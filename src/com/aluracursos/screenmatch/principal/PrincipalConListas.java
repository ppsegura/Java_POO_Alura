package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 199);
        otraPelicula.evalua(6);
        var peliculaPedro = new Pelicula("Pedro",2024);
        peliculaPedro.evalua(10);
        Serie casaDragon = new Serie("Dragon", 2024);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(otraPelicula);
        lista.add(peliculaPedro);
        lista.add(miPelicula);
        lista.add(casaDragon);

        lista.forEach(nombre -> System.out.println(nombre.getNombre()));

        for (Titulo item : lista){
            System.out.println(" --- "+item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Juan Gabriel");
        listaDeArtistas.add("Shakira");
        listaDeArtistas.add("Bon Jovi");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha" + lista);
    }
}
