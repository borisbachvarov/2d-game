package jade;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.opengl.GL11C.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11C.glClear;

public class JoyStickListener {
    public static void main(String[] args) {



        GLFW.glfwTerminate();

        String joystickName = GLFW.glfwGetJoystickName(GLFW.GLFW_JOYSTICK_1);
        System.out.println("Joystick 1: " + joystickName);



//        private void loop() {
//            GL.createCapabilities();
//
//            while (!GLFW.glfwWindowShouldClose(window)) {
//                // Clear the framebuffer
//                glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); // clear the framebuffer
//
//                // Poll for joystick input
//                if (GLFW.glfwJoystickPresent(GLFW.GLFW_JOYSTICK_1)) {
//                    FloatBuffer axes = GLFW.glfwGetJoystickAxes(GLFW.GLFW_JOYSTICK_1);
//                    ByteBuffer buttons = GLFW.glfwGetJoystickButtons(GLFW.GLFW_JOYSTICK_1);
//
//                    if (axes != null) {
//                        for (int i = 0; i < axes.limit(); i++) {
//                            System.out.println("Axis " + i + ": " + axes.get(i));
//                        }
//                    }
//
//                    if (buttons != null) {
//                        for (int i = 0; i < buttons.limit(); i++) {
//                            int state = buttons.get(i);
//                            System.out.println("Button " + i + ": " + (state == GLFW.GLFW_PRESS ? "Pressed" : "Released"));
//                        }
//                    }
//                }
//
//                GLFW.glfwSwapBuffers(window); // swap the color buffers
//
//                // Poll for window events. The key callback will only be
//                // invoked during this call.
//                GLFW.glfwPollEvents();
//            }
//        }



    }

}
