package com.example.karth.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void  convertFunction(View view){
        EditText amount= (EditText)findViewById(R.id.preCurr);
        Log.i("Entered amount", amount.getText().toString());
        Spinner fromCurrency = (Spinner)findViewById(R.id.spin);
        if (fromCurrency != null) {
            fromCurrency.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(MainActivity.this, parent.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
                    Log.i("Spinner Value", parent.getSelectedItem().toString());
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
