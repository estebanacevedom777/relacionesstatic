# relacionesstatic
<img width="592" height="584" alt="Diagrama sin título drawio" src="https://github.com/user-attachments/assets/455e11c7-0da0-435f-843a-34905bbded15" />
<img width="1312" height="785" alt="Infografía de resultados y errores Java" src="https://github.com/user-attachments/assets/9a8ae905-65aa-4bc7-be6c-c7073a932d8c" />

**Preguntas**

1. ¿Por qué ArrayList<int> no compila y ArrayList<Integer> sí?

2. ¿Por qué eliminar a Nevado de Favoritas no lo eliminó de Viaje? ¿Qué relación muestra eso?

3. ¿Qué diferencia hay entre la relación Playlist–Cancion y la relación Parqueadero–Puesto?

4. ¿Por qué totalCanciones debe ser static y titulo no?

5. ¿Por qué un método static no puede usar this?

**Desarrollo**

1. Porque ArrayList no acepta tipos primitivos como int, sino clases como Integer.

2. Porque ambas listas guardan una referencia al mismo objeto. Al eliminarlo de una lista, no se elimina de la otra. Es una relación de asociación.

3. En Playlist–Cancion, la canción puede existir sin la lista. En Parqueadero–Puesto, los puestos forman parte del parqueadero. Es una relación de composición.

4. Porque totalCanciones es compartido por todas las canciones, mientras que titulo es propio de cada objeto.

5. Porque static pertenece a la clase y this hace referencia a un objeto específico.
