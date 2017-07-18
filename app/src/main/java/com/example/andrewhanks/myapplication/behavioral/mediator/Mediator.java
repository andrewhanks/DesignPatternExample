package com.example.andrewhanks.myapplication.behavioral.mediator;

// 中介者抽像類別
abstract class Mediator {
    protected MedicColleague medic; // 醫護兵
    protected InfantryColleague infantry; // 步兵

    public abstract void work(String msgType, String msgCon, Colleague colleague);
}

// 中介者
class ConcreteMediator extends Mediator {

    // 中介者處理接收到的訊息
    public void work(String msgType, String msgCon, Colleague colleague) {
        System.out.println("中介者 接收到 " + colleague.name + " 訊息：" + msgCon + " => 訊息處理");
        switch (msgType) {
            case "hurt":
                this.medic.action(msgCon);
                break;
            case "attack":
                this.infantry.action(msgCon);
                break;
            case "normal":
                if (colleague != this.medic) this.medic.receive(msgCon);
                if (colleague != this.infantry) this.infantry.receive(msgCon);
                break;
        }
    }
}
