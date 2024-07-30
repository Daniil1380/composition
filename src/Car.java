import java.util.Objects;

public class Car {

    private Engine engine;

    private Wheel wheel;

    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheel=" + wheel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return Objects.equals(engine, car.engine) && Objects.equals(wheel, car.wheel);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(engine);
        result = 31 * result + Objects.hashCode(wheel);
        return result;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
