package br.com.sergio.poo.interfaces.test;

import br.com.sergio.poo.interfaces.dominio.DatabaseLoader;
import br.com.sergio.poo.interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

    }
}
