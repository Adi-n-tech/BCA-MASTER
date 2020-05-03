package com.adintech.bcamaster;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Reset extends AppCompatActivity {
    EditText edtEmail;
    Button btnResetPassword;
    Button btnBack;
    FirebaseAuth mAuth;
    ProgressDialog mProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);  //will hide the title
        getSupportActionBar().hide();                   // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_reset);

        mProgress = new ProgressDialog(this,mProgress.THEME_HOLO_DARK                                       );
        /*mProgress.setTitle("Processing...");*/
        mProgress.setMessage("Please wait...");
        mProgress.setCancelable(false);
        mProgress.setIndeterminate(true);

            edtEmail = (EditText) findViewById(R.id.edt_reset_email);
            btnResetPassword = (Button) findViewById(R.id.btn_reset_password);

            mAuth = FirebaseAuth.getInstance();

            btnResetPassword.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mProgress.show();
                    String email = edtEmail.getText().toString().trim();

                    if (TextUtils.isEmpty(email)) {
                        mProgress.dismiss();
                        Toast.makeText(getApplicationContext(), "Enter your email!", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    mAuth.sendPasswordResetEmail(email)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        mProgress.dismiss();
                                        Toast.makeText(Reset.this, "Check email to reset your password !", Toast.LENGTH_SHORT).show();
                                    } else {
                                        mProgress.dismiss();
                                        Toast.makeText(Reset.this, "Fail to send reset password email !", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            });

        }

    }
