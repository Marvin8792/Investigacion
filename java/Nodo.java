public class Nodo {

    //variable donde se almacena el dato
    private int valor;

    //variable que permite enlazar los nodos 
    private Nodo siguiente;

    /*Al tratase de variables que evidentemete 
    reservan un espacio en memoria 
    es conveniente crear el construptor*/
    //donde inicializamos el valor de la variable 
    public Nodo() {
        this.valor = 0;
        this.siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
