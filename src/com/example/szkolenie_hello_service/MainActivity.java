package com.example.szkolenie_hello_service;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	private HelloBroadcastReceiver helloBroadcastReceiver;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				sayHelloService();

			}
		});
	}

	protected void sayHelloService() {
		startService(new Intent(this, HelloService.class));
	}

	@Override
	protected void onStart() {
		super.onStart();
		helloBroadcastReceiver = new HelloBroadcastReceiver();
		registerReceiver(helloBroadcastReceiver, new IntentFilter(
				HelloService.ACTION_SERVICE_FINISHED));
	}

	@Override
	protected void onStop() {
		super.onStop();
		unregisterReceiver(helloBroadcastReceiver);
	}

	class HelloBroadcastReceiver extends BroadcastReceiver {

		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity.this, "Service sais hello",
					Toast.LENGTH_SHORT).show();
		}

	}
}
