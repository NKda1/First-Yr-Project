import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class MasterWindow extends JFrame {
    private JPanel cards; //a panel that uses CardLayout
    final static String FIRST_PANEL = "Card with JButtons";
    final static String SECOND_PANEL = "Card with JTextField";

    public MasterWindow() {
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(firstPanel(), FIRST_PANEL);
        cards.add(secondPanel(), SECOND_PANEL);
        
        getContentPane().add(cards, BorderLayout.CENTER); // Add cards to JFrame
        
        // Display the first card
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, FIRST_PANEL);
        
        // Add a button to switch between cards
        JButton btn = new JButton("Adjust Prices");
        btn.setBackground(new Color(255, 128, 64));
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
                PriceWindow priceWindow = new PriceWindow ();
                priceWindow.setVisible(true);
            }
        });
        
        getContentPane().add(btn, BorderLayout.PAGE_END); // Add button to JFrame
        setSize(750, 606);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JPanel firstPanel() {
        JPanel card = new JPanel();
        card.setBackground(Color.WHITE);
        JButton btnBackToLogin = new JButton("Log out");
        btnBackToLogin.setBounds(52, 11, 113, 23);
        btnBackToLogin.setBackground(new Color(255, 128, 128));
        btnBackToLogin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		LoginWindow loginWindow= new LoginWindow();
        		loginWindow.setVisible(true);
        		MasterWindow.this.setVisible(false);
        		
        	}
        });
        card.setLayout(null);
        card.add(btnBackToLogin);
        JButton btnCheckRecords = new JButton("Check Records");
        btnCheckRecords.setForeground(SystemColor.text);
        btnCheckRecords.setBounds(539, 11, 153, 23);
        btnCheckRecords.setBackground(new Color(0, 128, 192));
        btnCheckRecords.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		RecordsWindow recordsWindow = new RecordsWindow();
        		recordsWindow.setVisible(true);
        		MasterWindow.this.setVisible(false);
        	}
        });
        card.add(btnCheckRecords);
        
        JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("");
        lblNewJgoodiesTitle.setIcon(new ImageIcon("mainpage3.jpg"));
        lblNewJgoodiesTitle.setBounds(52, 11, 640, 544);
        card.add(lblNewJgoodiesTitle);
        return card;
    }

    private JPanel secondPanel() {
        JPanel card = new JPanel();
        card.add(new JTextField("TextField", 20));
        return card;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new MasterWindow();
        });
    }
}
