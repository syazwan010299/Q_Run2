package com.example.q_run2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class purchases extends AppCompatActivity {

    ImageButton previous;
    String items[] = new String[]{"Maybank2U","Credit/Debit Card","CIMB Clicks","Public eBank"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchases);
        previous = findViewById(R.id.previous);

        final ListView listView = (ListView) findViewById(R.id.listview);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String choose = adapter.getItem(position).toString();
                switch (choose){
                    case "Maybank2U":
                        Toast.makeText(purchases.this,"Successful",Toast.LENGTH_SHORT).show();
                        String message = "You purchased using Maybank2U";
                        NotificationCompat.Builder builder = new NotificationCompat.Builder(
                                purchases.this
                        )
                                .setSmallIcon(R.drawable.ic_message)
                                .setContentTitle("New Notification")
                                .setContentText(message)
                                .setAutoCancel(true);

                        Intent intent = new Intent(purchases.this,Notification.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.putExtra("message",message);

                        PendingIntent pendingIntent = PendingIntent.getActivity(purchases.this,
                                0,intent,PendingIntent.FLAG_UPDATE_CURRENT);

                        builder.setContentIntent(pendingIntent);

                        NotificationManager notificationManager = (NotificationManager)getSystemService(
                                Context.NOTIFICATION_SERVICE
                        );
                        notificationManager.notify(0,builder.build());
                        break;
                    case "Credit/Debit Card":
                        String message1 = "You purchased using Credit/Debit Card";
                        NotificationCompat.Builder builder1 = new NotificationCompat.Builder(
                                purchases.this
                        )
                                .setSmallIcon(R.drawable.ic_message)
                                .setContentTitle("New Notification")
                                .setContentText(message1)
                                .setAutoCancel(true);

                        Intent intent1 = new Intent(purchases.this,Notification.class);
                        intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent1.putExtra("message",message1);

                        PendingIntent pendingIntent1 = PendingIntent.getActivity(purchases.this,
                                0,intent1,PendingIntent.FLAG_UPDATE_CURRENT);

                        builder1.setContentIntent(pendingIntent1);

                        NotificationManager notificationManager1 = (NotificationManager)getSystemService(
                                Context.NOTIFICATION_SERVICE
                        );
                        notificationManager1.notify(0,builder1.build());
                        break;
                    case "CIMB Clicks":
                        Toast.makeText(purchases.this,"Successful",Toast.LENGTH_SHORT).show();
                        String message2 = "You purchased using CIMB Clicks";
                        NotificationCompat.Builder builder2 = new NotificationCompat.Builder(
                                purchases.this
                        )
                                .setSmallIcon(R.drawable.ic_message)
                                .setContentTitle("New Notification")
                                .setContentText(message2)
                                .setAutoCancel(true);

                        Intent intent2 = new Intent(purchases.this,Notification.class);
                        intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent2.putExtra("message",message2);

                        PendingIntent pendingIntent2 = PendingIntent.getActivity(purchases.this,
                                0,intent2,PendingIntent.FLAG_UPDATE_CURRENT);

                        builder2.setContentIntent(pendingIntent2);

                        NotificationManager notificationManager2 = (NotificationManager)getSystemService(
                                Context.NOTIFICATION_SERVICE
                        );
                        notificationManager2.notify(0,builder2.build());
                        break;
                    case "Public eBank":
                        Toast.makeText(purchases.this,"Successful",Toast.LENGTH_SHORT).show();
                        String message3 = "You purchased using Public eBank";
                        NotificationCompat.Builder builder3 = new NotificationCompat.Builder(
                                purchases.this
                        )
                                .setSmallIcon(R.drawable.ic_message)
                                .setContentTitle("New Notification")
                                .setContentText(message3)
                                .setAutoCancel(true);

                        Intent intent3 = new Intent(purchases.this,Notification.class);
                        intent3.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent3.putExtra("message",message3);

                        PendingIntent pendingIntent3 = PendingIntent.getActivity(purchases.this,
                                0,intent3,PendingIntent.FLAG_UPDATE_CURRENT);

                        builder3.setContentIntent(pendingIntent3);

                        NotificationManager notificationManager3 = (NotificationManager)getSystemService(
                                Context.NOTIFICATION_SERVICE
                        );
                        notificationManager3.notify(0,builder3.build());
                        break;

                }
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                purchases.super.onBackPressed();
            }
        });
    }
}
