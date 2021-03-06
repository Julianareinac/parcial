package co.uniquindio.cineColombia;

import java.util.ArrayList;

public class SalaCine {
    private boolean isLlena;
    private Zona zonaPref;
    private Zona zonaNormal;
    private ArrayList<Funcion> funciones;

    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(ArrayList<Funcion> funciones) {
        this.funciones = funciones;
    }

    /*
        private ArrayList<Integer> sillasOcupadasPref= zonaPref.getSillasOcupadas();
        private ArrayList<Integer> sillasOcupadasNormal= zonaNormal.getSillasOcupadas();
        private ArrayList<Integer> sillasTotalesPref= zonaPref.getSillasTotales();
        private ArrayList<Integer> sillasTotalesNormal= zonaNormal.getSillasTotales();*/
    private ArrayList<Integer> sillasOcupadasPref;
    private ArrayList<Integer> sillasOcupadasNormal;
    private ArrayList<Integer> sillasTotalesPref;
    private ArrayList<Integer> sillasTotalesNormal;

    public SalaCine() {

        this.zonaPref = new Zona();
        this.zonaNormal = new Zona();

        sillasOcupadasPref = new ArrayList<>();
        sillasOcupadasNormal = new ArrayList<>();
        sillasTotalesPref = new ArrayList<>();
        sillasTotalesNormal = new ArrayList<>();
    }

    public boolean isSalaLlena (){
        boolean isLlena= false;
        if (sillasOcupadasNormal.size()==sillasTotalesNormal.size() && sillasOcupadasPref.size()== sillasTotalesPref.size() ) {
            isLlena = true;
        }

        return isLlena;
    }


    public boolean isLlena() {

        return isLlena;
    }

    public void setLlena(boolean llena) {

        isLlena = llena;
    }

    public Zona getZonaPref() {

        return zonaPref;
    }

    public void setZonaPref(Zona zonaPref) {

        this.zonaPref = zonaPref;
    }

    public Zona getZonaNormal() {
        return zonaNormal;
    }

    public void setZonaNormal(Zona zonaNormal) {
        this.zonaNormal = zonaNormal;
    }
}
