package com.example.lesson3.Calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lesson3.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class CalcMain extends AppCompatActivity implements View.OnClickListener {

    MaterialTextView displayTextView;
    Display display;
    Arithmetics arithmetics;
    MaterialButton button_settings, button_MC, button_MR, button_MPlus, button_MMinus, button_Erase, button_CE, button_SQR, button_PlusMinus, button_C, button_Divide, button_Percent, button_Multiply, button_OneByX,
            button_Minus, button_Plus, button_Equals, button_Point, button_7, button_8, button_9, button_4, button_5, button_6, button_1, button_2, button_3, button_0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_layout);

        initView();
    }

    private void initView() {
        displayTextView = findViewById(R.id.display);
        display = new Display(displayTextView);
        arithmetics = new Arithmetics(display);

        button_settings = findViewById(R.id.button_reserved);
        button_MC = findViewById(R.id.button_MC);
        button_MR = findViewById(R.id.button_MR);
        button_MPlus = findViewById(R.id.button_MPlus);
        button_MMinus = findViewById(R.id.button_MMinus);
        button_Erase = findViewById(R.id.button_Erase);
        button_CE = findViewById(R.id.button_CE);
        button_SQR = findViewById(R.id.button_SQR);
        button_PlusMinus = findViewById(R.id.button_PlusMinus);
        button_C = findViewById(R.id.button_C);
        button_Divide = findViewById(R.id.button_Divide);
        button_Percent = findViewById(R.id.button_Percent);
        button_Multiply = findViewById(R.id.button_Multi);
        button_OneByX = findViewById(R.id.button_OneByX);
        button_Minus = findViewById(R.id.button_Minus);
        button_Plus = findViewById(R.id.button_Plus);
        button_Equals = findViewById(R.id.button_Equals);
        button_Point = findViewById(R.id.button_Point);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_0 = findViewById(R.id.button_0);

        setButtonsClickListeners();
    }

    private void setButtonsClickListeners() {
        button_settings.setOnClickListener(this);
        button_MC.setOnClickListener(this);
        button_MR.setOnClickListener(this);
        button_MPlus.setOnClickListener(this);
        button_MMinus.setOnClickListener(this);
        button_Erase.setOnClickListener(this);
        button_CE.setOnClickListener(this);
        button_SQR.setOnClickListener(this);
        button_PlusMinus.setOnClickListener(this);
        button_C.setOnClickListener(this);
        button_Divide.setOnClickListener(this);
        button_Percent.setOnClickListener(this);
        button_Multiply.setOnClickListener(this);
        button_OneByX.setOnClickListener(this);
        button_Minus.setOnClickListener(this);
        button_Plus.setOnClickListener(this);
        button_Equals.setOnClickListener(this);
        button_Point.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_0.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_reserved:
                recreate();
            case R.id.button_MC:
            case R.id.button_MR:
            case R.id.button_MPlus:
            case R.id.button_MMinus:
            case R.id.button_Erase:
            case R.id.button_CE:
            case R.id.button_SQR:
            case R.id.button_PlusMinus:
            case R.id.button_Divide:
            case R.id.button_Percent:
            case R.id.button_Multi:
            case R.id.button_OneByX:
            case R.id.button_Minus:
            case R.id.button_Plus:
            case R.id.button_Equals:
                Toast.makeText(getApplicationContext(), "Кнопка ещё не готова", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_Point:
                arithmetics.setDot(true);
                break;
            case R.id.button_C:
                arithmetics.eraseAll();
                break;
            case R.id.button_7:
                arithmetics.setButtonPressed(7);
//                button_7_onClick();
                break;
            case R.id.button_8:
                arithmetics.setButtonPressed(8);
//                button_8_onClick();
                break;
            case R.id.button_9:
                arithmetics.setButtonPressed(9);
//                button_9_onClick();
                break;
            case R.id.button_4:
                arithmetics.setButtonPressed(4);
//                button_4_onClick();
                break;
            case R.id.button_5:
                arithmetics.setButtonPressed(5);
//                button_5_onClick();
                break;
            case R.id.button_6:
                arithmetics.setButtonPressed(6);
//                button_6_onClick();
                break;
            case R.id.button_1:
                arithmetics.setButtonPressed(1);
//                button_1_onClick();
                break;
            case R.id.button_2:
                arithmetics.setButtonPressed(2);
//                button_2_onClick();
                break;
            case R.id.button_3:
                arithmetics.setButtonPressed(3);
//                button_3_onClick();
                break;
            case R.id.button_0:
                arithmetics.setButtonPressed(0);
//                button_0_onClick();
                break;
        }
    }


}
