package com.example.practicewithrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText playerNameEt, playerAgeEt, playerRoleEt, playerCountryNameEt;
    private Button showPlayerInfoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialization();
        onClick();

    }

    private void onClick() {
        showPlayerInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = playerNameEt.getText().toString();
                String age = playerAgeEt.getText().toString();
                String role = playerRoleEt.getText().toString();
                String countryName = playerCountryNameEt.getText().toString();

                startActivity(new Intent(MainActivity.this, ShowPlayerInfoActivity.class)
                        .putExtra("name", name)
                        .putExtra("age", age)
                        .putExtra("role", role)
                        .putExtra("countryName", countryName));
            }
        });
    }

    private void initialization() {
        playerNameEt = findViewById(R.id.playerNameEtId);
        playerAgeEt = findViewById(R.id.playerAgeEtId);
        playerRoleEt = findViewById(R.id.playerRoleEtId);
        playerCountryNameEt = findViewById(R.id.playerCountryNameEtId);
        showPlayerInfoBtn = findViewById(R.id.showPlayerInfoBtnId);
    }
}
