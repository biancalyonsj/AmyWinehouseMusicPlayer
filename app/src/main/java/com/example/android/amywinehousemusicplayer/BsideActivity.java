package com.example.android.amywinehousemusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class BsideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_tracks);

        //Array of Tracks
        String[] tracks = new String[8];
        tracks[0] = "Valerie - Live At BBC Radio 1 Live Lounge, London / 2007";
        tracks[1] = "Cupid - Deluxe Edition Version";
        tracks[2] = "Monkey Man";
        tracks[3] = "Some Unholy War - Down Tempo";
        tracks[4] = "Hey Little Rich Girl";
        tracks[5] = "You're Wondering Now";
        tracks[6] = "To Know Him Is To Love Him - Live";
        tracks[7] = "Love Is A Losing Game - Original Demo";

        //Use Adapter to list tracks. This adapter knows how to create a list for each track in the array
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tracks);

        //Find the ListView with the id trackView
        ListView listView = (ListView) findViewById(R.id.trackView);
        //Set adapter to the desired ListView
        listView.setAdapter(itemsAdapter);

        //Recieve Intent and set it as the Album Cover
        Intent mIntent = getIntent();
        int album_picture = mIntent.getIntExtra("album_cover",R.drawable.bside);
        ImageView album = (ImageView) findViewById(R.id.album_cover);
        album.setImageResource(album_picture);

        //Set the TextView underneath album cover to current album title
        TextView title = (TextView) findViewById(R.id.album_title);
        String currentAlbum = "Back To Black: B-Sides";
        title.setText(currentAlbum);

    }
}
