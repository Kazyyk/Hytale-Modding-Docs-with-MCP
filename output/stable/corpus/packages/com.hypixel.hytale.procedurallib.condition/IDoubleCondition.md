# IDoubleCondition

Type: interface | Package: com.hypixel.hytale.procedurallib.condition

public interface IDoubleCondition

Condition evaluating a double value.

Known implementors: DefaultDoubleCondition, DoubleThresholdCondition, SingleDoubleCondition

Also in this package: BasicHeightThresholdInterpreter, ConstantBlockFluidCondition, ConstantIntCondition, Constants, DefaultCoordinateCondition, DefaultCoordinateRndCondition, DefaultDoubleCondition, DefaultDoubleThresholdCondition, DoubleThreshold, DoubleThresholdCondition, HeightCondition, HeightThresholdCoordinateCondition, IBlockFluidCondition, ICoordinateCondition, ICoordinateRndCondition, IDoubleThreshold, IHeightThresholdInterpreter, IIntCondition, Multiple, NoiseHeightThresholdInterpreter (and 3 more)

Complete API:
  boolean eval(double var1)
  default boolean eval(int seed, IntToDoubleFunction seedFunction)
