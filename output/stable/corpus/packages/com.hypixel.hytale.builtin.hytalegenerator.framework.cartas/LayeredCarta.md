# LayeredCarta

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.cartas | Extends: TriCarta<R>

public class LayeredCarta<R> extends TriCarta<R>

Concrete implementation extending `TriCarta<R>`.

## Fields

- layers | List<TriCarta<R>> | final List<TriCarta<R>> field.
- allValues | List<R> | final List<R> field.
- defaultValue | R | final R field.

## Constructors

- LayeredCarta(@Nonnull R defaultValue) | Creates a new LayeredCarta instance.

## Methods

- apply(int x, int y, int z, @Nonnull WorkerIndexer.Id id) | R | public method.
- allPossibleValues() | List<R> | public method.
- addLayer(@Nonnull TriCarta<R> layer) | LayeredCarta<R> | public method.
- toString() | String | public method.

Also in this package: Builder, ImageCarta, SingleElementCarta

Complete API:
  public R apply(int x, int y, int z, WorkerIndexer.Id id)
  public List<R> allPossibleValues()
  public LayeredCarta<R> addLayer(TriCarta<R> layer)
  public String toString()

Fields:
private final List<TriCarta<R>> layers
private final List<R> allValues
private final R defaultValue
