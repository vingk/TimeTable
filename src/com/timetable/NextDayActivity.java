package com.timetable;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class NextDayActivity extends Activity {

	
	String[] subb={"FREE","COMPUTER GRAPHICS","COMPUTER NETWORKS","OOMD","AI","SMS","DIP","ADSA","MINI PROJECT"};
	String[] timee={"8:00","9:00","10:30","11:30","12:30","1:30","2:30","3:30"};
	
	int[][] daytt={{},{1,2,7,7,4,0,2,0},{1,1,6,5,2,0,8,8},{3,3,7,5,5,0,0,0},{8,8,6,2,5,0,0,0},{4,4,1,2,3,0,0,0},{0,4,6,6,0,0,0,0}};
	
	Calendar rightnow= Calendar.getInstance();
	
	int daynum= rightnow.get(Calendar.DAY_OF_WEEK);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		int i,k;
		
		LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
      // layout.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        if(daynum==0){
        	 TextView titleView = new TextView(this);
             LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
             titleView.setLayoutParams(lparams);
             titleView.setTextAppearance(this, android.R.attr.textAppearanceLarge);
             titleView.setText("SUNDAY DUDE NO CLASSES");
             layout.addView(titleView);
        }
        for(i=0;i<8;i++){
        	k=i;
        TextView titleView = new TextView(this);
        LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        titleView.setLayoutParams(lparams);
        titleView.setTextAppearance(this, android.R.attr.textAppearanceLarge);
        titleView.setText(timee[k]+" ---  "+subb[daytt[daynum][k]]);
        layout.addView(titleView);
        
        }

        setContentView(layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.next_day, menu);
		return true;
	}

}
