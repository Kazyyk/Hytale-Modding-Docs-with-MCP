# IHeightThresholdInterpreter

Type: interface | Package: com.hypixel.hytale.procedurallib.condition

public interface IHeightThresholdInterpreter

Interpolated height-based threshold provider.

Known implementors: BasicHeightThresholdInterpreter, NoiseHeightThresholdInterpreter

Also in this package: BasicHeightThresholdInterpreter, ConstantBlockFluidCondition, ConstantIntCondition, Constants, DefaultCoordinateCondition, DefaultCoordinateRndCondition, DefaultDoubleCondition, DefaultDoubleThresholdCondition, DoubleThreshold, DoubleThresholdCondition, HeightCondition, HeightThresholdCoordinateCondition, IBlockFluidCondition, ICoordinateCondition, ICoordinateRndCondition, IDoubleCondition, IDoubleThreshold, IIntCondition, Multiple, NoiseHeightThresholdInterpreter (and 3 more)

Complete API:
  int getLowestNonOne()
  int getHighestNonZero()
  float getThreshold(int var1, double var2, double var4, int var6)
  float getThreshold(int var1, double var2, double var4, int var6, double var7)
  double getContext(int var1, double var2, double var4)
  int getLength()
  default boolean isSpawnable(int height)
  static float lerp(float from, float to, float t)
