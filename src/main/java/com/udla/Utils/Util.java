package com.udla.Utils;
import java.util.List;
import com.udla.Models.Contacto;
import java.util.ArrayList;


public class Util {
    static public List<Contacto> listContacts = new ArrayList<Contacto>(
        List.of(
            new Contacto("Joaquin","1805226048", "0990354304", "Granados"),
            new Contacto("Maria","1793733839","0990356784", "San Roque"),
            new Contacto("Ana","7398263232", "099039868", "Quitumbe")
        )
    );
    
}
