
public class Lista {
    //Puntero que indica el inicio de la lista
    //O conocida tambien como cabeza o nodo puntero o apuntador de la lista

    private Nodo inicio;

    //variable que define el tamño de la lista
    private int tamano;

    /*Construptor para inicializar una variable*/
    public void Lista() {
        inicio = null;
        tamano = 0;
    }

    /*permite identificar que la lista se encuentra vacia*/
    public boolean estaVacia() {
        return inicio == null;
    }

    /*Permite determinar cuantos elementos (Nodos) tiene la lista
    
   Esto devuelve un valor con n siendo esto el numero de elementos contenidos en la lista
     */
    public int getTamano() {
        return tamano;
    }

    /*Permite agregar un nuevo nodo al final de la lista*/
    public void agregarNodoFinal(int valor) {
        //Permite un nuevo nodo
        Nodo nuevo = new Nodo();

        // asigna el valor del nuevo nodo
        nuevo.setValor(valor);

        // Verifica si la lista esta vacia
        if (estaVacia()) {
            /*En caso de que la lista se encuentre vacia inizializa la lista agregado
            como inicio el nuevo nodo*/

            inicio = nuevo;
            /*En coso contrario determina la cantidad de elementos que hay en la lista hasta llegar al ultimo Nodo y agregar el nuevo */
        } else {
            /*En caso de que quiede algun inconvenientes es importante generar una copia de la lista*/
            Nodo aux = inicio;
            //Facilita el recorrido de la lista
            //Hasta llegar al ultimo nodo
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }

            //Incrementa el contador de tamaño de la lista
            tamano++;
        }
    }

    /* Permite agregar un nuevo nodo el inicio de la lista*/
    public void agregarNodoinicio(int valor) {
        //Permite un nuevo nodo
        Nodo nuevo = new Nodo();

        nuevo.setValor(valor);

        if (estaVacia()) {
            inicio = nuevo;

        } else {
            nuevo.setSiguiente(inicio);
        }

    }

    public void InsertarPorReferencia(int referencia, int valor) {
        //Crea una copia de la lista
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        if (estaVacia()) {
            if (buscar(referencia)) {
                Nodo aux = inicio;
                //Recorre la lista

                while (aux.getValor() != referencia) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                //Une la continuacion de la lista al nuevo nodo
                aux.setSiguiente(siguiente);
                //incrementa el contador de tamaño de la lista
                tamano++;
            }
        }
    }

    /*Inserta un nuevo nodo despues en una posiciom determinado*/
    public void insertarPorPosicion(int posicion, int valor) {
        //Verifica si la posicion ingresada es
        //encuentra en el rango
        //es 0 y <= que el numero de elementos de la lista

        if (posicion >= 0 && posicion <= tamano) {
            Nodo nuevo = new Nodo();
            nuevo.setValor(valor);

            /*Consulta el nuevo nodo e ingresava al inicio de la lista*/
            if (posicion == 0) {
                //Inserta el nuevo nodo
                nuevo.setValor(valor);
                inicio = nuevo;
            } else {
                // si el nodo a insertar va al final de lista
                if (posicion == tamano) {
                    Nodo aux = inicio;

                    while (aux.getSiguiente() != null) {
                        aux.getSiguiente();
                    }

                    aux.setSiguiente(nuevo);
                }
                Nodo aux = inicio;

                for (int i = 0; i < (posicion - 1); i++) {
                    aux.getSiguiente();
                }
                Nodo siguiebte = aux.getSiguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(siguiebte);
            }
        }
        //incrementa el contador de tamaño de la lista
        tamano++;
    }

    /*Obtine el valor de un nodo en una derteminada posicion*/
    public int getValor(int posicion) throws Exception {
        if (posicion >= 0 && posicion < tamano) {
            if (posicion == 0) {
                return inicio.getValor();
            } else {
                    Nodo aux= inicio;
                    
                    for (int i = 0; i < posicion;i++){
                        aux= aux.getSiguiente();
                    }
                    //retorna el valor del nado
                    return aux.getValor();
            }
            
        }else {
            throw new Exception("Posicion inexsistente en la lista");
        }
        
    }
    public boolean buscar(int referencia){
       //Crea una copia de la lista
        Nodo aux = inicio;
        //Para indicar si el valor existe
        boolean encontrado = false;
        
        while (aux !=null && encontrado !=true){
            //consulta el valor del nodo
            if(referencia == aux.getValor()){
            // cambia el color de la bandera
            encontrado = true;
        
        }else{
                aux.getSiguiente();
                
         }
    }
        return encontrado;
}
    //consulta la posicion de un elemento en la lista
    public int getPosicion(int referencia) throws Exception{
        //consulta si el valor existe en la lista 
        if (buscar(referencia)){
            //crea una copia de la lista
        Nodo aux = inicio;
        //contado para almacenar la pocision del nodo
        int cont = 0;
        
        while(referencia != aux.getValor()){
             cont++;
             aux = aux.getSiguiente();
        }
        return cont;
        }else{
            throw new Exception("Valor inexistente en la lista");
        }
    }
    //Actualiza el valor de un nodo que se encuentra en la lista por un valor de referencia
    public void editarPorReferencia(int referencia, int valor){
        if(buscar(referencia)){
        // crea una copia de la lista
         Nodo aux = inicio;
         //Recorre la lista hasta llegar al Nodode referencia
         while(aux.getValor() !=referencia){
             aux = aux.getSiguiente();
         }
         //Actualiza el valor del Nodo
         aux.setValor(valor);
    }
    }
    //actualiza el valor de un nado que encuentra en la lista ubicado
    public void editarPorPosicion(int posicion, int valor){
        //Verifica si la posicion ingresada se encuentra 
        //>= 0 y < que el numero de elementos de la lista 
        if(posicion>=0 && posicion<tamano){
            //consulta si el nodo e eliminaar es lo primero
            if (posicion ==0){
                inicio.setValor(valor);
            }else{
                //En caso que el nodo a eliminar esta por 
                //o sea el ultimo
                Nodo aux = inicio;
                //Recorre la lista hasta llegar al nodo anterior al eliminar
                for(int i =0;i<posicion;i++){
                    aux = aux.getSiguiente();
                }
                //Actualiza el valor del nodo
                aux.setValor(valor);
            }
        }
    }
    /*Elimina un nodo que se encuentre en la lista ubicado por un valor de referencia */
    public void removerPorReferencia(int referencia){
        //consulto el valor de referencia existe en la lista
        if(buscar(referencia)){
            //consulta el nodo a eliminar es el primero
            if(inicio.getValor() == referencia ){
                inicio = inicio.getSiguiente();
            }else{
                //crea una copia de la lista
                Nodo aux = inicio;
                //Recorre la lista hasta llegar al nodo en
                //al de referenci
                
                while(aux.getSiguiente().getValor() != referencia){
                aux=aux.getSiguiente();
            }
                Nodo siguiente = aux.getSiguiente().getSiguiente();
                //Enlaza el modo anterior al de eliminar 
                aux.setSiguiente(siguiente);
            }
            tamano++;
        }
    }
    public void removerPorPosicion(int posicion){
         //Verifica si la posicion ingresada se encuentra 
        //>= 0 y < que el numero de elementos de la lista 
        if(posicion>=0 && posicion<tamano){
            
            if(posicion == 0){
                //Elimina el prime Nodo apuntado
                inicio = inicio.getSiguiente();
            }else{
                Nodo aux = inicio;
                //Recorte la lista hasta llegar nodo
                for (int i=0;i<posicion-1;i++){
                    aux= aux.getSiguiente();
                }
                Nodo siguiente =aux.getSiguiente();
                //Elimina la referencia del nodo
                //apuntando al nodo siguiente
                aux.setSiguiente(siguiente.getSiguiente());
            }
            //Disminuye el tamaño de la lista 
            tamano--;
            }
        }
    public void eliminar(){
        //Eliminar el valor y la referencia a los demas nodos
        inicio = null;
        //Referencia el contador de tamaño de la lista a 0
        tamano =0;
    }
    //Mustra en la pantalla los elementos de la lista.
    public void listar(){
        //Verifica si la lista contiene elementos
        if(!estaVacia()){
            //Crea una copia de la lista
            Nodo aux = inicio;
            //Posicion de los elementos de la lista
            int i = 0;
            //Recorre la lista hasta el final
            while(aux!=null){
                //Imprime en la pantalla el valor del nodo
                System.out.print(i +".[" + aux.getValor()+ "]"+ "->");
                //Avanza al siguiente nodo
                aux = aux.getSiguiente();
                //Incrementa el contador de la posicion
                i++;
            }
        }
    }
    }



