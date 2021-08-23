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
         */
        makeItRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * I want to log messages.
                 * Log.d stands for Log.Debug
                 */
                Log.d("MainActivity", "onClick: Make it rain!");
            }
        });


        /**
         * Instead of setting a String literal, I can (and should) provide the value
         * within string.xml and reference it here.
         * It stands for Resource.StringFile.testVariable.
         */
//        moneyValue.setText(R.string.test);
    }
}