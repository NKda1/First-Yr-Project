import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;

public class LoginWindow extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnLogin;
    private JButton btnNotStaff;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                LoginWindow frame = new LoginWindow();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public LoginWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1067, 619);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.inactiveCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        

        // ... (other components initialization)

        textField = new JTextField();
        textField.setBounds(254, 124, 114, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(254, 193, 114, 20);
        contentPane.add(passwordField);

        btnLogin = new JButton("Login");
        btnLogin.addActionListener(this::performLogin);
        btnLogin.setBackground(new Color(128, 255, 128));
        btnLogin.setBounds(327, 294, 89, 23);
        contentPane.add(btnLogin);

        // ... (rest of the GUI construction)

        btnNotStaff = new JButton("Not Staff?");
        btnNotStaff.addActionListener(e -> {
            dispose(); //closes current window
            PaymentWindow paymentWindow = new PaymentWindow(); //opens Pay Page
            paymentWindow.setVisible(true);      
        });
        btnNotStaff.setBackground(new Color(255, 255, 128));
        btnNotStaff.setBounds(165, 294, 100, 23);
        contentPane.add(btnNotStaff);
        
        JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Enter Username");
        lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewJgoodiesLabel.setBounds(47, 127, 92, 14);
        contentPane.add(lblNewJgoodiesLabel);
        
        JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("Enter Password");
        lblNewJgoodiesLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewJgoodiesLabel_1.setBounds(47, 196, 92, 14);
        contentPane.add(lblNewJgoodiesLabel_1);
        
        JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Brunel Health Medical Center BHMC");
        lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewJgoodiesTitle.setBounds(213, 33, 336, 32);
        contentPane.add(lblNewJgoodiesTitle);
        
        JLabel lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("");
        lblNewJgoodiesTitle_1.setIcon(new ImageIcon("H:\\eclipseWorkspace\\Finance Project\\Brunel-University-London.png"));
        lblNewJgoodiesTitle_1.setBounds(308, 0, 743, 581);
        contentPane.add(lblNewJgoodiesTitle_1);
    }

    private void performLogin(ActionEvent e) {
        String username = textField.getText();
        String password = new String(passwordField.getPassword());
        if (validateCredentials(username, password)) {
            JOptionPane.showMessageDialog(null, "Welcome Back");
            MasterWindow masterWindow = new MasterWindow();
            masterWindow.setVisible(true);
            this.setVisible(false); // Correctly hide this window
        } else {
            JOptionPane.showMessageDialog(null, "Wrong Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean validateCredentials(String username, String password) {
        return username.equals("name") && password.equals("password");
    }

    // Getters for testing
    public JTextField getTextField() {
        return textField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JButton getLoginButton() {
        return btnLogin;
    }
}
