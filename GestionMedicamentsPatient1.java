import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionMedicamentsPatient1 extends JFrame {
    private JComboBox<String> serviceDropdown;
    private JTextField medicament1Field;
    private JTextField quantite1Field;
    private JTextField medicament2Field;
    private JTextField quantite2Field;
    private JTextField medicament3Field;
    private JTextField quantite3Field;

    public GestionMedicamentsPatient1() {
        setTitle("Gestion des Medicaments pour Patient1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        JPanel contentPanel = new JPanel(new GridBagLayout());
        contentPanel.setBackground(new Color(240, 248, 255));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel serviceLabel = new JLabel("Service:");
        serviceDropdown = new JComboBox<>(new String[]{"Service1", "Service2", "Service3"});
        serviceDropdown.setFont(new Font("Arial", Font.PLAIN, 14));
        serviceDropdown.setBackground(new Color(173, 216, 230));
        gbc.gridx = 0;
        gbc.gridy = 0;
        contentPanel.add(serviceLabel, gbc);
        gbc.gridx = 1;
        contentPanel.add(serviceDropdown, gbc);


        JButton resetButton = new JButton("Reinitialiser");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });

        JButton submitButton = new JButton("Soumettre");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitForm();
            }
        });


        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        contentPanel.add(resetButton, gbc);

        gbc.gridx = 3;
        contentPanel.add(submitButton, gbc);

        add(contentPanel);
        pack();
        setVisible(true);
    }

    private void resetForm() {
        medicament1Field.setText("");
        quantite1Field.setText("");
        medicament2Field.setText("");
        quantite2Field.setText("");
        medicament3Field.setText("");
        quantite3Field.setText("");
    }

    private void submitForm() {
        System.out.println("Médicament 1 : " + medicament1Field.getText() + ", Quantité 1 : " + quantite1Field.getText());
        System.out.println("Médicament 2 : " + medicament2Field.getText() + ", Quantité 2 : " + quantite2Field.getText());
        System.out.println("Médicament 3 : " + medicament3Field.getText() + ", Quantité 3 : " + quantite3Field.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }

            GestionMedicamentsPatient1 gestionMedicamentsPatient1 = new GestionMedicamentsPatient1();
        });
    }
}
