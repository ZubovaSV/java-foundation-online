package ru.itsjava.object;

public class Car {
    private final String model;
    private final int wheelsCount;

    public Car(String model, int wheelsCount) {
        this.model = model;
        this.wheelsCount = wheelsCount;
    }

    public String getModel() {
        return this.model;
    }

    public int getWheelsCount() {
        return this.wheelsCount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Car)) return false;
        final Car other = (Car) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$model = this.getModel();
        final Object other$model = other.getModel();
        if (this$model == null ? other$model != null : !this$model.equals(other$model)) return false;
        if (this.getWheelsCount() != other.getWheelsCount()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Car;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $model = this.getModel();
        result = result * PRIME + ($model == null ? 43 : $model.hashCode());
        result = result * PRIME + this.getWheelsCount();
        return result;
    }

    public String toString() {
        return "Car(model=" + this.getModel() + ", wheelsCount=" + this.getWheelsCount() + ")";
    }

//    public Car(String model, int wheelsCount) {
//        this.model = model;
//        this.wheelsCount = wheelsCount;
//
//    }
//
//    @Override
//    public String toString() {
//        return "{Model:" + model + " Wheels:" + wheelsCount+"}";
//    }
//

}
