import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionDossierPatient extends JFrame {
    private JComboBox<String> serviceDropdown;
    private JComboBox<String> patientDropdown;
    private JTextField nomField;
    private JTextField prenomField;
    private JTextField dateNaissanceField;
    private JTextField lieuNaissanceField;
    private JTextField adresseField;
    private JTextField numTelField;
    private JTextField emailField;

    private JComboBox<String> medecinDropdown;
    private JTextField dureeHospitalisationField;
    private JTextField descriptionMaladieField;

    public GestionDossierPatient() {
        setTitle("Gestion de Dossier Patient");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JLabel serviceLabel = new JLabel("Service:");
        serviceDropdown = new JComboBox<>(new String[]{"Service1", "Service2", "Service3"});
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.add(serviceLabel);
        topPanel.add(serviceDropdown);
        add(topPanel, BorderLayout.NORTH);

        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.add(createPatientPanel());
        mainPanel.add(createMedecinPanel());
        add(mainPanel, BorderLayout.CENTER);

        JButton resetButton = new JButton("Reset");
        JButton submitButton = new JButton("Submit");

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitForm();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private JPanel createPatientPanel() {
        JPanel patientPanel = new JPanel(new GridLayout(9, 2, 10, 10));

        patientPanel.add(new JLabel("Service:"));
        patientDropdown = new JComboBox<>(new String[]{"Service1", "Service2", "Service3"});
        patientPanel.add(patientDropdown);

        patientPanel.add(new JLabel("Patient:"));
        patientDropdown = new JComboBox<>(new String[]{"Patient1", "Patient2", "Patient3"});
        patientPanel.add(patientDropdown);

        patientPanel.add(new JLabel("Nom:"));
        nomField = new JTextField();
        patientPanel.add(nomField);

        patientPanel.add(new JLabel("Prenom:"));
        prenomField = new JTextField();
        patientPanel.add(prenomField);

        patientPanel.add(new JLabel("Date de Naissance:"));
        dateNaissanceField = new JTextField();
        patientPanel.add(dateNaissanceField);

        patientPanel.add(new JLabel("Lieu de Naissance:"));
        lieuNaissanceField = new JTextField();
        patientPanel.add(lieuNaissanceField);

        patientPanel.add(new JLabel("Adresse:"));
        adresseField = new JTextField();
        patientPanel.add(adresseField);

        patientPanel.add(new JLabel("Num Tel:"));
        numTelField = new JTextField();
        patientPanel.add(numTelField);

        patientPanel.add(new JLabel("Email:"));
        emailField = new JTextField();
        patientPanel.add(emailField);

        return patientPanel;
    }

    private JPanel createMedecinPanel() {
        JPanel medecinPanel = new JPanel(new GridLayout(3, 2, 10, 10));

        medecinPanel.add(new JLabel("Medecin:"));
        medecinDropdown = new JComboBox<>(new String[]{"Medecin1", "Medecin2", "Medecin3"});
        medecinPanel.add(medecinDropdown);

        medecinPanel.add(new JLabel("Duree d'Hospitalisation Probable:"));
        dureeHospitalisationField = new JTextField();
        medecinPanel.add(dureeHospitalisationField);

        medecinPanel.add(new JLabel("Description de la Maladie:"));
        descriptionMaladieField = new JTextField();
        medecinPanel.add(descriptionMaladieField);

        return medecinPanel;
    }

    private void resetForm() {
        serviceDropdown.setSelectedIndex(0);
        patientDropdown.setSelectedIndex(0);
        nomField.setText("");
        prenomField.setText("");
        dateNaissanceField.setText("");
        lieuNaissanceField.setText("");
        adresseField.setText("");
        numTelField.setText("");
        emailField.setText("");
        medecinDropdown.setSelectedIndex(0);
        dureeHospitalisationField.setText("");
        descriptionMaladieField.setText("");
    }

    private void submitForm() {
        JOptionPane.showMessageDialog(this, "Formulaire soumis avec succès !");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GestionDossierPatient gestionDossierPatient = new GestionDossierPatient();
            gestionDossierPatient.setVisible(true);
        });
    }
}
