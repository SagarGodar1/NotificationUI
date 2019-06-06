package com.example.notificationui;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        private Button btnDisplayNotification;
        private Button btnDisplayNotification2;
        NotificationManagerCompat notificationManagerCompat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplayNotification = findViewById(R.id.btnDisplayNotification);
        btnDisplayNotification2 = findViewById(R.id.btnDisplayNotification2);
        notificationManagerCompat = NotificationManagerCompat.from(this);
        
        btnDisplayNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification();
            }
        });
        
        btnDisplayNotification2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification2();
            }
        });
    }

    private void DisplayNotification2() {
    }

    private void DisplayNotification() {
    }
}
