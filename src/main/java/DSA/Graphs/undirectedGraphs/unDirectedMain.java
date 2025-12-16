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
public class unDirectedMain{
   
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
        
        System.out.println("\n UNDIRECTED WEIGHTED GRAPHS \n");
        weight_unDirectedGraphs obj1 = new weight_unDirectedGraphs(5);
        obj1.addVertex();
        obj1.addVertex();
        obj1.addVertex();
        obj1.addVertex();
        obj1.addVertex();
        
        obj1.addEdge(0, 1,98);
        obj1.addEdge(0, 2,97);
        obj1.addEdge(1, 2,93);
        obj1.addEdge(2, 3,94);
        obj1.addEdge(3, 1,98);
        obj1.addEdge(4, 3,99);
        
        obj1.printGraph();
    }    
}
