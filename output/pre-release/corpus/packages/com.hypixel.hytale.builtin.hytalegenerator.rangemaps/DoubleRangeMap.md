# DoubleRangeMap

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.rangemaps

public class DoubleRangeMap<T>

Utility type in the `rangemaps` subsystem.

## Accessors

- get(double k) | T | Accessor method.

## Methods

- ranges() | List<DoubleRange> | Instance method.
- values() | List<T> | Instance method.
- put(DoubleRange range, T value) | void | Instance method.
- size() | int | Instance method.

Also in this package: DoubleRange

Complete API:
  public T get(double k)
  public List<DoubleRange> ranges()
  public List<T> values()
  public void put(DoubleRange range, T value)
  public int size()

Fields:
private ArrayList<DoubleRange> ranges
private ArrayList<T> values
