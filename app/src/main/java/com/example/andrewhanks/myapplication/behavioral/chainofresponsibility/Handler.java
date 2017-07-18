package com.example.andrewhanks.myapplication.behavioral.chainofresponsibility;

abstract class Handler {
    protected Handler next;

    Handler(Handler next) {
        this.next = next;
    }

    void doNext(char c) {
        if (next != null) {
            next.handle(c);
        }
    }

    abstract void handle(char c);
}

class SymbolHandler extends Handler {
    SymbolHandler(Handler next) {
        super(next);
    }

    void handle(char c) {
        System.out.println("Symbol has been handled");
        doNext(c);
    }
}

class CharacterHandler extends Handler {
    CharacterHandler(Handler next) {
        super(next);
    }

    void handle(char c) {
        if (Character.isLetter(c)) {
            System.out.println("Character has been handled");
        } else {
            doNext(c);
        }
    }
}

class DigitHandler extends Handler {
    DigitHandler(Handler next) {
        super(next);
    }

    void handle(char c) {
        if (Character.isDigit(c)) {
            System.out.println("Digit has been handled");
        } else {
            doNext(c);
        }
    }
}