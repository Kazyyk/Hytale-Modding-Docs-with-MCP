# RelativeVector2l

Type: class | Package: com.hypixel.hytale.math.vector.relative

public class RelativeVector2l

Class in the relative subsystem.

## Fields

- vector | Vector2l | Vector2l field.
- relative | boolean | boolean field.

## Constructors

- RelativeVector2l(@Nonnull Vector2l vector, boolean relative) | Creates a new RelativeVector2l instance.
- RelativeVector2l() | Creates a new RelativeVector2l instance.

## Methods

- getVector() | Vector2l | public method.
- isRelative() | boolean | public method.
- resolve(@Nonnull Vector2l vector) | Vector2l | public method.
- equals(@Nullable Object o) | boolean | public method.
- hashCode() | int | public method.
- toString() | String | public method.

Also in this package: RelativeVector2d, RelativeVector2i, RelativeVector3d, RelativeVector3i, RelativeVector3l

Complete API:
  public Vector2l getVector()
  public boolean isRelative()
  public Vector2l resolve(Vector2l vector)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final BuilderCodec<RelativeVector2l> CODEC
private Vector2l vector
private boolean relative
