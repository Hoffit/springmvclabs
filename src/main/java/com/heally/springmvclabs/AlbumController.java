package com.heally.springmvclabs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {

    @GetMapping("/albums")
    public String index(Model model) {

        //TODO; database integration
        //Interim mock data...
        Album[] albums = new Album[] {
                new Album("a title", "an artist", 9, 1620, "http://www.metcoverart.com/gallery/displayimage.php?pid=14016"),
                new Album("another title", "another artist", 8, 945, "http://www.metcoverart.com/gallery/displayimage.php?pid=14015")
        };
        model.addAttribute("albums", albums);
        return "albumIndex";
    }
}
