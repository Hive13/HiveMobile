package com.hive13.mobile;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class Hive13Spy extends Activity {
	public String spycam_url = "http://shell.hive13.org/webcam1/fullsize.jpg";
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Drawable image = ImageOperations(this,spycam_url,"spycam1.jpg");
		ImageView imgView = new ImageView(this);
		imgView.setImageDrawable(image);
        setContentView(imgView);
    }
    
	private Drawable ImageOperations(Context ctx, String url, String saveFilename) {
		try {
			InputStream is = (InputStream) this.fetch(url);
			Drawable d = Drawable.createFromStream(is, "src");
			return d;
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Object fetch(String address) throws MalformedURLException,IOException {
		URL url = new URL(address);
		Object content = url.getContent();
		return content;
	}
}
