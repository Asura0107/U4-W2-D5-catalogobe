package it.epicode.Catalogo;

import java.util.Random;

public class Libri extends Catalogo{
    private String autore;
    private String genere;

    public Libri(  String title, int pagine, String autore, String genere) {
        super(  title, pagine);
        Random r=new Random();
        this.autore=autore;
        this.genere=genere;
    }


    @Override
    public String toString() {
        return "Libri{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                ", Codice=" + getCodice() +
                ", title='" + getTitle() + '\'' +
                ", anno=" + getAnno() +
                ", pagine=" + getPagine() +
                '}';
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
    public long getCodice() {
        return super.getCodice();
    }

    @Override
    public void setCodice(long codice) {
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
