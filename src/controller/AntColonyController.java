package controller;
import view.*;
import model.*;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AntColonyController {
    private AntColonyView antColonyView;
    private Environment environment;

    public AntColonyController() {
        int dimensionX = 500;
        int dimensionY = 500;

        antColonyView = new AntColonyView();
        AntColonyPanel antColonyPanel = antColonyView.getAntColonyPanel();

        environment = new Environment(dimensionX, dimensionY);

         // Establecer las listas en el panel
        antColonyPanel.setAnts(environment.getAnts());
        antColonyPanel.setFoods(environment.getFoods());

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica de la simulación: actualización del modelo
                environment.update();  // Método en Environment que actualiza el estado

                // Lógica de la simulación: actualización de la vista
                antColonyPanel.repaint();


                //environment.printPheromoneMatrix();
            }
        });

        timer.start();
    }

    // Otros métodos del controlador según sea necesario
}
