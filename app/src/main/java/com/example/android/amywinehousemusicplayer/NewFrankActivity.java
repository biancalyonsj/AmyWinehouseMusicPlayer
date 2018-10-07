package com.example.android.amywinehousemusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class NewFrankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_tracks);

        //Array of Tracks
        String[] tracks = new String[17];
        tracks[0] = "Take The Box - Demo";
        tracks[1] = "I Heard Love Is Blind - Demo";
        tracks[2] = "Someone To Watch Over Me - Demo";
        tracks[3] = "What It Is - Demo";
        tracks[4] = "Teach Me Tonight - Live At The Hootenanny, London / 2004";
        tracks[5] = "'Round Midnight";
        tracks[6] = "Fool's Gold";
        tracks[7] = "Stronger Than Me - Later With Jools Holland, London / 2003";
        tracks[8] = "I Heard Love Is Blind - Live";
        tracks[9] = "Take The Box - Live at Concorde, Brighton / 2008";
        tracks[10] = "In My Bed - Live At Concorde, Brighton / 2008";
        tracks[11] = "Mr Magic (Through The Smoke) - Live, Janice Long Session";
        tracks[12] = "(There is) No Greater Love - Live, Janice Long Session";
        tracks[13] = "F Me Pumps - MJ Cole Remix";
        tracks[14] = "Take The Box - Seijis Buggin' Mix";
        tracks[15] = "Stronger Than Me - Harmonic 33 Remix";
        tracks[16] = "In My Bed - CJ Mix";

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tracks);
        ListView listView = (ListView) findViewById(R.id.trackView);
        listView.setAdapter(itemsAdapter);

        //Recieve Intent and set it as the Album Cover
        Intent mIntent = getIntent();
        int album_picture = mIntent.getIntExtra("album_cover",R.drawable.frank2);
        ImageView album = (ImageView) findViewById(R.id.album_cover);
        album.setImageResource(album_picture);

        //Set the TextView underneath album cover to current album title
        TextView title = (TextView) findViewById(R.id.album_title);
        String currentAlbum = "Frank";
        title.setText(currentAlbum);

    }
}
