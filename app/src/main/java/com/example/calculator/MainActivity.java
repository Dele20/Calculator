package com.example.calculator;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String currentDisplayingText = "";
    Double result1 = 0.0;
    String methAdd = "";
    String methDiv="";
    String methMul="";
    String methSub="";
    boolean clickedAdd = false;
    boolean clickedSub = false;
    boolean clickedDiv = false;
    boolean clickedMul = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        textView.setTextSize(20);
        textView.setTextColor(Color.BLACK);
        textView.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));

        Button button0 = findViewById(R.id.button11);
        Button button1 = findViewById(R.id.button9);
        Button button2 = findViewById(R.id.button8);
        Button button3 = findViewById(R.id.button7);
        Button button4 = findViewById(R.id.button6);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button4);
        Button button7 = findViewById(R.id.button3);
        Button button8 = findViewById(R.id.button2);
        Button button9 = findViewById(R.id.button1);

        Button add = findViewById(R.id.addButton);
        Button sub = findViewById(R.id.subButton);
        Button mul = findViewById(R.id.mulButton);
        Button div = findViewById(R.id.divButton);
        Button equals = findViewById(R.id.button);
        Button clear = findViewById(R.id.button13);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDisplayingText += "0";
                textView.setText(currentDisplayingText);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDisplayingText += "1";
                textView.setText(currentDisplayingText);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDisplayingText += "2";
                textView.setText(currentDisplayingText);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDisplayingText += "3";
                textView.setText(currentDisplayingText);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDisplayingText += "4";
                textView.setText(currentDisplayingText);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDisplayingText += "5";
                textView.setText(currentDisplayingText);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDisplayingText += "6";
                textView.setText(currentDisplayingText);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDisplayingText += "7";
                textView.setText(currentDisplayingText);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDisplayingText += "8";
                textView.setText(currentDisplayingText);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDisplayingText += "9";
                textView.setText(currentDisplayingText);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentDisplayingText.equals("")) {
                    currentDisplayingText = currentDisplayingText.substring(0, currentDisplayingText.length() - 1);
                    textView.setText(currentDisplayingText);
                } else {
                    textView.setText("0");
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentDisplayingText.equals("")) {
                    methAdd = currentDisplayingText;
                    currentDisplayingText = "";
                    clickedAdd = true;
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentDisplayingText.equals("")) {
                    methDiv = currentDisplayingText;
                    currentDisplayingText = "";
                    clickedDiv = true;
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentDisplayingText.equals("")) {
                    methMul = currentDisplayingText;
                    currentDisplayingText = "";
                    clickedDiv = true;
                }
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickedAdd) {
                    if(!methAdd.equals("") && !currentDisplayingText.equals("")){
                    result1 = Double.parseDouble(currentDisplayingText) + Double.parseDouble(methAdd);
                    String result2=String.valueOf(result1);
                    /*Below w, is simply the value of the last two elements in the string sequence, I am in this block
                    trying to remove the ".0" if it is not required, as it looks not nice. 
                    In future try using method overloading, can't do that now because, I'm overloaded myself, Ha
                     */
                    String w=result2.substring(result2.length()-2,result2.length());
                    if (w.equals(".0")){
                        textView.setText((result2.substring(0,result2.length()-2)));
                    }
                    else{
                        textView.setText(result2);
                    }
                    currentDisplayingText="";
                    //Set clicked to False in order to indicate a restart to the system
                    clickedAdd = false;
                    }
                    else{
                        textView.setText("Type a second num, Start over!");
                    }

                }



                if (clickedDiv) {
                    if(!methAdd.equals("") && !currentDisplayingText.equals("")){
                        result1 =  Double.parseDouble(methAdd)/Double.parseDouble(currentDisplayingText);
                        String result2=String.valueOf(result1);
                    /*Below w, is simply the value of the last two elements in the string sequence, I am in this block
                    trying to remove the ".0" if it is not required, as it looks not nice.
                    In future try using method overloading, can't do that now because, I'm overloaded myself, Ha
                     */
                        String w=result2.substring(result2.length()-2,result2.length());
                        if (w.equals(".0")){
                            textView.setText((result2.substring(0,result2.length()-2)));
                        }
                        else{
                            textView.setText(result2);
                        }
                        currentDisplayingText="";
                        //Set clicked to False in order to indicate a restart to the system
                        clickedDiv = false;
                    }
                    else{
                        textView.setText("Type a second num, Start over!");
                    }

                }






                if (clickedMul) {
                    if(!methAdd.equals("") && !currentDisplayingText.equals("")){
                        result1 = Double.parseDouble(currentDisplayingText) * Double.parseDouble(methMul);
                        String result2=String.valueOf(result1);
                    /*Below w, is simply the value of the last two elements in the string sequence, I am in this block
                    trying to remove the ".0" if it is not required, as it looks not nice.
                    In future try using method overloading, can't do that now because, I'm overloaded myself, Ha
                     */
                        String w=result2.substring(result2.length()-2,result2.length());
                        if (w.equals(".0")){
                            textView.setText((result2.substring(0,result2.length()-2)));
                        }
                        else{
                            textView.setText(result2);
                        }
                        currentDisplayingText="";
                        //Set clicked to False in order to indicate a restart to the system
                        clickedMul = false;
                    }
                    else{
                        textView.setText("Type a second num, Start over!");
                    }

                }



                if (clickedSub) {
                    if(!methAdd.equals("") && !currentDisplayingText.equals("")){
                        result1 = + Double.parseDouble(methSub)-Double.parseDouble(currentDisplayingText);
                        String result2=String.valueOf(result1);
                    /*Below w, is simply the value of the last two elements in the string sequence, I am in this block
                    trying to remove the ".0" if it is not required, as it looks not nice.
                    In future try using method overloading, can't do that now because, I'm overloaded myself, Ha
                     */
                        String w=result2.substring(result2.length()-2,result2.length());
                        if (w.equals(".0")){
                            textView.setText((result2.substring(0,result2.length()-2)));
                        }
                        else{
                            textView.setText(result2);
                        }
                        currentDisplayingText="";
                        //Set clicked to False in order to indicate a restart to the system
                        clickedSub = false;
                    }
                    else{
                        textView.setText("Type a second num, Start over!");
                    }

                }
            }
        });
    }
}
