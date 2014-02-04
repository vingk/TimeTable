package com.timetable;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}
	
	public void TodayTime(View view){
		Intent day = new Intent(this, DayActivity.class);
		startActivity(day);
	}
	
	public void NextClass(View view){
		Intent next = new Intent(this, NextActivity.class);
		startActivity(next);
	}
	
	public void NextDay(View view){
		Intent nextday = new Intent(this, NextDayActivity.class);
		startActivity(nextday);
	}


}
