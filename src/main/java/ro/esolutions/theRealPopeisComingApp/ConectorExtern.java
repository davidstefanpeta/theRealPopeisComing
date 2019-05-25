package ro.esolutions.theRealPopeisComingApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ConectorExtern {

    @GetMapping("/churches/{month}")
    public String getAllChurches(@PathVariable String month){

        String raspuns = "Bisericile mele sunt: ";

        List<Biserica> biserici = new ArrayList<>();

        Biserica catedralaMantuiriiNeamului = new Biserica();
        catedralaMantuiriiNeamului.nume = "Catedrala Mantuirii Neamului";
        catedralaMantuiriiNeamului.tipReligie = "ortodoxa";
        catedralaMantuiriiNeamului.program = "10:00-19:00";
        catedralaMantuiriiNeamului.luna = "Mai";

        Biserica catedralaSfIosif = new Biserica();
        catedralaSfIosif.nume = "Catedrala Sf. Iosif";
        catedralaSfIosif.tipReligie = "Catolica";
        catedralaSfIosif.program = "09:00-20:00";
        catedralaSfIosif.luna = "Noiembrie";

        Biserica bunaVestireBelu = new Biserica();
        bunaVestireBelu.nume = "Biserica Buna Vestire Belu";
        bunaVestireBelu.tipReligie = "Ortodoxa";
        bunaVestireBelu.program = "12:00-18:00";
        bunaVestireBelu.luna = "Ianuarie";

        Biserica moscheeaAlbastra = new Biserica();
        moscheeaAlbastra.nume = "Moscheea Albastra";
        moscheeaAlbastra.tipReligie = "musulmana";
        moscheeaAlbastra.program = "24/7";
        moscheeaAlbastra.luna = "Decembrie";

        Biserica Balasa = new Biserica();
        Balasa.nume = "Biserica Balasa";
        Balasa.tipReligie = "adventista de ziua a saptea";
        Balasa.program = "N/A";
        Balasa.luna = "Aprilie";

        biserici.add(catedralaMantuiriiNeamului);
        biserici.add(catedralaSfIosif);
        biserici.add(bunaVestireBelu);
        biserici.add(moscheeaAlbastra);
        biserici.add(Balasa);

        for(int i=0; i<biserici.size(); i++) {
            if(biserici.get(i).luna.equals(month)) {
                raspuns += biserici.get(i).nume + ", ";

            }
        }

    return raspuns;
    }
}
