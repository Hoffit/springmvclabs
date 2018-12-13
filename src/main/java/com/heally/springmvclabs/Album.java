package com.heally.springmvclabs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * An album; a collection of musical songs.
 */
@Entity
public class Album {

    /**
     * A unique id for the album.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
     *
     */
    public Album() {
        super();
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getAlbumArtURL() {
        return albumArtURL;
    }

    public void setAlbumArtURL(String albumArtURL) {
        this.albumArtURL = albumArtURL;
    }
}
