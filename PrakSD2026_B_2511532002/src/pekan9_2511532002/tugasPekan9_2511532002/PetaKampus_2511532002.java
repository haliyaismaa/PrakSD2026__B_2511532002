package tugasPekan9_2511532002;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.List;

public class PetaKampus_2511532002 extends JFrame {

	private static final long serialVersionUID = 1L;

	private Graph_2511532002 graph_2002;
	private GraphPanel_2511532002 graphPanel_2002;

	private JComboBox<String> startBox_2002;
	private JComboBox<String> goalBox_2002;

	private JButton bfsButton_2002;
	private JButton dfsButton_2002;
	private JButton resetButton_2002;

	private JTextArea resultArea_2002;

	public PetaKampus_2511532002() {

		setTitle("BFS dan DFS - 2511532002");
		setSize(800, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// Membuat Graph
		graph_2002 = new Graph_2511532002();

		// 10 Node dan 15 Edge
		graph_2002.addEdge_2002("Air Tawar", "Ulak Karang");
		graph_2002.addEdge_2002("Air Tawar", "Lubuk Buaya");
		graph_2002.addEdge_2002("Ulak Karang", "Purus");
		graph_2002.addEdge_2002("Ulak Karang", "Alai");
		graph_2002.addEdge_2002("Lubuk Buaya", "Tabing");
		graph_2002.addEdge_2002("Lubuk Buaya", "Koto Tangah");
		graph_2002.addEdge_2002("Purus", "Padang Barat");
		graph_2002.addEdge_2002("Alai", "Padang Barat");
		graph_2002.addEdge_2002("Alai", "Siteba");
		graph_2002.addEdge_2002("Tabing", "Siteba");
		graph_2002.addEdge_2002("Tabing", "By Pass");
		graph_2002.addEdge_2002("Koto Tangah", "By Pass");
		graph_2002.addEdge_2002("Siteba", "By Pass");
		
		// Panel Graph
		graphPanel_2002 = new GraphPanel_2511532002(graph_2002);

		// Pilihan Node
		// JComboBox
		String[] lokasi_2002 = {
			    "Air Tawar",
			    "Ulak Karang",
			    "Lubuk Buaya",
			    "Purus",
			    "Alai",
			    "Tabing",
			    "Koto Tangah",
			    "Padang Barat",
			    "Siteba",
			    "By Pass"
			};
		
		startBox_2002 = new JComboBox<>(lokasi_2002);
		goalBox_2002 = new JComboBox<>(lokasi_2002);

		bfsButton_2002 = new JButton("BFS");
		dfsButton_2002 = new JButton("DFS");
		resetButton_2002 = new JButton("Reset");

		resultArea_2002 = new JTextArea();
		resultArea_2002.setEditable(false);

		// Panel Atas
		JPanel topPanel_2002 = new JPanel();

		topPanel_2002.setLayout(new FlowLayout());

		topPanel_2002.add(startBox_2002);
		topPanel_2002.add(goalBox_2002);
		topPanel_2002.add(bfsButton_2002);
		topPanel_2002.add(dfsButton_2002);
		topPanel_2002.add(resetButton_2002);

		// Event BFS
		bfsButton_2002.addActionListener(e -> {

			String start_2002 =
					(String) startBox_2002.getSelectedItem();

			String goal_2002 =
					(String) goalBox_2002.getSelectedItem();

			List<String> path_2002 = graph_2002.bfs_2002( start_2002, goal_2002);

			graphPanel_2002.setVisitedNodes_2002(path_2002);

			resultArea_2002.setText("");

			resultArea_2002.append("METODE : BFS\n\n");
			resultArea_2002.append("Start : " + start_2002 + "\n");
			resultArea_2002.append("Goal : " + goal_2002 + "\n\n");

			if(path_2002.isEmpty()) {
				resultArea_2002.append("Path tidak ditemukan");
			}else {
				resultArea_2002.append(
						"Path : "
						+ String.join(" -> ", path_2002));
			}
		});

		// Event DFS
		dfsButton_2002.addActionListener(e -> {

			String start_2002 =
					(String) startBox_2002.getSelectedItem();

			String goal_2002 =
					(String) goalBox_2002.getSelectedItem();

			List<String> path_2002 =graph_2002.dfs_2002(start_2002,goal_2002);

			graphPanel_2002.setVisitedNodes_2002(path_2002);

			resultArea_2002.setText("");

			resultArea_2002.append("METODE : DFS\n\n");
			resultArea_2002.append("Start : " + start_2002 + "\n");
			resultArea_2002.append("Goal : " + goal_2002 + "\n\n");

			if(path_2002.isEmpty()) {
				resultArea_2002.append("Path tidak ditemukan");
			}else {
				resultArea_2002.append(
						"Path : "
						+ String.join(" -> ", path_2002));
			}
		});

		// Event Reset
		resetButton_2002.addActionListener(e -> {

			graphPanel_2002.resetGraph_2002();
			resultArea_2002.setText("");

		});

		add(topPanel_2002, BorderLayout.NORTH);
		add(graphPanel_2002, BorderLayout.CENTER);
		add(new JScrollPane(resultArea_2002),
				BorderLayout.SOUTH);
	}

	public static void main(String[] args) {

		new PetaKampus_2511532002().setVisible(true);

	}
}
