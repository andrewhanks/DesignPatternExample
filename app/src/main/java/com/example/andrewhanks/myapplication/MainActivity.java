package com.example.andrewhanks.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.andrewhanks.myapplication.chainofresponsibility.ChainOfResponsibilityMain;
import com.example.andrewhanks.myapplication.memento.MementoMain;
import com.example.andrewhanks.myapplication.observer.ObserverMain;
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
    }
}
