public class Robot extends SampleRobot {
    RobotDrive myRobot = new RobotDrive(0, 1, 2, 3); // class that handles basic drive
    Joystick joystick = new Joystick(0); // set to ID 1 in DriverStation

    public Robot() {
        myRobot.setExpiration(0.1);
    }

/**
* Runs the motors with Arcade steering.
*/

    @Override
    public void operatorControl() {
        myRobot.setSafetyEnabled(true);
        while (isOperatorControl() && isEnabled()) {
            double xValue = -1 * joystick.getX();
            double yValue = -1 * joystick.getY();
            myRobot.arcadeDrive(yValue, xValue, true);
            Timer.delay(0.005); // wait for a motor update time
        }
    }
}
