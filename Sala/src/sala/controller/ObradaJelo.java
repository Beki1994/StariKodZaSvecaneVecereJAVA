/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.controller;

import java.util.List;
import org.hibernate.Query;
import sala.model.Jelo;
import sala.model.Mladenci;
import sala.model.Pice;
import sala.pomocno.HibernateUtil;
import sala.pomocno.ObradaSucelje;
import sala.pomocno.SalatestException;
import sala.view.Jela;

/**
 *
 * @author Tomislav
 */
public class ObradaJelo extends Obrada<Jelo> implements ObradaSucelje<Jelo>{
    
    public ObradaJelo(){
    super();
}

    @Override
    public List<Jelo> getLista() {
        return HibernateUtil.getSession().createQuery("from Jelo").list();
    }

    @Override
    public void kontrola(Jelo j) throws SalatestException {
        if(j.getGlavno_jelo()==null) {
            throw new SalatestException("glavno jelo je null, obavezan unos");
        }
        if(j.getGlavno_jelo().trim().isEmpty()){
            throw new SalatestException("glavno jelo je prazno, obavezan unos");
        }
        if(j.getPredjelo()==null) {
            throw new SalatestException("predjelo je null, obavezan unos");
        }
        if(j.getPredjelo().trim().isEmpty()) {
            throw new SalatestException("predjelo je prazan, obavezan unos");
        }
        if(j.getKolaci()==null) {
            throw new SalatestException("kolaci je null, obavezan unos");
        }
        if(j.getKolaci().trim().isEmpty()) {
            throw new SalatestException("kolaci su prazni, obavezan unos");
        }
        if(j.getTorte()==null) {
            throw new SalatestException("torte je null, obavezan unos");
        }
        if(j.getTorte().trim().isEmpty()) {
            throw new SalatestException("torte je prazno, obavezan unos");
        }

    
   

    @Override
    public void kontrola(Jelo j) throws SalatestException {
         
    }

    @Override
    public Jelo spremi(Jelo j) throws SalatestException {
            kontrola(j);
            return dao.save(j);
    }

    @Override
    public void obrisi(Jelo j) throws SalatestException {
        if(j.getJelovnik().size()>0) {
            throw new SalatestException("Ne može se izbrisati jelo jer ga ima u jelovniku");
        }
        dao.delete(j);
    }

    public Iterable<Jelo> getLista(String uvjet, boolean isSelected) {
        Query query = HibernateUtil.getSession().createQuery("from Jelo a "
                 + " where concat(a.glavno_jelo) like :uvjet")
                 .setString("uvjet", "%" + uvjet + "%");
         if(isSelected){
             query.setMaxResults(20);
         }
         
         return query.list();
    }

    public List<Jelo> spremi(List<Jelo> jela) throws SalatestException{
        for (Jelo j : jela) {
              
            kontrola(j);
         }
        
         
         return dao.save(jela);
    }

        
        dao.delete(j);
    }

    public List<Jelo> getLista(String uvjet, boolean isSelected) {
        
        Query query = HibernateUtil.getSession().createQuery("from Jelo a " +
                 " where concat (a.naziv,' ',a.cijenaPoGlavi) like :uvjet").setString("uvjet", "%" + uvjet + "%");
        if(isSelected) {
            query.setMaxResults(20);
        }
        return query.list();
        
    }

   

    }
    
    
    

