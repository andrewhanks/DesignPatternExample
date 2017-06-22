package com.example.andrewhanks.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.andrewhanks.myapplication.chainofresponsibility.ChainOfResponsibilityMain;
import com.example.andrewhanks.myapplication.command.CommandMain;
import com.example.andrewhanks.myapplication.interpreter.InterpreterMain;
import com.example.andrewhanks.myapplication.iterator.IteratorMain;
import com.example.andrewhanks.myapplication.memento.MementoMain;
import com.example.andrewhanks.myapplication.observer.ObserverMain;
import com.example.andrewhanks.myapplication.state.StateMain;
import com.example.andrewhanks.myapplication.strategy.StrategyMain;
import com.example.andrewhanks.myapplication.template.TemplateMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    }
}
