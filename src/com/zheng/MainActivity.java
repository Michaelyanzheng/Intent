package com.zheng;

import java.io.File;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btnStartOtherActivity;
	private Button btnOpenImage;
	private Button btnCall10086;
	private Button btnBaidu;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnStartOtherActivity = (Button) findViewById(R.id.btnStartOtherActivity);
		btnStartOtherActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

//				Intent intent = new Intent(MainActivity.this,OtherActivity.class);
//				startActivity(intent);
				
//				Intent intent = new Intent();
//				intent.setAction("com.zheng.OA");
//				startActivity(intent);
				
				Intent intent = new Intent();
				intent.setComponent(new ComponentName("com.zheng","com.zheng.OtherActivity"));
				startActivity(intent);
				
			}
		});
		
		btnOpenImage = (Button) findViewById(R.id.btnOpenImage);
		btnOpenImage.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				File file = new File("/mnt/sdcard/abc34.png");
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setDataAndType(Uri.fromFile(file), "image/*");
				startActivity(intent);
				
			}
		});
		btnCall10086 = (Button) findViewById(R.id.btnCall10086);
		btnCall10086.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("tel:10086"));
				startActivity(intent);
				
			}
		});
		btnBaidu = (Button) findViewById(R.id.btnBaidu);
		btnBaidu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.baidu.com"));
				startActivity(intent);
				
			}
		});

	}

}

















