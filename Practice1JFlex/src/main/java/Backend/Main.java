package Backend;

import Frontend.GUI.MainView;
import javax.swing.JFrame;

/**
 *
 * @author jefemayoneso
 */
public class Main {

    public static void main(String[] args) {
        // START OF PROGRAM
        MainView app = new MainView();
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setLocationRelativeTo(null);
    }
}
