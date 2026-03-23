# MaskShader

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.shaders | Implements: Shader<T>

public class MaskShader<T> implements Shader<T>

Implementation of `Shader<T>`.

## Fields

- childShader | Shader<T> | final Shader<T> field.
- mask | Predicate<T> | final Predicate<T> field.
- seedGenerator | SeedGenerator | SeedGenerator field.

## Constructors

- MaskShader(Predicate<T> mask, Shader<T> childShader, long seed) | Creates a new MaskShader instance.

## Methods

- builder(@Nonnull Class<T> dataType) | MaskShader.Builder<T> | static public method.
- shade(T current, long seed) | T | public method.
- shade(T current, long seedA, long seedB) | T | public method.
- shade(T current, long seedA, long seedB, long seedC) | T | public method.
- toString() | String | public method.

Also in this package: Builder, RelationalShader, Shader, SimpleShader, WeighedShader

Complete API:
  public static MaskShader.Builder<T> builder(Class<T> dataType)
  public T shade(T current, long seed)
  public T shade(T current, long seedA, long seedB)
  public T shade(T current, long seedA, long seedB, long seedC)
  public String toString()

Fields:
private final Shader<T> childShader
private final Predicate<T> mask
private SeedGenerator seedGenerator
