package com.ver2point0.android.testtextviewmethods;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("My new text view!");
        textView.setAllCaps(true);
        textView.setHighlightColor(Color.BLUE);
        textView.setTextColor(Color.RED);
        textView.setTextSize(32);

        setContentView(textView);
    }
}
