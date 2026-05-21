package tugasPekan7_2511532002;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class MahasiswaGUI_2511532002 extends JFrame {

    class Mahasiswa_2002 {
        private String nama_2002;
        private String nim_2002;
        private String prodi_2002;

        public Mahasiswa_2002(String nama_2002, String nim_2002, String prodi_2002) {
            this.nama_2002 = nama_2002;
            this.nim_2002 = nim_2002;
            this.prodi_2002 = prodi_2002;
        }

        public String getNama_2002() {
            return nama_2002;
        }

        public String getNim_2002() {
            return nim_2002;
        }

        public String getProdi_2002() {
            return prodi_2002;
        }

        @Override
        public String toString() {
            return nama_2002;
        }
    }

    ArrayList<Mahasiswa_2002> data_2002 = new ArrayList<>();

    JTextField txtNama_2002;
    JTextField txtNim_2002;
    JTextField txtProdi_2002;

    JComboBox<String> cmbSort_2002;

    JTable tabel_2002;
    DefaultTableModel model_2002;

    JTextArea areaProses_2002;

    JButton btnTambah_2002;
    JButton btnHapus_2002;
    JButton btnSort_2002;

    public MahasiswaGUI_2511532002() {

        setTitle("Sorting Mahasiswa");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panelInput_2002 = new JPanel(new GridLayout(5, 2));

        panelInput_2002.add(new JLabel("Nama"));
        txtNama_2002 = new JTextField();
        panelInput_2002.add(txtNama_2002);

        panelInput_2002.add(new JLabel("NIM"));
        txtNim_2002 = new JTextField();
        panelInput_2002.add(txtNim_2002);

        panelInput_2002.add(new JLabel("Program Studi"));
        txtProdi_2002 = new JTextField();
        panelInput_2002.add(txtProdi_2002);

        panelInput_2002.add(new JLabel("Pilih Sorting"));

        cmbSort_2002 = new JComboBox<>(new String[]{
                "Insertion Sort",
                "Selection Sort",
                "Bubble Sort"
        });
        panelInput_2002.add(cmbSort_2002);

        btnTambah_2002 = new JButton("Tambah");
        btnHapus_2002 = new JButton("Hapus");

        panelInput_2002.add(btnTambah_2002);
        panelInput_2002.add(btnHapus_2002);

        add(panelInput_2002, BorderLayout.NORTH);

        // ===== TABLE =====
        model_2002 = new DefaultTableModel(new String[]{"Nama", "NIM", "Prodi"}, 0);
        tabel_2002 = new JTable(model_2002);

        add(new JScrollPane(tabel_2002), BorderLayout.CENTER);

        // ===== BOTTOM PANEL =====
        JPanel panelBawah_2002 = new JPanel(new BorderLayout());

        btnSort_2002 = new JButton("Mulai Sorting");
        panelBawah_2002.add(btnSort_2002, BorderLayout.NORTH);

        areaProses_2002 = new JTextArea(10, 50);
        areaProses_2002.setEditable(false);

        panelBawah_2002.add(new JScrollPane(areaProses_2002), BorderLayout.CENTER);

        add(panelBawah_2002, BorderLayout.SOUTH);

        aksiButton_2002();
    }

    void aksiButton_2002() {

        // ===== TAMBAH =====
        btnTambah_2002.addActionListener(e -> {

            Mahasiswa_2002 mhs = new Mahasiswa_2002(
                    txtNama_2002.getText(),
                    txtNim_2002.getText(),
                    txtProdi_2002.getText()
            );

            data_2002.add(mhs);

            model_2002.addRow(new Object[]{
                    mhs.getNama_2002(),
                    mhs.getNim_2002(),
                    mhs.getProdi_2002()
            });

            txtNama_2002.setText("");
            txtNim_2002.setText("");
            txtProdi_2002.setText("");
        });

        // ===== HAPUS (FIXED) =====
        btnHapus_2002.addActionListener(e -> {

            int baris = tabel_2002.getSelectedRow();

            if (baris == -1) {
                JOptionPane.showMessageDialog(this, "Pilih data dulu!");
                return;
            }

            String nim = model_2002.getValueAt(baris, 1).toString();

            data_2002.removeIf(m -> m.getNim_2002().equals(nim));
            model_2002.removeRow(baris);
        });

        // ===== SORT =====
        btnSort_2002.addActionListener(e -> {

            ArrayList<Mahasiswa_2002> temp = new ArrayList<>(data_2002);
            String pilih = cmbSort_2002.getSelectedItem().toString();

            if (pilih.equals("Insertion Sort")) {
                insertionSort_2002(temp);
            } else if (pilih.equals("Selection Sort")) {
                selectionSort_2002(temp);
            } else {
                bubbleSort_2002(temp);
            }
        });
    }

    // ===== INSERTION SORT =====
    void insertionSort_2002(ArrayList<Mahasiswa_2002> list) {

        areaProses_2002.append("\n=== INSERTION SORT ===\n");

        for (int i = 1; i < list.size(); i++) {

            Mahasiswa_2002 key = list.get(i);
            int j = i - 1;

            while (j >= 0 &&
                    list.get(j).getNama_2002()
                            .compareToIgnoreCase(key.getNama_2002()) > 0) {

                list.set(j + 1, list.get(j));
                j--;
            }

            list.set(j + 1, key);

            areaProses_2002.append("Langkah " + i + " : " + ambilNama_2002(list) + "\n");
        }
    }

    // ===== SELECTION SORT =====
    void selectionSort_2002(ArrayList<Mahasiswa_2002> list) {

        areaProses_2002.append("\n=== SELECTION SORT ===\n");

        for (int i = 0; i < list.size() - 1; i++) {

            int min = i;

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(j).getNama_2002()
                        .compareToIgnoreCase(list.get(min).getNama_2002()) < 0) {
                    min = j;
                }
            }

            Mahasiswa_2002 temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);

            areaProses_2002.append("Pass " + (i + 1) + " : " + ambilNama_2002(list) + "\n");
        }
    }

    // ===== BUBBLE SORT =====
    void bubbleSort_2002(ArrayList<Mahasiswa_2002> list) {

        areaProses_2002.append("\n=== BUBBLE SORT ===\n");

        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = 0; j < list.size() - i - 1; j++) {

                if (list.get(j).getNama_2002()
                        .compareToIgnoreCase(list.get(j + 1).getNama_2002()) > 0) {

                    Mahasiswa_2002 temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }

            areaProses_2002.append("Pass " + (i + 1) + " : " + ambilNama_2002(list) + "\n");
        }
    }

    String ambilNama_2002(ArrayList<Mahasiswa_2002> list) {

        String hasil = "[ ";
        for (Mahasiswa_2002 m : list) {
            hasil += m.getNama_2002() + " ";
        }
        return hasil + "]";
    }

    public static void main(String[] args) {
        new MahasiswaGUI_2511532002().setVisible(true);
    }
}