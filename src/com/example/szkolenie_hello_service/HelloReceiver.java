package com.example.szkolenie_hello_service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class HelloReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "Service sais hello BR!",
				Toast.LENGTH_SHORT).show();

	}

}
