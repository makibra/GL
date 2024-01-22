import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionMedicalePatient1 extends JFrame {
    private JComboBox<String> serviceDropdown;
    private JComboBox<String> patientDropdown;
    private JComboBox<String> medecinDropdown;
    private JTextArea descriptionEtatPatientArea;
    private JCheckBox[] analyseCheckBoxes;
    private JTextField radiologieField;
    private JComboBox<String> typeRadioDropdown;
    private JTextField organeRadiographierField;
    private JTextArea descriptionRadioArea;
    private JTextField medicament1Field;
    private JTextField quantite1Field;
    private JTextField medicament2Field;
    private JTextField quantite2Field;
    private JTextField medicament3Field;
    private JTextField quantite3Field;
    private JTextField medicament4Field;
    private JTextField quantite4Field;

    public GestionMedicalePatient1() {
        setTitle("Gestion Medicale du Patient 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
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

        JLabel analyseLabel = new JLabel("Analyses a faire:");
        JPanel analysePanel = createAnalysePanel();

        JLabel radiologieLabel = new JLabel("Radiologie a faire:");
        radiologieField = new JTextField(20);

        JLabel typeRadioLabel = new JLabel("Type de radio:");
        typeRadioDropdown = new JComboBox<>(new String[]{"Radio1", "Radio2", "Radio3", "Radio4"});
        typeRadioDropdown.setFont(new Font("Arial", Font.PLAIN, 14));
        typeRadioDropdown.setBackground(new Color(173, 216, 230));

        JLabel organeRadiographierLabel = new JLabel("Organe a radiographier:");
        organeRadiographierField = new JTextField(20);

        JLabel descriptionRadioLabel = new JLabel("Description de la radiographie:");
        descriptionRadioArea = new JTextArea(5, 20);
        JScrollPane radioScrollPane = new JScrollPane(descriptionRadioArea);
        radioScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        JLabel medicamentLabel = new JLabel("Medicaments Prescrits:");
        JPanel medicamentPanel = createMedicamentPanel();

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
        contentPanel.add(analyseLabel, gbc);
        gbc.gridx = 1;
        contentPanel.add(analysePanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        contentPanel.add(radiologieLabel, gbc);
        gbc.gridx = 1;
        contentPanel.add(radiologieField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        contentPanel.add(typeRadioLabel, gbc);
        gbc.gridx = 1;
        contentPanel.add(typeRadioDropdown, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        contentPanel.add(organeRadiographierLabel, gbc);
        gbc.gridx = 1;
        contentPanel.add(organeRadiographierField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        contentPanel.add(descriptionRadioLabel, gbc);
        gbc.gridx = 1;
        contentPanel.add(radioScrollPane, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        contentPanel.add(medicamentLabel, gbc);
        gbc.gridx = 1;
        contentPanel.add(medicamentPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        contentPanel.add(new JPanel(), gbc); 
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        contentPanel.add(resetButton, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        contentPanel.add(submitButton, gbc);

        setLayout(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(contentPanel, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    private JPanel createAnalysePanel() {
        JPanel analysePanel = new JPanel();
        analysePanel.setLayout(new GridLayout(3, 3));
        analyseCheckBoxes = new JCheckBox[9];

        for (int i = 0; i < 9; i++) {
            analyseCheckBoxes[i] = new JCheckBox("Analyse" + (i + 1));
            analyseCheckBoxes[i].setFont(new Font("Arial", Font.PLAIN, 14));
            analyseCheckBoxes[i].setBackground(new Color(240, 248, 255));
            analysePanel.add(analyseCheckBoxes[i]);
        }

        return analysePanel;
    }

    private JPanel createMedicamentPanel() {
        JPanel medicamentPanel = new JPanel();
        medicamentPanel.setLayout(new GridLayout(4, 2));

        JLabel medicament1Label = new JLabel("1:");
        medicament1Field = new JTextField(20);
        JLabel quantite1Label = new JLabel("Quantite:");
        quantite1Field = new JTextField(20);

        JLabel medicament2Label = new JLabel("2:");
        medicament2Field = new JTextField(20);
        JLabel quantite2Label = new JLabel("Quantite:");
        quantite2Field = new JTextField(20);

        JLabel medicament3Label = new JLabel("3:");
        medicament3Field = new JTextField(20);
        JLabel quantite3Label = new JLabel("Quantite:");
        quantite3Field = new JTextField(20);

        JLabel medicament4Label = new JLabel("4:");
        medicament4Field = new JTextField(20);
        JLabel quantite4Label = new JLabel("Quantite:");
        quantite4Field = new JTextField(20);

        medicamentPanel.add(medicament1Label);
        medicamentPanel.add(medicament1Field);
        medicamentPanel.add(quantite1Label);
        medicamentPanel.add(quantite1Field);
        medicamentPanel.add(medicament2Label);
        medicamentPanel.add(medicament2Field);
        medicamentPanel.add(quantite2Label);
        medicamentPanel.add(quantite2Field);
        medicamentPanel.add(medicament3Label);
        medicamentPanel.add(medicament3Field);
        medicamentPanel.add(quantite3Label);
        medicamentPanel.add(quantite3Field);
        medicamentPanel.add(medicament4Label);
        medicamentPanel.add(medicament4Field);
        medicamentPanel.add(quantite4Label);
        medicamentPanel.add(quantite4Field);

        return medicamentPanel;
    }

    private void resetForm() {
        serviceDropdown.setSelectedIndex(0);
        patientDropdown.setSelectedIndex(0);
        medecinDropdown.setSelectedIndex(0);
        descriptionEtatPatientArea.setText("");
        for (JCheckBox checkBox : analyseCheckBoxes) {
            checkBox.setSelected(false);
        }
        radiologieField.setText("");
        typeRadioDropdown.setSelectedIndex(0);
        organeRadiographierField.setText("");
        descriptionRadioArea.setText("");
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
        String service = (String) serviceDropdown.getSelectedItem();
        String patient = (String) patientDropdown.getSelectedItem();
        String medecin = (String) medecinDropdown.getSelectedItem();
        String descriptionEtatPatient = descriptionEtatPatientArea.getText();
        StringBuilder analyses = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if (analyseCheckBoxes[i].isSelected()) {
                analyses.append("Analyse").append(i + 1).append(", ");
            }
        }
        String radiologie = radiologieField.getText();
        String typeRadio = (String) typeRadioDropdown.getSelectedItem();
        String organeRadiographier = organeRadiographierField.getText();
        String descriptionRadio = descriptionRadioArea.getText();
        String medicament1 = medicament1Field.getText();
        String quantite1 = quantite1Field.getText();
        String medicament2 = medicament2Field.getText();
        String quantite2 = quantite2Field.getText();
        String medicament3 = medicament3Field.getText();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }

            GestionMedicalePatient1 gestionMedicalePatient1 = new GestionMedicalePatient1();
        });
    }
}

