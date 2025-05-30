class Motor {
    public void arrancar() {
        System.out.println("Motor arrancado");
    }
}

class Coche {
    private Motor motor;

    public Coche() {
        this.motor = new Motor();
    }

    public void arrancarCoche() {
        motor.arrancar();
    }
}

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.arrancarCoche();
    }
}
