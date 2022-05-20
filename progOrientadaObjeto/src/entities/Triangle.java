package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	// Area of triangle formula >>>  area = sqrt p(p-a)(p-b)(p-c) where p=(a+b+C)/2	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
}
