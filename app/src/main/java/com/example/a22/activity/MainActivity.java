package com.example.a22.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.a22.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button Add;
    private Button Modify;
    private Button Delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Add.findViewById(R.id.btn_add);
        Modify.findViewById(R.id.btn_change);
        Delete.findViewById(R.id.btn_delete);
        Add.setOnClickListener(this);
        Delete.setOnClickListener(this);
        Modify.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_add:
            Intent intent = new Intent(MainActivity.this,InsertActivity.class);
            break;
            case R.id.btn_change:
                Intent intent1 = new Intent(MainActivity.this,ItemStudentActivity.class);
                break;
        }

    }
}
