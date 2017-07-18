package com.example.andrewhanks.myapplication.behavioral.memento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Application {
    private String state = "default setting";

    Backup backup() {
        return new Backup(state);
    }

    void recover(Backup backup) {
        this.state = backup.state;
    }

    void setState(String state) {
        this.state = state;
    }

    String getState() {
        return state;
    }
}

class Backup {
    final String state;
    final Date date;

    Backup(String state) {
        this.state = state;
        this.date = new Date();
    }
}

class Recovery {
    private List<Backup> backups = new ArrayList<>();

    void add(Backup backup) {
        backups.add(backup);
    }

    Backup retrieve(Date date) {
        for (Backup backup : backups) {
            if (backup.date.equals(date)) {
                backups.remove(backup);
                return backup;
            }
        }
        return null;
    }
}