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
  strokeWeight(4);

}

int startX = mouseX+100;
int startY = 0;
int endX = 150;
int endY = 0;

public void draw()
{
	hammer();
  	stroke(235, 235, 235);
  	while (endY < 570){
    	endX = startX + (int)(Math.random()* 18-9);
    	endY = startY + (int)(Math.random()* 25);
    	line(startX-100,startY,endX-100,endY);
    	line(startX+100,startY,endX+100,endY);
    	startX = endX;
    	startY = endY;
  }

}
public void mousePressed()
{
	startX = (int)(Math.random()* mouseX+100);
	startY = 0;
	endX = 150;
	endY = 0;
}



public void hammer(){
	  background(0,0,0);
	  photo = loadImage("thorhammer2.gif");
	  image(photo, mouseX, mouseY);
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
