package com.cjz;

import com.facebook.drawee.backends.pipeline.Fresco;

import android.app.Application;

/**
 * 集成Fresco eclipse环境可用
 * 
 * @author ChengJunzhang
 *
 */
public class CJZApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		Fresco.initialize(this);
	}

}
