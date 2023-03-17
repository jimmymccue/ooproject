package org.weCanCodeIT;

public class BasicInspection extends Service {

    //Inheritance-- BasicInspection inherits from Service, thus it has access to the public and protected methods.
    //BasicInspection is a parent of AdvancedInspection and therefore lends it public and protected methods to them.

    //Encapsulation--Nothing else in the world cares about what a tire inspection is or how it works, but just that
    //a BasicInspection has one.
    private TireInspection tireInspection;

    public TireInspection getTireInspection() {
        return tireInspection;
    }

    public void setTireInspection(TireInspection tireInspection) {
        this.tireInspection = tireInspection;
    }
}
