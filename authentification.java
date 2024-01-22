import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class authentification extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

  public authentification() {
        setTitle("Connexion à l'application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);  
        setLocationRelativeTo(null);

        JPanel contentPanel = new JPanel(new GridBagLayout());

        // Ajouter le message de bienvenue au JPanel
        JLabel welcomeLabel = new JLabel("Bienvenue sur l'application d'hopital");
        welcomeLabel.setFont(new Font("Calibri", Font.BOLD, 40));
        welcomeLabel.setForeground(Color.BLUE);
        GridBagConstraints welcomeLabelConstraints = new GridBagConstraints();
        welcomeLabelConstraints.gridx = 0;
        welcomeLabelConstraints.gridy = 0;
        welcomeLabelConstraints.gridwidth = 2;
        welcomeLabelConstraints.insets = new Insets(30, 30, 30, 30);  
        contentPanel.add(welcomeLabel, welcomeLabelConstraints);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  

        gbc.gridx = 0;
        gbc.gridy = 1;
        contentPanel.add(createLabel("Nom d'utilisateur:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        contentPanel.add(createTextField(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        contentPanel.add(createLabel("Mot de passe:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        contentPanel.add(createPasswordField(), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
         contentPanel.add(createResetButton(), gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        contentPanel.add(createLoginButton(), gbc);
        
        setLayout(new BorderLayout());
        add(contentPanel, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        return label;
    }

    private JTextField createTextField() {
        usernameField = new JTextField(20);
        usernameField.setFont(new Font("Arial", Font.PLAIN, 16));
        return usernameField;
    }

    private JPasswordField createPasswordField() {
        passwordField = new JPasswordField(20);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 16));
        return passwordField;
    }

    private JButton createResetButton() {
        JButton resetButton = new JButton("Reinitialiser");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Réinitialiser les champs de texte à vide
                usernameField.setText("");
                passwordField.setText("");
            }
        });
        return resetButton;
    }

    private JButton createLoginButton() {
        JButton loginButton = new JButton("Connexion");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        return loginButton;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }

            authentification loginWindow = new authentification();
        });
    }
}
