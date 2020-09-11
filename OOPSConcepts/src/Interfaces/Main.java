package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(60);
        List<String> names = new ArrayList<>();

        CarInterface fossilFuelCarInterface = new FossilFuelCar("Mercedes");
         fossilFuelCarInterface.start();
         fossilFuelCarInterface.move(100);
    }
}
