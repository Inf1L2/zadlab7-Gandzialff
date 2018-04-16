package pl.edu.ur.oopl7.zad1;

public class Osoba {

    private String imie;
    private String nazwisko;
    private String data_urodzenia;
    private String plec;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(String data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public void setPłeć(String płeć) {
        this.plec = płeć;
    }

    public Osoba(String imie, String nazwisko, String data_urodzenia, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data_urodzenia;
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", data_urodzenia='" + data_urodzenia + '\'' +
                ", plec='" + plec + '\'';
    }
}
