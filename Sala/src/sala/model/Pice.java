/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.model;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
=======
import java.math.BigDecimal;
import javax.persistence.Entity;
>>>>>>> Verzija 1, greska u Svadbe
import javax.persistence.Table;

/**
 *
 * @author Tomislav
 */
@Entity
@Table
public class Pice extends Entitet implements Serializable{
    
<<<<<<< HEAD
    private String bezalkoholno;
    private String pivo;
    private String vino;
    private String zesta;
    
    @ManyToMany (mappedBy = "pice")
    private List<Jelovnik> jelovnik=new ArrayList<>();

    public String getBezalkoholno() {
        return bezalkoholno;
    }

    public void setBezalkoholno(String bezalkoholno) {
        this.bezalkoholno = bezalkoholno;
    }

    public String getPivo() {
        return pivo;
    }

    public void setPivo(String pivo) {
        this.pivo = pivo;
    }

    public String getVino() {
        return vino;
    }

    public void setVino(String vino) {
        this.vino = vino;
    }

    public String getZesta() {
        return zesta;
    }

    public void setZesta(String zesta) {
        this.zesta = zesta;
    }

    public List<Jelovnik> getJelovnik() {
        return jelovnik;
    }

    public void setJelovnik(List<Jelovnik> jelovnik) {
        this.jelovnik = jelovnik;
    }

    
    
      @Override
    public String toString() {
        return getBezalkoholno()+ " " + getPivo();
    }
   
=======
private String naziv;
private BigDecimal cijenaPoGlavi;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getCijenaPoGlavi() {
        return cijenaPoGlavi;
    }

    public void setCijenaPoGlavi(BigDecimal cijenaPoGlavi) {
        this.cijenaPoGlavi = cijenaPoGlavi;
    }

    @Override
    public String toString() {
        return getNaziv();
    }
>>>>>>> Verzija 1, greska u Svadbe
    
    
    
}
