package it.epicode.Catalogo;

public abstract class  Catalogo {
    public int  Codice;
    public String title;
    public int anno;
    public int pagine;

    public Catalogo(int codice, String title, int anno, int pagine) {
        this.Codice = codice;
        this.title = title;
        this.anno = anno;
        this.pagine = pagine;
    }

    public int getCodice() {
        return Codice;
    }

    public void setCodice(int codice) {
        Codice = codice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }
}
