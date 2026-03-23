# RelativeVector2d

Type: class | Package: com.hypixel.hytale.math.vector.relative

public class RelativeVector2d

Class in the relative subsystem.

## Fields

- vector | Vector2d | Vector2d field.
- relative | boolean | boolean field.

## Constructors

- RelativeVector2d(@Nonnull Vector2d vector, boolean relative) | Creates a new RelativeVector2d instance.
- RelativeVector2d() | Creates a new RelativeVector2d instance.

## Methods

- getVector() | Vector2d | public method.
- isRelative() | boolean | public method.
- resolve(@Nonnull Vector2d vector) | Vector2d | public method.
- equals(@Nullable Object o) | boolean | public method.
- hashCode() | int | public method.
- toString() | String | public method.

Also in this package: RelativeVector2i, RelativeVector2l, RelativeVector3d, RelativeVector3i, RelativeVector3l

Complete API:
  public Vector2d getVector()
  public boolean isRelative()
  public Vector2d resolve(Vector2d vector)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final BuilderCodec<RelativeVector2d> CODEC
private Vector2d vector
private boolean relative
