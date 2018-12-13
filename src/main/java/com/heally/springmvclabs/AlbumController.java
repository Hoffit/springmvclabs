package com.heally.springmvclabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String index(Model model) {

//Interim mock data...
//        Album[] albums = new Album[] {
//                new Album("a title", "an artist", 9, 1620, "http://www.metcoverart.com/gallery/displayimage.php?pid=14016"),
//                new Album("another title", "another artist", 8, 945, "http://www.metcoverart.com/gallery/displayimage.php?pid=14015")
//        };
        model.addAttribute("albums", albumRepository.findAll());
        return "albumIndex";
    }

    @PostMapping("/albums")
    public String create(Model model) {
//TODO this is temp data to check that inserts work...
        albumRepository.save(new Album("a title", "an artist", 9, 1620, "http://www.metcoverart.com/gallery/displayimage.php?pid=14016"));
        return "albumIndex";
    }
}
