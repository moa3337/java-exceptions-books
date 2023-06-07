package org.learning.java;

public class Book {
    private String titolo;
    private int numPagine;
    private String autore;
    private String editore;

    public void setTitolo(String titolo) {
        if (titolo.isEmpty()) {
            throw new IllegalArgumentException("E' obbligatorio inserire un titolo");
        }
        this.titolo = titolo;
    }

    public int getNumPagine() {
        return numPagine;
    }

    public void setNumeroPagine(int numPagine) {
        if (numPagine <= 0) {
            throw new IllegalArgumentException("Il numero di pagine deve essere maggiore di 0");
        }
        this.numPagine = numPagine;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        if (autore.isEmpty()) {
            throw new IllegalArgumentException("E' obbligatorio inserire un autore");
        }
        this.autore = autore;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        if (editore.isEmpty()) {
            throw new IllegalArgumentException("E' obbligatorio iserire un editore");
        }
        this.editore = editore;
    }

    @Override
    public String toString() {
        return "Titolo: " + titolo +
                "\nNumero pagine: " + numPagine +
                "\nAutore: " + autore +
                "\nEditore: " + editore;
    }
}
