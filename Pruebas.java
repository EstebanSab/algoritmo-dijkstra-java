

public class Pruebas{
  public static void main(String[] arg){
  
  Grafo grafoDij = new Grafo(7,true);
  
  grafoDij.agregarArista("A","B",5);
  grafoDij.agregarArista("A","C",10);
  grafoDij.agregarArista("B","E",8);
  grafoDij.agregarArista("B","C",4);
  grafoDij.agregarArista("C","D",3);
  grafoDij.agregarArista("C","E",9);
  grafoDij.agregarArista("C","F",22);
  grafoDij.agregarArista("C","G",8);
  grafoDij.agregarArista("D","F",11);
  grafoDij.agregarArista("E","G",19);
  grafoDij.agregarArista("F","G",2);
   
  Dijkstra dij = new Dijkstra(grafoDij.getMatriz(),grafoDij.getNodos());
  dij.menorCosto(2);
  dij.mostrarCamino();
  dij.mostrar();
  
 
 
    }
}
