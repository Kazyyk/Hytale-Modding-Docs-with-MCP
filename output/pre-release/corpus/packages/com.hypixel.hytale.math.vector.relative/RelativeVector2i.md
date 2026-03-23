# RelativeVector2i

Type: class | Package: com.hypixel.hytale.math.vector.relative

public class RelativeVector2i

Class in the relative subsystem.

## Fields

- vector | Vector2i | Vector2i field.
- relative | boolean | boolean field.

## Constructors

- RelativeVector2i(@Nonnull Vector2i vector, boolean relative) | Creates a new RelativeVector2i instance.
- RelativeVector2i() | Creates a new RelativeVector2i instance.

## Methods

- getVector() | Vector2i | public method.
- isRelative() | boolean | public method.
- resolve(@Nonnull Vector2i vector) | Vector2i | public method.
- equals(@Nullable Object o) | boolean | public method.
- hashCode() | int | public method.
- toString() | String | public method.

Also in this package: RelativeVector2d, RelativeVector2l, RelativeVector3d, RelativeVector3i, RelativeVector3l

Complete API:
  public Vector2i getVector()
  public boolean isRelative()
  public Vector2i resolve(Vector2i vector)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final BuilderCodec<RelativeVector2i> CODEC
private Vector2i vector
private boolean relative
