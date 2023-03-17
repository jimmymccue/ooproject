package org.weCanCodeIT;

public class ConventionalOilChange extends OilChange {

    //Inheritance-- ConventionalOilChange inherits from OilChange and Service.  It has access to the public and
    // protected methods that they have.

    public ConventionalOilChange() {
    }

    public void setCost() {
        super.cost = 60;
    }
}
