public class Navigator {

    public void move(Vehicle vehicle) {
        vehicle.goForward();
        vehicle.turnLeft();
        vehicle.goForward();
        vehicle.turnRight();
        vehicle.goForward();
    }
}
