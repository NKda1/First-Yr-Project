import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.*;


public class PaymentWindow extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField; // Card Holder Name
    private JTextField textField_1; // Card Number
    private JTextField textField_3; // Enter Amount
    private JPasswordField passwordField; // CVV
    private JRadioButton rdbtnNewRadioButton; // Visa
    private JRadioButton rdbtnNewRadioButton_1; // MasterCard
    private ButtonGroup buttonGroup; // For radio buttons

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PaymentWindow frame = new PaymentWindow();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public PaymentWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 875, 583);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        initializeComponents();
        addButtonListener();
    }
    
   


    private void initializeComponents() {
        textField = new JTextField();
        textField.setBounds(220, 33, 130, 26);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(220, 123, 249, 26);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(220, 230, 130, 26);
        contentPane.add(textField_3);

        JButton btnNewButton = new JButton("Pay");
        btnNewButton.setBackground(Color.GREEN);
        btnNewButton.setBounds(432, 331, 117, 29);
        contentPane.add(btnNewButton);

        JLabel lblNewLabel = new JLabel("Card Holder Name");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblNewLabel.setBounds(46, 38, 130, 16);
        contentPane.add(lblNewLabel);

        JLabel lblCardNumber = new JLabel("Card Number");
        lblCardNumber.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblCardNumber.setBounds(46, 128, 100, 16);
        contentPane.add(lblCardNumber);

        JLabel lblCvv = new JLabel("CVV");
        lblCvv.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblCvv.setBounds(46, 185, 100, 16);
        contentPane.add(lblCvv);

        JLabel lblEnterAmount = new JLabel("Enter Amount");
        lblEnterAmount.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblEnterAmount.setBounds(46, 235, 100, 16);
        contentPane.add(lblEnterAmount);

        rdbtnNewRadioButton = new JRadioButton("Visa");
        rdbtnNewRadioButton.setBackground(Color.WHITE);
        rdbtnNewRadioButton.setBounds(209, 75, 141, 23);
        contentPane.add(rdbtnNewRadioButton);

        rdbtnNewRadioButton_1 = new JRadioButton("MasterCard");
        rdbtnNewRadioButton_1.setBackground(Color.WHITE);
        rdbtnNewRadioButton_1.setBounds(424, 75, 141, 23);
        contentPane.add(rdbtnNewRadioButton_1);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(rdbtnNewRadioButton);
        buttonGroup.add(rdbtnNewRadioButton_1);

        passwordField = new JPasswordField();
        passwordField.setBounds(220, 180, 74, 26);
        contentPane.add(passwordField);
        
        JButton btnNewButton_1 = new JButton("Back To Login");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		LoginWindow loginWindow= new LoginWindow ();
        		loginWindow.setVisible(true);
        			
        	}
        });
        btnNewButton_1.setBackground(new Color(255, 51, 102));
        btnNewButton_1.setBounds(160, 331, 117, 29);
        contentPane.add(btnNewButton_1);
        
        JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("");
        lblNewJgoodiesTitle.setIcon(new ImageIcon("Payment Page 2.jpg"));
        lblNewJgoodiesTitle.setBounds(209, 0, 650, 544);
        contentPane.add(lblNewJgoodiesTitle);
        
        JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Pick Card Type");
        lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewJgoodiesLabel.setBounds(46, 79, 92, 14);
        contentPane.add(lblNewJgoodiesLabel);
    }

    private void addButtonListener() {
        JButton btnPay = (JButton) contentPane.getComponent(3); // Assuming "Pay" is the fourth component added
        btnPay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_3.getText().isEmpty() || new String(passwordField.getPassword()).isEmpty() || (!rdbtnNewRadioButton.isSelected() && !rdbtnNewRadioButton_1.isSelected())) {
                    JOptionPane.showMessageDialog(null, "Please fill in all fields and select a card type.");
                    return;
                }
                
                if (textField_1.getText().length() != 16) {
                    JOptionPane.showMessageDialog(null, "Card Number must be 16 digits.");
                    return;
                }

                if (new String(passwordField.getPassword()).length() != 3) {
                    JOptionPane.showMessageDialog(null, "CVV must be 3 digits.");
                    return;
                }
               
                JOptionPane.showMessageDialog(null, "Payment Processed Successfully!");
            }
        });
    }
}

