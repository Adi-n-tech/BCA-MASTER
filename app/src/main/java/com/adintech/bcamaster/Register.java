package com.adintech.bcamaster;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    ProgressDialog mProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);  //will hide the title
        getSupportActionBar().hide();                   // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_register);
        final EditText emailId, passwd,pass;
        Button SignUp;
        TextView signIn;
        final FirebaseAuth firebaseAuth;
        firebaseAuth = FirebaseAuth.getInstance();
        emailId = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        passwd = findViewById(R.id.password);
        SignUp = findViewById(R.id.btnSignUp);
        signIn = findViewById(R.id.TVSignIn);

        mProgress = new ProgressDialog(this,mProgress.THEME_HOLO_DARK);
        /*mProgress.setTitle("Processing...");*/
        mProgress.setMessage("Please wait...");
        mProgress.setCancelable(false);
        mProgress.setIndeterminate(true);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mProgress.show();
                String emailID = emailId.getText().toString();
                String paswd = passwd.getText().toString();
                String pas=pass.getText().toString();
                if (emailID.isEmpty()) {
                    mProgress.dismiss();
                    emailId.setError("Provide your Email first!");
                    emailId.requestFocus();
                } else if (paswd.isEmpty()) {
                    mProgress.dismiss();
                    passwd.setError("Set your password");
                    passwd.requestFocus();
                }else if (pas.isEmpty()) {
                    mProgress.dismiss();
                    passwd.setError("Set your password");
                    passwd.requestFocus();
                }
                else if(!(passwd.length()>=6)) {
                    mProgress.dismiss();
                    passwd.setError("Password must be minimum 6 digit !");
                }
                else if (emailID.isEmpty() && paswd.isEmpty()) {
                    mProgress.dismiss();
                    Toast.makeText(Register.this, "Fields Empty!", Toast.LENGTH_SHORT).show();
                } else if (!(emailID.isEmpty() && paswd.isEmpty())) {
                    firebaseAuth.createUserWithEmailAndPassword(emailID, paswd).addOnCompleteListener(Register.this, new OnCompleteListener() {
                        @Override
                        public void onComplete(@NonNull Task task) {

                            if (!task.isSuccessful()) {
                                mProgress.dismiss();
                                Toast.makeText(Register.this.getApplicationContext(),
                                        "SignUp unsuccessful !! email id not valid ",
                                        Toast.LENGTH_SHORT).show();
                            } else {
                                mProgress.dismiss();
                                startActivity(new Intent(Register.this, MainActivity.class));
                            }
                        }
                    });
                } else {
                    mProgress.dismiss();
                    Toast.makeText(Register.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(Register.this, Login.class);
                startActivity(I);
                finish();
            }
        });
    }
}