package ogl.vecmath;

import java.nio.FloatBuffer;

import ogl.vecmathimp.ColorImp;


public interface Color {

  /**
   * @return the r
   */
  public abstract float getR();
  
  /**
   * @return the g
   */
  public abstract float getG();
  
  /**
   * @return the b
   */
  public abstract float getB();
  /**
   * Test this color for blackness.
   * 
   * @return True if black, else false.
   */
  public abstract boolean isBlack();

  /**
   * Calculate the sum of two colors.
   * 
   * @param c
   *          The second color.
   * @return The sum.
   */
  public abstract Color add(ColorImp c);

  /**
   * Calculate the product of this color an a scalar.
   * 
   * @param s
   *          The scalar.
   * @return The product.
   */
  public abstract Color modulate(float s);

  /**
   * Perform the component wise multiplication of two colors. This is not a dot
   * product!
   * 
   * @param c
   *          The second color.
   * @return The result of the multiplication.
   */
  public abstract Color modulate(ColorImp c);

  /**
   * Clip the color components to the interval [0.0, 1.0].
   * 
   * @return The clipped color.
   */
  public abstract Color clip();

  public abstract float[] asArray();

  public abstract FloatBuffer asBuffer();

  public abstract void fillBuffer(FloatBuffer buf);

  /**
   * Return this color in a packed pixel format suitable for use with AWT.
   * 
   * @return The color as a packed pixel integer value.
   */
  public abstract int toAwtColor();

  /*
   * @see java.lang.Object#toString()
   */
  public abstract String toString();

  public abstract boolean equals(final Object o);

  public abstract int compareTo(Color o);

  public abstract int size();

}