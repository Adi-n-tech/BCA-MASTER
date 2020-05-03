package com.adintech.bcamaster;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.legacy.app.ActionBarDrawerToggle;

import android.app.ActivityOptions;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Explode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    AdView mAdview;
    CardView syll,notes,lmr,pque,interview,programming;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      MobileAds.initialize(this,"ca-app-pub-1082981046237684~9403814471");

        mAdview=findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);


        syll=findViewById(R.id.syllabus);
        notes=findViewById(R.id.notes);
        lmr=findViewById(R.id.lmr);
        pque=findViewById(R.id.pque);
        interview=findViewById(R.id.interview);
        programming=findViewById(R.id.programming);
        syll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, SyllabusActivity.class);
                startActivity(it);
            }
        });
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, NotesActivity.class);
                startActivity(it);
            }
        });
        pque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, PossQueActivity.class);
                startActivity(it);
            }
        });
        interview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, InterviewQueActivity.class);
                startActivity(it);
            }
        });
        programming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ProgLangActivity.class);
                startActivity(it);
            }
        });
        lmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, LmrActivity.class);
                startActivity(it);
            }
        });
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        /*builder.setTitle("Please confirm");*/
        builder.setMessage("Do you want to exit the app?");
        builder.setCancelable(true);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finishAffinity();
                MainActivity.super.onBackPressed();
            }
            });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this,"thank you !!!",Toast.LENGTH_SHORT).show();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int itemId = item.getItemId();
        if(itemId==R.id.Notification){
            Intent it=new Intent(this,Notification.class);
            startActivity(it);
        }
        if(itemId==R.id.share){
            Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT,"Hello Students..This Application" +
                    "is very useful for Computer Science Students and Specially for " +
                    "BCA student for Study Material Like Notes, Syllabus, Question Papers, " +
                    "Programming skills, Interview Questions and so on ...So Download this app from play store");
          /*  String app_url = " https://play.google.com/store/apps/details?id=";*/
            /*shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,app_url);*/
            startActivity(shareIntent);
        }
        if(itemId==R.id.feedback){
            Intent it=new Intent(this, Developer.class);
            startActivity(it);
        }
        if(itemId==R.id.logout){
            FirebaseAuth.getInstance().signOut();
            Intent it=new Intent(this, Login.class);
            startActivity(it);
        }

        if(itemId==R.id.Result){
            Intent it=new Intent(this, Result.class);
            startActivity(it);
        }
        return true;
    }
};
