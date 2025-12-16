/*
My own work
*/
package DSA.Graphs.undirectedGraphs;

import java.util.LinkedList;

public class unDirectedGraph {
    class Edge{
        int initialPoint;
        int terminalPoint;

        public Edge(int initialPoint, int terminalPoint) {
            this.initialPoint = initialPoint;
            this.terminalPoint = terminalPoint;
        }
        
    }//END OF EDGE CLASS
    
    int E;
    int V;
    LinkedList<Edge> adj[];
    int vertexCount;
    
    public unDirectedGraph(int V) {
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
    
    public void addEdge(int u, int v){
        Edge e1 = new Edge(u,v);
        Edge e2 = new Edge(v, u);
        
        adj[u].add(e1);
        adj[v].add(e2);
        E++;
    }
    
   public void printGraph(){
       for (int i = 0; i < V; i++) {
           System.out.print(i);
           for (Edge e: adj[i] ) {
               System.out.print("-->"+e.terminalPoint);
           }
           System.out.println("");
       }
   }
}
