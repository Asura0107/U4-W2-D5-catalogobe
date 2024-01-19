package it.epicode.Utils;

import com.github.javafaker.Faker;
import it.epicode.Catalogo.Catalogo;
import it.epicode.Catalogo.Libri;
import it.epicode.Catalogo.Riviste;

import java.util.List;
import java.util.Random;

public class Utils {

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

}
