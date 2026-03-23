# DefaultCoordinateCondition

Type: class | Package: com.hypixel.hytale.procedurallib.condition | Extends: ICoordinateCondition

public class DefaultCoordinateCondition extends ICoordinateCondition

Default constant-result coordinate condition.

Also in this package: BasicHeightThresholdInterpreter, ConstantBlockFluidCondition, ConstantIntCondition, Constants, DefaultCoordinateRndCondition, DefaultDoubleCondition, DefaultDoubleThresholdCondition, DoubleThreshold, DoubleThresholdCondition, HeightCondition, HeightThresholdCoordinateCondition, IBlockFluidCondition, ICoordinateCondition, ICoordinateRndCondition, IDoubleCondition, IDoubleThreshold, IHeightThresholdInterpreter, IIntCondition, Multiple, NoiseHeightThresholdInterpreter (and 3 more)

Complete API:
  public boolean getResult()
  public boolean eval(int seed, int x, int y)
  public boolean eval(int seed, int x, int y, int z)
  public String toString()

Fields:
public static final DefaultCoordinateCondition DEFAULT_TRUE
public static final DefaultCoordinateCondition DEFAULT_FALSE
protected final boolean result
