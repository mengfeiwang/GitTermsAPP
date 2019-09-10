package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

/**
 * The ProfileActivity program implements an application that
 * simply run an first UI of an app with start and exit buttons.
 * @author  Mengfe Wang
 * @version 1.0
 * @since   2019-09-10
 */
public class ProfileActivity extends AppCompatActivity {

    /**
     * There are two fields; button for start and exit the game
     */
    Button Start, Exit;

    /**
     * The onCreate method is called when Activity class is first created.
     *  The setContentView(R.layout.activity_main) gives information about
     *  our layout resource.
     *  Here, our layout resources are defined in activity_main.xml file.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //Declare the buttons
        Start = findViewById(R.id.Start);
        Exit = findViewById(R.id.Exit);
        /**
         * If the Start button is clicked, LaunchActivity method is called
         */
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });

        /**
         * If Exit button is clicked, the application will be closed
         */
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    /**
     * launchActivity is a method that returns to application MainActivity
     */
    private void launchActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
