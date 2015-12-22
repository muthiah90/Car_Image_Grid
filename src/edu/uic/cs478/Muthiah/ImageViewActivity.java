package edu.uic.cs478.Muthiah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewActivity extends Activity {
	
	int imageId;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		Intent intent = getIntent();

		ImageView imageView = new ImageView(getApplicationContext());

		// Getting the image position from the intent
		imageId = intent.getIntExtra("EXT_RESOURCE_POS", 0);

		// Fetching and setting the image to be displayed in full screen
		imageView.setImageResource(ImageAdapter.cars[imageId]);
		imageView.setScaleType(ImageView.ScaleType.FIT_XY);

		setContentView(imageView);
	}

}
