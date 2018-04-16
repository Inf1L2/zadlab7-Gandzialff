package pl.edu.ur.oopl7.zad1;

public class Wykladowca extends Osoba {

    public Wykladowca(String imie, String nazwisko, String data_urodzenia, String plec,String dziedzina_naukowa, String stopien_naukowy) {
        super(imie, nazwisko, data_urodzenia, plec);
        this.dziedzina_naukowa = dziedzina_naukowa;
        this.stopien_naukowy = stopien_naukowy;
    }

    private String dziedzina_naukowa;
    public String stopien_naukowy;

    public String getDziedzina_naukowa() {
        return dziedzina_naukowa;
    }

    public void setDziedzina_naukowa(String dziedzina_naukowa) {
        this.dziedzina_naukowa = dziedzina_naukowa;
    }

    public String getStopien_naukowy() {
        return stopien_naukowy;
    }

    public void setStopien_naukowy(String stopien_naukowy) {
        this.stopien_naukowy = stopien_naukowy;
    }

    @Override
    public String getImie() {
        return super.getImie();
    }

    @Override
    public void setImie(String imie) {
        super.setImie(imie);
    }

    @Override
    public String getNazwisko() {
        return super.getNazwisko();
    }

    @Override
    public void setNazwisko(String nazwisko) {
        super.setNazwisko(nazwisko);
    }

    @Override
    public String getData_urodzenia() {
        return super.getData_urodzenia();
    }

    @Override
    public void setData_urodzenia(String data_urodzenia) {
        super.setData_urodzenia(data_urodzenia);
    }

    @Override
    public String getPlec() {
        return super.getPlec();
    }

    @Override
    public void setPłeć(String płeć) {
        super.setPłeć(płeć);
    }

    @Override
    public String toString() {
        return "Wykladowca{"+ super.toString()+"" +
                "dziedzina_naukowa='" + dziedzina_naukowa + '\'' +
                ", stopien_naukowy='" + stopien_naukowy + '\'' +
                '}';
    }
}

