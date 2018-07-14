void setup(){
 size(1000,1000); 
}
void draw(){
background(#CBCBCB);
  int x = mouseX;
int y = mouseY;
  if(mouseY>510){
   y = 510;
}
 else if(mouseY<475){
   y = 475;
}
if(mouseX>350){
   x = 350;
}
else if(mouseX<250){
   x=250;
}
fill(#FFFFFF);
ellipse(300,500,150,100);
ellipse(700,500,150,100);
fill(#050505);
ellipse(x,y,50,50);

ellipse(x+400,y,50,50);

}