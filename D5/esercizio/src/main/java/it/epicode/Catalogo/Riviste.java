package it.epicode.Catalogo;

public class Riviste extends Catalogo {

    public enum periodicità {
        SETTIMANALE, MENSILE, SEMESTRALE
    };

    public periodicità periodicità;

    public Riviste(int codice, String title, int anno, int pagine, periodicità periodicità) {
        super(codice, title, anno, pagine);
        this.periodicità=periodicità;
    }

    @Override
    public int getCodice() {
        return super.getCodice();
    }

    @Override
    public void setCodice(int codice) {
        super.setCodice(codice);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public int getAnno() {
        return super.getAnno();
    }

    @Override
    public void setAnno(int anno) {
        super.setAnno(anno);
    }

    @Override
    public int getPagine() {
        return super.getPagine();
    }

    @Override
    public void setPagine(int pagine) {
        super.setPagine(pagine);
    }

    public Riviste.periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Riviste.periodicità periodicità) {
        this.periodicità = periodicità;
    }
}
