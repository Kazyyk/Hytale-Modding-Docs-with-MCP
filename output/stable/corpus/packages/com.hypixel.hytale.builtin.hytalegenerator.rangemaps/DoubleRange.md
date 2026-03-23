# DoubleRange

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.rangemaps

public class DoubleRange

Utility type in the `rangemaps` subsystem.

## Static Methods

- inclusive(double min, double max) | DoubleRange | Static utility method.
- exclusive(double min, double max) | DoubleRange | Static utility method.

## Accessors

- getMin() | double | Accessor method.
- isInclusiveMin() | boolean | Boolean accessor.
- getMax() | double | Accessor method.
- isInclusiveMax() | boolean | Boolean accessor.

## Methods

- includes(double v) | boolean | Instance method.

Also in this package: DoubleRangeMap

Complete API:
  public double getMin()
  public boolean isInclusiveMin()
  public double getMax()
  public boolean isInclusiveMax()
  public boolean includes(double v)
  public static DoubleRange inclusive(double min, double max)
  public static DoubleRange exclusive(double min, double max)

Fields:
private double min
private double max
private boolean inclusiveMin
private boolean inclusiveMax
