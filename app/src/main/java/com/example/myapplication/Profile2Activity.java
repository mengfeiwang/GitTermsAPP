package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/**
 * The Profile2 program implements an application that
 * simply run the an UI of the APP which gives some tips when you have
 * made a mistake in the choices.
 */
public class Profile2Activity extends AppCompatActivity {
    /**
     * There are fields for buttons and textView; buttons for starting new game or exiting the game
     * textView for demonstrating the tips and display your score.
     * The bundle is for the Integer data to be passed.
     */

    Button NewGame, Exit;
    TextView Score;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();
        String stringVariableName = extras.getString("StringVariableName");
        int intVariableName = Integer.parseInt(stringVariableName);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        //Declare the button and textViews
        NewGame = findViewById(R.id.NewGame);
        Exit = findViewById(R.id.Exit);
        Score = findViewById(R.id.Score);
        Score.setText("Score: " + intVariableName);

        /**
         *If the NewGame button is clicked, launchActivity method is called.
         *If the Exit button is clicked, the APP will be finished.
         */
        NewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });
        Exit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    /**
     * This method switch page to MainActivity.
     */
    private void launchActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
