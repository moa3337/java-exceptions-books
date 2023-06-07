package org.learning.java;

import org.learning.java.Book;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Catalogo libri");

        // Numero di libri da inserire nell'array
        System.out.println("Quanti libri vuoi aggiungere al catalogo? ");
        int numLibri = scanner.nextInt();
        scanner.nextLine();

        // Creazione dell'array per il catalogo libri
        Book[] catalogo = new Book[numLibri];

        // Ciclo per inserire libri nel catalogo
        for (int i = 0; i < numLibri; i++) {
            System.out.println("\nInserisci i dati del libro " + (i + 1));

            try {
                // Richiesta dati libro
                System.out.println("Titolo");
                String titolo = scanner.nextLine();

                System.out.println("Numero pagine");
                int numPagine = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Autore");
                String autore = scanner.nextLine();

                System.out.println("Editore");
                String editore = scanner.nextLine();

                // Creazione ogetto Book più inserimento nell'array
                Book libro = new Book();
                libro.setTitolo(titolo);
                libro.setNumeroPagine(numPagine);
                libro.setAutore(autore);
                libro.setEditore(editore);

                catalogo[i] = libro;
            } catch (IllegalArgumentException e) {
                System.out.println("Errore: " + e.getMessage());
                i--; // Ripeto l'inserimento per lo stesso libro
            }
        }

        // Stampo catalogo libro
        System.out.println("\nCatalogo libri");
        for (Book libro : catalogo) {
            System.out.println(libro);
        }
    }
}
