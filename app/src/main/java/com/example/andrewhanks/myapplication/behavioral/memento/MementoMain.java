package com.example.andrewhanks.myapplication.behavioral.memento;

import java.util.Date;

public class MementoMain {

    public static void start() {
        Application application = new Application();
        Recovery recovery = new Recovery();

        System.out.println(application.getState());

        Backup backup = application.backup();  // 建立備忘
        recovery.add(backup); // 加入備忘錄

        application.setState("customer setting");
        System.out.println(application.getState());

        Date date = backup.date; // 假設 date 是使用者自行設定所要取得的還原時間！
        application.recover(recovery.retrieve(date)); // 取得備忘來還原
        System.out.println(application.getState());
    }
}
