

public class Dijkstra{ 
  private int matriz[][];
  private String[] nodos;
  private int numNodos;
  
  private final int infinito =999999999;
  private int[] distancia;
  private boolean[] visto;
  private String[] camino;

public Dijkstra(int[][] matriz,String[] nodos) {
  this.matriz = matriz;
  this.nodos = nodos;
  this.numNodos = nodos.length;

  distancia = new int[numNodos];
  visto = new boolean[numNodos];
  camino = new String[numNodos];
  
  
  for (int i = 0; i < numNodos; i++) {
      distancia[i] = infinito;
      visto[i] = false;
      camino[i]="00";
  }
  
}



public void menorCosto(int nodoInicial) {
distancia[nodoInicial]=0;
camino[nodoInicial]= nodos[nodoInicial];

for (int i = 0; i < numNodos; i++) {
  int u = minDistancia(distancia, visto);  
   visto[u] = true;
 
  for (int j = 0; j < numNodos; j++) {
   if ((!visto[j]) && (matriz[u][j] > 0) ){
    //Verifico que visto en la posicion [j] sea false 
    //Verifico que la matriz en la fila [u] y columna [j] se mayor que cero    
    if( distancia[u] != infinito) { 
          //Verifico que la distancia el la posicion [u] sea diferente de "infinito"
         if(distancia[u]+matriz[u][j] < distancia[j]){
           //Verifico que la suma entre distancia [u] y la matriz [u][j] sea menor que distancia [j]
           distancia[j] = distancia[u] + matriz[u][j];
 
           camino[j] = camino[u]+" "+nodos[j];
         }
       }
    }
 }
}
}

private int minDistancia(int[] dist, boolean[] nodoYaProcesado){
  int min = infinito;
  int min_index=0;

  for (int nodo = 0; nodo < numNodos; nodo++)
    if (!(nodoYaProcesado[nodo]) && dist[nodo] <= min) {
        min = dist[nodo];
        min_index = nodo;
     }
  return min_index;
}

public void mostrar(){
   for (int i = 0; i < numNodos; i++)
  System.out.println(nodos[i] + "\t" + distancia[i]);
}

public void mostrarCamino(){
 for (int i = 0; i < numNodos; i++)
 System.out.println(nodos[i]+"-->"+camino[i]);
}
}