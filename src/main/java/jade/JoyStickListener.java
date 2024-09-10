package jade;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.opengl.GL11C.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11C.glClear;

public class JoyStickListener {
    private static JoyStickListener instance;

    private boolean buttonPressed[] = new boolean[350];

    private JoyStickListener () {

    }
    public static JoyStickListener get() {

        if (JoyStickListener.instance == null){
            JoyStickListener.instance = new JoyStickListener();
        }

        GLFW.glfwTerminate();

        String joystickName = GLFW.glfwGetJoystickName(GLFW.GLFW_JOYSTICK_1);
        System.out.println("Joystick 1: " + joystickName);

        return JoyStickListener.instance;
    }


}
