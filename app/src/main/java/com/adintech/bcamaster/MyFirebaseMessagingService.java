package com.adintech.bcamaster;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;

import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Random;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        showNotification(remoteMessage.getNotification().getBody());
    }
    public void showNotification(String message){

        PendingIntent pi=PendingIntent.getActivity(this,0, new Intent(this,MainActivity.class),0);

        Notification notification = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.notification)  //a resource for your custom small icon
                .setContentTitle("BCA Master") //the "title" value you sent in your notification
                .setContentText(message) //ditto
                .setContentIntent(pi)
                .setAutoCancel(true)  //dismisses the notification on click
                .build();

        NotificationManager notificationManager =
                (NotificationManager) getSystemService(MyFirebaseMessagingService.this.NOTIFICATION_SERVICE);

        notificationManager.notify(0, notification);
    }

}