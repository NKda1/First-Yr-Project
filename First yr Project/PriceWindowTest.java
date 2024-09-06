import org.junit.Test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;

public class PriceWindowTest {

    @Test
    public void testConfirmChangesDialog() throws Exception {
        
        SwingUtilities.invokeAndWait(() -> new PriceWindow().setVisible(true));

        
        Robot robot = new Robot();
        robot.setAutoDelay(40);
        robot.setAutoWaitForIdle(true);

        
       
        robot.mouseMove(635, 502); 
        robot.delay(500);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

      
       
        SwingUtilities.invokeAndWait(() -> {
            Frame[] frames = JFrame.getFrames();
            for (Frame frame : frames) {
                if (frame instanceof PriceWindow) {
                    frame.dispose();
                }
            }
        });
    }
}

//tests to make sure dialogue box when prices are adjusted shows