import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;

import javax.swing.JTextField;

public class PaymentWindowTest {

    @Test
    public void testPrivateFieldAccess() throws NoSuchFieldException, IllegalAccessException {
        PaymentWindow paymentWindow = new PaymentWindow();
        Field textFieldField = PaymentWindow.class.getDeclaredField("textField");
        textFieldField.setAccessible(true); // Make the field accessible
        JTextField textField = (JTextField) textFieldField.get(paymentWindow);

        assertNotNull("Text field should not be null", textField);
        
    }
}
//tests to ensure all fields are filled before accepting payment
