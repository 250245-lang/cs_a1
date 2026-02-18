class Sensor {
    String location;
    double reading;

    public Sensor(String location, double reading) {
        this.location = location;
        if (reading > 50 || reading < -50) {
            this.reading = 0;
        } else {
            this.reading = reading;
        }
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[5];
        for(int i = 0; i<5; i++){
            sensors[i] = new Sensor("Location " + i, Math.random()*100 - 50);
        }
        double sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.reading;
        }
        System.out.printf("Average temperature: %.2f%n", sum/sensors.length);
    }
}
