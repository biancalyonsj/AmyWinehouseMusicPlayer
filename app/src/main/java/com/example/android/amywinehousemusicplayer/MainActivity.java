package com.example.android.amywinehousemusicplayer;

import android.app.Activity;
import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create an Array of Amy Winehouse objects
        final ArrayList<WinehouseAlbums> winehouseAlbums = new ArrayList<WinehouseAlbums>();
        winehouseAlbums.add(new WinehouseAlbums("Lioness: Hidden Treasures", "12", R.drawable.lioness));
        winehouseAlbums.add(new WinehouseAlbums("Frank", "17", R.drawable.frank2));
        winehouseAlbums.add(new WinehouseAlbums("Back To Black: B-Sides", "8", R.drawable.bside));
        winehouseAlbums.add(new WinehouseAlbums("Back To Black", "11", R.drawable.black));
        winehouseAlbums.add(new WinehouseAlbums("Frank", "15", R.drawable.frank1));

        WinehouseAlbumsAdapter adapter = new WinehouseAlbumsAdapter(this, winehouseAlbums);

        //Find the Listview and set the adapter on desired ListView
        ListView listView = (ListView) findViewById(R.id.listview_albums);
        listView.setAdapter(adapter);

        //Set a click listener on that View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //The code in this method will be executed when the corresponding object is clicked on
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 4) {
                    Intent myIntent = new Intent(view.getContext(), FrankActivity.class);
                    myIntent.putExtra("album_cover",R.drawable.frank1);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 3) {
                    Intent myIntent = new Intent(view.getContext(), BlackActivity.class);
                    myIntent.putExtra("album_cover",R.drawable.black);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 2) {
                    Intent myIntent = new Intent(view.getContext(), BsideActivity.class);
                    myIntent.putExtra("album_cover",R.drawable.bside);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 0) {
                    Intent myIntent = new Intent(view.getContext(), LionessActivity.class);
                    myIntent.putExtra("album_cover",R.drawable.lioness);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 1) {
                    Intent myIntent = new Intent(view.getContext(), NewFrankActivity.class);
                    myIntent.putExtra("album_cover",R.drawable.frank2);
                    startActivityForResult(myIntent, 0);
                }
            }
        });
    }

}
