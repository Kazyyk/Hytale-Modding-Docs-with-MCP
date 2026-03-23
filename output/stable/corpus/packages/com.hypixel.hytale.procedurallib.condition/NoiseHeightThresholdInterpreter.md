# NoiseHeightThresholdInterpreter

Type: class | Package: com.hypixel.hytale.procedurallib.condition | Extends: IHeightThresholdInterpreter

public class NoiseHeightThresholdInterpreter extends IHeightThresholdInterpreter

Noise-modulated height threshold interpreter.

Also in this package: BasicHeightThresholdInterpreter, ConstantBlockFluidCondition, ConstantIntCondition, Constants, DefaultCoordinateCondition, DefaultCoordinateRndCondition, DefaultDoubleCondition, DefaultDoubleThresholdCondition, DoubleThreshold, DoubleThresholdCondition, HeightCondition, HeightThresholdCoordinateCondition, IBlockFluidCondition, ICoordinateCondition, ICoordinateRndCondition, IDoubleCondition, IDoubleThreshold, IHeightThresholdInterpreter, IIntCondition, Multiple (and 3 more)

Complete API:
  public int getLowestNonOne()
  public int getHighestNonZero()
  protected double noise(int seed, double x, double y)
  public double getContext(int seed, double x, double y)
  public int getLength()
  public float getThreshold(int seed, double x, double z, int height)
  public float getThreshold(int seed, double x, double z, int height, double context)
  static float lerp(float from, float to, float t)
  private static void checkInterpreterLength(IHeightThresholdInterpreter[] values)
  public String toString()

Fields:
protected final NoiseProperty noise
protected final float[] keys
protected final IHeightThresholdInterpreter[] values
protected final int length
protected final int lowestNonOne
protected final int highestNonZero
