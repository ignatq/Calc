import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by student on 11.12.2014.
 */
public class Tablo {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton b1;
    private JButton b2;
    private JButton button9;
    private JPanel mainPanel;
    private JTextField inputField;

    public Tablo() {
        mainPanel.setFocusable(true);
        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            AbstractAction actioni = new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    inputField.setText(inputField.getText() + finalI);
                }
            };
            mainPanel.getActionMap().put("Key" + i, actioni);
            mainPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke((char) ('0' + i)), "Key" + i);
        }
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "1");
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
