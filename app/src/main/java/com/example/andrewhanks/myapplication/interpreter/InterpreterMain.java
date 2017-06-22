package com.example.andrewhanks.myapplication.interpreter;

public class InterpreterMain {
    public static void start() {
        String program = "PROGRAM \n" +
                "    PRINT dog SPACE \n" +
                "    PRINT is SPACE \n" +
                "    PRINT an SPACE \n" +
                "    PRINT animal BREAK \n" +
                "END ";
        Node node = new Program();
        node.parse(new Context(program));
        node.execute();
    }
}
