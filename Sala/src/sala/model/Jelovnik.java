/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.model;

import java.io.Serializable;
<<<<<<< HEAD
=======
import java.math.BigDecimal;
>>>>>>> Verzija 1, greska u Svadbe
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Tomislav
 */
@Entity
@Table
public class Jelovnik extends Entitet implements Serializable{
    
    
<<<<<<< HEAD
    private String korisnik;

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
=======
    private String naziv;
    

  
    
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
>>>>>>> Verzija 1, greska u Svadbe
    }
    
    
    @ManyToMany 
    private List<Pice> pice = new ArrayList<>();
    
    
    @ManyToMany 
    private List<Jelo> jelo = new ArrayList<>();
    
    @OneToMany (mappedBy = "jelovnik")
    private List<Svadba> svadba = new ArrayList<>();

    public List<Pice> getPice() {
        return pice;
    }

    public void setPice(List<Pice> pice) {
        this.pice = pice;
    }

    public List<Jelo> getJelo() {
        return jelo;
    }

    public void setJelo(List<Jelo> jelo) {
        this.jelo = jelo;
    }

    public List<Svadba> getSvadba() {
        return svadba;
    }

    public void setSvadba(List<Svadba> svadba) {
        this.svadba = svadba;
    }

<<<<<<< HEAD
=======
    @Override
    public String toString() {
        return getNaziv() + " " + getJelo() + " " + getPice();
    }

    
>>>>>>> Verzija 1, greska u Svadbe
    
   
    
}
