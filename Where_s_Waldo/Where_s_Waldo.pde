void setup() {
      PImage waldo = loadImage("2_wheres_waldo_now.jpg"); // 5. Change this to match your file name.
      size(500, 500);
      image(waldo, 0, 0);
     doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
     woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");
}

void draw() {
      // 6. Use this print statement to find out the coordinates of Waldo
       println("X: " + mouseX + " Y: " + mouseY); 

      // 7. If the mouse is on Waldo, print “Waldo found!”
      if(mouseX>=130&&mouseX<=170&&mouseY>=140&&mouseX<=180&&mousePressed){
        println("Waldo Found!");
         playWoohoo();
      }
      // 8. If Waldo is found, also use the method below to play “Woohoo”
     
      // Change the name of the sound file if you need to
      // 9. If the mouse is pressed and they’re not on Waldo, play “Doh”
     else if(mousePressed){
         playDoh();
     }
      // Change the name of the sound file if you need to
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;