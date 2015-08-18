package com.cjz.activities;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import com.cjz.R;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * 
 * @author ChengJunzhang
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initViews();
	}

	protected Context mContext;
	protected SimpleDraweeView mTestBaidu;

	private void initViews() {
		mContext = this;
		mTestBaidu = (SimpleDraweeView) findViewById(R.id.test_baidu);
		Uri uri = Uri.parse("https://www.baidu.com/img/bd_logo1.png");
		mTestBaidu.setImageURI(uri);
	}

}
