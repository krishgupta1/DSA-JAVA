package Graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    int adjMatrix[][];

    class Pair{
        int node;
        int weight; 
        Pair(int n, int w){
            node = n;
            weight = w;
        }

        @Override
        public String toString(){
            return "(" + node + "," + weight + ")";
        }
    }

    Graph(int nodes) {
        adjMatrix = new int[nodes][nodes];
        adjList = new ArrayList<>();
        adjListWithWeight = new ArrayList<>();
        for(int i = 0; i<nodes; i++){
            adjListWithWeight.add(new ArrayList<>());
        }
    }

    public void addEdgesInMatrix(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            //directed
            if(isDirected){
                adjMatrix[u][v] = 1;
            }
            //undirect
            else{
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }
    }

    public void addEdgesWithWeightInMatrix(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            //directed
            if(isDirected){
                adjMatrix[u][v] = w;
            }
            //undirect
            else{
                adjMatrix[u][v] = w;
                adjMatrix[v][u] = w;
            }
        }
    }

    public void print(){
        for(int i = 0; i<adjMatrix.length; i++){
            System.out.print("row " + i + "-> ");
            for(int j = 0; j<adjMatrix[i].length; j++){
                System.out.print(adjMatrix[i][j] + ",");
            }
            System.out.println();
        }
    }
    
    List<List<Integer>> adjList;
    List<List<Pair>>  adjListWithWeight;
    public void addEdgesInList(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            //directed
            if(isDirected){
                adjList.get(u).add(v);
            }
            //undirect
            else{
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }
    }
    
    public void addEdgesWithWeightInList(int edges[][], boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if (isDirected) {
                Pair pair = new Pair(v, w);
                // directed
                adjListWithWeight.get(u).add(pair);
            } else {
                Pair pair = new Pair(v, w);
                Pair pair2 = new Pair(u, w);
                // undirected
                adjListWithWeight.get(u).add(pair);
                adjListWithWeight.get(v).add(pair2);
            }
        }
    }

    public void printList(){
        for(int i = 0; i<adjList.size(); i++){
            System.out.print(i + " -> ");
            System.out.print("[");
            for(int j = 0; j < adjList.get(i).size(); j++){
                System.out.print(adjList.get(i).get(j));
                if(j!=adjList.get(i).size()-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public void printListWeight() {
        for (int i = 0; i < adjListWithWeight.size(); i++) {
            System.out.print(i + " -> ");
            System.out.print("[");
            for (int j = 0; j < adjListWithWeight.get(i).size(); j++) {
                System.out.print(adjListWithWeight.get(i).get(j));
                if (j != adjListWithWeight.get(i).size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
     
    public static void main(String[] args) {
        // int edges[][] = {{0,2}, {0,1}, {1,3}};
        // int nodes = 4;
        // System.out.println("Undirected Graph ->");
        // Graph graph = new Graph(nodes);
        // graph.addEdgesInMatrix(edges, false);
        // graph.print();

        // System.out.println("Directed Graph ->");
        // Graph graph1 = new Graph(nodes);
        // graph1.addEdgesInMatrix(edges, true);
        // graph1.print(); 


        // For Weighted
        // int edges[][] = {{0,2,10}, {0,1,20}, {1,3,30}};
        // int nodes = 4;
        // System.out.println("Weighted Undirected Graph");
        // Graph gUn = new Graph(nodes);
        // gUn.addEdgesWithWeightInMatrix(edges, false);
        // gUn.print();
        // System.out.println();
        // System.out.println("Weighted Directed Graph");
        // Graph gDir = new Graph(nodes);
        // gDir.addEdgesWithWeightInMatrix(edges, true);
        // gDir.print();


        // For List
        // int edges[][] = {{0,2}, {0,1}, {1,3}};
        // int nodes = 4;
        // System.out.println("Undirected Graph ->");
        // Graph graph = new Graph(nodes);
        // graph.addEdgesInList(edges, false);
        // graph.printList();

        // System.out.println("Directed Graph ->");
        // Graph graph1 = new Graph(nodes);
        // graph1.addEdgesInList(edges, true);
        // graph1.printList(); 

        // For List with Weighted
        int edges[][] = { { 0, 2, 10 }, { 0, 1, 20 }, { 1, 3, 30 } };
        int nodes = 4;
        Graph graph = new Graph(nodes);
        graph.addEdgesWithWeightInList(edges, false);
        graph.printListWeight();
    }   
}