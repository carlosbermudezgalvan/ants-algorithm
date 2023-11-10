package model;

public class Food {
    private int posX;
    private int posY;

    public Food(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }



    public boolean found(Ant ant){
        if(ant.getPosX() == posX && ant.getPosY() == posY){
            return true;
        }else{
            return false;
        }
        
    }


}
