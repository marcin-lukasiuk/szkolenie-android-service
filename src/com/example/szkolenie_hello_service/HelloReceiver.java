package com.example.szkolenie_hello_service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

public class HelloReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {

		PendingIntent pendingIntent = PendingIntent.getActivity(
				context,
				0,
				new Intent(context, MainActivity.class),
				PendingIntent.FLAG_UPDATE_CURRENT);
		
		Notification notification = new NotificationCompat.Builder(context)
				.setSmallIcon(R.drawable.ic_launcher)
				.setContentTitle("Hi!")
				.setContentText("Content")
				.setTicker("Hi Ticker")
				.setContentIntent(pendingIntent)
				.setAutoCancel(true)
				.build();
		
		NotificationManager notificationManager =
				(NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
		
		notificationManager.notify(0, notification);
	}

}
