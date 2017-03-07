/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahlbots_tutorial;

/**
 * My first tutorial robot for RoboCode, pulled from the WaybackMachine's
 * copy of Robowiki.net
 * @author david.rahl
 */

import robocode.*;

public class TutorialBot1 extends Robot {
    public void run() {
        while (true) {
            ahead(100); // Basic movement forward
            turnGunRight(360); // Rotate the turret 360 degrees
            back(100); // Basic movement backward
            turnGunRight(360); // Rotate the turret 360 degrees
        }
    }
    
    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1); // Fire on robot detection
    }
}
