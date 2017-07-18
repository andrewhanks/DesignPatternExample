package com.example.andrewhanks.myapplication.behavioral.command;

public class CommandMain {
    public static void start() {
        ImageService service = new ImageService();
        service.addCommand("AEffect", new AEffectCommand());
        service.addCommand("BEffect", new BEffectCommand());
        service.addCommand("CEffect", new CEffectCommand());
        // 在需要時指定使用某特效
        service.doEffect("AEffect");
        service.doEffect("BEffect");
        service.doEffect("CEffect");
    }
}
