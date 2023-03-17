package org.weCanCodeIT;

public class Service implements ServiceInterface {
    private String customerProblem;
    private String estimate = "";
//
//    public Service(String customerProblem) {
//    }
    public Service() {

    }
    public String getCustomerProblem() {
        return customerProblem;
    }

    @Override
    public void stateProblem(String problem) {
        this.customerProblem = problem;
    }

    @Override
    public String getEstimate() {
        return this.estimate;
    }
}
