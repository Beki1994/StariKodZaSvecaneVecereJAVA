/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Tomislav
 */
@Entity
@Table
public class Osoblje extends Entitet implements Serializable{
    
<<<<<<< HEAD
    private String konobar;
    private String kuhar;
    private String pomocni_kuhar;

    @ManyToMany (mappedBy = "osoblje")
    private List<Svadba> svadba = new ArrayList<>();

    public List<Svadba> getSvadba() {
        return svadba;
    }

    public void setSvadba(List<Svadba> svadba) {
        this.svadba = svadba;
    }

=======
    private String ime;
    private String prezime;
    private String radnoMjesto;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getRadnoMjesto() {
        return radnoMjesto;
    }

    public void setRadnoMjesto(String radnoMjesto) {
        this.radnoMjesto = radnoMjesto;
    }

    

>>>>>>> Verzija 1, greska u Svadbe
    
    
    
    

    
    
    
    
    
    
    
<<<<<<< HEAD
    public String getKonobar() {
        return konobar;
    }

    public void setKonobar(String konobar) {
        this.konobar = konobar;
    }

    public String getKuhar() {
        return kuhar;
    }

    public void setKuhar(String kuhar) {
        this.kuhar = kuhar;
    }

    public String getPomocni_kuhar() {
        return pomocni_kuhar;
    }

    public void setPomocni_kuhar(String pomocni_kuhar) {
        this.pomocni_kuhar = pomocni_kuhar;
    }

    @Override
    public String toString() {
        return getKonobar();
=======
    

    @Override
    public String toString() {
        return getIme() + " " + getPrezime();
>>>>>>> Verzija 1, greska u Svadbe
    }
    
    
    
    
}
