package com.heally.springmvclabs;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

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
     * A list of songs contained in the Album.
     */
    @OneToMany
    private List<Song> songs;

    /**
     * Default constructor.
     */
    public Album() {
        super();
    }

    /**
     * Constructor.
     * @param title The album title.
     * @param artist The primary artist.
     * @param length The length in seconds.
     * @param albumArtURL A URL to album art.
     */
    public Album(String title, String artist, int songCount, int length, String albumArtURL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.albumArtURL = albumArtURL;
    }

    /**
     * Getter.
     * @return Album title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter.
     * @param title Album title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter.
     * @return Album artist.
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Setter.
     * @param artist Album artist.
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Getter.
     * @return Number of songs.
     */
    public int getSongCount() {
        return songCount;
    }

    /**
     * Setter.
     * @param songCount Number of songs.
     */
    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    /**
     * Getter.
     * @return Album length in seconds.
     */
    public int getLength() {
        return length;
    }

    /**
     * Setter.
     * @param length Album length in seconds.
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Getter.
     * @return Album art URL.
     */
    public String getAlbumArtURL() {
        return albumArtURL;
    }

    /**
     * Setter.
     * @param albumArtURL Album art URL.
     */
    public void setAlbumArtURL(String albumArtURL) {
        this.albumArtURL = albumArtURL;
    }

    /**
     * Getter.
     * @return The songs on the album.
     */
    public List<Song> getSongs() {
        return songs;
    }

    /**
     * Setter.
     * @param songs The songs that belong to the album.
     */
    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
