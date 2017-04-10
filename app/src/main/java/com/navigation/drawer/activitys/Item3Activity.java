package com.navigation.drawer.activitys;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.widget.LinearLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

import static com.navigation.drawer.activitys.R.id.map_fragment;


/**
 * Maps Main Function
 *
 */
public class Item3Activity extends BaseActivity  {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getLayoutInflater().inflate(R.layout.item_3_layout, frameLayout);


        mDrawerList.setItemChecked(position, true);
        setTitle(listArray[position]);


	}

    private void setUpMapIfNeeded() {
        if (mMap != null) {
            return;
        }


        //mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map_fragment)).getMap();

       // mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map_fragment)).getMap();

       // mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(map_fragment)).getMap();

        if (mMap == null) {
            return;
        }
        // Initialize map options. For example:
        // mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }


}
