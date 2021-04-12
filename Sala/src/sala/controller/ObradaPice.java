/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.controller;



import java.util.List;
import org.hibernate.Query;
import sala.model.Pice;
import sala.pomocno.HibernateUtil;
import sala.pomocno.ObradaSucelje;
import sala.pomocno.SalatestException;

/**
 *
 * @author Tomislav
 */
public class ObradaPice extends Obrada<Pice> implements ObradaSucelje<Pice>{
    
    public ObradaPice() {
        super();
    }
    

    @Override
    public List<Pice> getLista() {
        return HibernateUtil.getSession().createQuery("from Pice").list();
    }


    @Override
    public void kontrola(Pice p) throws SalatestException {
        if(p.getBezalkoholno()==null) {
            throw new SalatestException("bezalkoholno je null obavezan unos");
        }
        if(p.getBezalkoholno().trim().isEmpty()) {
            throw new SalatestException("bezalkoholno je prazan obavezan unos");
        }
        if(p.getPivo()==null) {
            throw new SalatestException("pivo je null obavezan unos");
        }
        if(p.getPivo().trim().isEmpty()) {
            throw new SalatestException("pivo je prazan obavezan unos");
        }
        if(p.getVino()==null) {
            throw new SalatestException("vino je null obavezan unos");
        }
        if(p.getVino().trim().isEmpty()) {
            throw new SalatestException("vino je prazno obavezan unos");
        }
        if(p.getZesta()==null) {
            throw new SalatestException("zesta je null obavezan unos");
        }
        if(p.getZesta().trim().isEmpty()) {
            throw new SalatestException("zesza je prazna obavezan unos");
        }
    }


    @Override
    public Pice spremi(Pice p) throws SalatestException {
        kontrola(p);
        return dao.save(p);

        

    }

    @Override
    public void obrisi(Pice p) throws SalatestException {
       if(p.getJelovnik().size()>0) {
           throw new SalatestException("Pice se nemože izbrisati jer ga već ima u jelovniku");
       }
           dao.delete(p);
    }

    public Iterable<Pice> getLista(String uvjet, boolean isSelected) {
         Query query = HibernateUtil.getSession().createQuery("from Pice a "
                 + " where concat(a.bezalkoholno) like :uvjet")
                 .setString("uvjet", "%" + uvjet + "%");
         if(isSelected){
             query.setMaxResults(20);
         }
         
         return query.list();
    }

    public List<Pice> spremi(List<Pice> pica) throws SalatestException{
        for (Pice p : pica) {
            kontrola(p);
        }
 return dao.save(pica);
    }

     dao.delete(p);
    }

    public List<Pice> getLista(String uvjet, boolean isSelected) {
        
        Query query = HibernateUtil.getSession().createQuery("from Pice a " +
                 " where concat (a.naziv,' ',a.cijenaPoGlavi) like :uvjet").setString("uvjet", "%" + uvjet + "%");
        if(isSelected) {
            query.setMaxResults(20);
        }
        return query.list();
        
    }

    @Override
    public void kontrola(Pice t) throws SalatestException {
       
    }

   

    

    
    
}
