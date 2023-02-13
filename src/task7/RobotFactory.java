package task7;

import task7.manufacture.Robot;

public class RobotFactory {

    public void run(int count) {
        Robot[] robots = new Robot[count];
        Robot robot = new Robot();
        for (int i = 0; i < robots.length; i++) {
            robot.createRobot();
            robots[i] = robot;
            System.out.println(robot);
        }
    }
}
