/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA.Graphs.undirectedGraphs;

import java.util.LinkedList;

/**
 *
 * @author Syed Suhaib Hasan
 */
public class unDirectedMain extends unDirectedGraph{
   
    public static void main(String[] args) {
        unDirectedGraph obj = new unDirectedGraph(5);
        obj.addVertex();
        obj.addVertex();
        obj.addVertex();
        obj.addVertex();
        obj.addVertex();
        
        obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 2);
        obj.addEdge(2, 3);
        obj.addEdge(3, 1);
        obj.addEdge(4, 3);
        
        obj.printGraph();
    }
    
    //contructor of parent class
    public unDirectedMain(int V) {
        super(V);
    }
    
}
