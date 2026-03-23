# WeighedShader

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.shaders | Implements: Shader<T>

public class WeighedShader<T> implements Shader<T>

Implementation of `Shader<T>`.

## Constructors

- WeighedShader(@Nonnull Shader<T> initialChild, double weight) | Creates a new WeighedShader instance.

## Methods

- add(@Nonnull Shader<T> child, double weight) | WeighedShader<T> | public method.
- setSeed(long seed) | WeighedShader<T> | public method.
- shade(T current, long seed) | T | public method.
- shade(T current, long seedA, long seedB) | T | public method.
- shade(T current, long seedA, long seedB, long seedC) | T | public method.
- toString() | String | public method.

Also in this package: Builder, MaskShader, RelationalShader, Shader, SimpleShader

Complete API:
  public WeighedShader<T> add(Shader<T> child, double weight)
  public WeighedShader<T> setSeed(long seed)
  public T shade(T current, long seed)
  public T shade(T current, long seedA, long seedB)
  public T shade(T current, long seedA, long seedB, long seedC)
  public String toString()

Fields:
private final WeightedMap<Shader<T>> childrenWeightedMap
private SeedGenerator seedGenerator
