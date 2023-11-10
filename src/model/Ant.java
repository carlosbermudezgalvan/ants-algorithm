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

   

    // Otros métodos y atributos según sea necesario

    public void move(int newX, int newY, Environment environment) {
        // Método para mover la hormiga a una nueva posición
        environment.leavePheromone(this);  // Deja una feromona en la posición anterior
        // Método para mover la hormiga a una nueva posición
        this.posX = newX;
        this.posY = newY;
    }
}
