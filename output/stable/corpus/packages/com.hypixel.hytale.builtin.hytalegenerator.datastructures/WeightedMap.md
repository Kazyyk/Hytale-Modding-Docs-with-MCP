# WeightedMap

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.datastructures

public class WeightedMap<T>

Class in the datastructures subsystem.

## Fields

- elementSet | Set<T> | final Set<T> field.
- elements | List<T> | final List<T> field.
- weights | List<Double> | final List<Double> field.
- indices | Map<T, Integer> | final Map<T, Integer> field.
- totalWeight | double | double field.
- immutable | boolean | boolean field.

## Constructors

- WeightedMap(@Nonnull WeightedMap<T> other) | Creates a new WeightedMap instance.
- WeightedMap() | Creates a new WeightedMap instance.
- WeightedMap(int initialCapacity) | Creates a new WeightedMap instance.

## Methods

- add(@Nonnull T element, double weight) | WeightedMap<T> | public method.
- get(@Nonnull T element) | double | public method.
- pick(@Nonnull Random rand) | T | public method.
- size() | int | public method.
- allElements() | List<T> | public method.
- makeImmutable() | void | public method.
- isImmutable() | boolean | public method.
- forEach(@Nonnull BiConsumer<T, Double> consumer) | void | public method.
- toString() | String | public method.
