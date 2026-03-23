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
