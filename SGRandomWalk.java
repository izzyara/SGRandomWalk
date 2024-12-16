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
        
        double distance = 0;
        int steps = 0;
        while(distance<50){
            int vertical = (int)(Math.random()*21)-10;
            int horizontal = (int)(Math.random()*21)-10;
            max.translate(vertical, horizontal);
            steps ++;
            try { Thread.sleep(100);}
            catch(Exception ex) {};
            distance = Math.sqrt(Math.pow(max.getX()-150,2)+Math.pow(max.getY()-150,2));
            if (distance>50){
                System.out.print("Escaped in " + steps + " steps");
            }

        }

   
    }
}