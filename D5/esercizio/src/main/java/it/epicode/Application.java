package it.epicode;

import it.epicode.Catalogo.Catalogo;
import it.epicode.Catalogo.Riviste;
import it.epicode.Utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    private static List<Catalogo> catalogo = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        System.out.println("--------Aggiunta elementi----------");


        for (int i = 0; i < 2; i++) {

            Utils.aggiungiLibro(catalogo);
            Utils.aggiungiRivista(catalogo);


        }


        Utils.addlibbro(7, "Gli uomini danzanti", 2001, 350, "Arthur Conan Doyle", "mistero", catalogo);
        Utils.addlibbro(8, "Sono il numero 4", 2001, 350, "Pittacus Lore", "fantasy", catalogo);
        Utils.addrivista(6, "Magazine", 2020, 30, Riviste.periodicità.SETTIMANALE, catalogo);
        Utils.addrivista(5, "Cucina", 2024, 36, Riviste.periodicità.SETTIMANALE, catalogo);

        System.out.println("-------Cerca autore-------");

        Utils.cercaAutore("Pittacus Lore", catalogo);

        System.out.println("-------Cerca isbn-------");

        Utils.cercaIsbn(7, catalogo);

        System.out.println("-------Cerca anno-------");

        Utils.cercaAnno(2001, catalogo);

        System.out.println("-------Rimuovi-------");

        Utils.rimuovi(5, catalogo);

        System.out.println("-------Stampa catalogo-------");

        System.out.println(catalogo);

        System.out.println("-------Salva sul disco-------");

        Utils.save(catalogo);

        System.out.println("-------Leggi il disco-------");

        Utils.read();


    }


}
