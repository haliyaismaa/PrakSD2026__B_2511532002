package pekan8_2511532002;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.util.LinkedList;
import java.util.Queue;


public class MergeSortGUI_2511532002 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane_2002;
	private int[] array_2002;
	private JLabel[] labelArray_2002;
	JButton stepButton_2002;
	private JButton resetButton_2002;
	JButton setButton_2002;
	private JTextField inputField_2002;
	private JPanel panelArray_2002;
	private JTextArea stepArea_2002;	
	private int i_2002 = 1, j_2002;
	private boolean sorting_2002 = false;
	private int stepCount_2002 = 1;
	private Queue<int[]> mergeQueue_2002 = new LinkedList<>();
	private boolean isMerging_2002 = false;
	private boolean copying_2002 = false;
	private int left_2002;
	private int mid_2002;
	private int right_2002;
	private int k_2002;
	private int[] temp_2002;

	/**
	* Create the frame.
	* @return 
	*/
		
	public MergeSortGUI_2511532002() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane_2002 = new JPanel();
		contentPane_2002.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_2002);
		contentPane_2002.setLayout(null);
		setTitle("Merge sort langkah per langkah");
		setSize(750, 400);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
			
		// Panel input
		JPanel inputPanel = new JPanel(new FlowLayout());
		inputField_2002 = new JTextField(30);
		setButton_2002 = new JButton("Set Array");
		inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma): "));
		inputPanel.add(inputField_2002);
		inputPanel.add(setButton_2002);
			
		// Panel Array
		panelArray_2002 = new JPanel();
		panelArray_2002.setLayout(new FlowLayout());
			
		// Panel kontrol
		JPanel controlPanel = new JPanel();
		stepButton_2002 = new JButton("Langkah Selanjutnya");
		resetButton_2002 = new JButton("Reset");
		stepButton_2002.setEnabled(false);
		controlPanel.add(stepButton_2002);
		controlPanel.add(resetButton_2002);
			
		// Teks untuk log langkah-langkah
		stepArea_2002 = new JTextArea(8, 60);
		stepArea_2002.setEditable(false);
		stepArea_2002.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane(stepArea_2002);
			
		// Menambahkan Panel ke Frame
		add(inputPanel, BorderLayout.NORTH);
		add(panelArray_2002, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		add(scrollPane, BorderLayout.EAST);
			
		setButton_2002.addActionListener(e -> setArrayFromInput_2002());
			
		stepButton_2002.addActionListener(e -> performStep_2002());
			
		// Even Reset
		resetButton_2002.addActionListener(e -> reset_2002());
	}

	private void setArrayFromInput_2002() {
		String text_2002 = inputField_2002.getText().trim();
		if (text_2002.isEmpty()) return;
		   
		String[] parts_2002 = text_2002.split(",");
		array_2002 = new int[parts_2002.length];

		try {
		for (int i_2002 = 0; i_2002 < parts_2002.length; i_2002++) {
			array_2002[i_2002] = Integer.parseInt(parts_2002[i_2002].trim());
		}
		} catch (NumberFormatException e_2002) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
			}
		
		labelArray_2002 = new JLabel[array_2002.length];
		panelArray_2002.removeAll();
		
		for (int i_2002 = 0; i_2002 < array_2002.length; i_2002++) {
			labelArray_2002[i_2002] = new JLabel(String.valueOf(array_2002[i_2002]));
			labelArray_2002[i_2002].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_2002[i_2002].setOpaque(true);
			labelArray_2002[i_2002].setBackground(Color.WHITE);
			labelArray_2002[i_2002].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_2002[i_2002].setPreferredSize(new Dimension(50, 50));
			labelArray_2002[i_2002].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_2002.add(labelArray_2002[i_2002]);

			mergeQueue_2002.clear();
			generateMergeSteps_2002(0, array_2002.length - 1);
			stepButton_2002.setEnabled(true);
		    stepArea_2002.setText("");
		    stepCount_2002 = 1;
		    isMerging_2002 = false;
		    panelArray_2002.revalidate();
		    panelArray_2002.repaint();
		    }
		}

		private void generateMergeSteps_2002(int left_2002, int right_2002) {
		    if (left_2002 >= right_2002) {
		        return;
		    }

		    int mid_2002 = (left_2002 + right_2002) / 2;

		    generateMergeSteps_2002(left_2002, mid_2002);
		    generateMergeSteps_2002(mid_2002 + 1, right_2002);

		    mergeQueue_2002.offer(new int[] {
		            left_2002, mid_2002, right_2002
		    });
		}

		private void performStep_2002() {

		    resetHighlights_2002();

		    if (!isMerging_2002 && !mergeQueue_2002.isEmpty()) {

		        int[] range_2002 = mergeQueue_2002.poll();

		        left_2002 = range_2002[0];
		        mid_2002 = range_2002[1];
		        right_2002 = range_2002[2];

		        temp_2002 = new int[right_2002 - left_2002 + 1];

		        i_2002 = left_2002;
		        j_2002 = mid_2002 + 1;
		        k_2002 = 0;

		        copying_2002 = false;
		        isMerging_2002 = true;

		        stepArea_2002.append("Langkah " + stepCount_2002++
		                + ": Mulai merge dari " + left_2002 + " ke "
		                + right_2002 + "\n");
		        return;
		    }

		    if (isMerging_2002 && !copying_2002) {

		        if (i_2002 <= mid_2002 && j_2002 <= right_2002) {

		            labelArray_2002[i_2002].setBackground(Color.cyan);
		            labelArray_2002[j_2002].setBackground(Color.cyan);

		            if (array_2002[i_2002] <= array_2002[j_2002]) {
		                temp_2002[k_2002++] = array_2002[i_2002++];
		            } else {
		                temp_2002[k_2002++] = array_2002[j_2002++];
		            }

		            stepArea_2002.append("Langkah " + stepCount_2002++
		                    + ": Bandingkan dan salin elemen\n");
		            return;

		        } else if (i_2002 <= mid_2002) {

		            temp_2002[k_2002++] = array_2002[i_2002++];

		            stepArea_2002.append("Langkah " + stepCount_2002++
		                    + ": Salin sisa kiri\n");
		            return;

		        } else if (j_2002 <= right_2002) {

		            temp_2002[k_2002++] = array_2002[j_2002++];

		            stepArea_2002.append("Langkah " + stepCount_2002++
		                    + ": Salin sisa kanan\n");
		            return;

		        } else {

		            copying_2002 = true;
		            k_2002 = 0;
		            return;
		        }
		    }

		    if (copying_2002 && k_2002 < temp_2002.length) {

		        array_2002[left_2002 + k_2002] = temp_2002[k_2002];

		        labelArray_2002[left_2002 + k_2002]
		                .setText(String.valueOf(temp_2002[k_2002]));

		        labelArray_2002[left_2002 + k_2002]
		                .setBackground(Color.GREEN);

		        k_2002++;

		        stepArea_2002.append("Langkah " + stepCount_2002++
		                + ": Tempelkan ke array utama\n");
		        return;
		    }

		    if (copying_2002 && k_2002 == temp_2002.length) {
		        isMerging_2002 = false;
		        copying_2002 = false;
		    }

		    if (mergeQueue_2002.isEmpty() && !isMerging_2002) {
		        stepArea_2002.append("Selesai.\n");
		        stepButton_2002.setEnabled(false);
		        JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
		    }
		}

		private void resetHighlights_2002() {

		    if (labelArray_2002 == null) return;

		    for (JLabel label_2002 : labelArray_2002) {
		        label_2002.setBackground(Color.WHITE);
		    }
		}

		private void reset_2002() {

		    inputField_2002.setText("");

		    panelArray_2002.removeAll();
		    panelArray_2002.revalidate();
		    panelArray_2002.repaint();

		    stepArea_2002.setText("");

		    stepButton_2002.setEnabled(false);

		    mergeQueue_2002.clear();

		    isMerging_2002 = false;
		    stepCount_2002 = 1;
		}

		public static void main(String[] args) {

		    SwingUtilities.invokeLater(() -> {

		        MergeSortGUI_2511532002 gui =
		                new MergeSortGUI_2511532002();

		        gui.setVisible(true);
		    });
		}
	}