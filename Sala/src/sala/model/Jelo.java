
package sala.model;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Jelo extends Entitet implements Serializable{
    

  private String glavno_jelo;
  private String predjelo;
  private String kolaci;
  private String torte;
  private String svedski_stol;

  @ManyToMany (mappedBy = "pice")
  private List<Jelovnik> jelovnik=new ArrayList<>();

    public String getGlavno_jelo() {
        return glavno_jelo;
    }

    public void setGlavno_jelo(String glavno_jelo) {
        this.glavno_jelo = glavno_jelo;
    }

    public String getPredjelo() {
        return predjelo;
    }

    public void setPredjelo(String predjelo) {
        this.predjelo = predjelo;
    }

    public String getKolaci() {
        return kolaci;
    }

    public void setKolaci(String kolaci) {
        this.kolaci = kolaci;
    }

    public String getTorte() {
        return torte;
    }

    public void setTorte(String torte) {
        this.torte = torte;
    }

    public String getSvedski_stol() {
        return svedski_stol;
    }

    public void setSvedski_stol(String svedski_stol) {
        this.svedski_stol = svedski_stol;
    }

    public List<Jelovnik> getJelovnik() {
        return jelovnik;
    }

    public void setJelovnik(List<Jelovnik> jelovnik) {
        this.jelovnik = jelovnik;

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
>>>>>>> Verzija 1, greska u Svadbe
    }

    @Override
    public String toString() {

        return getGlavno_jelo();
    }

    

        return getNaziv();
    }
  

  
  
  
    
}
