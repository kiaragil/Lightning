PImage photo;
void setup()
{ 
  size(600,600);
  strokeWeight(4);
  photo = loadImage("thorhammer2.gif");

}

int startX = mouseX+100;
int startY = 0;
int endX = 150;
int endY = 0;

void draw()
{
	background(0,0,0);
	image(photo, mouseX, mouseY);
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
void mousePressed()
{
	startX = (int)(Math.random()* mouseX+100);
	startY = 0;
	endX = 150;
	endY = 0;
}



void hammer(){
	  	  
	  
}