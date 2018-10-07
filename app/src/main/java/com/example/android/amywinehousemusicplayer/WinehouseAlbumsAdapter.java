package com.example.android.amywinehousemusicplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WinehouseAlbumsAdapter extends ArrayAdapter<WinehouseAlbums> {

    public WinehouseAlbumsAdapter(Activity context, ArrayList<WinehouseAlbums> winehouseAlbums) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, winehouseAlbums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_albums, parent, false);
        }

        // Get the WinehouseAlbums object located at this position in the list
        WinehouseAlbums currentAlbum = getItem(position);

        // Find the TextView in the list_albums.xml layout with the ID albumName
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.albumName);

        // Get the version name from the current WinehouseAlbums object and
        // set this text on the name TextView
        albumTextView.setText(currentAlbum.getAlbumName());

        // Find the TextView in the list_albums.xml layout with the ID trackLength
        TextView trackTextView = (TextView) listItemView.findViewById(R.id.trackLength);

        // Get the version number from the current WinehouseAlbums object and
        // set this text on the number TextView
        trackTextView.setText(currentAlbum.getTrackLength());

        // Find the ImageView in the list_albums.xml layout with the ID albumIcon
        ImageView albumIconView = (ImageView) listItemView.findViewById(R.id.albumIcon);
        // Get the image resource ID from the current WinehouseAlbums object and
        // set the image to ImageView
        albumIconView.setImageResource(currentAlbum.getAlbumID());

        // Return so that it can be shown in the ListView
        return listItemView;
    }

}
