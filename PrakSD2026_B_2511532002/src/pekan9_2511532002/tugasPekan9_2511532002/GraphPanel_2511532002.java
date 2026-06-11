package tugasPekan9_2511532002;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.*;
import javax.swing.JPanel;


public class GraphPanel_2511532002 extends JPanel{
	
    private Map<String, Point> positions_2002;
    private Graph_2511532002 graph_2002;
    private Set<String> visitedNodes_2002;

    public GraphPanel_2511532002(Graph_2511532002 graph_2002) {

        this.graph_2002 = graph_2002;
        this.visitedNodes_2002 = new HashSet<>();

        positions_2002 = new HashMap<>();
        setBackground(Color.WHITE);

        // Posisi 10 node
        positions_2002.put("Air Tawar", new Point(300, 50));
        positions_2002.put("Ulak Karang", new Point(150, 120));
        positions_2002.put("Lubuk Buaya", new Point(450, 120));
        positions_2002.put("Purus", new Point(80, 220));
        positions_2002.put("Alai", new Point(220, 220));
        positions_2002.put("Tabing", new Point(380, 220));
        positions_2002.put("Koto Tangah", new Point(520, 220));
        positions_2002.put("Padang Barat", new Point(150, 320));
        positions_2002.put("Siteba", new Point(300, 320));
        positions_2002.put("By Pass", new Point(450, 320));

        setBackground(Color.WHITE);
    }
	public void setVisitedNodes_2002(
            Collection<String> visited_2002) {

        visitedNodes_2002.clear();
        visitedNodes_2002.addAll(visited_2002);

        repaint();
    }

    public void resetGraph_2002() {

        visitedNodes_2002.clear();

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2_2002 = (Graphics2D) g;

        // gambar edge
        for (String node_2002 :
                graph_2002.getGraph_2002().keySet()) {

            Point p1_2002 =
                    positions_2002.get(node_2002);

            for (String neighbor_2002 :
                    graph_2002.getGraph_2002()
                            .get(node_2002)) {

                Point p2_2002 =
                        positions_2002.get(neighbor_2002);

                g2_2002.drawLine(
                        p1_2002.x,
                        p1_2002.y,
                        p2_2002.x,
                        p2_2002.y);
            }
        }

        // gambar node
        for (String node_2002 :
                positions_2002.keySet()) {

            Point p_2002 =
                    positions_2002.get(node_2002);

            if (visitedNodes_2002.contains(node_2002)) {

                g2_2002.setColor(Color.GREEN);

            } else {

                g2_2002.setColor(Color.LIGHT_GRAY);
            }

            g2_2002.fillOval(
                    p_2002.x - 40,
                    p_2002.y - 40,
                    75,
                    75);

            g2_2002.setColor(Color.BLACK);

            g2_2002.drawOval(
                    p_2002.x - 35,
                    p_2002.y - 35,
                    70,
                    70);

            java.awt.FontMetrics fm_2002 =
                    g2_2002.getFontMetrics();

            int width_2002 =
                    fm_2002.stringWidth(node_2002);

            g2_2002.drawString(
                    node_2002,
                    p_2002.x - width_2002 / 2,
                    p_2002.y + 5);
        }
    }
}
