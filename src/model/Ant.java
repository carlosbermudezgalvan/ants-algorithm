package model;

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

    public void move(int newX, int newY, Environment environment) {
        // Método para mover la hormiga a una nueva posición
        this.posX = newX;
        this.posY = newY;
        environment.leavePheromone(this);  // Deja una feromona en la nueva posición
    }
}
