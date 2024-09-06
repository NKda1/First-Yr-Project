import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.*;
import java.lang.reflect.Field;

public class RecordsWindowTest {

    @Test
    public void testRecordsWindowInitialization() {
        
        SwingUtilities.invokeLater(() -> {
            RecordsWindow window = new RecordsWindow();

            
            try {
                Field tableField = RecordsWindow.class.getDeclaredField("table"); // Assuming the table is a member variable named 'table'.
                tableField.setAccessible(true);
                JTable table = (JTable) tableField.get(window);

                // Test if the table model is correctly set up.
                assertNotNull("Table model should not be null", table.getModel());
                
                // check for the expected number of columns
                
                assertTrue("Table should have more than 0 rows", table.getRowCount() > 0);
                

                
                
            } catch (NoSuchFieldException | IllegalAccessException e) {
                fail("Reflection to access the table failed: " + e.getMessage());
            }
        });
    }
    
    
}

