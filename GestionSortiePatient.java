import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionSortiePatient extends JFrame {
    private JComboBox<String> serviceDropdown;
    private JComboBox<String> patientDropdown;
    private JComboBox<String> medecinDropdown;
    private JTextField etatPatientField;

    public GestionSortiePatient() {
        setTitle("Gestion de Sortie de Patient");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        JPanel contentPanel = new JPanel(new GridBagLayout());
       
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // En haut - Liste déroulante de service
        JLabel serviceLabel = new JLabel("Service:");
        serviceDropdown = new JComboBox<>(new String[]{"Service1", "Service2", "Service3"});
        serviceDropdown.setFont(new Font("Arial", Font.PLAIN, 14));
        serviceDropdown.setBackground(new Color(173, 216, 230)); 
        gbc.gridx = 0;
        gbc.gridy = 0;
        contentPanel.add(serviceLabel, gbc);
        gbc.gridx = 1;
        contentPanel.add(serviceDropdown, gbc);

        JLabel patientLabel = new JLabel("Patient:");
        patientDropdown = new JComboBox<>(new String[]{"Patient1", "Patient2", "Patient3"});
        patientDropdown.setFont(new Font("Arial", Font.PLAIN, 14));
        patientDropdown.setBackground(new Color(173, 216, 230));
        JLabel medecinLabel = new JLabel("Medecin:");
        medecinDropdown = new JComboBox<>(new String[]{"Medecin1", "Medecin2", "Medecin3"});
        medecinDropdown.setFont(new Font("Arial", Font.PLAIN, 14));
        medecinDropdown.setBackground(new Color(173, 216, 230));
        JLabel etatPatientLabel = new JLabel("Description de l'etat du patient:");
        etatPatientField = new JTextField(20);
        etatPatientField.setFont(new Font("Arial", Font.PLAIN, 14));
        etatPatientField.setBackground(new Color(240, 255, 240)); 

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

        gbc.gridx = 0;
        gbc.gridy = 1;
        contentPanel.add(patientLabel, gbc);
        gbc.gridx = 1;
        contentPanel.add(patientDropdown, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        contentPanel.add(medecinLabel, gbc);
        gbc.gridx = 1;
        contentPanel.add(medecinDropdown, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        contentPanel.add(etatPatientLabel, gbc);
        gbc.gridx = 1;
        contentPanel.add(etatPatientField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        contentPanel.add(new JPanel(), gbc); 

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        contentPanel.add(resetButton, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        contentPanel.add(submitButton, gbc);

        setLayout(new BorderLayout());
        add(contentPanel, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    private void resetForm() {
        serviceDropdown.setSelectedIndex(0);
        patientDropdown.setSelectedIndex(0);
        medecinDropdown.setSelectedIndex(0);
        etatPatientField.setText("");
    }

    private void submitForm() {
        String service = (String) serviceDropdown.getSelectedItem();
        String patient = (String) patientDropdown.getSelectedItem();
        String medecin = (String) medecinDropdown.getSelectedItem();
        String etatPatient = etatPatientField.getText();

        System.out.println("Service: " + service);
        System.out.println("Patient: " + patient);
        System.out.println("Médecin: " + medecin);
        System.out.println("Description de l'état du patient: " + etatPatient);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }

            GestionSortiePatient gestionSortiePatient = new GestionSortiePatient();
        });
    }
}
