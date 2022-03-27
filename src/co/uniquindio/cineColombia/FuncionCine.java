package co.uniquindio.cineColombia;

import java.util.ArrayList;
import java.util.Date;

public class FuncionCine {

    private Pelicula pelicula1 = new Pelicula("Metal Gear Solid 4", 2, TipoCategoria.P18);
    private Pelicula pelicula2 = new Pelicula("Bonnie and Clyde", 2, TipoCategoria.P18);
    private Pelicula pelicula3 = new Pelicula("Spiderman",  2, TipoCategoria.P15);
    private Pelicula pelicula4 = new Pelicula("Encanto",  2, TipoCategoria.P10);

    private ArrayList<Funcion> listaFuncionesSala1=new ArrayList<>();
    private ArrayList<Funcion> listaFuncionesSala2=new ArrayList<>();
    private ArrayList<Funcion> listaFuncionesSala3=new ArrayList<>();
    private ArrayList<Funcion> listaFuncionesSala4=new ArrayList<>();
    private ArrayList<SalaCine> salasCines=new ArrayList<>();


    SalaCine sala1 = new SalaCine();
    SalaCine sala2 = new SalaCine();
    SalaCine sala3 = new SalaCine();
    SalaCine sala4 = new SalaCine();

    Funcion funcion1;
    Funcion funcion2;
    Funcion funcion3;
    Funcion funcion4;

    int horaApertura;


    public FuncionCine() {

        funcion1 = new Funcion(sala1, horaApertura, pelicula1);
        funcion2 = new Funcion(sala1, horaApertura, pelicula2);
        funcion3 = new Funcion(sala1, 12, pelicula3);
        funcion4 = new Funcion(sala1, 2, pelicula4);
        listaFuncionesSala1.add(funcion1);
        listaFuncionesSala1.add(funcion2);
        listaFuncionesSala1.add(funcion3);
        listaFuncionesSala1.add(funcion4);
        sala1.setFunciones(listaFuncionesSala1);

        funcion1 = new Funcion(sala2, horaApertura, pelicula1);
        funcion2 = new Funcion(sala2, horaApertura, pelicula2);
        funcion3 = new Funcion(sala2, 3, pelicula3);
        funcion4 = new Funcion(sala2, 4, pelicula4);
        listaFuncionesSala2.add(funcion1);
        listaFuncionesSala2.add(funcion2);
        listaFuncionesSala2.add(funcion3);
        listaFuncionesSala2.add(funcion4);
        sala2.setFunciones(listaFuncionesSala2);

        funcion1 = new Funcion(sala3, horaApertura, pelicula1);
        funcion2 = new Funcion(sala3, horaApertura, pelicula2);
        funcion3 = new Funcion(sala3, 5, pelicula3);
        funcion4 = new Funcion(sala3, 6, pelicula4);
        listaFuncionesSala3.add(funcion1);
        listaFuncionesSala3.add(funcion2);
        listaFuncionesSala3.add(funcion3);
        listaFuncionesSala3.add(funcion4);
        sala3.setFunciones(listaFuncionesSala3);

        funcion1 = new Funcion(sala4, horaApertura, pelicula1);
        funcion2 = new Funcion(sala4, horaApertura, pelicula2);
        funcion3 = new Funcion(sala4, 4, pelicula3);
        funcion4 = new Funcion(sala4, 8, pelicula4);
        listaFuncionesSala4.add(funcion1);
        listaFuncionesSala4.add(funcion2);
        listaFuncionesSala4.add(funcion3);
        listaFuncionesSala4.add(funcion4);
        sala4.setFunciones(listaFuncionesSala4);

        salasCines.add(sala1);
        salasCines.add(sala2);
        salasCines.add(sala3);
        salasCines.add(sala4);
    }



    public ArrayList<Integer> getHoraPelicula (String pelicula) {
        ArrayList<Integer> horaPelicula= new ArrayList<>();

        for (int j = 0; j < listaFuncionesSala1.size(); j++) {
                if (listaFuncionesSala1.get(j).getPelicula().getNombre().equals(pelicula)){
                    horaPelicula.add(listaFuncionesSala1.get(j).getHorarioInicio());
                }
            }
        for (int j = 0; j < listaFuncionesSala2.size(); j++) {
            if (listaFuncionesSala2.get(j).getPelicula().getNombre().equals(pelicula)){
                horaPelicula.add(listaFuncionesSala2.get(j).getHorarioInicio());
            }
        }
        for (int j = 0; j < listaFuncionesSala3.size(); j++) {
            if (listaFuncionesSala3.get(j).getPelicula().getNombre().equals(pelicula)){
                horaPelicula.add(listaFuncionesSala3.get(j).getHorarioInicio());
            }
        }
        for (int j = 0; j < listaFuncionesSala4.size(); j++) {
            if (listaFuncionesSala4.get(j).getPelicula().getNombre().equals(pelicula)){
                horaPelicula.add(listaFuncionesSala4.get(j).getHorarioInicio());
            }
        }
        System.out.print(horaPelicula);
        return horaPelicula;

    }


    /*public String getPeliculas(int num) {

        String listaPeliculas = new String();

        switch(numFuncion){
            case 1:

                listaPeliculas = funcion1.getListaPeliculasToString();
                break;

            case 2:
                listaPeliculas =funcion2.getListaPeliculasToString();
                break;

            case 3:
                System.out.print(funcion3.getListaPeliculasToString());
                listaPeliculas = funcion3.getListaPeliculasToString();
                break;

            case 4:
                listaPeliculas = funcion4.getListaPeliculasToString();
                break;

        }
        return listaPeliculas;
    }*/

    }


}
