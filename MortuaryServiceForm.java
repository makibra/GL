import javax.swing.*;
import java.awt.*;

public class MortuaryServiceForm {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestion de E/S du service mortuaire");
        frame.setSize(600, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel hospitalisationLabel = new JLabel("Hospitalisé");
        hospitalisationLabel.setBounds(10, 20, 80, 25);
        panel.add(hospitalisationLabel);

        JCheckBox hospitalisedCheckbox = new JCheckBox();
        hospitalisedCheckbox.setBounds(100, 20, 20, 25);
        panel.add(hospitalisedCheckbox);

        JLabel serviceLabel = new JLabel("Service");
        serviceLabel.setBounds(10, 50, 80, 25);
        panel.add(serviceLabel);

        String[] names = { "Service A", "Service B", "Service C" }; 
        JComboBox nameList = new JComboBox(names);
        nameList.setBounds(100, 50, 160, 25);
        panel.add(nameList);
        

        JLabel dobbLabel = new JLabel("Patient");
        dobbLabel.setBounds(10, 80, 80, 25);
        panel.add(dobbLabel);

        String[] patients = { "Patient A", "Patient B", "Patient C" }; 
        JComboBox patientsList = new JComboBox(patients);
        patientsList.setBounds(100, 80, 160, 25);
        panel.add(patientsList);
        

      
        JLabel nonhospitalisationLabel = new JLabel("Non Hospitalisé");
        nonhospitalisationLabel.setBounds(10, 120, 80, 25);
        panel.add(nonhospitalisationLabel);

        JCheckBox nonhospitalisedCheckbox = new JCheckBox();
        nonhospitalisedCheckbox.setBounds(100, 120, 20, 25);
        panel.add(nonhospitalisedCheckbox);
        

        JLabel nameLabel = new JLabel("Nom");
nameLabel.setBounds(10, 150, 80, 25);
panel.add(nameLabel);

JTextField nameText = new JTextField(20);
nameText.setBounds(100, 150, 160, 25);
panel.add(nameText);

JLabel prenomLabel = new JLabel("Prénom");
prenomLabel.setBounds(10, 180, 80, 25);
panel.add(prenomLabel);

JTextField prenomText = new JTextField(20);
prenomText.setBounds(100, 180, 160, 25);
panel.add(prenomText);

JLabel dobLabel = new JLabel("Date de Naissance");
dobLabel.setBounds(10, 210, 120, 25);
panel.add(dobLabel);

JTextField dobText = new JTextField(20);
dobText.setBounds(130, 210, 130, 25);
panel.add(dobText);

JLabel birthPlaceLabel = new JLabel("Lieu de Naissance");
birthPlaceLabel.setBounds(10, 240, 120, 25);
panel.add(birthPlaceLabel);

JTextField birthPlaceText = new JTextField(20);
birthPlaceText.setBounds(130, 240, 130, 25);
panel.add(birthPlaceText);

JLabel infoLabel = new JLabel("Si informations manquantes, entrer le code ici");
infoLabel.setBounds(300, 150, 250, 25);
panel.add(infoLabel);

JTextField infoText = new JTextField(20);
infoText.setBounds(300, 180, 200, 25);
panel.add(infoText);


JLabel doctorLabel = new JLabel("Médecin");
doctorLabel.setBounds(10, 280, 80, 25);
panel.add(doctorLabel);


String[] doctors = { "doctor A", "doctor B", "doctor C" }; 
        JComboBox doctorsList = new JComboBox(doctors);
        doctorsList.setBounds(100, 280, 160, 25);
        panel.add(doctorsList);


JLabel causeLabel = new JLabel("Cause du décès");
causeLabel.setBounds(10, 310, 120, 25);
panel.add(causeLabel);

JTextField causeText = new JTextField(20);
causeText.setBounds(130, 310, 130, 25);
panel.add(causeText);

JLabel placeLabel = new JLabel("Lieu du décès");
placeLabel.setBounds(10, 340, 120, 25);
panel.add(placeLabel);

JTextField placeText = new JTextField(20);
placeText.setBounds(130, 340, 130, 25);
panel.add(placeText);

JLabel dateLabel = new JLabel("Date du décès");
dateLabel.setBounds(10, 360, 120, 25);
panel.add(dateLabel);

JTextField dateText = new JTextField(20);
dateText.setBounds(130, 360, 130, 25);
panel.add(dateText);

JLabel entryDateLabel = new JLabel("Date d'entrée à la morgue");
entryDateLabel.setBounds(10, 410, 160, 25);
panel.add(entryDateLabel);

JTextField entryDateText = new JTextField(20);
entryDateText.setBounds(170, 410, 90, 25);
panel.add(entryDateText);

JLabel entryTimeLabel = new JLabel("Heure d'entrée à la morgue");
entryTimeLabel.setBounds(10, 440, 160, 25);
panel.add(entryTimeLabel);

JTextField entryTimeText = new JTextField(20);
entryTimeText.setBounds(170, 440, 90, 25);
panel.add(entryTimeText);

JButton yesButton = new JButton("Reset");
yesButton.setBounds(10, 470, 80, 25);
panel.add(yesButton);

JButton submitButton = new JButton("Submit");
submitButton.setBounds(100, 470, 80, 25);
panel.add(submitButton);





    }
}
