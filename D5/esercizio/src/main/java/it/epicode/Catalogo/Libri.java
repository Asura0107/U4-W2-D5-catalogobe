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

    public Libri(long codice, String title, int anno, int pagine, String autore, String genere) {
        super(codice, title, anno, pagine);
        this.autore = autore;
        this.genere = genere;
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

    public String getGenere() {
        return genere;
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
