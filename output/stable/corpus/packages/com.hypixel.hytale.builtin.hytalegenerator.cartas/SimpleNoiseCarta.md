# SimpleNoiseCarta

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.cartas | Extends: BiCarta

public class SimpleNoiseCarta<T> extends BiCarta<T>

Utility type in the `cartas` subsystem.

## Methods

- put(DoubleRange range, T value) | SimpleNoiseCarta<T> | Instance method.
- apply(int x, int z, WorkerIndexer.Id id) | T | Instance method.
- allPossibleValues() | List<T> | Instance method.

Complete API:
  public SimpleNoiseCarta<T> put(DoubleRange range, T value)
  public T apply(int x, int z, WorkerIndexer.Id id)
  public List<T> allPossibleValues()

Fields:
private final Density density
private final DoubleRangeMap<T> rangeMap
private final T defaultValue
