import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GestionMedicamentsPatient2 extends JFrame {
    private JComboBox<String> serviceDropdown;
    private JTextArea patientInfoArea;
    private JButton goToGestionMedicamentsPatient1Button;

    public GestionMedicamentsPatient2() {
        setTitle("Gestion des Medicaments - Patient2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setLocationRelativeTo(null);


        JPanel contentPanel = new JPanel(new GridBagLayout());
        contentPanel.setBackground(new Color(240, 248, 255));

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

        // Nombre de patients
        JLabel numberOfPatientsLabel = new JLabel("Nombre de patients: 4");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        contentPanel.add(numberOfPatientsLabel, gbc);

        // En bas - Affichage des médicaments pour chaque patient
        patientInfoArea = new JTextArea();
        patientInfoArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(patientInfoArea);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        contentPanel.add(scrollPane, gbc);

        // Bouton pour aller à la gestion des médicaments pour Patient1
        goToGestionMedicamentsPatient1Button = new JButton("Aller a Gestion de Medicaments Patient1");
        goToGestionMedicamentsPatient1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openGestionMedicamentsPatient1();
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        contentPanel.add(goToGestionMedicamentsPatient1Button, gbc);

        add(contentPanel);
        pack();
        setVisible(true);

        // Afficher les informations pour chaque patient
        displayPatientInfo();
    }

    private void displayPatientInfo() {
        StringBuilder infoBuilder = new StringBuilder();

        // Patient 1
        int randomBedNumber1 = new Random().nextInt(50) + 1; // Numéro de lit aléatoire entre 1 et 50
        infoBuilder.append("Patient 1 - Lit: ").append(randomBedNumber1).append("\n");
        infoBuilder.append("Medicament1: medicamentY quantite: 3\n");
        infoBuilder.append("Medicament2: medicamentT quantite: 2\n");
        infoBuilder.append("Medicament3: medicamentC quantite: 1\n");
        infoBuilder.append("--------------------------------------------------\n");

        // Patient 2
        int randomBedNumber2 = new Random().nextInt(50) + 1; // Numéro de lit aléatoire entre 1 et 50
        infoBuilder.append("Patient 2 - Lit: ").append(randomBedNumber2).append("\n");
        infoBuilder.append("Medicament1: medicamentA quantite: 4\n");
        infoBuilder.append("Medicament2: medicamentB quantite: 2\n");
        infoBuilder.append("Medicament3: medicamentC quantite: 4\n");
        infoBuilder.append("--------------------------------------------------\n");

        // Patient 3
        int randomBedNumber3 = new Random().nextInt(50) + 1; // Numéro de lit aléatoire entre 1 et 50
        infoBuilder.append("Patient 3 - Lit: ").append(randomBedNumber3).append("\n");
        infoBuilder.append("Medicament1: medicamentA quantite: 3\n");
        infoBuilder.append("Medicament2: medicamentM quantite: 2\n");
        infoBuilder.append("Medicament3: medicamentN quantite: 3\n");
        infoBuilder.append("--------------------------------------------------\n");

        int randomBedNumber4 = new Random().nextInt(50) + 1; // Numéro de lit aléatoire entre 1 et 50
        infoBuilder.append("Patient 4 - Lit: ").append(randomBedNumber3).append("\n");
        infoBuilder.append("Medicament1: medicamentA quantite: 1\n");
        infoBuilder.append("Medicament2: medicamentK quantite: 2\n");
        infoBuilder.append("Medicament3: medicamentZ quantite: 1\n");
        infoBuilder.append("--------------------------------------------------\n");

        patientInfoArea.setText(infoBuilder.toString());
    }

    private void openGestionMedicamentsPatient1() {
        GestionMedicamentsPatient1 gestionMedicamentsPatient1 = new GestionMedicamentsPatient1();
        gestionMedicamentsPatient1.setVisible(true);
        dispose(); // Fermer la fenêtre actuelle
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }

            GestionMedicamentsPatient2 gestionMedicamentsPatient2 = new GestionMedicamentsPatient2();
        });
    }
}
