package org.weCanCodeIT;

public abstract class OilChange extends Service {

    //Inheritance-- Oil Change inherits from Service, thus it has access to the public and protected methods.
    //OilChange is a parent of ConventionalOilChange and SyntheticOilChange and therefore lends it public and protected
    //methods to them.

    protected int cost;

    public void setCost() {

    }

    public int getCost() {
        return this.cost;
    }
}
