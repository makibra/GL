import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.util.ArrayList;

public class MedicationManagement extends JFrame {

    private JLabel titleLabel;
    private JLabel patientCountLabel;
    private JLabel serviceLabel;
    private ArrayList<JPanel> bedPanels;
    private JButton goToMedicationManagement1Button;

    public MedicationManagement() {
        super("Gestion des médicaments pour patients (2)");
        setLayout(new BorderLayout());

  
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.Y_AXIS));

        titleLabel = new JLabel("Gestion des médicaments pour patients (2)");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        headerPanel.add(titleLabel);

        serviceLabel = new JLabel("Service XXXX");
        serviceLabel.setFont(new Font("Arial", Font.BOLD, 16));
        headerPanel.add(serviceLabel);

        patientCountLabel = new JLabel("Nombre de patients: 31");
        headerPanel.add(patientCountLabel);

        add(headerPanel, BorderLayout.NORTH);


        JPanel detailsPanel = new JPanel();
        detailsPanel.setLayout(new BoxLayout(detailsPanel, BoxLayout.Y_AXIS));

        bedPanels = new ArrayList<>();

      
        addBedPanel("1) Numéro du lit : 3",
                "Médicament 1: xxx xxxx, quantité: xxxx",
                "Médicament 2: xxxx xxx, quantité: xx",
                "Médicament 3: xxxxx, quantité: xxx");

        addBedPanel("2) Numéro du lit: 5",
                "Médicament 1: xxxxxx quantité: xxx",
                "Médicament 2: xxxxx quantitexxx");

        for (JPanel bedPanel : bedPanels) {
            detailsPanel.add(bedPanel);
        }

        add(new JScrollPane(detailsPanel), BorderLayout.CENTER);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        goToMedicationManagement1Button = new JButton("aller à Gestion médicament");
        buttonPanel.add(goToMedicationManagement1Button);
        add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addBedPanel(String bedLabelText, String... medicationLabels) {
        JPanel bedPanel = new JPanel(new BorderLayout());
        bedPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10),
                BorderFactory.createEtchedBorder(EtchedBorder.LOWERED)
        ));

        JLabel bedLabel = new JLabel(bedLabelText);
        bedPanel.add(bedLabel, BorderLayout.NORTH);

        JPanel medicationPanel = new JPanel();
        medicationPanel.setLayout(new BoxLayout(medicationPanel, BoxLayout.Y_AXIS));
        for (String medicationLabel : medicationLabels) {
            medicationPanel.add(new JLabel(medicationLabel));
        }
        bedPanel.add(medicationPanel, BorderLayout.CENTER);

        bedPanels.add(bedPanel);
    }

    public static void main(String[] args) {
        new MedicationManagement();
    }
}
