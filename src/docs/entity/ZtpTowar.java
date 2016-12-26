package docs.entity;
// Generated 2016-12-26 16:47:05 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * ZtpTowar generated by hbm2java
 */
public class ZtpTowar  implements java.io.Serializable {


     private Integer idT;
     private String nazwa;
     private BigDecimal cena;
     private int ilosc;
     private BigDecimal vat;
     private Set ztpZTs = new HashSet(0);

    public ZtpTowar() {
    }

	
    public ZtpTowar(String nazwa, BigDecimal cena, int ilosc, BigDecimal vat) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
        this.vat = vat;
    }
    public ZtpTowar(String nazwa, BigDecimal cena, int ilosc, BigDecimal vat, Set ztpZTs) {
       this.nazwa = nazwa;
       this.cena = cena;
       this.ilosc = ilosc;
       this.vat = vat;
       this.ztpZTs = ztpZTs;
    }
   
    public Integer getIdT() {
        return this.idT;
    }
    
    public void setIdT(Integer idT) {
        this.idT = idT;
    }
    public String getNazwa() {
        return this.nazwa;
    }
    
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public BigDecimal getCena() {
        return this.cena;
    }
    
    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }
    public int getIlosc() {
        return this.ilosc;
    }
    
    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
    public BigDecimal getVat() {
        return this.vat;
    }
    
    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }
    public Set getZtpZTs() {
        return this.ztpZTs;
    }
    
    public void setZtpZTs(Set ztpZTs) {
        this.ztpZTs = ztpZTs;
    }




}


