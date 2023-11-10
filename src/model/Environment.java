package model;

import java.util.ArrayList;
import java.util.List;

public class Environment {
    private List<Ant> ants;
    private List<Food> foods;
    private int[][] pheromoneMatrix;
    

    public Environment(int dimensionX, int dimensionY) {


        ants = new ArrayList<>();
        foods = new ArrayList<>();
        pheromoneMatrix = new int[dimensionX/10][dimensionY/10];
        // Inicializa la matriz de feromonas u otros atributos según sea necesario
        initializeAntsAndFoods();  // Inicializa las hormigas y los alimentos
    }

    private void initializeAntsAndFoods() {
        // Agrega hormigas al environment según sea necesario
        for (int i = 0; i < 10; i++) {
            Ant ant = new Ant(0,0);
            ants.add(ant);
        }

        // Agrega alimentos al environment según sea necesario
        for (int i = 0; i < 5; i++) {
            Food food = new Food(49,49);
            foods.add(food);
        }
    }

    public void update() {

        // Lógica de la simulación: actualización del estado del modelo

        // Mueve las hormigas
        moveAnts();

        // Actualiza las feromonas
        updatePheromones();

        // Otros pasos de la simulación según sea necesario
    }

    private void moveAnts() {
        for (Ant ant : ants) {
            // Lógica para el movimiento de las hormigas
            // Actualiza la posición de la hormiga según tu algoritmo
            ant.move(ant.getPosX()+1, ant.getPosY()+1,this);
        }
    }

    private void updatePheromones() {
        // Lógica para la actualización de las feromonas
        // Actualiza la matriz de feromonas según tu algoritmo
    }

    // Otros métodos y atributos según sea necesario
    public List<Ant> getAnts() {
        return ants;
    }

    public List<Food> getFoods() {
        return foods;
    }
    public void leavePheromone(Ant ant) {
        // Deja una feromona en la posición actual de la hormiga
        int x = ant.getPosX();
        int y = ant.getPosY();
        pheromoneMatrix[x][y]++;
        
    }

    public void printPheromoneMatrix() {
        System.out.println("Pheromone Matrix:");

        for (int i = 0; i < 50; i += 1) {
            for (int j = 0; j < 50; j += 1) {
                System.out.print(pheromoneMatrix[i][j]);
            }
        }
        System.out.println();
    }
}
