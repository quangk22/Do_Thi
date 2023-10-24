import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Graph graph = new Graph(6);
	        graph.addEdge(0, 1);
	        graph.addEdge(0, 2);
	        graph.addEdge(1, 3);
	        graph.addEdge(2, 4);
	        graph.addEdge(3, 5);
	        graph.addEdge(5, 4);
	        graph.addEdge(4, 0);

	        System.out.println("Tìm kiếm theo chiều rộng bắt đầu từ đỉnh 0:");
	        graph.BFS(0);

	        System.out.println("Tìm kiếm theo chiều sau bắt đầu từ đỉnh 0:\"");
	        graph.DFS(0);
	    }
}
