import javax.swing.*;

/**
 * Created by student on 11.12.2014.
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        Tablo tablo = new Tablo();
        frame.add(tablo.getMainPanel());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
