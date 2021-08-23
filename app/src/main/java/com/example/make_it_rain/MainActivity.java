package com.example.make_it_rain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Variables to be used in order to connect to the widgets.
     */
    private Button makeItRain;
    private TextView moneyValue;
    private Button showInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Connect variables to widgets.
         */
        makeItRain = findViewById(R.id.buttonMakeItRain);
        moneyValue = findViewById(R.id.moneyValue);

        /**
         * I want to make the Make It Rain button perform an action when clicked.
         * That's the FIRST method of introducing an onClick method! I specify it
         * within this class on the variable linked with the widget.
         */
        makeItRain.setOnClickListener(view -> {
            /**
             * I want to log messages.
             * Log.d stands for Log.Debug
             */
            Log.d("MainActivity", "onClick: Make it rain!");
        });


        /**
         * Instead of setting a String literal, I can (and should) provide the value
         * within string.xml and reference it here.
         * It stands for Resource.StringFile.testVariable.
         */
//        moneyValue.setText(R.string.test);
    }

    /**
     * This method has been created within activity_main.xml.
     * This is the SECOND method of introducing an onClick method! It is declared in the
     * activity_main.xml and defined here!
     * View -> without passing the View, Android wouldn't know where this button is
     * in the hierarchy. Everything in Android inherits from View class.
     * Passing View as a parameter means that showMoney() has to pass it internally.
     * Due to that it's going to be know that it's required to go and fetch the View
     * which is the Button in activity_main.xml
     */
    public void showMoney(View view) {
        Log.d("MainActivity", "onClick: Make it rain!");
    }
}