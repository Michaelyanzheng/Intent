package com.zheng;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewer extends Activity {

	private ImageView imageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		imageView = new ImageView(this);
		setContentView(imageView);
		imageView.setImageURI(getIntent().getData());
		
		
	}
}
