package solid.isp.exercise;

public class Main {

    public static void main(String[] args) {
        Drivable car = new Car();
        car.startEngine();
        car.stopEngine();

        Airplane airplane = new Airplane();
        airplane.startEngine();
        airplane.fly();
        airplane.loadCargo();

        Boat boat = new Boat();
        boat.startEngine();
        boat.sail();
        boat.loadCargo();

        Truck truck = new Truck();
        truck.startEngine();
        truck.loadCargo();

        Drivable motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }

}
