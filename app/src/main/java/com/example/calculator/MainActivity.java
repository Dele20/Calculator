package com.example.calculator;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
//TODO: Add an Ans
//TODO: enable further calculation

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
    String display="";
    Double answer=0.0;


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

        //Buttons, for operations and stuff
        Button add    = findViewById(R.id.addButton);
        Button sub    = findViewById(R.id.subButton);
        Button mul    = findViewById(R.id.mulButton);
        Button div    = findViewById(R.id.divButton);
        Button equals = findViewById(R.id.button);
        Button clear  = findViewById(R.id.button13);
        Button AC     = findViewById(R.id.button14);
        Button ans    = findViewById(R.id.ans);
        Button reset  = findViewById(R.id.resetCalc);

        //Button for changing calculator background
        Button buttonMode =findViewById(R.id.buttonMode);
        ConstraintLayout rootLayout = findViewById(R.id.rootLayout);


        //Change background button
        buttonMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable background = rootLayout.getBackground();

                if (background instanceof ColorDrawable) {
                    int color = ((ColorDrawable) background).getColor();
                    if (color == getResources().getColor(R.color.black)) {
                        rootLayout.setBackgroundColor(getResources().getColor(R.color.white));
                    } else {
                        rootLayout.setBackgroundColor(getResources().getColor(R.color.black));

                    }}


            }
        });
        //Below, are setOnClickListeners, yeah!!
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

        AC.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View v){
                currentDisplayingText="";
                textView.setText("0");
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

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentDisplayingText.equals("")) {
                    methSub = currentDisplayingText;
                    currentDisplayingText = "";
                    clickedSub = true;
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentDisplayingText.equals("")) {
                    methMul = currentDisplayingText;
                    currentDisplayingText = "";
                    clickedMul = true;
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

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickedAdd) {
                    if (!methAdd.equals("") && !currentDisplayingText.equals("")) {
                        result1 = Double.parseDouble(methAdd) + Double.parseDouble(currentDisplayingText);
                        answer=result1;

                        currentDisplayingText="";
                        display = String.valueOf(result1);

                        textView.setText(display);
                    } else {
                        textView.setText("Type a second number. Start over!");
                    }
                    clickedAdd = false;
                }

                if (clickedSub) {
                    if (!methSub.equals("") && !currentDisplayingText.equals("")) {
                        result1 = Double.parseDouble(methSub) - Double.parseDouble(currentDisplayingText);
                        currentDisplayingText="";
                        display = String.valueOf(result1);

                        textView.setText(display);
                    } else {
                        textView.setText("Type a second number. Start over!");
                    }
                    clickedSub = false;
                }

                if (clickedMul) {
                    if (!methMul.equals("") && !currentDisplayingText.equals("")) {
                        result1 = Double.parseDouble(methMul) * Double.parseDouble(currentDisplayingText);
                        currentDisplayingText="";
                        display = String.valueOf(result1);

                        textView.setText(display);
                    } else {
                        textView.setText("Type a second number. Start over!");
                    }
                    clickedMul = false;
                }

                if (clickedDiv) {
                    if (!methDiv.equals("") && !currentDisplayingText.equals("")) {
                        if (Double.parseDouble(currentDisplayingText) != 0) {
                            result1 = Double.parseDouble(methDiv) / Double.parseDouble(currentDisplayingText);
                            currentDisplayingText="";
                            display = String.valueOf(result1);

                            textView.setText(display);
                        } else {
                            textView.setText("Cannot divide by zero!");
                        }
                    } else {
                        textView.setText("Type a second number. Start over!");
                    }
                    clickedDiv = false;
                }
            }
        });
        ans.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                currentDisplayingText=String.valueOf(answer);
                textView.setText("Previous answer: "+currentDisplayingText);

            }
        }
    );
        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               currentDisplayingText="";
               answer=0.0;
               display="";
               Double result1 = 0.0;
               String methAdd = "";
               String methDiv="";
               String methMul="";
               String methSub="";
               boolean clickedAdd = false;
               boolean clickedSub = false;
               boolean clickedDiv = false;
               boolean clickedMul = false;
               String display="";
               Double answer=0.0;
               textView.setText("Your Calculator has been Reset!");

            }
        });


        /*add.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    // Button pressed
                    add.getBackground().setColorFilter(getResources().getColor(R.color.button_pressed_color), PorterDuff.Mode.SRC_ATOP);
                    add.invalidate();
                } else if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL) {
                    // Button released
                    add.getBackground().clearColorFilter();
                    add.invalidate();
                }
                return false;
            }
        });*/

    }
}
