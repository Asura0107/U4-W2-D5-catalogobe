package it.epicode.Catalogo;

public class Riviste extends Catalogo {

    public enum periodicità {
        SETTIMANALE, MENSILE, SEMESTRALE
    };

    public static periodicità periodicità;

    public Riviste(int pagine, String title,  periodicità periodicità) {
        super( title,pagine);
        this.periodicità = periodicità;
    }

    public Riviste(long codice, String title, int anno, int pagine, periodicità periodicità) {
        super(codice, title, anno, pagine);
        this.periodicità = periodicità;

    }

    @Override
    public String toString() {
        return "Riviste{" +
                "periodicità=" + periodicità +
                ", Codice=" + getCodice() +
                ", title='" + getTitle() + '\'' +
                ", anno=" + getAnno() +
                ", pagine=" + getPagine() +
                '}';
    }

    @Override
    public long getCodice() {
        return super.getCodice();
    }


    @Override
    public String getTitle() {
        return super.getTitle();
    }


    @Override
    public int getAnno() {
        return super.getAnno();
    }



    @Override
    public int getPagine() {
        return super.getPagine();
    }




}
