package edu.uic.cs478.Muthiah;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter 
{

	// Context declaration
	private Context mContext;

	// This array of cars contains the drawable reference to all the images
	// thats shown in the grid view
	public static Integer[] cars = { R.drawable.avalon, R.drawable.bmwi3,
			R.drawable.bmwi8, R.drawable.bmws2, R.drawable.camry,
			R.drawable.corolla, R.drawable.highlander, R.drawable.landcruiser,
			R.drawable.lexus_ct, R.drawable.lexus_g, R.drawable.lexus_ls,
			R.drawable.prius, R.drawable.tundra, R.drawable.volt,
			R.drawable.accura_ilx, R.drawable.accura_mdx,
			R.drawable.accura_rlx, R.drawable.ghost, R.drawable.kia_forte,
			R.drawable.kia_optima, R.drawable.sonata, R.drawable.rav4,
			R.drawable.runner, R.drawable.sequoia };
	
	// Constants for setting the image height, width and padding
	private int imageWidth = 350;
	private int imageHeight = 350;
	private int imagePadding = 8;

	// Constructor ImageAdapter class
	public ImageAdapter(Context C) 
	{
		mContext = C;
	}

	@Override
	public int getCount() 
	{
		return cars.length;
	}

	@Override
	public Object getItem(int position) 
	{
		return null;
	}

	@Override
	public long getItemId(int position) 
	{
		return 0;
	}

	/**
	 * This method returns the grid view to be displayed in the activity
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) 
	{
		ImageView imageView;
		
		// This checks for an exiting Image View. If it exists then the same is
		// re used and if not then a new Image View is created and passed for
		// display
		if (convertView == null) {
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(imageWidth,
					imageHeight));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(0, imagePadding, 0, 0);
		} else {
			imageView = (ImageView) convertView;
		}

		imageView.setImageResource(cars[position]);
		return imageView;
	}

}
