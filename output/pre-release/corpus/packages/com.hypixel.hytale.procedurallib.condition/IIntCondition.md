# IIntCondition

Type: interface | Package: com.hypixel.hytale.procedurallib.condition

public interface IIntCondition

Condition evaluating an integer value.

Known implementors: ConstantIntCondition, HashSetIntCondition

Also in this package: BasicHeightThresholdInterpreter, ConstantBlockFluidCondition, ConstantIntCondition, Constants, DefaultCoordinateCondition, DefaultCoordinateRndCondition, DefaultDoubleCondition, DefaultDoubleThresholdCondition, DoubleThreshold, DoubleThresholdCondition, HeightCondition, HeightThresholdCoordinateCondition, IBlockFluidCondition, ICoordinateCondition, ICoordinateRndCondition, IDoubleCondition, IDoubleThreshold, IHeightThresholdInterpreter, Multiple, NoiseHeightThresholdInterpreter (and 3 more)

Complete API:
  boolean eval(int var1)
  default boolean eval(int seed, IntToIntFunction seedFunction)
