package com.xyzcorp;

/**
 * @author Daniel Hinojosa
 * @since 11/22/13 9:33 AM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 *        tel: 505.363.5832
 */
public class Employee {
    private double pay;
	private String firstName;
	private String lastName;
	
    public Employee(String firstName, String lastName, double pay) {
        this.pay = pay;
		this.firstName = firstName;
		this.lastName = lastName;
    }
	
	public String getEmployee(){
		return this.firstName + " " + this.lastName;
	}

	
    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
}
