package com.heally.springmvclabs;

/**
 * An album; a collection of musical songs.
 */
public class Album {

    /**
     * A unique id for the album.
     */
    private long id;

    /**
     * The album title.
     */
    private String title;

    //TODO Maybe this should be a collection of artists, not just one.
    /**
     * The artist.
     */
    private String artist;

    /**
     * The number of songs in the album.
     */
    private int songCount;

    /**
     * The total length of the album in seconds.
     */
    private int length;

    /**
     * A URL to the album art.
     */
    private String albumArtURL;

    /**
     * Constructor.
     * @param title
     * @param artist
     * @param songCount
     * @param length
     * @param albumArtURL
     */
    public Album(String title, String artist, int songCount, int length, String albumArtURL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.albumArtURL = albumArtURL;
    }
}
