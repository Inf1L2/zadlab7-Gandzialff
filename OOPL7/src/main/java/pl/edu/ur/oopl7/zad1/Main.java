package pl.edu.ur.oopl7.zad1;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Andrzej", "Kowalski", "20-01-1996", "M", 23213, "Dzienne", "Inf", 1);
        Wykladowca d = new Wykladowca("Jan","Nowak","20-03-1987","M","Matematyka","Doktor");

        System.out.println(s.toString());
        System.out.println(d.toString());
    }
}
