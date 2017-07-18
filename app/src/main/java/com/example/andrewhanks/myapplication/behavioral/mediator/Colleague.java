package com.example.andrewhanks.myapplication.behavioral.mediator;

// 同事抽象類別
abstract class Colleague {
    protected String name; // 姓名
    protected Mediator mediator; // 中介者

    // 設定姓名、中介者
    Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    // 發送訊息給中介者
    public void send(String msgType, String msgCon) {
        mediator.work(msgType, msgCon, this);
    }

    // 接收一般訊息
    public void receive(String msgCon) {
        System.out.println(this.name + " 接收到 中介者 訊息：" + msgCon);
    }
}

// 醫護兵
class MedicColleague extends Colleague {
    MedicColleague(String name, Mediator mediator) {
        super(name, mediator);
        mediator.medic = this;
    }

    // 醫療行動
    public void action(String msgCon) {
        System.out.println(this.name + " 接收到 中介者 訊息：" + msgCon + "。前往救護中");
    }
}

// 步兵
class InfantryColleague extends Colleague {
    public InfantryColleague(String name, Mediator mediator) {
        super(name, mediator);
        mediator.infantry = this;
    }

    // 攻擊行動
    public void action(String msgCon) {
        System.out.println(this.name + " 接收到 中介者 訊息：" + msgCon + "。前往救助中");
    }
}