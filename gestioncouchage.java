
import javax.swing.*;
import java.awt.*;

public class gestioncouchage  {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestion de couchage des patients");
        frame.setSize(600, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel serviceLabel = new JLabel("Service");
serviceLabel.setBounds(10, 30, 80, 25);
panel.add(serviceLabel);

String[] serviceOptions = { "Option 1", "Option 2", "Option 3" }; 
JComboBox serviceList = new JComboBox(serviceOptions);
serviceList.setBounds(100, 30, 160, 25);
panel.add(serviceList);


JButton resetButton = new JButton("Reset");
resetButton.setBounds(10, 60, 80, 25);
panel.add(resetButton);

JButton submitButton = new JButton("Submit");
submitButton.setBounds(100, 60, 80, 25);
panel.add(submitButton);



    }
}
