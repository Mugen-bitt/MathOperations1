package Practic5.Task3;

public class Drink extends Dish {
    private int volume;
    public Drink(int volume){
        this.volume = volume;
    }
    public int getVolume(){
        return volume;
    }
    @Override
    void showCharacteristics(){
        System.out.println("Объем напитка " + this.volume);
    }
}
