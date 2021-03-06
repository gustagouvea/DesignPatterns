package abstractFactory.motorcycle;

import abstractFactory.motorcycle.Motorcycle;

public class HondaMotorcycle extends Motorcycle {

    public HondaMotorcycle() {
        setMaxSpeed(300);
    }

    public String toString(){
        return "Honda Motorcyle, MaxSpeed: " + getMaxSpeed();
    }

}
