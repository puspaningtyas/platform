package pojos;
// Generated Nov 1, 2018 4:38:56 PM by Hibernate Tools 4.3.1



/**
 * Klinik generated by hbm2java
 */
public class Klinik  implements java.io.Serializable {


     private String idKlinik;
     private String nama;
     private String spesialis;

    public Klinik() {
    }

	
    public Klinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }
    public Klinik(String idKlinik, String nama, String spesialis) {
       this.idKlinik = idKlinik;
       this.nama = nama;
       this.spesialis = spesialis;
    }
   
    public String getIdKlinik() {
        return this.idKlinik;
    }
    
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getSpesialis() {
        return this.spesialis;
    }
    
    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }




}


