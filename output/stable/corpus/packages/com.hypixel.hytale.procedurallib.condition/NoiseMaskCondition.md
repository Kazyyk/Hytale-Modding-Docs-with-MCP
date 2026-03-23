# NoiseMaskCondition

Type: class | Package: com.hypixel.hytale.procedurallib.condition | Extends: ICoordinateCondition

public class NoiseMaskCondition extends ICoordinateCondition

Coordinate condition using noise mask with double condition.

Also in this package: BasicHeightThresholdInterpreter, ConstantBlockFluidCondition, ConstantIntCondition, Constants, DefaultCoordinateCondition, DefaultCoordinateRndCondition, DefaultDoubleCondition, DefaultDoubleThresholdCondition, DoubleThreshold, DoubleThresholdCondition, HeightCondition, HeightThresholdCoordinateCondition, IBlockFluidCondition, ICoordinateCondition, ICoordinateRndCondition, IDoubleCondition, IDoubleThreshold, IHeightThresholdInterpreter, IIntCondition, Multiple (and 3 more)

Complete API:
  public boolean eval(int seed, int x, int y)
  public boolean eval(int seed, int x, int y, int z)
  public String toString()

Fields:
protected final NoiseProperty noiseMask
protected final IDoubleCondition condition
