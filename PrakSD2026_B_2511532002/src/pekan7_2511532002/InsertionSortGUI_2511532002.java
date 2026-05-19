	package pekan7_2511532002;

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
		
		public class InsertionSortGUI_2511532002 extends JFrame {
			private static final long serialVersionUID=1L;
			private int[]array_2002;
			private JLabel[] labelArray_2002;
			private JButton stepButton_2002, resetButton_2002, setButton_2002;
			private JTextField inputField_2002;
			private JPanel panelArray_2002;
			private JTextArea stepArea_2002;
			
			private int i= 1, j;
			private boolean sorting = false;
			private int stepCount=1;
		/**
		 * Create the frame.
		 */
		public InsertionSortGUI_2511532002() {
			setTitle("Insertion Sort Langkah per Langkah");
			setSize(750, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setLayout(new BorderLayout());
			
			// Panel Input
			JPanel inputPanel = new JPanel(new FlowLayout());
			inputField_2002 = new JTextField(30);
			setButton_2002 = new JButton("Set Array");

			inputPanel.add(new JLabel("Masukan angka (pisahkan dengan koma): "));
			inputPanel.add(inputField_2002);
			inputPanel.add(setButton_2002);

			// Panel array visual
			panelArray_2002 = new JPanel();
			panelArray_2002.setLayout(new FlowLayout());

			// Panel Kontrol
			JPanel controlPanel = new JPanel();
			stepButton_2002 = new JButton("Langkah Selanjutnya");
			resetButton_2002 = new JButton("Reset");
			stepButton_2002.setEnabled(false);

			controlPanel.add(stepButton_2002);
			controlPanel.add(resetButton_2002);

			// Area teks untuk log langkah-langkah
			stepArea_2002 = new JTextArea(8, 60);
			stepArea_2002.setEditable(false);
			stepArea_2002.setFont(new Font("Monospaced", Font.PLAIN, 14));

			JScrollPane scrollPane = new JScrollPane(stepArea_2002);
			
			//Tambahlan Panel ke frame
			add(inputPanel, BorderLayout.NORTH);
			add(panelArray_2002, BorderLayout.CENTER);
			add(controlPanel, BorderLayout.SOUTH);
			add(scrollPane, BorderLayout.EAST);
			
			//Event set array
			setButton_2002.addActionListener(e-> setArrayFromInput());
			
			//Event langkah selanjutnya
			stepButton_2002.addActionListener(e-> performStep());
			
			//Event reset
			resetButton_2002.addActionListener(e-> reset ());
		}
		
		private void setArrayFromInput() {
			String text = inputField_2002.getText().trim();
			if (text.isEmpty()) return;
			String [] parts=text.split(",");
			array_2002=new int[parts.length];
			try {
				for (int k=0; k< parts.length; k++) {
					array_2002[k] =Integer.parseInt(parts[k].trim());}
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Masukan hanya angka yang dipisahkan"+"dengan  koma!", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			i=1;
			stepCount=1;
			sorting=true;
			stepButton_2002.setEnabled(true);
			stepArea_2002.setText("");
			panelArray_2002.removeAll();
			labelArray_2002=new JLabel[array_2002.length];
			for (int k=0; k < array_2002.length; k++) {
				labelArray_2002[k] = new JLabel(String.valueOf(array_2002[k]));
				labelArray_2002[k].setFont(new Font ("Arial", Font.BOLD, 24));
				labelArray_2002[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				labelArray_2002[k].setPreferredSize(new Dimension(50, 50));
				labelArray_2002[k].setHorizontalAlignment(SwingConstants.CENTER);
				panelArray_2002.add(labelArray_2002[k]);
			}
			panelArray_2002.revalidate();
			panelArray_2002.repaint();
		}
		private void performStep() {
			if (i<array_2002.length&& sorting) {
				int key=array_2002[i];
				j=i-1;
				
				StringBuilder stepLog = new StringBuilder();
				stepLog.append("Langkah").append(stepCount).append(": Memasukan ").append(key).append("\n");
				
				 while (j >= 0 && array_2002[j] > key) {
			            array_2002[j + 1] = array_2002[j];
			            j--;
			        }

			        array_2002[j + 1] = key;

			        updateLabels();
			        stepLog.append("Hasil: ").append(arrayToString(array_2002)).append("\n\n");
			        stepArea_2002.append(stepLog.toString());

			        i++;
			        stepCount++;

			        if (i == array_2002.length) {
			            sorting = false;
			            stepButton_2002.setEnabled(false);
			            JOptionPane.showMessageDialog(this, "Sorting selesai!");
			        }
			}
		}
		private void updateLabels() {
			for (int k=0; k<array_2002.length; k++) {
				labelArray_2002[k].setText(String.valueOf(array_2002[k]));
			}
		}
		private void reset() {
		    inputField_2002.setText("");
		    panelArray_2002.removeAll();
		    panelArray_2002.revalidate();
		    panelArray_2002.repaint();
		    stepArea_2002.setText("");
		    stepButton_2002.setEnabled(false);
		    sorting = false;
		    i = 1;
		    stepCount = 1;
		}

		private String arrayToString(int[] arr) {
		    StringBuilder sb = new StringBuilder();

		    for (int k = 0; k < arr.length; k++) {
		        sb.append(arr[k]);

		        if (k < arr.length - 1)
		            sb.append(", ");
		    }

		    return sb.toString();
		}

		public static void main(String[] args) {
		    SwingUtilities.invokeLater(() -> {
		        InsertionSortGUI_2511532002 gui =
		                new InsertionSortGUI_2511532002();
		        gui.setVisible(true);
		    });
		}
	}
		