import java.awt.Color;


public class Global {
    public static int TITLE_BAR_WIDTH = 15;
    public static int SCREEN_WIDTH = 900;
    public static int SCREEN_HEIGHT = 700;
    public static int DX = 0;
    public static int DY = 3;
    public static int GRAVITY = 9;
    public static int TIME_TICK = 20;
    public static float DIAMETER = 50;
    public static float ELASTICITY_C = .9f;
    public static float FRICTION = .1f;
    public static float MOUSE_DAMPENER = .1f;
    public static float DENSITY = .2f;
    public static float BALL_WEIGHT = DIAMETER*DENSITY;
    public static float D_OMEGA = (float)((-1/(DIAMETER/2))*(180/Math.PI)); //ratio of angular velocity over velocity
    public static float TRACTOR_BEAM_CONSTANT_VELO = 5;
    public static Color B_COLOR = Color.MAGENTA;
    public static Color BGROUND_COLOR = Color.black;
    public static Color L_COLOR = Color.cyan;
    public static Color TRAJECTORY_COLOR = Color.green;
}
