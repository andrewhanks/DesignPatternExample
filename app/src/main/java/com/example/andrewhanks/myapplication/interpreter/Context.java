package com.example.andrewhanks.myapplication.interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Node {
    void parse(Context context);

    void execute();
}

// <program> ::= PROGRAM <command list>
class Program implements Node {
    private Node commandList;

    public void parse(Context context) {
        context.skipToken("PROGRAM");
        commandList = new CommandList();
        commandList.parse(context);
    }

    public void execute() {
        commandList.execute();
    }
}

// <command list> ::= <command>* END
class CommandList implements Node {
    private List<Node> commands = new ArrayList<>();

    public void parse(Context context) {
        while (true) {
            if (context.currentToken() == null) {
                System.err.println("Missing 'END'");
                break;
            } else if (context.currentToken().equals("END")) {
                context.skipToken("END");
                break;
            } else {
                Node command = new Command();
                command.parse(context);
                commands.add(command);
            }
        }
    }

    public void execute() {
        for (Node command : commands) {
            command.execute();
        }
    }
}

// <command> ::= <repeat> | <primitive>
class Command implements Node {
    private Node node;

    public void parse(Context context) {
        if (context.currentToken().equals("REPEAT")) {
            node = new Repeat();
            node.parse(context);
        } else {
            node = new Primitive();
            node.parse(context);
        }
    }

    public void execute() {
        node.execute();
    }
}

// <primitive> ::= PRINT <string> | SPACE | BREAK | LINEBREAK
class Primitive implements Node {
    private String name;
    private String text;

    public void parse(Context context) {
        name = context.currentToken();
        context.skipToken(name);
        if (!(name.equals("PRINT") ||
                name.equals("BREAK") ||
                name.equals("LINEBREAK") ||
                name.equals("SPACE"))) {
            System.err.println("Undefined Command");
        }
        if (name.equals("PRINT")) {
            text = context.currentToken();
            context.nextToken();
        }
    }

    public void execute() {
        if (name.equals("PRINT"))
            System.out.print(text);
        else if (name.equals("SPACE"))
            System.out.print(" ");
        else if (name.equals("BREAK"))
            System.out.println();
        else if (name.equals("LINEBREAK"))
            System.out.println("\n------------------------------");
    }
}

class Repeat implements Node {
    private int number;
    private Node commandList;

    public void parse(Context context) {
        context.skipToken("REPEAT");
        number = context.currentNumber();
        context.nextToken();
        commandList = new CommandList();
        commandList.parse(context);
    }

    public void execute() {
        for (int i = 0; i < number; i++) {
            commandList.execute();
        }
    }
}

class Context {
    private Iterator<String> tokens;
    private String currentToken;

    Context(String program) {
        List<String> tokenList = new ArrayList<>();
        String input = program;

        for (String text : input.split("\n")) {
            for (String token : text.trim().split(" ")) {
                tokenList.add(token.trim());
            }
        }

        tokens = tokenList.iterator();
        nextToken();
    }

    String nextToken() {
        currentToken = null;
        if (tokens.hasNext()) {
            currentToken = tokens.next();
        }
        return currentToken;
    }

    String currentToken() {
        return currentToken;
    }

    void skipToken(String token) {
        if (!token.equals(currentToken)) {
            System.err.println("Warning: " + token +
                    " is expected, but " +
                    currentToken + " is found.");
        }
        nextToken();
    }

    int currentNumber() {
        return Integer.parseInt(currentToken);
    }
}