package com.navigation.drawer.activity;

import android.os.Bundle;
import android.widget.ImageView;

/**
 * Maps Main Function
 *
 */
public class Item3Activity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		/**
		 * Adding our layout to parent class frame layout.
		 */
		getLayoutInflater().inflate(R.layout.item_3_layout, frameLayout);
		
		/**
		 * Setting title and itemChecked  
		 */
		mDrawerList.setItemChecked(position, true);
		setTitle(listArray[position]);
		
		//((ImageView)findViewById(R.id.image_view)).setBackgroundResource(R.drawable.image3);
	}
}
