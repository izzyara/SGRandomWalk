public class SGRandomWalk{

    public static void main (String[]args){
        Rectangle box = new Rectangle(0, 0, 300, 300);
        box.draw();
        box.setColor(Color.GREEN);
        box.fill();
        Ellipse ball = new Ellipse(99, 99, 102, 102);
        ball.setColor(Color.BLACK);
        ball.fill(); 
        Ellipse egg = new Ellipse(100, 100, 100, 100);
        egg.setColor(Color.WHITE);
        egg.fill(); 

        Ellipse max = new Ellipse(145,145,10,10);
        max.setColor(Color.RED);
        max.fill();   
        
        while(true){
            
        }

   
    }
}