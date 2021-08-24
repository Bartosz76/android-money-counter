package com.example.make_it_rain;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Variables to be used in order to connect to the widgets.
     */
//    private Button makeItRain;
    private TextView moneyValue;
//    private Button showInfo;
    private int moneyCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Connect variables to widgets.
         */
//        makeItRain = findViewById(R.id.buttonMakeItRain);
        moneyValue = findViewById(R.id.moneyValue);

        /**
         * I want to make the Make It Rain button perform an action when clicked.
         * That's the FIRST method of introducing an onClick method! I specify it
         * within this class on the variable linked with the widget.
         */
//        makeItRain.setOnClickListener(view -> {
//            /**
//             * I want to log messages.
//             * Log.d stands for Log.Debug
//             */
//            Log.d("MainActivity", "onClick: Make it rain!");
//        });


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
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 1000;
        /**
         * moneyValue is TextView, so it needs... text. moneyCounter is an int. So it needs
         * to be a String. NumberFormat is used to keep the number in the format of a currency.
         */
        moneyValue.setText(String.valueOf(numberFormat.format(moneyCounter)));
        Log.d("MainActivity", "onClick: " + moneyCounter);
    }

    /**
     * Toast class -> it's a mechanism that allows for small snippets of information to
     * appear while the user is using the application. It's an overlay on top of everything else.
     */
    public void showInfo(View view) {
        /**
         * Context needs to be passed into so that the Toast knows how to show itself inside the
         * activity.
         * R.string... is a char sequence, basically a message I want displayed. R.string is used
         * so it's a reference to a resource kept in string.xml.
         * The last is the duration of how long the Toast is supposed to be displayed.
         * .show() needs to be present in order to...show the Toast. Kind of like a builder.
         */
        Toast.makeText(MainActivity.this, R.string.app_info, Toast.LENGTH_SHORT).show();
    }
}