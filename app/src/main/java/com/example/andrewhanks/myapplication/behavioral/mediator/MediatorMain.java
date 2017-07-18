package com.example.andrewhanks.myapplication.behavioral.mediator;

public class MediatorMain {
    public static void start() {
        ConcreteMediator mediator = new ConcreteMediator(); // 中介者

        MedicColleague medic = new MedicColleague("小護士", mediator); // 醫護兵
        InfantryColleague infantry = new InfantryColleague("小小強", mediator); // 步兵

        medic.send("normal", "吹東風了");
        infantry.send("normal", "左前方一隻小白兔走過去");
        medic.send("attack", "遭受敵人攻擊");
        infantry.send("hurt", "我中彈了");
    }
}
