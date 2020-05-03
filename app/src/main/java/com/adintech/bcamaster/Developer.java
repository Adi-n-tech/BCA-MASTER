package com.adintech.bcamaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
    }

    public void mail(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "adintech.solutions@gmail.com" });
        intent.putExtra(Intent.EXTRA_SUBJECT, "Application Feedback");
        startActivity(Intent.createChooser(intent, "Contact Us!"));
    }

    public void gmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plain/text");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "adintech.solutions@gmail.com" });
        intent.putExtra(Intent.EXTRA_SUBJECT, "Application Feedback");
        startActivity(Intent.createChooser(intent, "Contact Us!"));
    }
    public void youtube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/c/ADINTECH" ));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/channel/UCmbLAFOiUxzs3F-f33vsV2Q?view_as=subscriber"));
        try {
            this.startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            this.startActivity(webIntent);
        }
    }
    public void fb(View view) {
        Intent intent;
        try {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/Adintech.youtuber"));
        } catch (Exception e) {
            intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Adintech.youtuber"));
        }
        startActivity(intent);
    }

    public void twitter(View view) {
        Intent intent = null;
        try {
            // get the Twitter app if possible
            this.getPackageManager().getPackageInfo("com.twitter.android", 0);
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?screen_name=Adityanandardh3"));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        } catch (Exception e) {
            // no Twitter app, revert to browser
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Adityanandardh3"));
        }
        this.startActivity(intent);
    }

    public void insta(View view) {
        Uri uri = Uri.parse("http://instagram.com/_u/adi_n_tech/");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/adi_n_tech/")));
        }
    }

    public void linkin(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.linkedin.com/in/aditya-nandardhane-0b9153148/l"));
        startActivity(i);
    }

    public void whatsapp(View view) {
        try {
            String mobile = "919309877624";
            String msg = "Hello Adi n tech !!! .... i am ";
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=" + mobile + "&text=" + msg)));
        }catch (Exception e){
            Toast.makeText(this, "Whats app not installed in your device !!", Toast.LENGTH_SHORT).show();
        }
    }

    public void donate(View view) {
        Intent it=new Intent(Developer.this,Donate.class);
        startActivity(it);
    }
}
