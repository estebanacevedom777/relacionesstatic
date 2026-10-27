/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.modelo;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Playlist {

    public static final int MAX_CANCIONES = 3;

    private final String nombre;
    private final ArrayList<cancion> canciones;

    public Playlist(String nombre) {
        this.nombre = nombre;
        canciones = new ArrayList<>();
    }

    public boolean agregar(cancion cancion) {
        if (cancion == null
                || canciones.contains(cancion)
                || canciones.size() >= MAX_CANCIONES) {
            return false;
        }

        canciones.add(cancion);
        return true;
    }

    public void mostrar() {
        System.out.println(nombre + ":");

        for (int i = 0; i < canciones.size(); i++) {
            cancion c = canciones.get(i);

            System.out.println((i + 1) + ". "
                    + c.getTitulo() + " - "
                    + c.getArtista() + " ("
                    + c.getDuracion() + " s)");
        }
    }

    public int duracionTotal() {
        int total = 0;

        for (cancion c : canciones) {
            total += c.getDuracion();
        }

        return total;
    }

    public cancion buscar(String titulo) {
        if (titulo == null) {
            return null;
        }

        for (cancion c : canciones) {
            if (c.getTitulo().equalsIgnoreCase(titulo)) {
                return c;
            }
        }

        return null;
    }

    public int eliminarArtista(String artista) {
        int eliminadas = 0;

        for (int i = canciones.size() - 1; i >= 0; i--) {
            if (artista == null
                    ? canciones.get(i).getArtista() == null
                    : artista.equalsIgnoreCase(
                            canciones.get(i).getArtista())) {
                canciones.remove(i);
                eliminadas++;
            }
        }

        return eliminadas;
    }

    public cancion cancionMasLarga() {
        if (canciones.isEmpty()) {
            return null;
        }

        cancion mayor = canciones.get(0);

        for (cancion c : canciones) {
            if (c.getDuracion() > mayor.getDuracion()) {
                mayor = c;
            }
        }

        return mayor;
    }

     public ArrayList<cancion> getCanciones() {
        return new ArrayList<>(canciones);
    }

}

