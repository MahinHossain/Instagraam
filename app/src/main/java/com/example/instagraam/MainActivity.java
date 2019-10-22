package com.example.instagraam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;
import com.shashank.sony.fancytoastlib.FancyToast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button SignUpbtn,SignInbtn;
    EditText UsernameTv,EmailTv,PaswordTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("SignUp");

        SignInbtn=findViewById(R.id.loginId);
        SignUpbtn=findViewById(R.id.signupId);

        UsernameTv=findViewById(R.id.edtSignUpUserName);
        EmailTv=findViewById(R.id.edtEmailSignupid);
        PaswordTv=findViewById(R.id.edtSignUpPasswordId);

        SignInbtn.setOnClickListener(this);
        SignUpbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case
                R.id.signupId:
                final ParseUser appuser=new ParseUser();
            appuser.setEmail(EmailTv.getText().toString());
            appuser.setUsername(UsernameTv.getText().toString());
            appuser.setPassword(PaswordTv.getText().toString());
            appuser.signUpInBackground(new SignUpCallback() {
                @Override
                public void done(ParseException e) {
                    if (e==null){

                        FancyToast.makeText(MainActivity.this,appuser.getUsername()+
                                        " is signUp Successfully !"
                                ,FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();
                    }
                    else
                        FancyToast.makeText(MainActivity.this,e+"",FancyToast.
                                LENGTH_LONG,FancyToast.ERROR,true).show();
                }
            });
                break;

            case
                    R.id.loginId:

                Intent intent=new Intent(MainActivity.this,LogIn.class);
            startActivity(intent);
                break;
        }



    }
}
