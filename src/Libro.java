public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private int numPaginas;

    /**
     * Metodo constructor de Libros
     * @param id identificador de Libros
     * @param titulo titulo de libro
     * @param autor autor del libro
     * @param numPaginas numero de paginas del libro
     */

    public Libro(int id, String titulo, String autor, int numPaginas) {
        int numHojas; // variable del metodo


        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;

        numHojas = numPaginas/2;

    }


    public int getId() {
        return id;
    }
     public String getTitulo() {
        return titulo;
     }
     public String getAutor() {
        return autor;
     }

     public int getNumPaginas() {
        return numPaginas;
     }

     @Override
     public String toString() {
        StringBuilder sb = new StringBuilder("Libro:");
        sb.append(String.format("\n id: %d", id));
        sb.append(String.format(" titulo: %s;", titulo));
         sb.append(String.format(" autor: %s;", autor));
         sb.append(String.format(" num.Paginas: %d;", numPaginas));

         return sb.toString();

     }

     public void updateNumPaginas(int numPaginas) {
        boolean resultado;
        if(numPaginas <= 0){
            resultado = false;
        } else {
            this.numPaginas = numPaginas;
            resultado = true;
        }
            return resultado;

     }
}
