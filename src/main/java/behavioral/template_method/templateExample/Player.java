package behavioral.template_method.templateExample;

import java.util.Random;

public class Player {

    private String name;
    private int distance;

    Player(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public void run() {
        distance += new Random().nextInt(5)+1;
    }


    String getName() {
        return name;
    }

    int getDistance() {
        return distance;
    }
}
