void setup()
{ 
  size(600,600);
  strokeWeight(1);
  background(88, 71, 125);
}

int startX = 150;
int startY = 0;
int endX = 150;
int endY = 0;

void draw()
{

  
  stroke(235, 235, 235);
  while (endY<590){
    endX = startX + (int)(Math.random()* 18-9);
    endY = startY + (int)(Math.random()* 25);
    line(startX,startY,endX,endY);
    startX = endX;
    startY = endY;
  }

}
void mousePressed()
{
	startX = (int)(Math.random()* 590);
	startY = 0;
	endX = 150;
	endY = 0;
}

