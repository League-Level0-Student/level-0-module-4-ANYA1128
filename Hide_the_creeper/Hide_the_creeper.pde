PImage creeper;
void draw(){
  PImage minecraft = loadImage("PREVIEW_SCREENSHOT4_62492.jpg");  
  minecraft.resize(1920, 1080);          
background(minecraft);
  image(creeper, mouseX, mouseY); 
}
void setup(){
  size (1920,1080);

  
creeper=loadImage("11564475-2144539805526037.jpg"); 
creeper.resize(70, 75);

}