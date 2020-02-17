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
<<<<<<< HEAD
>>>>>>> 128c1157624554f06e8e3f01c6aac100db7ed36e
	}
=======
    }
>>>>>>> eb73adade4ee29c79cd5220fe94af6f2d6fec7c9
    
    public void dogsCats()
    {
        // Polymorphism means
        // The type is a superclass, the instance is a subclass

        // This is not polymorphism
        Cat topcat = new Cat("Topcat");

<<<<<<< HEAD
        Main main = new Main();
<<<<<<< HEAD
		main.BugZapp();
=======
		main.loops();
>>>>>>> 128c1157624554f06e8e3f01c6aac100db7ed36e
=======
        // This is polymorphism!
        Animal mino = new Cat("Mino");
        // A vitual method!
        // Dynamic binding
        mino.speak();
        // This wont compile!!
        //System.out.println(mino.getNumLives());
        // This is an example of a cast
        System.out.println(((Cat)mino).getNumLives());

        mino = new Dog("Misty");  // This will compile!
        //topcat = new Dog("Tara"); // This wont compile!

        Animal a = new Cat("a");
        Animal b = new Cat("b");
>>>>>>> eb73adade4ee29c79cd5220fe94af6f2d6fec7c9
        
        System.out.println(a);
        System.out.println(b);

        a = b;

        a.setName("c");

        System.out.println(a);
        System.out.println(b);

        // c c will get printed out because 
        // a & b are object references

    }
    
    public static void main(String[] arg)
    {
        Main main = new Main();
		main.loops();        
    }
}