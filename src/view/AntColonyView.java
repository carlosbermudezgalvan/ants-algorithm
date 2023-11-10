package view;
import javax.swing.*;

public class AntColonyView extends JFrame {
    
    private AntColonyPanel antColonyPanel;

    public AntColonyView() {
        antColonyPanel = new AntColonyPanel();
        add(antColonyPanel);

        // Configuración del JFrame
        setTitle("Ant Colony Optimization");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Empaqueta el JFrame para ajustarse al tamaño preferido del contenido (AntColonyPanel)
        pack();

        // Ajusta el JFrame al centro de la pantalla
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public AntColonyPanel getAntColonyPanel() {
        return antColonyPanel;
    }
}


