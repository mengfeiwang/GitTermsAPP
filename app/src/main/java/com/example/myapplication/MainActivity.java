package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

/**
* The MainActivity program implements an application that
* simply run an APP which help people prepare for vocabulary quiz.
* @author  Mengfe Wang
* @version 1.0
* @since   2019-09-10
*/

public class MainActivity extends AppCompatActivity {
    /**
     * There are ten fields; buttons and textsView including four
     * buttons of choices and two textView which explains
     * the definitions of word, the scores, and the word bank.
     */

    Button answers1, answers2, answers3, answers4;
    TextView word, score;
    private BankWord mBankWord= new BankWord();
    private String mAnswer;
    private int mScore;
    private int mBankWordLength=mBankWord.mBankWord.length-1;

    /**
     * The onCreate method is called when Activity class is first created.
     *  The setContentView(R.layout.activity_main) gives information about
     *  our layout resource. Here, our layout resources are defined in activity_main.xml file.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare the button and textViews
        answers1 = findViewById(R.id.answer1);
        answers2 = findViewById(R.id.answer2);
        answers3 = findViewById(R.id.answer3);
        answers4 = findViewById(R.id.answer4);
        word = findViewById(R.id.word);
        score = findViewById(R.id.score);
        score.setText("Score: " + mScore);

        /*The method for replacing all the text in the MainActivity page including the definition
          of the word, score and also the choices.
         */
        updateWord(mBankWordLength);

        /**
         * If the answer that you click is the right answer, your score will add one and
         * that word will be removed from word bank. On the other hand, if the answer clicked is
         * not right, the method gameOver will be called.
         * If the word bank is zero which means I have been through all the words, the method win
         * will be called.
         */
        answers1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answers1.getText() == mAnswer){
                    mScore++;
                    mBankWordLength--;
                    if (mBankWordLength == 0){ Win(); }
                    score.setText("Score: " + mScore);
                    updateWord(mBankWordLength);
                } else { gameOver();}
            }
        });
        answers2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answers2.getText() == mAnswer){

                    mScore++;
                    mBankWordLength--;
                    if (mBankWordLength == 0){ Win(); }
                    score.setText("Score: " + mScore);
                    updateWord(mBankWordLength);
                } else { gameOver();}
            }
        });
        answers3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answers3.getText() == mAnswer){

                    mScore++;
                    mBankWordLength--;
                    if (mBankWordLength == 0){ Win(); }
                    score.setText("Score: " + mScore);
                    updateWord(mBankWordLength);

                } else { gameOver();}
            }
        });
        answers4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answers4.getText() == mAnswer){
                    mScore++;
                    mBankWordLength--;
                    if (mBankWordLength == 0){ Win(); }
                    score.setText("Score: " + mScore);
                    updateWord(mBankWordLength);
                } else { gameOver();}
            }
        });
    }

    /**
     * This this is private method with a parameter which points at the number of question.
     * The parameter will get the word definition and the choices using the fields.
     * @param num
     */
    private void updateWord(int num){
        word.setText(mBankWord.getBankWord(num));
        answers1.setText(mBankWord.getChoice1(num));
        answers2.setText(mBankWord.getChoice2(num));
        answers3.setText(mBankWord.getChoice3(num));
        answers4.setText(mBankWord.getChoice4(num));
        mAnswer= mBankWord.getCorrectAnswer(num);
    }

    /**
     * gameOver is a method which create a small window that prompts the user to a
     * decision or enter additional information.
     * .setMessage is the method setting the message to be displayed in the alert dialog.
     * .setCancelable is the method setting the property that the dialog can be cancelled or not.
     * .setPositiveButton and setNegativeButton are "yes" and "no" in response of any
     * actions taken, by remaining in the same activity and without changing the screen.
     * The"yes" goes to the starting UI and the exit goes to finish the APP
     */
    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("     Game Over! Your Score is "+ mScore + " points" )
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                            }
                        })
                .setNegativeButton("EXIT                                            ",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    /**
     * Win is a method similar to gameOver except the message.
     */
    private void Win(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
            .setMessage("                   CONGRATULATION!!" )
                .setCancelable(false)
                .setPositiveButton("TRY AGAIN",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            }
                        })
                .setNegativeButton("EXIT                                            ",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

}


