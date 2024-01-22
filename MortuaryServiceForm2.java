import javax.swing.*;
import java.awt.*;

public class MortuaryServiceForm2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestion de E/S du service mortuaire 2");
        frame.setSize(600, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel deceasedLabel = new JLabel("Défunt(e)");
deceasedLabel.setBounds(10, 150, 80, 25);
panel.add(deceasedLabel);

String[] deceasedOptions = { "Option 1", "Option 2", "Option 3" }; 
JComboBox deceasedList = new JComboBox(deceasedOptions);
deceasedList.setBounds(100, 150, 160, 25);
panel.add(deceasedList);




JLabel exitDateLabel = new JLabel("Date de sortie de la morgue");
exitDateLabel.setBounds(10, 180, 200, 25);
panel.add(exitDateLabel);

JTextField exitDateText = new JTextField(20);
exitDateText.setBounds(210, 180, 100, 25);
panel.add(exitDateText);

JLabel exitTimeLabel = new JLabel("Heure de sortie de la morgue");
exitTimeLabel.setBounds(10, 210, 200, 25);
panel.add(exitTimeLabel);

JTextField exitTimeText = new JTextField(20);
exitTimeText.setBounds(210, 210, 100, 25);
panel.add(exitTimeText);

JButton resetButton = new JButton("Reset");
resetButton.setBounds(10, 240, 80, 25);
panel.add(resetButton);

JButton submitButton = new JButton("Submit");
submitButton.setBounds(100, 240, 80, 25);
panel.add(submitButton);






    }
}
