package com.example.calculator;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    String currentDisplayingText="";
    Double left_operand;
    Double right_operand;
    Double result;
    String operator;
    Double currentDisplayingNum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setTextSize(20); // Set font size to 20
        textView.setTextColor(Color.BLACK); // Set text color to black
        textView.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));


        //Assigning the values for the buttons to variables
        Button button0=findViewById(R.id.button11);
        Button button1=findViewById(R.id.button9);
        Button button2=findViewById(R.id.button8);
        Button button3=findViewById(R.id.button7);
        Button button4=findViewById(R.id.button6);
        Button button5=findViewById(R.id.button5);
        Button button6=findViewById(R.id.button4);
        Button button7=findViewById(R.id.button3);
        Button button8=findViewById(R.id.button2);
        Button button9=findViewById(R.id.button1);

        // Operations button
        Button add=findViewById(R.id.addButton);
        Button sub=findViewById(R.id.subButton);
        Button mul=findViewById(R.id.mulButton);
        Button div=findViewById(R.id.divButton);

        //Onclick Listeners for Operation buttons
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDisplayingNum = Double.parseDouble(currentDisplayingText);
                textView.setText(currentDisplayingText+"+");


            }
        });


// ...

// Perform the addition when the equals button is clicked







        //Clear button
        Button clear=findViewById(R.id.button13);

        //TODO: ADD BUTTON FOR SINGLE CLEARING

        button0.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                currentDisplayingText+="0";
                textView.setText(currentDisplayingText );





            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                currentDisplayingText += "1";
                textView.setText(currentDisplayingText);
            }});
        button2.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                currentDisplayingText += "2";
                textView.setText(currentDisplayingText);
            }});
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDisplayingText += "3";
                textView.setText(currentDisplayingText);
            }});
        button4.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                currentDisplayingText += "4";
                textView.setText(currentDisplayingText);
            }});
        button5.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                currentDisplayingText += "5";
                textView.setText(currentDisplayingText);
            }});
        button6.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                currentDisplayingText += "6";
                textView.setText(currentDisplayingText);
            }});
        button7.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                currentDisplayingText += "7";
                textView.setText(currentDisplayingText);
            }});
        button8.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                currentDisplayingText += "8";
                textView.setText(currentDisplayingText);
            }});
        button9.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                currentDisplayingText += "9";
                textView.setText(currentDisplayingText);
            }});
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
        button9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
            textView.setText(String.valueOf(Double.parseDouble(currentDisplayingText)+currentDisplayingNum));
        }});


    }
    /*double Calculate(){
        Double aa=  Double.parseDouble(currentDisplayingText)+currentDisplayingNum;

        return aa;
    }*/
}