package com.example.fitfinessee.JadwalWoPage.broadcastReceiver;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.fitfinessee.R;
import com.example.fitfinessee.JadwalWoPage.activity.AlarmActivity;

public class AlarmBroadcastReceiver extends BroadcastReceiver {

    String title, desc, date, time;
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            title = intent.getStringExtra("TITLE");
            desc = intent.getStringExtra("DESC");
            date = intent.getStringExtra("DATE");
            time = intent.getStringExtra("TIME");

            if (ActivityCompat.checkSelfPermission(context, Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED &&
                    ActivityCompat.checkSelfPermission(context, Manifest.permission.WAKE_LOCK) == PackageManager.PERMISSION_GRANTED) {

                if (intent.getAction() != null && intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
                    Toast.makeText(context, "Alarm baru saja berbunyi...", Toast.LENGTH_SHORT).show();
                }
                NotificationCompat.Builder notification = new NotificationCompat.Builder(context, "123")
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("Name")
                        .setContentText("Name")
                        .setPriority(NotificationCompat.PRIORITY_HIGH);

                NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(context);
                notificationManagerCompat.notify(200, notification.build());
                Toast.makeText(context, "Waktunya mengerjakan tugasmu", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(context, AlarmActivity.class);
                i.putExtra("TITLE", title);
                i.putExtra("DESC", desc);
                i.putExtra("DATE", date);
                i.putExtra("TIME", time);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);

            } else {
                // Handle the case where permissions are not granted
                Toast.makeText(context, "Izin yang diperlukan tidak diberikan", Toast.LENGTH_SHORT).show();
            }
        }
    }
}