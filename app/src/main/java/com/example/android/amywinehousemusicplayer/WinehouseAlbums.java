package com.example.android.amywinehousemusicplayer;

public class WinehouseAlbums {

    //Name of Each Album
    private String mAlbumName;

    //Number of Tracks
    private String mTrackLength;

    //Drawable resource ID
    private int mAlbumID;

    /*
     * Create a new com.example.android.amywinehousemusicplayer.WinehouseAlbums object.
     *
     * @param albumName is the name of the Amy Winehouse Album
     * @param trackLength is the number of tracks on corresponding Album
     * @param albumID is drawable reference ID that corresponds to the Album
     * */
    public WinehouseAlbums(String albumName, String trackLength, int albumID)
    {
        mAlbumName = albumName;
        mTrackLength = trackLength;
        mAlbumID = albumID;
    }

    /**
     * Gets the name of the Amy Winehouse Album
     */
    public String getAlbumName() {

        return mAlbumName;
    }

    /**
     * Gets the Number of tracks on corresponding Album
     */
    public String getTrackLength() {

        return mTrackLength + " Songs";
    }

    /**
     * Get the Album image resource ID
     */
    public int getAlbumID() {

        return mAlbumID;
    }
}
