package com.example.szkolenie_hello_service;

import android.app.IntentService;
import android.content.Intent;

public class HelloService extends IntentService {

	public static final String ACTION_SERVICE_FINISHED = "HELLO_SERVICE_HAS_FINISHED";

	public HelloService() {
		super("HelloServiceWorker");
	}

	@Override
	protected void onHandleIntent(Intent arg0) {
		supportLongOpperation();
		
		Intent result = new Intent(ACTION_SERVICE_FINISHED);
		sendBroadcast(result);
	}

	private void supportLongOpperation() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
