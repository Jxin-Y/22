package com.example.a22.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a22.R;

public class InsertActivity extends AppCompatActivity implements View.OnClickListener {
    private Button Yes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        Yes.findViewById(R.id.btn_yes);
        Yes.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_yes:
                Intent intent = new Intent(InsertActivity.this, MainActivity.class);
                break;

        }
    }
}
