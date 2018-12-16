package com.heally.springmvclabs;

import javax.persistence.*;

/**
 * A musical song.
 */
@Entity
public class Song {

    /**
     * A unique id for the album.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Song title.
     */
    private String title;

    /**
     * Song length in seconds.
     */
    private int length;

    /**
     * The track position of this song, in the associated album.
     */
    private int trackNumber;

    /**
     * Album this song belongs to.
     */
    @ManyToOne
    private Album album;

    /**
     * Default constructor.
     */
    public Song() {
        super();
    }

    /**
     * Constructor.
     * @param title Song title.
     * @param length Song length in seconds.
     * @param album The album to which the song belongs.
     * @param trackNumber The track number on the album to which the song belongs.
     */
    public Song(String title, int length, Album album, int trackNumber) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    /**
     * Getter.
     * @return Song title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter.
     * @param title Song title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter.
     * @return Song length in seconds.
     */
    public int getLength() {
        return length;
    }

    /**
     * Setter.
     * @param length Song length in seconds.
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Getter.
     * @return Track number on the album to which the song belongs.
     */
    public int getTrackNumber() {
        return trackNumber;
    }

    /**
     * Setter.
     * @param trackNumber Track number on the album to which the song belongs.
     */
    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    /**
     * Getter.
     * @return The album to which the song belongs.
     */
    public Album getAlbum() {
        return album;
    }

    /**
     * Setter.
     * @param album The album to which the song belongs.
     */
    public void setAlbum(Album album) {
        this.album = album;
    }
}
