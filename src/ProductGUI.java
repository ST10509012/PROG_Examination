import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ProductGUI extends JFrame {
    private JComboBox<String> cmbLocation;
    private JTextField txtName, txtPrice, txtCommission;
    private JTextArea txtReport;
    private ProductGUI;

    public ProductGUI() {
        setTitle("Product App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenuItem itemExit = new JMenuItem("Exit");
        menuFile.add(itemExit);

        JMenu menuTools = new JMenu("Tools");
        JMenuItem itemProcess = new JMenuItem("Process");
        JMenuItem itemClear = new JMenuItem("Clear");
        menuTools.add(itemProcess);
        menuTools.add(itemClear);
        menuBar.add(menuFile);
        menuBar.add(menuTools);
        setJMenuBar(menuBar);

        // Components Setup
        JLabel lblCustomer = new JLabel("Customer Name:");
        lblCustomer.setBounds(20, 30, 120, 25);
        add(lblCustomer);

        txtCustomerName = new JTextField();
        txtCustomerName.setBounds(150, 30, 200, 25);
        add(txtCustomerName);

        JLabel lblProduct = new JLabel("Select Product:");
        lblProduct.setBounds(20, 80, 120, 25);
        add(lblProduct);

        String[] products = {"Cosy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};

    }
}

