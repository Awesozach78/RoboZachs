package Zero;

//I will make you great

import java.awt.*;
import robocode.Robot;
import robocode.ScannedRobotEvent;

/**
 * Created by 20171340 on 12/16/2016.
 */
public class SquareRoute extends Robot{
    @Override


    public void run(){
        ahead(250);
        turnGunRight(360);
        turnRight(90);

    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(12);
    }
}