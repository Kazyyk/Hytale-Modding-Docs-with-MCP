# SimpleShader

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.shaders | Implements: Shader<T>

public class SimpleShader<T> implements Shader<T>

Implementation of `Shader<T>`.

## Fields

- value | T | final T field.

## Constructors

- SimpleShader(@Nonnull T value) | Creates a new SimpleShader instance.

## Methods

- of(@Nonnull T value) | SimpleShader<T> | static public method.
- shade(T current, long seed) | T | public method.
- shade(T current, long seedA, long seedB) | T | public method.
- shade(T current, long seedA, long seedB, long seedC) | T | public method.
- toString() | String | public method.

Also in this package: Builder, MaskShader, RelationalShader, Shader, WeighedShader

Complete API:
  public static SimpleShader<T> of(T value)
  public T shade(T current, long seed)
  public T shade(T current, long seedA, long seedB)
  public T shade(T current, long seedA, long seedB, long seedC)
  public String toString()

Fields:
private final T value
