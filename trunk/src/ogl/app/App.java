package ogl.app;

/**
 * Interface to be implemented by OpenGL applications that are used with the
 * <code>OpenGLApp</code> class.
 */
public interface App {

  /**
   * Override to initialize OpenGL. Everything that only needs to be done once
   * at application initialization should happen here.
   * 
   * @param gl
   *          The OpenGL context.
   */
  public void init();

  /**
   * Override to advance the simulation. Called once per frame.
   * 
   * @param elapsed
   *          The elapsed time since the last call.
   * @param input
   *          The current input state.
   */
  public void simulate(float elapsed, Input input);

  /**
   * Override to render the scene. Called once for each frame.
   * 
   * @param width
   *          Width of the canvas.
   * @param height
   *          Height of the canvas.
   * @param gl
   *          The OpenGL context.
   */
  public void display(int width, int height);
}
