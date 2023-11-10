package model;

import java.util.ArrayList;
import java.util.List;

public class Ant {
    private int posX;
    private int posY;

    public Ant(int initialX, int initialY) {
        this.posX = initialX;
        this.posY = initialY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void move(Environment environment) {
        // Generar movimientos aleatorios para X e Y (pueden ser -1, 0 o 1)
        int moveX = (int) Math.floor(Math.random() * 3) - 1;
        int moveY = (int) Math.floor(Math.random() * 3) - 1;
    
        // Calcular la nueva posición
        int newX = posX + moveX;
        int newY = posY + moveY;
    
        // Verificar si la nueva posición es válida
        if (isValidCell(newX, newY, environment.getPheromoneMatrix())) {
            // Mover la hormiga a la nueva posición
            this.posX = newX;
            this.posY = newY;
            // Deja una feromona en la posición nueva
            environment.leavePheromone(this);
        }
        // Si la nueva posición no es válida, la hormiga no se mueve
    }
    
    
   

        
    private boolean isValidCell(int x, int y, int[][] matrix) {
        return x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length;
    }
}
