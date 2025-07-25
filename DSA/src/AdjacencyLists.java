public class AdjacencyLists {
    public static void main(String[] args) {
        /*
         * Adjacency Lists = An array/arraylist of linkedlist.
         *                   Each LinkedList has a unique node at the head.
         *                   All adjacent neighbour to that node are added to that node's linkedlist
         *
         *                   runtime complexity to check  an edge: O(v)
         *                   space complexity: O(v + e)
         *
         * */

        Graph2 graph2 = new Graph2();

        graph2.addNode(new Node2('A'));
        graph2.addNode(new Node2('B'));
        graph2.addNode(new Node2('C'));
        graph2.addNode(new Node2('D'));
        graph2.addNode(new Node2('E'));

        graph2.addEdge(0, 1);
        graph2.addEdge(1, 2);
        graph2.addEdge(1, 4);
        graph2.addEdge(2, 3);
        graph2.addEdge(2, 4);
        graph2.addEdge(4, 0);
        graph2.addEdge(4, 2);

        graph2.print();


    }
}
