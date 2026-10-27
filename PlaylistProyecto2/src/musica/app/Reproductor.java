package musica.app;

import musica.modelo.Playlist3;
import musica.modelo.cancion;

public class Reproductor {

    public static void main(String[] args) {

        cancion c1 = new cancion(
                "Lluvia en Manizales", "Nevado", 200);

        cancion c2 = new cancion(
                "Bajo el guadual", "Café Trío", 245);

        cancion c3 = new cancion(
                "Noche en Chipre", "Nevado", 185);

        Playlist3 fav = new Playlist3("Favoritas");

        fav.agregar(c1);
        fav.agregar(c2);
        fav.agregar(c3);

        System.out.println(fav.agregar(c1));
        fav.mostrar();
        System.out.println(fav.duracionTotal());

        Playlist3 viaje = new Playlist3("Viaje");
        viaje.agregar(c1);
        viaje.agregar(c2);

        System.out.println(fav.eliminarArtista("Nevado"));

        fav.mostrar();
        viaje.mostrar();

        System.out.println(
                fav.buscar("bajo el guadual").getArtista());

        System.out.println(
                fav.buscar("Lluvia en Manizales"));

        cancion c4 = new cancion(
                "Río Chinchiná", "Nevado", 230);

        System.out.println(viaje.agregar(c3));
        System.out.println(viaje.agregar(c4));

        System.out.println((char) cancion.getTotalCanciones());
        System.out.println(Playlist3.MAX_CANCIONES);
    }
}