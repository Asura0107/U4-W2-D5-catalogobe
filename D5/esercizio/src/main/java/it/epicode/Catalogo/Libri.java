package it.epicode.Catalogo;

public class Libri extends Catalogo{
    public String autore;
    public String genere;

    public Libri(int codice, String title, int anno, int pagine, String autore, String genere) {
        super(codice, title, anno, pagine);
        this.autore=autore;
        this.genere=genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
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
}
