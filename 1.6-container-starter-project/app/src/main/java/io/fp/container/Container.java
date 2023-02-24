package io.fp.container;

import java.util.ArrayList;

public class Container<T extends Cargo> {

    private ArrayList<T> cargoList;
    private double maxWeight;
    private double currentWeight;

    public Container(ArrayList<T> cargo) {
        this.cargoList = cargo;
        this.maxWeight = 5000;
        this.currentWeight = 2300;
    }

    public Container() {
        this.cargoList = new ArrayList<>();
        this.maxWeight = 5000;
        this.currentWeight = 2300;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public ArrayList<T> getCargo() throws CargoException {
        return cargoList;
    }

    public void loadCargo(T newCargo) throws CargoException {
        // Aufgabe b)
        if (currentWeight + newCargo.getWeight() <= maxWeight) {
            cargoList.add(newCargo);
            currentWeight += newCargo.getWeight();
        } else
            throw new CargoException("Maximum Weigt exceeded");
    }

    public void unloadCargo(T requestedCargo) throws CargoException {
        // Aufgabe c)
        if (cargoList.contains(requestedCargo)) {
            cargoList.remove(requestedCargo);
            currentWeight -= requestedCargo.getWeight();
        } else
            throw new CargoException("Requested cargo not in container");
    }

    public void unloadContainer() throws CargoException {
        if (cargoList.isEmpty()) {
            throw new CargoException("This conatiner is already empty");
        } else {
            currentWeight = 2300;
            cargoList.clear();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This Container has a weight of " + currentWeight + " and contains: \n");
        for (T cargo : cargoList) {
            sb.append(cargo.toString() + "\n");
        }
        return sb.toString();
    }

}
