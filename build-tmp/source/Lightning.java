import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

PImage photo;
public void setup()
{ 
  size(600,600);
  strokeWeight(3);
  photo = loadImage("thorhammer2.gif");

}

int startX = mouseX+15;
int startY = mouseY-95;
int endX = 0;
int endY = 1;

public void draw()
{
	background(0,0,0);
	image(photo, mouseX-30, mouseY-100);
  	stroke(147, 202, 219);
  	while (endY > 0){
    	endX = startX + (int)(Math.random()* 50-25);
    	endY = startY - (int)(Math.random()* 50);
    	
    	line(startX-20,startY-20,endX-20,endY-20);
    	line(startX,startY,endX, endY);
    	startX = endX;
    	startY = endY;

  }

}
public void mousePressed()
{
	startX = mouseX+15;
	startY = mouseY-95;
	endX = 0;
	endY = 1;
}



public void hammer(){
	  	  
	  
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
