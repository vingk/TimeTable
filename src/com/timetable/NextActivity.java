package com.timetable;

import java.util.Calendar;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class NextActivity extends Activity {

	String[] subb={"FREE","COMPUTER GRAPHICS","COMPUTER NETWORKS","OOMD","AI","SMS","DIP","ADSA","MINI PROJECT"};
	//String[] timee={"8:00","9:00","10:30","11:30","12:30","2:30","3:30"};
	
	int[][] daytt={{},{1,2,7,7,4,0,2,0},{1,1,6,5,2,0,8,8},{3,3,7,5,5,0,0,0},{8,8,6,2,5,0,0,0},{4,4,1,2,3,0,0,0},{0,4,6,6,0,0,0,0}};
	
	Calendar rightnow= Calendar.getInstance();
	
	int daynum= rightnow.get(Calendar.DAY_OF_WEEK);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		int findsub=subjectfinder();
		String message;
		
		daynum--;
		
		if(daynum==0){
			message="SUNDAY DUDE"; }
		else if(findsub==8){
			message="NOT TILL TOMORROW";
			
		}
		else 
		{
			message=subb[daytt[daynum][findsub]];
		}
		
		//message=" "+findsub;
		
		TextView textview = new TextView(this);
		textview.setTextSize(40);
		textview.setText(message);

		setContentView(textview);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.next, menu);
		return true;
	}
	
	public int subjectfinder(){
		
		Calendar rightthis= Calendar.getInstance();
		int thishr=rightthis.get(Calendar.HOUR_OF_DAY);
		int thismn=rightthis.get(Calendar.MINUTE);
		
		if(thishr<8 )return 0;
		else if(thishr>=8 && thishr<9)return 1;
		else if(thishr>=9 && thishr<11 || (thishr==10 && thismn<30))return 2;
		else if((thishr==10 && thismn>30) || (thishr==11 && thismn<30))return 3;
		else if((thishr==11 && thismn>30) || (thishr==12 && thismn<30) )return 4;
		else if((thishr==12 && thismn>30) || (thishr==13 && thismn<30))return 5;
		else if((thishr==13 && thismn>30) || (thishr==14 && thismn<30))return 6;
		else if((thishr==14 && thismn>30) || (thishr==15 && thismn<30))return 7;
		else return 8;
		
		
		
		
	}

}
