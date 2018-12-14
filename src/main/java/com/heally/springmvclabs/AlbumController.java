package com.heally.springmvclabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String index(Model model) {
        model.addAttribute("albums", albumRepository.findAll());
        return "albumIndex";
    }

    @PostMapping("/albums")
    public RedirectView create(
            @RequestParam String title,
            @RequestParam String artist,
            @RequestParam String albumArtURL,
            @RequestParam int songCount,
            @RequestParam int length) {
        albumRepository.save(new Album(title, artist, songCount, length, albumArtURL));
        return new RedirectView("/albums");
    }
}
