package com.example.instagraam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {
    private EditText edtEmail,EdtPassrof;
    Button login,signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);


        edtEmail=findViewById(R.id.edtEmailSignupid);
        EdtPassrof=findViewById(R.id.edtSignUpPasswordId);
        login=findViewById(R.id.loginId);
        signUp=findViewById(R.id.signupId);
        
    }
}
