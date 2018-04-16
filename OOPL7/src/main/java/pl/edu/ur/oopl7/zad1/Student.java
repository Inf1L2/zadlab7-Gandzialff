package pl.edu.ur.oopl7.zad1;

public class Student extends Osoba {
    private int nr_indeksu;
    private String typ_studiów;
    private String kierunek;
    private int rok_stodiow;

    public Student(String imie, String nazwisko, String data_urodzenia, String plec, int nr_indeksu, String typ_studiów, String kierunek, int rok_stodiow) {
        super(imie, nazwisko, data_urodzenia, plec);
        this.nr_indeksu = nr_indeksu;
        this.typ_studiów = typ_studiów;
        this.kierunek = kierunek;
        this.rok_stodiow = rok_stodiow;
    }

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public String getTyp_studiów() {
        return typ_studiów;
    }

    public void setTyp_studiów(String typ_studiów) {
        this.typ_studiów = typ_studiów;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRok_stodiow() {
        return rok_stodiow;
    }

    public void setRok_stodiow(int rok_stodiow) {
        this.rok_stodiow = rok_stodiow;
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
        return "Student{" + super.toString() +
                "nr_indeksu=" + nr_indeksu +
                ", typ_studiów='" + typ_studiów + '\'' +
                ", kierunek='" + kierunek + '\'' +
                ", rok_stodiow=" + rok_stodiow +
                '}';
    }
}
