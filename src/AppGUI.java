import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class AppGUI extends JFrame {

    public AppGUI(String title) {
        super(title);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                setSize(500,450);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
            }
        });
    }
}
