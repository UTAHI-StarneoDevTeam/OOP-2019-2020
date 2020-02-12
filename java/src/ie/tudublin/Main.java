package ie.tudublin;

public class Main
{

    public void BugZapp()
	{
		String[] a = {"MAIN"};
<<<<<<< HEAD
        processing.core.PApplet.runSketch( a, new BugZapp());
=======
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

    public void loops()
    {
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
    }
    
    public void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
    }
    
    public void airSeaBattle()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AirSeaBattle());
>>>>>>> 128c1157624554f06e8e3f01c6aac100db7ed36e
	}
    
    public static void main(String[] arg)
    {
        /*
        System.out.println("Hello world!");

        Animal misty = new Dog(); // Polymorphism
        misty.setName("Misty");
        System.out.println(misty.getName());  
        misty.speak();  
        Cat topcat = new Cat();
        topcat.speak();
        */

        Main main = new Main();
<<<<<<< HEAD
		main.BugZapp();
=======
		main.loops();
>>>>>>> 128c1157624554f06e8e3f01c6aac100db7ed36e
        
    }
}