
package DSA.Graphs.undirectedGraphs;

import java.util.LinkedList;

/*
My own work
*/
public class weight_unDirectedGraphs {
    class Edge{
        int initialPoint;
        int terminalPoint;
        int weight;
        
        public Edge(int initialPoint, int terminalPoint, int weight) {
            this.initialPoint = initialPoint;
            this.terminalPoint = terminalPoint;
            this.weight=weight;
        }
        
    }//END OF EDGE CLASS
    
    int E;
    int V;
    LinkedList<Edge> adj[];
    int vertexCount;
    
    public weight_unDirectedGraphs(int V) {
        this.E = E;
        this.V = V;
        this.vertexCount=0;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }//contructor
    
    public void addVertex(){
        if (V>vertexCount) {
            vertexCount++;
        }else{
            System.out.println("Vertex limit reached!");
        }
    }
    
    public void addEdge(int u, int v, int w){
        Edge e1 = new Edge(u, v, w);
        Edge e2 = new Edge(v, u, w);
        
        adj[u].add(e1);
        adj[v].add(e2);
        E++;
    }
    
   public void printGraph(){
       for (int i = 0; i < V; i++) {
           System.out.print(i);
           for (Edge e: adj[i] ) {
                System.out.print(" -> (" + e.terminalPoint + ", " + e.weight + ")");
           }
           System.out.println("");
       }
   }
}
