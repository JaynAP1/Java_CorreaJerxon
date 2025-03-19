
package mvc;

import javax.swing.SwingUtilities;
import mvc.View.Home;

public class MVC {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Home ventana = new Home();
            ventana.setVisible(true);
            ventana.revalidate();
            ventana.repaint();
        });
    }
    
}
