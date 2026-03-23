# SingleElementCarta

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.cartas | Extends: BiCarta<R>

public class SingleElementCarta<R> extends BiCarta<R>

Concrete implementation extending `BiCarta<R>`.

## Fields

- element | R | R field.

## Constructors

- SingleElementCarta() | Creates a new SingleElementCarta instance.

## Methods

- of(@Nonnull R element) | SingleElementCarta<R> | static public method.
- apply(int x, int z, @Nonnull WorkerIndexer.Id id) | R | public method.
- allPossibleValues() | List<R> | public method.

Also in this package: Builder, ImageCarta, LayeredCarta

Complete API:
  public static SingleElementCarta<R> of(R element)
  public R apply(int x, int z, WorkerIndexer.Id id)
  public List<R> allPossibleValues()

Fields:
private R element
