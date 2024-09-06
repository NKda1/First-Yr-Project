import org.junit.jupiter.api.Test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.reflect.*;
import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class MasterWindowTest {

    @Test
    public void testButtonAction() throws Exception {
        MasterWindow window = new MasterWindow(); 

        
        JButton btn = findButton(window.getContentPane(), "Adjust Prices");
        assertNotNull(btn, "Button not found.");

        // simulate the click and verify the outcome.
        
       
        SwingUtilities.invokeLater(window::dispose);
    }

    private JButton findButton(Container container, String buttonText) {
        for (Component comp : container.getComponents()) {
            if (comp instanceof JButton) {
                JButton button = (JButton) comp;
                if (button.getText().equals(buttonText)) {
                    return button;
                }
            } else if (comp instanceof Container) {
                JButton found = findButton((Container) comp, buttonText);
                if (found != null) {
                    return found;
                }
            }
        }
        return null;
    }
}
