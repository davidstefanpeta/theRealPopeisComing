package ro.esolutions.theRealPopeisComingApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConectorExtern {

    @GetMapping("/churches")
    public String getAllChurches(){

        Biserica catedralaMantuiriiNeamului = new Biserica();
        catedralaMantuiriiNeamului.nume = "Catedrala Mantuirii Neamului";
        catedralaMantuiriiNeamului.tipReligie = "ortodoxa";
        catedralaMantuiriiNeamului.program = "10:00-19:00";
        catedralaMantuiriiNeamului.luna = "Mai";
        return "Bisericile mele sunt: " + catedralaMantuiriiNeamului.nume;

    }
}
