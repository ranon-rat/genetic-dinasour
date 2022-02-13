import java.awt.*;
import java.util.ArrayList;

public class Game {
    public int width = 600;
    public int height = 600;
    // this is for testing for now, later I will generate more obstacles
    Obstacle obs = new Obstacle("duck", width);
    Dinosaur dino = new Dinosaur();
    ArrayList<Double> input = new ArrayList<>();
    // the list of possible obstacles for use it later
    String[] options = {"duck"};// {"big cactus","two big cactus","three big cactus","small cactus","two small cactus","three small cactus","duck"};
    Brain b = new Brain();//when I create the population I will delete this

    public void clean(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);
    }

    Game() {
        for (int i = 0; i < b.input; i++)
            input.add(Math.random() * 10);
    }

    public void update(Graphics2D g) {
        clean(g);


        for (Double i : b.result()) {
            System.out.println(i);
        }
        b.passToInput(input);

        b.show(g, this);
        b.clearNodes();
        /*
        g.setColor(Color.black);
        obs.show(g, height);
        dino.show(g, height);
        g.drawString("" + dino.score, 40, 40);
        if (Math.random() < 0.1) {
            boolean bigJump = Math.random() > 0.5;
            dino.jump(bigJump);
        }
        if (Math.random() < 0.1) {
            dino.duck();
        }
        obs.isOnArea(dino);
        if (obs.x < -obs.width) {
            obs = new Obstacle(options[(int) (Math.random() * options.length)], width);

        }*/
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }


    }


}

