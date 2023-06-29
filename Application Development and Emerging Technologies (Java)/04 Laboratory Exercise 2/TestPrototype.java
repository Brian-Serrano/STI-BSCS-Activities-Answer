class Shape implements Cloneable{
    private int x;
    private int y;
    private String color;
    
    public int getX(){
    	return x;
    }
    public void setX(int x){
    	this.x = x;
    }
    public int getY(){
    	return y;
    }
    public void setY(int y){
    	this.y = y;
    }
    public String getColor(){
    	return color;
    }
    public void setColor(String color){
    	this.color = color;
    }
    public Shape(){
    	color = "orange";
    	x = 50;
    	y = 55;
    }
    @Override
	public String toString() {
    	return "Color is: " + color + " X is: " + x + " Y is: " + y;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Rectangle extends Shape{
	private int width;
	private int height;
	public int getWidth(){
    	return width;
    }
    public void setWidth(int width){
    	this.width = width;
    }
    public int getHeight(){
    	return height;
    }
    public void setHeight(int height){
    	this.height = height;
    }
	public Rectangle(){
		width = 25;
		height = 30;
	}

    @Override
	public String toString() {
    	return super.toString() + " Width is: " + width + " Height is: " + height;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException  {
		return super.clone();
	}
}
class Circle extends Shape{
	private int radius;
	public int getRadius(){
    	return radius;
    }
    public void setRadius(int radius){
    	this.radius = radius;
    }
	public Circle(){
		radius = 35;
	}
    @Override
	public String toString() {
    	return super.toString() + " Radius is: " + radius;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException  {
		return super.clone();
	}
}

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {

    	Rectangle r = new Rectangle();
    	System.out.println(r);

    	Circle c = new Circle();
    	System.out.println(c);

    	Rectangle r1 = (Rectangle)r.clone();
    	r1.setColor("blue");
    	r1.setWidth(35);
    	System.out.println(r1);

    	Circle c1 = (Circle)c.clone();
    	c1.setColor("red");
    	c1.setY(45);
    	System.out.println(c1);

    	Rectangle r2 = (Rectangle)r.clone();
    	r2.setX(60);
    	r2.setHeight(40);
    	System.out.println(r2);

    	Circle c2 = (Circle)c.clone();
    	c2.setRadius(30);
    	c2.setX(30);
    	System.out.println(c2);

	}

}