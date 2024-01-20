package it.epicode.Catalogo;

import java.util.Random;

public abstract class  Catalogo {
     private long  Codice;
    private String title;
    private int anno;
    private int pagine;

    public Catalogo( String title, int pagine) {
        Random r=new Random();
        this.Codice = r.nextLong();
        this.title = title;
        this.anno = r.nextInt(1998,2024);
        this.pagine =pagine;
    }

    public Catalogo(long codice, String title, int anno, int pagine) {
        Codice = codice;
        this.title = title;
        this.anno = anno;
        this.pagine = pagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "Codice=" + Codice +
                ", title='" + title + '\'' +
                ", anno=" + anno +
                ", pagine=" + pagine +
                '}';
    }

    public long getCodice() {
        return Codice;
    }


    public String getTitle() {
        return title;
    }


    public int getAnno() {
        return anno;
    }


    public int getPagine() {
        return pagine;
    }

}
