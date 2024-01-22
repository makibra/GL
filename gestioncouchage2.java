import javax.swing.*;
import java.awt.*;

public class gestioncouchage2 extends JFrame {

    private JLabel titleLabel;
    private JLabel serviceLabel;
    private JLabel nbPatientsSortantsLabel;
    private JTextField nbPatientsSortantsField;
    private JLabel numerosLitsSortantsLabel;
    private JTextField numerosLitsSortantsField;
    private JLabel nbPatientsEntrantsLabel;
    private JTextField nbPatientsEntrantsField;
    private JLabel numerosLitsEntrantsLabel;
    private JTextField numerosLitsEntrantsField;
    private JButton allerButton;

    public gestioncouchage2() {
    
        super("Gestion du couchage des patients (2)");
        
       
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

 
        titleLabel = new JLabel("Gestion du couchage des patients (2)");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(titleLabel);

        serviceLabel = new JLabel("Service: XXXXXX");
        panel.add(serviceLabel);

        nbPatientsSortantsLabel = new JLabel("Nombre de patients sortants:");
        panel.add(nbPatientsSortantsLabel);

        nbPatientsSortantsField = new JTextField(5);
        panel.add(nbPatientsSortantsField);

        numerosLitsSortantsLabel = new JLabel("Numéro des lits:");
        panel.add(numerosLitsSortantsLabel);

        numerosLitsSortantsField = new JTextField(20);
        panel.add(numerosLitsSortantsField);

        nbPatientsEntrantsLabel = new JLabel("Nombre de patients entrants:");
        panel.add(nbPatientsEntrantsLabel);

        nbPatientsEntrantsField = new JTextField(5);
        panel.add(nbPatientsEntrantsField);

        numerosLitsEntrantsLabel = new JLabel("Numéro des lits:");
        panel.add(numerosLitsEntrantsLabel);

        numerosLitsEntrantsField = new JTextField(20);
        panel.add(numerosLitsEntrantsField);

        allerButton = new JButton("aller à Gestion couchage(1)");
        panel.add(allerButton);

     
        for (Component component : panel.getComponents()) {
            if (component instanceof JLabel) {
                ((JLabel) component).setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            }
        }

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new gestioncouchage2();
    }
}
