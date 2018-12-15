package com.teamedge.android.devinsshoestore;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView priceTextView;
    int price = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        priceTextView = findViewById(R.id.price);

    }

    public void increase(View view) {
        price += 60;
        priceTextView.setText("$" + price);

    }

    public void decrease(View view) {
        price -= 60;
        priceTextView.setText("$" + price);
        }







}
