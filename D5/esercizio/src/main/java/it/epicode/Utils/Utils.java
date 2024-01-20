package it.epicode.Utils;

import com.github.javafaker.Faker;
import it.epicode.Catalogo.Catalogo;
import it.epicode.Catalogo.Libri;
import it.epicode.Catalogo.Riviste;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Utils {

    public static BiPredicate<Long, Catalogo> questoIsbn = (Isbn, catalogo) ->
            catalogo.getCodice() == Isbn;


    public static void aggiungiLibro(List<Catalogo> catalogo) {
        Faker faker = new Faker();
        Random r = new Random();

        String title = faker.book().title();
        String autor = faker.dragonBall().character();
        String genere = faker.book().genre();
        int pagine = r.nextInt(150, 350);

        Libri book = new Libri(title, pagine, autor, genere);
        catalogo.add(book);


    }

    public static void addlibbro(long codice, String title, int anno, int pagine, String autore, String genere, List<Catalogo> catalogo){
        Libri libro=new Libri(codice,title,anno,pagine,autore,genere);
        catalogo.add(libro);
        System.out.println(catalogo);


    }

    public static void aggiungiRivista(List<Catalogo> catalogo) {
        Faker faker = new Faker();
        Random r = new Random();
        String title = faker.book().title();
        int pagine = r.nextInt(30, 50);

        Riviste.periodicità[] per = Riviste.periodicità.values();
        Riviste.periodicità periodicita = per[r.nextInt(per.length)];

        Riviste rivista = new Riviste(pagine, title, periodicita);
        catalogo.add(rivista);

    }

    public static void addrivista(long codice, String title, int anno, int pagine,Riviste.periodicità periodicità, List<Catalogo> catalogo){
        Riviste rivista=new Riviste(codice,title,anno,pagine,periodicità);
        catalogo.add(rivista);
        System.out.println(catalogo);


    }

    public static void rimuovi(long isbn, List<Catalogo> catalogo) {
        //sono costretto ad usare Optional perchè la variabile catalogorimosso può essere anche null
        Optional<Catalogo> catalogorimosso = catalogo.stream().filter(c -> questoIsbn.test(isbn, c)).findFirst();


        if (catalogorimosso.isPresent()) {
            catalogo.remove(catalogorimosso.get());
            System.out.println("rimosso isbn: " + isbn);
        } else {
            System.out.println("ops non trovato");
        }
    }

    ;


    public static void cercaIsbn(long isbn, List<Catalogo> catalogo) {

        List<Catalogo> cerca = catalogo.stream().filter(c -> questoIsbn.test(isbn, c)).collect(Collectors.toList());
        if (!cerca.isEmpty()) {
            System.out.println("trovato: "+cerca);

        } else {
            System.out.println("ops è vuoto");
        }

    }

    public static void cercaAnno(int anno, List<Catalogo> catalogo) {
        List<Catalogo> cerca = catalogo.stream().filter(elem -> elem.getAnno() == anno).collect(Collectors.toList());
        if (!cerca.isEmpty()) {
            System.out.println("trovato: "+cerca);

        } else {
            System.out.println("ops è vuoto");
        }
    }


    public static void cercaAutore(String autore, List<Catalogo> catalogo) {
        List<Catalogo> cerca = catalogo.stream().filter(elem -> elem instanceof Libri).filter(elem -> ((Libri) elem).getAutore().equals(autore)).collect(Collectors.toList());
        if (!cerca.isEmpty()) {
            System.out.println("trovato: "+cerca);

        } else {
            System.out.println("ops è vuoto");
        }
    }

    public static void save(List<Catalogo> catalogo)  {
        File file = new File("src/archivio.txt");
        try (FileWriter fw = new FileWriter(file)) {
            for (Catalogo elemento : catalogo) {
                fw.write(elemento.toString() + "\n");
            }

            fw.flush();
            System.out.println("Catalogo salvato su archivio.txt con successo.");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
//        try {
//            for (Catalogo elemento:catalogo)
//            FileUtils.writeStringToFile(file,elemento.toString()+System.lineSeparator(),StandardCharsets.UTF_8, true);
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }
//        // System.lineSeparator() è il carattere che rappresenta l' "a capo"
//        System.out.println("Scritto");


    }

    public static void read() {
        File file = new File("src/archivio.txt");
        try {

            String content = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            List<String> lines = Arrays.asList(content.split("\\r?\\n"));

            System.out.println("Contenuto del file letto e convertito in lista di stringhe:");
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }


    }
}
