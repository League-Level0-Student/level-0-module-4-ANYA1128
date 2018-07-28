int x = 150;
int y = 350;
PImage creeper;
void draw(){
  PImage minecraft = loadImage("PREVIEW_SCREENSHOT4_62492.jpg");  
  minecraft.resize(1920, 1080);          
background(minecraft);
  image(creeper,x,y);
 
    if(mouseX==10 && mouseY==10){
    fill(#70CE7C);
    ellipse(mouseX,mouseY,35,35);
  }
 if(mousePressed){
if(mouseX>=x&&mouseX<=x+70 && mouseY>=y&&mouseY<=y+75){
    fill(#70CE7C);
    text("You found the creeper!",500,300);
    textSize(100);
 
  }else{
   fill(#FF0808);
 
  }
     ellipse(mouseX,mouseY,35,35);
 }

}
void setup(){
  size (1920,1080);

  
creeper=loadImage("11564475-2144539805526037.jpg"); 
creeper.resize(70, 75);

}