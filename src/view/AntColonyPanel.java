package view;

import java.awt.*;
import javax.swing.*;
import model.Ant;
import model.Food;
import java.util.List;

public class AntColonyPanel extends JPanel {
    private static final int MATRIX_SIZE = 500;
    private static final int CELL_SIZE = MATRIX_SIZE / 50; // Tamaño de cada celda en la cuadrícula

    private ImageIcon antImageIcon;
    private ImageIcon foodImageIcon;

    private List<Ant> ants;
    private List<Food> foods;

    public AntColonyPanel() {
        // Carga de imágenes
        antImageIcon = new ImageIcon("src\\assets\\ant-man.png");
        foodImageIcon = new ImageIcon("src\\assets\\mini-food.png");

        // Establecer el tamaño preferido
        setPreferredSize(new Dimension(MATRIX_SIZE, MATRIX_SIZE));
    }

    public void setAnts(List<Ant> ants) {
        this.ants = ants;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja las hormigas
        if (ants != null) {
            for (Ant ant : ants) {
                drawImage(g, antImageIcon, ant);
            }
        }

        // Dibuja los alimentos
        if (foods != null) {
            for (Food food : foods) {
                drawImage(g, foodImageIcon, food);
            }
        }

        // Dibuja la cuadrícula (opcional)
        drawGrid(g);
    }

    private void drawImage(Graphics g, ImageIcon imageIcon, Object obj) {
    if (imageIcon != null) {
        int x = 0, y = 0;

        if (obj instanceof Ant) {
            Ant ant = (Ant) obj;
            x = ant.getPosX() * CELL_SIZE;
            y = ant.getPosY() * CELL_SIZE;
        } else if (obj instanceof Food) {
            Food food = (Food) obj;
            x = food.getPosX() * CELL_SIZE;
            y = food.getPosY() * CELL_SIZE;
        }

        imageIcon.paintIcon(this, g, x, y);
    }
}


    private void drawGrid(Graphics g) {
        // Dibuja una cuadrícula simple
        g.setColor(Color.BLACK);
        for (int x = 0; x <= MATRIX_SIZE; x += CELL_SIZE) {
            g.drawLine(x, 0, x, MATRIX_SIZE);
        }
        for (int y = 0; y <= MATRIX_SIZE; y += CELL_SIZE) {
            g.drawLine(0, y, MATRIX_SIZE, y);
        }
    }
}
