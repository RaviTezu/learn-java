// Write the code to draw a tower of blocks that looks like the one in the link below:
// http://i.imgur.com/PvIGJkL.png
    
// Name the class BlockTower. Each block has a width of 40 and a height of 30. 
// There are three rows. The upper left-hand corner of the bottom row is at (20, 70)

// Create a custom color for the topmost color where red = 125, green=125, blue = 255. 
// For all the other colors, use predefined colors. 
// The colors from top to bottom are: custom, RED, PINK, BLUE, MAGENTA, CYAN


// HINT:
// The rectangle should have the attributes:
// x: 20
// y: 70
// width: 40
// height: 30
//
// You should set the color of the rectangle to blue by using the method:
// setColor(Color.somecolor); on the rectangle object that you created
//
// Don't forget to draw the rectangle by calling the fill() function




public class BlockTower
{
   public static void main(String[] args)
   {
       Rectangle r1 = new Rectangle(60,10,40,30);
       Rectangle r2 = new Rectangle(40,40,40,30);
       Rectangle r3 = new Rectangle(80,40,40,30);
       Rectangle r4 = new Rectangle(20,70,40,30);
       Rectangle r5 = new Rectangle(60,70,40,30);
       Rectangle r6 = new Rectangle(100,70,40,30);
       Color c1 = new Color(125,125,255);
       r1.setColor(c1);
       r2.setColor(Color.RED);
       r3.setColor(Color.PINK);
       r4.setColor(Color.BLUE);
       r5.setColor(Color.MAGENTA);
       r6.setColor(Color.CYAN);
       r1.draw();
       r1.fill();
       r2.draw();
       r2.fill();
       r3.draw();
       r3.fill();
       r4.draw();
       r4.fill();
       r5.draw();
       r5.fill();
       r6.draw();
       r6.fill();
   }
}
