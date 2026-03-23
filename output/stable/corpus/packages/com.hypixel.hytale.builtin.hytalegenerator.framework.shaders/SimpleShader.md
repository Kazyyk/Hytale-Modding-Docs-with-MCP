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
