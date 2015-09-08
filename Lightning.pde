PImage photo;
void setup()
{ 
  size(600,600);
  strokeWeight(3);
  photo = loadImage("thorhammer2.gif");

}

int startX = mouseX+13;
int startY = mouseY-100;
int endX = 0;
int endY = 1;

void draw()
{
  background(0,0,0);
  image(photo, mouseX-30, mouseY-100);
    stroke(147, 202, 219);
    while (endY > 0){
      endX = startX + (int)(Math.random()* 50-25);
      endY = startY - (int)(Math.random()* 50);
      line(startX,startY,endX, endY);
      startX = endX;
      startY = endY;

  }

}
void mousePressed()
{
  background(0,0,0);
  startX = mouseX+13;
  startY = mouseY-100;
  endX = 0;
  endY = 1;
}



void hammer(){
        
    
}
