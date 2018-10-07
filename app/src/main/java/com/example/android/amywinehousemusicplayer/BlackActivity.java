package com.example.android.amywinehousemusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class BlackActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_tracks);

        //Array of Tracks
        String[] tracks = new String[11];
        tracks[0] = "Rehab";
        tracks[1] = "You Know I'm No Good";
        tracks[2] = "Me & Mr Jones";
        tracks[3] = "Just Friends";
        tracks[4] = "Back To Black";
        tracks[5] = "Love Is A Losing Game";
        tracks[6] = "Tears Dry On Their Own";
        tracks[7] = "Wake Up Alone";
        tracks[8] = "Some Unholy War";
        tracks[9] = "He Can Only Hold Her";
        tracks[10] = "Addicted";

        //Use Adapter to list tracks. This adapter knows how to create a list for each track in the array
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tracks);

        //Find the ListView with the id trackView
        ListView listView = (ListView) findViewById(R.id.trackView);
        //Set adapter to the desired ListView
        listView.setAdapter(itemsAdapter);

        //Recieve Intent and set it as the Album Cover
        Intent mIntent = getIntent();
        int album_picture = mIntent.getIntExtra("album_cover",R.drawable.black);
        ImageView album = (ImageView) findViewById(R.id.album_cover);
        album.setImageResource(album_picture);

        //Set the TextView underneath album cover to current album title
        TextView title = (TextView) findViewById(R.id.album_title);
        String currentAlbum = "Back To Black";
        title.setText(currentAlbum);

    }
}
