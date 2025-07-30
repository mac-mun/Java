import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {

    ArrayList<NodE> nodES;
    int[][] matrix;

    Graph(int size) {
        nodES = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(NodE node) {
        nodES.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        if (matrix[src][dst] == 1) {
            return true;
        } else {
            return false;
        }

    }

    public void print() {

        System.out.print("  ");

        for (NodE node : nodES) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {

            System.out.print(nodES.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }


    public void breadthFirstSearch(int src) {

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while (queue.size() != 0) {
            src = queue.poll();
            System.out.println(nodES.get(src).data + " = visited!");

            for (int i = 0; i < matrix[src].length; i++) {
                if (matrix[src][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }

            }
        }

    }


}
