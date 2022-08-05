
public class main {
    public static void main(String[] args) {

       throw Exception{

            Lista lista = new Lista();

            System.out.println("<<-- Ejemplo de lista simple -->>\n");
            //Agregar al final de la lista
            lista.agregarNodoFinal(12);
            lista.agregarNodoFinal(15);
            lista.agregarNodoFinal(9);

            //Agregar el inicio de la lista
            lista.agregarNodoinicio(41);
             lista.agregarNodoinicio(6);
             
             System.out.println("<<-- Lista -->>");
             lista.listar();
             
             System.out.println("\n\n<<--Tamaño-->>");
             System.out.println(lista.getTamano());
             
             System.out.println("\n<<--Obtener valor del nodo en la posicion 3-->>");
             System.out.println(lista.getValor(3));
             
             
             System.out.println("\nInsertar un nodo con valor 16 despues del 15");
             lista.InsertarPorReferencia(15, 16);
             lista.listar();
             System.out.println("Tamaño");
             System.out.println(lista.getTamano());
             
             System.out.println("\n\nInsertar un nodo");
             lista.insertarPorPosicion(2, 44);
             lista.listar();
             System.out.println("Tamaño");
             System.out.println(lista.getTamano());
             
             System.out.println("\nActualizarel valor 12 del tercer nodo por 13");
             lista.editarPorReferencia(12, 13);
             lista.listar();
             System.out.println("tamaño");
             System.out.println(lista.getTamano());
             
             System.out.println("\nactualiza el valor nodo en la pocicion 0 por 41");
             lista.removerPorReferencia(41);
             lista.listar();
             System.out.println("Tamaño");
             System.out.println(lista.getTamano());
             
             System.out.println("\nElimina el nodo en la pocicion 4");
             lista.removerPorPosicion(4);
             lista.listar();
             System.out.println("Tamaño");
             System.out.println(lista.getTamano());
             
             System.out.println("\nconsulta si existe el valor 30");
             System.out.println(lista.buscar(30));
             
             System.out.println("\nConsulta la posicion del valor 9");
             System.out.println(lista.getPosicion(9));
             
             System.out.println("\nElimina la lista");
             lista.eliminar();
             
             System.out.println("\nconsulta si la lista esta vacia");
             System.out.println(lista.estaVacia());
             
             System.out.println("fin del ejemplo ");
             
             
        }
    }

