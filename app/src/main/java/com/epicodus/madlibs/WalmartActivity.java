package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class WalmartActivity extends AppCompatActivity {

    @Bind(R.id.editText1)
    EditText mEditText1;
    @Bind(R.id.editText2) EditText mEditText2;
    @Bind(R.id.editText3) EditText mEditText3;
    @Bind(R.id.editText4) EditText mEditText4;
    @Bind(R.id.editText5) EditText mEditText5;
    @Bind(R.id.editText6) EditText mEditText6;
    @Bind(R.id.editText7) EditText mEditText7;
    @Bind(R.id.editText8) EditText mEditText8;
    @Bind(R.id.submitButton)
    Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walmart);

        ButterKnife.bind(this);

        mSubmitButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String editText1 = mEditText1.getText().toString();
                String editText2 = mEditText2.getText().toString();
                String editText3 = mEditText3.getText().toString();
                String editText4 = mEditText4.getText().toString();
                String editText5 = mEditText5.getText().toString();
                String editText6 = mEditText6.getText().toString();
                String editText7= mEditText7.getText().toString();
                String editText8 = mEditText8.getText().toString();
                Intent intent = new Intent(WalmartActivity.this, ResultsActivity.class);

                String str = "Come " + editText1 +" at WALMART, where you'll recieve " + editText2 +
                        " discounts on all of your favorite brand name " + editText3 + ". " + editText4 +
                        " for the moms, " + editText5 + " for the kids and all the latest electronics " +
                        "for the " + editText6 + ". So come on down to your " + editText7 + " WALMART where the " + editText8 + " come first.";

                intent.putExtra("story", str);
                startActivity(intent);
            }
        });
    }
}
