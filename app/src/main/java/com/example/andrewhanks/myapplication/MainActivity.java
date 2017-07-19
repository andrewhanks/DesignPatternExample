package com.example.andrewhanks.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.andrewhanks.myapplication.behavioral.chainofresponsibility.ChainOfResponsibilityMain;
import com.example.andrewhanks.myapplication.behavioral.command.CommandMain;
import com.example.andrewhanks.myapplication.behavioral.interpreter.InterpreterMain;
import com.example.andrewhanks.myapplication.behavioral.iterator.IteratorMain;
import com.example.andrewhanks.myapplication.behavioral.mediator.MediatorMain;
import com.example.andrewhanks.myapplication.behavioral.memento.MementoMain;
import com.example.andrewhanks.myapplication.behavioral.observer.ObserverMain;
import com.example.andrewhanks.myapplication.behavioral.state.StateMain;
import com.example.andrewhanks.myapplication.behavioral.strategy.StrategyMain;
import com.example.andrewhanks.myapplication.behavioral.template.TemplateMain;
import com.example.andrewhanks.myapplication.creational.prototype.PrototypeMain;
import com.example.andrewhanks.myapplication.creational.singleton.Singleton;
import com.example.andrewhanks.myapplication.creational.singleton.SingletonMain;
import com.example.andrewhanks.myapplication.structural.adapter.AdapterMain;
import com.example.andrewhanks.myapplication.structural.bridge.BridgeMain;
import com.example.andrewhanks.myapplication.structural.composite.CompositeMain;
import com.example.andrewhanks.myapplication.structural.decorator.DecoratorMain;
import com.example.andrewhanks.myapplication.structural.facade.FacadeMain;
import com.example.andrewhanks.myapplication.structural.flyweight.FlyweightMain;
import com.example.andrewhanks.myapplication.structural.proxy.ProxyMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creational Patterns
        Button singletonButton = (Button) findViewById(R.id.singleton);
        singletonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SingletonMain.start();
            }
        });

        Button prototypeButton = (Button) findViewById(R.id.prototype);
        prototypeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PrototypeMain.start();
            }
        });

        // Structural Patterns
        Button bridgeButton = (Button) findViewById(R.id.bridge);
        bridgeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BridgeMain.start();
            }
        });

        Button compositeButton = (Button) findViewById(R.id.composite);
        compositeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CompositeMain.start();
            }
        });

        Button decoratorButton = (Button) findViewById(R.id.decorator);
        decoratorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecoratorMain.start();
            }
        });

        Button facadeButton = (Button) findViewById(R.id.facade);
        facadeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FacadeMain.start();
            }
        });

        Button flyweightButton = (Button) findViewById(R.id.flyweight);
        flyweightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FlyweightMain.start();
            }
        });

        Button proxyButton = (Button) findViewById(R.id.proxy);
        proxyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProxyMain.start();
            }
        });

        Button adapterButton = (Button) findViewById(R.id.adapter);
        adapterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdapterMain.start();
            }
        });

        // Behavioral Patterns
        Button templateButton = (Button) findViewById(R.id.template);
        templateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TemplateMain.start();
            }
        });

        Button mementoButton = (Button) findViewById(R.id.memento);
        mementoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MementoMain.start();
            }
        });

        Button observerButton = (Button) findViewById(R.id.observer);
        observerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObserverMain.start();
            }
        });

        Button chainOfResponsibility = (Button) findViewById(R.id.chain_of_responsibility);
        chainOfResponsibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChainOfResponsibilityMain.start();
            }
        });

        Button commandButton = (Button) findViewById(R.id.command);
        commandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommandMain.start();
            }
        });

        Button stateButton = (Button) findViewById(R.id.state);
        stateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StateMain.start();
            }
        });

        Button stragegyButton = (Button) findViewById(R.id.strategy);
        stragegyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrategyMain.start();
            }
        });

        Button interpreterButton = (Button) findViewById(R.id.interpreter);
        interpreterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InterpreterMain.start();
            }
        });

        Button iteratorButton = (Button) findViewById(R.id.iterator);
        iteratorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IteratorMain.start();
            }
        });

        Button mediatorButton = (Button) findViewById(R.id.mediator);
        mediatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediatorMain.start();
            }
        });
    }
}
