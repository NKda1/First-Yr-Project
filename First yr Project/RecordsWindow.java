import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class RecordsWindow extends JFrame {

    public RecordsWindow() {
        // Set the frame title
        setTitle("Records Window");

        // Set the layout
        getContentPane().setLayout(new BorderLayout());

        // Initialize the JTable
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        table.setModel(model);

        // Add search field
        JTextField searchField = new JTextField(30);
        JPanel topPanel = new JPanel();
        topPanel.setBackground(SystemColor.inactiveCaption);
        topPanel.add(new JLabel("Search:"));
        topPanel.add(searchField);

        // Add "Back" button
        JButton backButton = new JButton("Back");
        backButton.setBackground(new Color(255, 0, 0));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current window
                MasterWindow masterWindow = new MasterWindow(); // Create an instance of MasterWindow
                masterWindow.setVisible(true); // Make MasterWindow visible
            }
        });
        topPanel.add(backButton);

        getContentPane().add(topPanel, BorderLayout.NORTH);

        // Load CSV file data
        try {
            Vector<Vector<Object>> data = new Vector<>();
            Vector<String> columnNames = new Vector<>();
            BufferedReader br = new BufferedReader(new FileReader("updated_treatments.csv"));
            String line;
            int lineCount = 0;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); // Assuming comma is the delimiter
                Vector<Object> vector = new Vector<>();
                for (String value : values) {
                    if (lineCount == 0) { // This is the header row
                        columnNames.add(value);
                    } else { // Data rows
                        vector.add(value);
                    }
                }
                if (lineCount > 0) { // Add to data vector if this is not the header row
                    data.add(vector);
                }
                lineCount++;
            }
            br.close();

            // Set model to the table
            model.setDataVector(data, columnNames);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading CSV file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        // Implement search functionality
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);
        searchField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String text = searchField.getText();
                if (text.trim().length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    // (?i) for case insensitive matching
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
        });

        // Add MouseListener to JTable for click detection
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) { // Single-click detection
                    int row = table.convertRowIndexToModel(table.getSelectedRow());
                    // Ensure a row is actually selected
                    if (row >= 0) {
                        displayRowDetails(row, model);
                    }
                }
            }
        });

        // Add the table to a scrolling pane
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        setSize(800, 400); // Set the window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void displayRowDetails(int rowIndex, DefaultTableModel model) {
        StringBuilder details = new StringBuilder();
        for (int columnIndex = 0; columnIndex < model.getColumnCount(); columnIndex++) {
            details.append(model.getColumnName(columnIndex))
                   .append(": ")
                   .append(model.getValueAt(rowIndex, columnIndex))
                   .append("\n");
        }
        JOptionPane.showMessageDialog(this, details.toString(), "Details for Entry " + (rowIndex + 1), JOptionPane.INFORMATION_MESSAGE);
    }

    
    
    public static void main(String[] args) {
        // Ensuring the GUI is created in the Event Dispatch Thread
        SwingUtilities.invokeLater(RecordsWindow::new);
    }
}
