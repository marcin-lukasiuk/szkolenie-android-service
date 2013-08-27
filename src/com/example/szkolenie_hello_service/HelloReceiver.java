package com.example.szkolenie_hello_service;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

public class HelloReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {


		Notification notification = new NotificationCompat.Builder(context)
		.setSmallIcon(R.drawable.ic_launcher)
				.setContentTitle("Hi!").setContentText("Content")
				.setTicker("Hi Ticker").build();
		
		NotificationManager notificationManager = (NotificationManager) context
				.getSystemService(Context.NOTIFICATION_SERVICE);
		
		notificationManager.notify(0, notification);
	}

}
