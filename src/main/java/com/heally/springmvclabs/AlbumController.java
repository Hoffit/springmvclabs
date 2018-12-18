package com.heally.springmvclabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Spring controller for Album.
 */
@Controller
public class AlbumController {

    /**
     * A spring repository (JPA) of albums.
     */
    @Autowired
    private AlbumRepository albumRepository;

    /**
     * A spring repository (JPA) of songs.
     */
    @Autowired
    private SongRepository songRepository;

    /**
     * Returns an HTTP response containing an array of Albums.
     * @param model The model.
     * @return The HTTP response, including the model container of albums, with key "albums".
     */
    @GetMapping("/albums")
    public String index(Model model) {
            model.addAttribute("albums", albumRepository.findAll());
        return "albumIndex";
    }

    /**
     * Adds a new album to the repository.
     * @param title Album title.
     * @param artist Album artist.
     * @param albumArtURL Album art URL.
     * @param length The length of the album, in seconds.
     * @return A redirect to the album index page (/albums).
     */
    @PostMapping("/albums")
    public RedirectView create(
            @RequestParam String title,
            @RequestParam String artist,
            @RequestParam int songCount,
            @RequestParam String albumArtURL,
            @RequestParam int length) {
        System.out.println("hi");
        albumRepository.save(new Album(title, artist, songCount, length, albumArtURL));
        return new RedirectView("/albums");
    }

    @PostMapping("/albums/{albumId}/add-song")
    public RedirectView addSong(@PathVariable long albumId,
                                @RequestParam String title,
                                @RequestParam int length,
                                @RequestParam int trackNumber
                                ) {
        Album album = albumRepository.findById(albumId).get();
        Song song = new Song(title, length, album, trackNumber);
        album.addSong(song);
        songRepository.save(song);
        albumRepository.save(album);
        return new RedirectView("/albums/{albumId}/album-details");
    }

    @GetMapping("/albums/{albumId}/album-details")
    public String albumDetails(@PathVariable long albumId,
                                     Model model) {
        model.addAttribute("album", albumRepository.findById(albumId).get());
        return "albumDetail";
    }
}
