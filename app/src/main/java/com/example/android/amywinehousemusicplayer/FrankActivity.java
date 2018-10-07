package com.example.android.amywinehousemusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class FrankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_tracks);

        //Array of Tracks
        String[] tracks = new String[15];
        tracks[0] = "Intro / Stronger Than Me";
        tracks[1] = "You Sent Me Flying / Cherry";
        tracks[2] = "Know You Now";
        tracks[3] = "F Me Pumps";
        tracks[4] = "I Heard Love Is Blind";
        tracks[5] = "Moody's Mood For Love / Teo Licks";
        tracks[6] = "(There Is) No Greater Love";
        tracks[7] = "In My Bed";
        tracks[8] = "Take The Box";
        tracks[9] = "October Song";
        tracks[10] = "What Is It About Men";
        tracks[11] = "Amy Amy Amy";
        tracks[12] = "Outro";
        tracks[13] = "Brother";
        tracks[14] = "Mr Magic (Through The Smoke)";

        //Use Adapter to list tracks. This adapter knows how to create a list for each track in the array
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tracks);

        //Find the ListView with the id trackView
        ListView listView = (ListView) findViewById(R.id.trackView);
        //Set adapter to the desired ListView
        listView.setAdapter(itemsAdapter);

        //Recieve Intent and set it as the Album Cover
        Intent mIntent = getIntent();
        int album_picture = mIntent.getIntExtra("album_cover",R.drawable.frank1);
        ImageView album = (ImageView) findViewById(R.id.album_cover);
        album.setImageResource(album_picture);

        //Set the TextView underneath album cover to current album title
        TextView title = (TextView) findViewById(R.id.album_title);
        String currentAlbum = "Frank";
        title.setText(currentAlbum);

    }
}


