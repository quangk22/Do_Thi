import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
	  private int V; // Số đỉnh
	    private LinkedList<Integer> adjList[];

	    public Graph(int v) {
	        V = v;
	        adjList = new LinkedList[v];
	        for (int i = 0; i < v; i++) {
	            adjList[i] = new LinkedList<>();
	        }
	    }

	    // Thêm một cạnh từ u đến v
	    void addEdge(int u, int v) {
	        adjList[u].add(v);
	    }

	    // Tìm kiếm đường đi theo chiều rộng (BFS)
	    void BFS(int start) {
	        boolean visited[] = new boolean[V];
	        LinkedList<Integer> queue = new LinkedList<>();

	        visited[start] = true;
	        queue.add(start);

	        while (queue.size() != 0) {
	            start = queue.poll();
	            System.out.print(start + " ");

	            for (Integer neighbor : adjList[start]) {
	                if (!visited[neighbor]) {
	                    visited[neighbor] = true;
	                    queue.add(neighbor);
	                }
	            }
	        }
	        System.out.println();
	    }

	    // Tìm kiếm đường đi theo chiều sau (DFS)
	    void DFS(int start) {
	        boolean visited[] = new boolean[V];
	        DFSUtil(start, visited);
	    }

	    void DFSUtil(int v, boolean visited[]) {
	        visited[v] = true;
	        System.out.print(v + " ");

	        for (Integer neighbor : adjList[v]) {
	            if (!visited[neighbor]) {
	                DFSUtil(neighbor, visited);
	            }
	        }
	    }
	}