package com.richardpinegar.myspotter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Options Dropdown Menu
        Spinner optionsDropdown = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> optionsDropdownAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.options));
        optionsDropdownAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        optionsDropdown.setAdapter(optionsDropdownAdapter);
        // End Options Dropdown Menu
    }
}
