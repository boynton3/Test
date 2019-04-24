package com.example.newandimprovescoolisstracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    /** Default logging tag for messages from the main activity. */
    private static final String TAG = "MP5:Main";

    /** Run when this activity comes to the foreground.
     *
     * @param savedInstanceState unused
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
/** Pressing buttons n stuff. */
        Button button = findViewById((R.id.BigRedButton));
        button.setOnClickListener(v -> {
            Log.e(TAG, "Big Red Button clicked");
            printJson();
        });

        /**
         * Run when this activity is no longer visible.
         */
    }
    @Override
    protected void onPause() {
        super.onPause();
    }

    protected String printJson() {
        HttpHandler sh = new HttpHandler();

        String url = "https://api.wheretheiss.at/v1/satellites/25544";
        String jsonStr = sh.makeServiceCall(url);

        return jsonStr;
    }
}

