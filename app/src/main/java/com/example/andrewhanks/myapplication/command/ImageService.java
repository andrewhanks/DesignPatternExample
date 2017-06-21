package com.example.andrewhanks.myapplication.command;

import java.util.HashMap;
import java.util.Map;

interface Drawing {
    void processSome();

    void processOther();

    void processAnother();
}

class DrawingImpl implements Drawing {
    public void processSome() {
        System.out.println("    - 對圖片作 Some 處理");
    }

    public void processOther() {
        System.out.println("    - 對圖片作 Other 處理");
    }

    public void processAnother() {
        System.out.println("    - 對圖片作 Another 處理");
    }
}

interface Command {
    void execute(Drawing drawing);
}

class ImageService {
    private Map<String, Command> commands = new HashMap<>();
    private Drawing drawing = new DrawingImpl();

    void addCommand(String effect, Command command) {
        commands.put(effect, command);
    }

    void doEffect(String effect) {
        commands.get(effect).execute(drawing);
    }
}

class AEffectCommand implements Command {
    public void execute(Drawing drawing) {
        System.out.println("作 A 特效");
        drawing.processSome();
        drawing.processOther();
    }
}

class BEffectCommand implements Command {
    public void execute(Drawing drawing) {
        System.out.println("作 B 特效");
        drawing.processOther();
        drawing.processAnother();
    }
}

class CEffectCommand implements Command {
    public void execute(Drawing drawing) {
        System.out.println("作 C 特效");
        drawing.processOther();
        drawing.processSome();
        drawing.processAnother();
    }
}
