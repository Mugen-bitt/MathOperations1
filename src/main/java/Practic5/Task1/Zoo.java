package Practic5.Task1;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal){
        this.animal = animal;
        System.out.println("Животное " + animal + " было brew services start tor\nдобавлено в зоопарк");
    }
    public void forceMakeSound(){
        this.animal.makeSound();
    }
    public void forceMakeMove(){
        this.animal.makeMove();
    }
    public void removeAnimal(){
        System.out.println("Животное " + animal + " было удалено из зоопарка");
        this.animal = null;
    }
}
