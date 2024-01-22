import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionMedicalePatient2 extends JFrame {
    private JComboBox<String> serviceDropdown;
    private JComboBox<String> patientDropdown;
    private JComboBox<String> medecinDropdown;
    private JTextArea descriptionEtatPatientArea;
    private JTextField analyse1Field;
    private JTextField analyse2Field;
    private JTextField analyse3Field;
    private JTextArea radiologieResultatArea;
    private JTextField medicament1Field;
    private JTextField quantite1Field;
    private JTextField medicament2Field;
    private JTextField quantite2Field;
    private JTextField medicament3Field;
    private JTextField quantite3Field;
    private JTextField medicament4Field;
    private JTextField quantite4Field;

    public GestionMedicalePatient2() {
        setTitle("Gestion Medicale du Patient 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
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

        // En bas - Liste déroulante de patient, médecin, champs texte et boutons
        JLabel patientLabel = new JLabel("Patient:");
        patientDropdown = new JComboBox<>(new String[]{"Patient1", "Patient2", "Patient3"});
        patientDropdown.setFont(new Font("Arial", Font.PLAIN, 14));
        patientDropdown.setBackground(new Color(173, 216, 230));

        JLabel medecinLabel = new JLabel("Medecin:");
        medecinDropdown = new JComboBox<>(new String[]{"Medecin1", "Medecin2", "Medecin3"});
        medecinDropdown.setFont(new Font("Arial", Font.PLAIN, 14));
        medecinDropdown.setBackground(new Color(173, 216, 230));

        JLabel descriptionEtatLabel = new JLabel("Description de l'etat du patient:");
        descriptionEtatPatientArea = new JTextArea(5, 20);
        JScrollPane descriptionScrollPane = new JScrollPane(descriptionEtatPatientArea);
        descriptionScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        JLabel analyse1Label = new JLabel("Resultat Analyse 1:");
        analyse1Field = new JTextField(20);
        JLabel analyse2Label = new JLabel("Resultat Analyse 2:");
        analyse2Field = new JTextField(20);
        JLabel analyse3Label = new JLabel("Resultat Analyse 3:");
        analyse3Field = new JTextField(20);

        JLabel radiologieResultatLabel = new JLabel("Resultat Radiologie:");
        radiologieResultatArea = new JTextArea(5, 20);
        JScrollPane radiologieScrollPane = new JScrollPane(radiologieResultatArea);
        radiologieScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        JLabel medicamentLabel = new JLabel("Medicaments Prescrits:");
        JLabel medicament1Label = new JLabel("1:");
        medicament1Field = new JTextField(15);
        JLabel quantite1Label = new JLabel("Quantite:");
        quantite1Field = new JTextField(5);

        JLabel medicament2Label = new JLabel("2:");
        medicament2Field = new JTextField(15);
        JLabel quantite2Label = new JLabel("Quantite:");
        quantite2Field = new JTextField(5);

        JLabel medicament3Label = new JLabel("3:");
        medicament3Field = new JTextField(15);
        JLabel quantite3Label = new JLabel("Quantite:");
        quantite3Field = new JTextField(5);

        JLabel medicament4Label = new JLabel("4:");
        medicament4Field = new JTextField(15);
        JLabel quantite4Label = new JLabel("Quantite:");
        quantite4Field = new JTextField(5);

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
        contentPanel.add(descriptionEtatLabel, gbc);
        gbc.gridx = 1;
        contentPanel.add(descriptionScrollPane, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        contentPanel.add(analyse1Label, gbc);
        gbc.gridx = 1;
        contentPanel.add(analyse1Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        contentPanel.add(analyse2Label, gbc);
        gbc.gridx = 1;
        contentPanel.add(analyse2Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        contentPanel.add(analyse3Label, gbc);
        gbc.gridx = 1;
        contentPanel.add(analyse3Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        contentPanel.add(radiologieResultatLabel, gbc);
        gbc.gridx = 1;
        contentPanel.add(radiologieScrollPane, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        contentPanel.add(medicamentLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        contentPanel.add(medicament1Label, gbc);
        gbc.gridx = 1;
        contentPanel.add(medicament1Field, gbc);
        gbc.gridx = 2;
        contentPanel.add(quantite1Label, gbc);
        gbc.gridx = 3;
        contentPanel.add(quantite1Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        contentPanel.add(medicament2Label, gbc);
        gbc.gridx = 1;
        contentPanel.add(medicament2Field, gbc);
        gbc.gridx = 2;
        contentPanel.add(quantite2Label, gbc);
        gbc.gridx = 3;
        contentPanel.add(quantite2Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 11;
        contentPanel.add(medicament3Label, gbc);
        gbc.gridx = 1;
        contentPanel.add(medicament3Field, gbc);
        gbc.gridx = 2;
        contentPanel.add(quantite3Label, gbc);
        gbc.gridx = 3;
        contentPanel.add(quantite3Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 12;
        contentPanel.add(medicament4Label, gbc);
        gbc.gridx = 1;
        contentPanel.add(medicament4Field, gbc);
        gbc.gridx = 2;
        contentPanel.add(quantite4Label, gbc);
        gbc.gridx = 3;
        contentPanel.add(quantite4Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 13;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        contentPanel.add(new JPanel(), gbc); // Espace vide pour l'esthétique

        gbc.gridx = 0;
        gbc.gridy = 14;
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
        descriptionEtatPatientArea.setText("");
        analyse1Field.setText("");
        analyse2Field.setText("");
        analyse3Field.setText("");
        radiologieResultatArea.setText("");
        medicament1Field.setText("");
        quantite1Field.setText("");
        medicament2Field.setText("");
        quantite2Field.setText("");
        medicament3Field.setText("");
        quantite3Field.setText("");
        medicament4Field.setText("");
        quantite4Field.setText("");
    }

    private void submitForm() {
        // Ajoutez le code pour traiter les données soumises
        String service = (String) serviceDropdown.getSelectedItem();
        String patient = (String) patientDropdown.getSelectedItem();
        String medecin = (String) medecinDropdown.getSelectedItem();
        String descriptionEtatPatient = descriptionEtatPatientArea.getText();
        String analyse1 = analyse1Field.getText();
        String analyse2 = analyse2Field.getText();
        String analyse3 = analyse3Field.getText();
        String radiologieResultat = radiologieResultatArea.getText();
        String medicament1 = medicament1Field.getText();
        String quantite1 = quantite1Field.getText();
        String medicament2 = medicament2Field.getText();
        String quantite2 = quantite2Field.getText();
        String medicament3 = medicament3Field.getText();
        String quantite3 = quantite3Field.getText();
        String medicament4 = medicament4Field.getText();
        String quantite4 = quantite4Field.getText();

        // Vous pouvez ajouter le code pour traiter ces données comme nécessaire
        // (par exemple, les enregistrer dans une base de données)
        // Imprimez-les pour le moment
        System.out.println("Service: " + service);
        System.out.println("Patient: " + patient);
        System.out.println("Médecin: " + medecin);
        System.out.println("Description de l'état du patient: " + descriptionEtatPatient);
        System.out.println("Résultat Analyse 1: " + analyse1);
        System.out.println("Résultat Analyse 2: " + analyse2);
        System.out.println("Résultat Analyse 3: " + analyse3);
        System.out.println("Résultat Radiologie: " + radiologieResultat);
        System.out.println("Médicament 1: " + medicament1 + " | Quantité: " + quantite1);
        System.out.println("Médicament 2: " + medicament2 + " | Quantité: " + quantite2);
        System.out.println("Médicament 3: " + medicament3 + " | Quantité: " + quantite3);
        System.out.println("Médicament 4: " + medicament4 + " | Quantité: " + quantite4);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }

            GestionMedicalePatient2 gestionMedicalePatient2 = new GestionMedicalePatient2();
        });
    }
}
