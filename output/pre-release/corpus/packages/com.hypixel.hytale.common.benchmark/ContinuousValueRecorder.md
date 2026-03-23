# ContinuousValueRecorder

Type: class | Package: com.hypixel.hytale.common.benchmark

public class ContinuousValueRecorder

Class in the benchmark subsystem.

## Fields

- minValue | double | double field.
- maxValue | double | double field.
- sumValues | double | double field.
- count | long | long field.

## Methods

- reset() | void | public method.
- getMinValue(double def) | double | public method.
- getMinValue() | double | public method.
- getMaxValue(double def) | double | public method.
- getMaxValue() | double | public method.
- getCount() | long | public method.
- getAverage(double def) | double | public method.
- getAverage() | double | public method.
- record(double value) | double | public method.

Known subclasses: TimeRecorder

Also in this package: DiscreteValueRecorder, TimeDistributionRecorder, TimeRecorder

Complete API:
  public void reset()
  public double getMinValue(double def)
  public double getMinValue()
  public double getMaxValue(double def)
  public double getMaxValue()
  public long getCount()
  public double getAverage(double def)
  public double getAverage()
  public double record(double value)

Fields:
protected double minValue
protected double maxValue
protected double sumValues
protected long count
