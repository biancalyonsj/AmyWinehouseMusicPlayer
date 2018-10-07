package com.example.android.amywinehousemusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class LionessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_tracks);

        //Array of Tracks
        String[] tracks = new String[11];
        tracks[0] = "Our Day Will Come";
        tracks[1] = "Between The Cheats";
        tracks[2] = "Tears Dry - Original Version";
        tracks[3] = "Will You Still Love Me Tomorrow? - 2011";
        tracks[4] = "Like Smoke";
        tracks[5] = "The Girl From Ipanema";
        tracks[6] = "Half Time";
        tracks[7] = "Wake Up Alone - Original Recording";
        tracks[8] = "Best Friends, Right?";
        tracks[9] = "Body and Soul";
        tracks[10] = "A Song For You";

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tracks);
        ListView listView = (ListView) findViewById(R.id.trackView);
        listView.setAdapter(itemsAdapter);

        //Recieve Intent and set it as the Album Cover
        Intent mIntent = getIntent();
        int album_picture = mIntent.getIntExtra("album_cover",R.drawable.lioness);
        ImageView album = (ImageView) findViewById(R.id.album_cover);
        album.setImageResource(album_picture);

        //Set the TextView underneath album cover to current album title
        TextView title = (TextView) findViewById(R.id.album_title);
        String currentAlbum = "Lioness: Hidden Treasures";
        title.setText(currentAlbum);

    }
}
