package ie.tudublin;

import processing.core.PApplet;
import java.util.Arrays;

public class Arrays extends PApplet
{	
	//example of arrays
	//float[] rainFall = new float[12];
	float[] rainFall = {45,37,555,27,38,50,79,48,104,31,300,58};
	String[] months = {"Jan", "Feb", "Mar","Apr", "May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for(int i = 0 ; i < rainFall.length; i++)
		{
			println(months[i] + "\t" + rainFall[i]);
		}
		/*
		for(float f:rainFall)
		{
			println(f);//prints all elements of rainfall array
		}*/

		/*for(String s:months)
		{
			println(s);
		}*/

		int maxIndex=0;
		int minIndex = 0;

		for(int i = 0 ; i < rainFall.length; i++)
		{
			if(rainFall[i] < rainFall[minIndex])
			{
				minIndex = i;
			}

			if(rainFall[i] > rainFall[maxIndex]);
			{
				maxIndex = i;
			}

		}

		println(months[minIndex] + " Had the minimum rainfall of " + rainFall[minIndex]);
		println(months[maxIndex] + " Had the minimum rainfall of " + rainFall[maxIndex]);
	}

	void drawBarchart()
	{
		float w = width/rainFall.length;
		float cGap = 255/rainFall.length;
		noStroke();
		colorMode(HSB);
		for(int i = 0; i < rainFall.length; i++)
		{
			float x = i * w;
			fill(i * cGap, 255,255);
			rect(x,height, w, -rainFall[i]);

		}
		/*
		/////
		background(150);
		//int width = 500;
		//int height = 500;
		int rectX = 20;
		int rectY = 250;
		int rectWidth = 40;
		

		for(int i = 0 ; i < rainFall.length; i++)
		{
			rect(rectX,rectY,width,--rainFall[i]);
			rectX += 40;

		}
		*/
	}

	

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);	
		drawBarchart();
	}
}
