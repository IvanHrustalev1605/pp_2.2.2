package web.model;

import java.util.Objects;

public class Car {
    private String markName;
    private String model;
    private int series;

    public Car(String markName, String model, int series) {
        this.markName = markName;
        this.model = model;
        this.series = series;
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && Objects.equals(markName, car.markName) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markName, model, series);
    }

    @Override
    public String toString() {
        return "Car{" +
                "markName='" + markName + '\'' +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
