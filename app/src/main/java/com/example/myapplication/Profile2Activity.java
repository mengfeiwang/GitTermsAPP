package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile2Activity extends AppCompatActivity {
    Button NewGame, Exit;
    TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        NewGame = findViewById(R.id.NewGame);
        Exit = findViewById(R.id.Exit);
        score.setText("Score: " + mScore);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        NewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });
    }
    private void launchActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
