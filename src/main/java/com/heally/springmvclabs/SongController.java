package com.heally.springmvclabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Spring controller for Song.
 */
@Controller
public class SongController {

    /**
     * A spring repository (JPA)
     */
    @Autowired
    private SongRepository SongRepository;

    /**
     * Returns an HTTP response containing an array of Songs.
     * @param model The model.
     * @return The HTTP response, including the model container of Songs, with key "Songs".
     */
    @GetMapping("/songs")
    public String index(Model model) {
        model.addAttribute("songs", SongRepository.findAll());
        return "songIndex";
    }
}
