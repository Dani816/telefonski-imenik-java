package projects_danijel.telefonski_imenik;

public class Contact {
    private String telefon;
    private String oib;
    private String ime;
    private String prezime;
    private String adresa;
    private String grad;

    public Contact(String telefon, String oib, String ime, String prezime, String adresa, String grad) {
        this.telefon = telefon;
        this.oib = oib;
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.grad = grad;
    }

    public Contact() {
    }

    @Override
    public String toString() {
        return (telefon +"    "+ oib+ "    "+ ime+ "    " + prezime+ "    " +adresa+ "    " +grad);
    }

    public String getTelefon() { return telefon; }

    public void setTelefon(String telefon) { this.telefon = telefon; }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

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

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }
}
