/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.controller;

import java.util.List;
<<<<<<< HEAD
=======
import org.hibernate.Query;
>>>>>>> Verzija 1, greska u Svadbe
import sala.model.Osoblje;
import sala.pomocno.HibernateUtil;
import sala.pomocno.ObradaSucelje;
import sala.pomocno.SalatestException;

/**
 *
 * @author Tomislav
 */
public class ObradaOsoblje extends Obrada<Osoblje> implements ObradaSucelje<Osoblje>{

    public ObradaOsoblje() {
        super();
    }
    
    

    @Override
    public List<Osoblje> getLista() {
        return HibernateUtil.getSession().createQuery("from Osoblje").list();
    }

    @Override
    public void kontrola(Osoblje o) throws SalatestException {
<<<<<<< HEAD
        if(o.getKonobar()==null) {
            throw new SalatestException("Konobar je null, obavezan unos");
        }
          if(o.getKonobar().trim().isEmpty()) {
            throw new SalatestException("Konobar je prazan, obavezan unos");
        }
            if(o.getKuhar()==null) {
            throw new SalatestException("Kuhar je null, obavezan unos");
        }
              if(o.getKuhar().trim().isEmpty()) {
            throw new SalatestException("Kuhar je prazan, obavezan unos");
        }
                if(o.getPomocni_kuhar()==null) {
            throw new SalatestException("pomocni kuhar je null, obavezan unos");
        }
                  if(o.getPomocni_kuhar().trim().isEmpty()) {
            throw new SalatestException("pomocni kuhar je prazan, obavezan unos");
=======
        if(o.getIme()==null) {
            throw new SalatestException("Ime je null, obavezan unos");
        }
          if(o.getIme().trim().isEmpty()) {
            throw new SalatestException("Ime je prazan, obavezan unos");
        }
            if(o.getPrezime()==null) {
            throw new SalatestException("Prezime je null, obavezan unos");
        }
              if(o.getPrezime().trim().isEmpty()) {
            throw new SalatestException("Prezime je prazan, obavezan unos");
        }
                if(o.getRadnoMjesto()==null) {
            throw new SalatestException("radno mjesto je null, obavezan unos");
        }
                  if(o.getRadnoMjesto().trim().isEmpty()) {
            throw new SalatestException("radno mjesto je prazan, obavezan unos");
>>>>>>> Verzija 1, greska u Svadbe
        }
    }

    @Override
    public Osoblje spremi(Osoblje o) throws SalatestException {
        kontrola(o);
        return dao.save(o);
    }

    @Override
    public void obrisi(Osoblje o) throws SalatestException {
<<<<<<< HEAD
        if(o.getSvadba().size()>0) {
            throw new SalatestException("Osoblje ne može se izbrisati jer je dodjeljeno jednoj svadbi");
        }
=======
       
>>>>>>> Verzija 1, greska u Svadbe
        dao.delete(o);
    }

    public List<Osoblje> spremi(List<Osoblje> osoblja) throws SalatestException{
        for ( Osoblje o : osoblja) {
            kontrola(o);
        }
        return dao.save(osoblja);
    }
<<<<<<< HEAD
=======

    public List<Osoblje> getLista(String uvjet, boolean isSelected) {
       Query query = HibernateUtil.getSession().createQuery("from Osoblje a "
                 + " where concat(a.ime) like :uvjet")
                 .setString("uvjet", "%" + uvjet + "%");
         if(isSelected){
             query.setMaxResults(20);
         }
         
         return query.list();
    }
>>>>>>> Verzija 1, greska u Svadbe
    
    
    
}
