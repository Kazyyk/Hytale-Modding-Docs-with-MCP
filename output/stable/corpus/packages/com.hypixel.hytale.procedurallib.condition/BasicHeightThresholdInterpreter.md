# BasicHeightThresholdInterpreter

Type: class | Package: com.hypixel.hytale.procedurallib.condition | Extends: IHeightThresholdInterpreter

public class BasicHeightThresholdInterpreter extends IHeightThresholdInterpreter

Height threshold interpreter with interpolated values.

Also in this package: ConstantBlockFluidCondition, ConstantIntCondition, Constants, DefaultCoordinateCondition, DefaultCoordinateRndCondition, DefaultDoubleCondition, DefaultDoubleThresholdCondition, DoubleThreshold, DoubleThresholdCondition, HeightCondition, HeightThresholdCoordinateCondition, IBlockFluidCondition, ICoordinateCondition, ICoordinateRndCondition, IDoubleCondition, IDoubleThreshold, IHeightThresholdInterpreter, IIntCondition, Multiple, NoiseHeightThresholdInterpreter (and 3 more)

Complete API:
  public int getLowestNonOne()
  public int getHighestNonZero()
  public double getContext(int seed, double x, double y)
  public int getLength()
  public float getThreshold(int seed, double x, double y, int height)
  public float getThreshold(int seed, double x, double y, int height, double context)
  public String toString()

Fields:
protected final float[] interpolatedThresholds
protected final int lowestNonOne
protected final int highestNonZero
