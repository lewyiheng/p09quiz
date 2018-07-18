package com.example.a17010407.p09quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvForm;
    ArrayList<FormulaStuff> alFormulaList;
    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvForm = findViewById(R.id.ListViewFormula);

        alFormulaList = new ArrayList<>();
        FormulaStuff item1 = new FormulaStuff("Area of Rectangle", "Length x Length","Formula type is: Area");
        FormulaStuff item2 = new FormulaStuff("Area of Triangle", "(Length of base x Length)/2)","Formula type is: Area");
        FormulaStuff item3 = new FormulaStuff("Volume of Cube", "Length x Length x Length","Formula type is: Volume");


        alFormulaList.add(item1);
        alFormulaList.add(item2);
        alFormulaList.add(item3);


        caFormula = new CustomAdapter(this, R.layout.formulainfo, alFormulaList);
        lvForm.setAdapter(caFormula);
    }}
