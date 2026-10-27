
package parqueadero.modelo;

import java.util.ArrayList;

public class Parqueadero {
    private final ArrayList<Puesto> puestos;
    private static int ingresosTotales = 0;

    public Parqueadero(String nombre, int cantidad) {
        puestos = new ArrayList<>();

        for (int i = 1; i <= cantidad; i++) {
            var add = puestos.add(new Puesto(i));
        }
    }

    public void ingresar(String placa) {
        for (Puesto puesto : puestos) {
            if (placa.equals(puesto.getPlaca())) {
                System.out.println(placa + " ya está adentro");
                return;
            }
        }

        for (Puesto puesto : puestos) {
            if (puesto.estaLibre()) {
                puesto.ocupar(placa);
                ingresosTotales++;

                System.out.println(
                    placa + " en puesto " + puesto.getNumero()
                );
                return;
            }
        }

        System.out.println(placa + ": parqueadero lleno");
    }

    public boolean salir(String placa) {
        for (Puesto puesto : puestos) {
            if (placa.equals(puesto.getPlaca())) {
                puesto.liberar();
                return true;
            }
        }

        return false;
    }

    public int puestosLibres() {
        int libres = 0;

        for (Puesto puesto : puestos) {
            if (puesto.estaLibre()) {
                libres++;
            }
        }

        return libres;
    }

    public static int getIngresosTotales() {
        return ingresosTotales;
    }
}
