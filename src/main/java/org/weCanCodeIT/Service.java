package org.weCanCodeIT;

public class Service implements ServiceInterface {

    //Inheritance-- OilChange and BasicInspection inherits from Service.  They both have access to the public and
    // protected attributes and methods contained here.

    private String customerProblem;
    private String estimate = "";

    public Service() {

    }

    protected String getCustomerProblem() {
        return customerProblem;
    }

    //The next two methods represent polymorphism as they can implement these two methods differently that something
    //else that may implement them.
    @Override
    public void stateProblem(String problem) {
        this.customerProblem = problem;
    }

    @Override
    public String getEstimate() {
        return this.estimate;
    }
}
