package ie.tudublin;

import processing.core.PApplet;

public class BugZapp extends PApplet
{	

    float playerX = 20;
    float playerY = 50;
    float playerWidth = 30;


	public void settings()
	{
		size(500, 500);
	}

	public void setup() {

	}

	/*
	public void draw() {
		background(0, 0, 255);
		stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
		triangle(10, 10, 100, 90, 200, 200); // vertices	
	}	
    */
	
	public void draw()
	{	
		
        background(128);
        drawPlayer(playerX,playerY,playerWidth);
		
    }

    public void drawPlayer(float x, float y, float w){
        
        stroke(0,0,255);
        rect(x,y,w,y+10);
        stroke(255,0,0);
        rect(x+10,y,w - 20,y+25);

    }

    public void keyPressed()
    {
        if(keyCode == LEFT)
        {
            if(playerX != 0)
            {
                playerX = playerX - 3;
            }
            
        }
        if (keyCode == RIGHT)
        {
            if(playerX != 462)
            {
                playerX = playerX + 3;
            }
        }
        if(key == ' ')
        {
            line(10,10, 10, 100); 
        }
    }
   
}
