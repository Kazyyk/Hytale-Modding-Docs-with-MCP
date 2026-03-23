# RelationalShader

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.shaders | Implements: Shader<T>

public class RelationalShader<T> implements Shader<T>

Implementation of `Shader<T>`.

## Fields

- relations | Map<T, Shader<T>> | final Map<T, Shader<T>> field.
- onMissingKey | Shader<T> | final Shader<T> field.

## Constructors

- RelationalShader(@Nonnull Shader<T> onMissingKey) | Creates a new RelationalShader instance.

## Methods

- addRelation(@Nonnull T key, @Nonnull Shader<T> value) | RelationalShader<T> | public method.
- shade(T current, long seed) | T | public method.
- shade(T current, long seedA, long seedB) | T | public method.
- shade(T current, long seedA, long seedB, long seedC) | T | public method.
- toString() | String | public method.

Also in this package: Builder, MaskShader, Shader, SimpleShader, WeighedShader

Complete API:
  public RelationalShader<T> addRelation(T key, Shader<T> value)
  public T shade(T current, long seed)
  public T shade(T current, long seedA, long seedB)
  public T shade(T current, long seedA, long seedB, long seedC)
  public String toString()

Fields:
private final Map<T,Shader<T>> relations
private final Shader<T> onMissingKey
