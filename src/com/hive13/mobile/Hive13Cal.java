package com.hive13.mobile;

import java.net.MalformedURLException;
import java.net.URL;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
/*
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.sample.calendar.v2.model.BatchOperation;
import com.google.api.client.sample.calendar.v2.model.BatchStatus;
import com.google.api.client.sample.calendar.v2.model.CalendarClient;
import com.google.api.client.sample.calendar.v2.model.CalendarEntry;
import com.google.api.client.sample.calendar.v2.model.CalendarFeed;
import com.google.api.client.sample.calendar.v2.model.CalendarUrl;
import com.google.api.client.sample.calendar.v2.model.EventEntry;
import com.google.api.client.sample.calendar.v2.model.EventFeed;
import com.google.api.client.sample.calendar.v2.model.Util;
import com.google.api.client.sample.calendar.v2.model.When;
import com.google.api.client.util.DateTime;
*/

public class Hive13Cal extends Activity {
	public String Hive13Feed = "https://www.google.com/calendar/feeds/hive13.org_udjdae3tclqjlm6o9uu7t3pp7g%40group.calendar.google.com/public/basic";
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
			URL HiveFeedUrl = new URL(Hive13Feed);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		CalendarClient calClient = new CalendarClient();
        TextView textview = new TextView(this);
        textview.setText("Hive13 Events coming soon");
        setContentView(textview);
    }
}
