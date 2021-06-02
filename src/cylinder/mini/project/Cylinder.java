package cylinder.mini.project;

public class Cylinder implements C {
	private double radius;
	private String color;
	private double height;
	
	
	
	/**
	 * @param radius
	 * @param color
	 * @param height
	 */
	public Cylinder(double radius, String color, double height) {
		super();
		this.radius = radius;
		this.color = color;
		this.height = height;
	}

	@Override
	public double area() {
		return PI * radius* radius;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}

	@Override
	public void volume() {
		System.out.print("My volume is " + area() * height);
	}

}
