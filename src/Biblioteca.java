public class Biblioteca {

    private Libro[] catalogo;
    private final int CANT_MAX_LIBROS;

    public Biblioteca(int cantidad_maxima_libros){
        CANT_MAX_LIBROS = cantidad_maxima_libros;
        catalogo = new Libro[CANT_MAX_LIBROS];
    }

    /**
     * Busca el primer que encuentre con el id recibido
     * @param idLibro
     * @return
     */

    public Libro findLibro(int idLibro){
        boolean seguirBuscando = true;
        Libro libroEncontrado = null;

        for(int i = 0; i < CANT_MAX_LIBROS && seguirBuscando; i++){
            if(catalogo[i]. != null && catalogo[i].getId() == idLibro){
                seguirBuscando = false;
                libroEncontrado = catalogo[i];
            }

        }
        return libroEncontrado;

    }

    /**
     * Metodo privado quew busca la primera posicion libre en el catalogo
     * @return -1 si no hay hueco libre o la posicion libre
     */

    private int buscarPrimerHuecoLibre(){
        int posicionLibre = -1;
        boolean seguirBuscando = true;

        for(int i = 0; i < CANT_MAX_LIBROS && seguirBuscando; i++){
            if(catalogo[i] == null){
                posicionLibre = i;
                seguirBuscando = false;
            }

        }
        return posicionLibre;
    }

    /**
     * Recibe y añade el libro no duplicado
     * @param libro Libro no recibido
     * @return true si se ha añadido, false si no ha podido añadirlo
     */

    public boolean addLibro(Libro libro){
        boolean libroAnadido = false;
        int posicion;

        //comprobamos si existe

        //buscar hueco

          //no hay -> libroAnadido = false

        //si hay ->

        //añadimos

        //libroAnadido = true

        if(findLibro(libro.getId()) != null){ //no lo ha encontrado. no esta duplicado
            posicion = buscarPrimerHuecoLibre();
            if( posicion >= 0 ){
                catalogo[posicion] = libro;
                libroAnadido = true;
            }
        }
        return libroAnadido;
    }

    /**
     * Recibe un id de un libro, lo borra y devuelve el libro eliminado o null si no lo encuentra
     * @param id identificador de libro
     * @return el libro eliminado o null en caso de no encontrarlo
     */
    public Libro deleteLibro (int id){
        Libro libroEncontrado = null;
        int posicion;
        boolean seguirBuscando = true;

        // Comprobamos que existe. Ncesitamos el libro y la posicion

        for (int i = 0; i < CANT_MAX_LIBROS && seguirBuscando; i++) {
            if(catalogo[i] != null && catalogo[i].getId() == id){
                libroEncontrado = catalogo[i]; // guardo el libro
                catalogo[i] = null; // vaciamos la posicion
                seguirBuscando = false; //para que no siga recorriendo
            }
        }
        return libroEncontrado;

    }

    /**
     * Actualiza el numero de paginas del libro con el id recibido
     * @param idLibro id del libro
     */

    public updateNumPaginas (int idLibro){
        boolean numPaginasActualizado;
        Libro libro;

        libro = findLibro(idLibro);

        if(libro != null){
            numPaginasActualizado = libro.updateNumPaginas(numPaginas);
        }
        return numPaginasActualizado;

    }

    /**
     * Devuelve un String con el catalogo de libros
     * @return
     */

    public String obtainCatalogo(){
        StringBuilder sb = new StringBuilder("catalogo: { ");

        for(int i = 0; i < CANT_MAX_LIBROS; i++){
            if(catalogo[i] != null){
                sb.append(catalogo[i].toString());
            }
        }

    }

}
