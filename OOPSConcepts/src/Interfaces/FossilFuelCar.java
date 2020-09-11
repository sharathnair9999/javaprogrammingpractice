package Interfaces;

public class FossilFuelCar implements CarInterface, TestInterface{
    private String name;

    public FossilFuelCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {

    }

    @Override
    public void printName(String name) {

    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName()+" is moving at "+ speed+" mph");
    }
}
