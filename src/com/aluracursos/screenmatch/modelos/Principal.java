package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendaciones;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println(miPelicula.getSumaDeLasEvaluaciones());
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1999);
        otraPelicula.setDuracionEnMinutos(180);

        Serie casaDragon = new Serie();
        casaDragon.setNombre("Dragon");
        casaDragon.setFechaDeLanzamiento(2024);
        casaDragon.setDuracionEnMinutos(360);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporadas(18);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        System.out.println("Tiempo de las series y pelis: "+calculadora.getTiempoTotal());

        FiltroRecomendaciones filtro = new FiltroRecomendaciones();
        filtro.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNombre("New Order");
        episodio.setNumero(1);
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtro.filtra(episodio);

    }
}
