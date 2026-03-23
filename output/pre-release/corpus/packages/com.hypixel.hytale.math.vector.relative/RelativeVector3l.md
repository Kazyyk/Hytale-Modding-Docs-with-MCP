# RelativeVector3l

Type: class | Package: com.hypixel.hytale.math.vector.relative

public class RelativeVector3l

Class in the relative subsystem.

## Fields

- vector | Vector3l | Vector3l field.
- relative | boolean | boolean field.

## Constructors

- RelativeVector3l(@Nonnull Vector3l vector, boolean relative) | Creates a new RelativeVector3l instance.
- RelativeVector3l() | Creates a new RelativeVector3l instance.

## Methods

- getVector() | Vector3l | public method.
- isRelative() | boolean | public method.
- resolve(@Nonnull Vector3l vector) | Vector3l | public method.
- equals(@Nullable Object o) | boolean | public method.
- hashCode() | int | public method.
- toString() | String | public method.

Also in this package: RelativeVector2d, RelativeVector2i, RelativeVector2l, RelativeVector3d, RelativeVector3i

Complete API:
  public Vector3l getVector()
  public boolean isRelative()
  public Vector3l resolve(Vector3l vector)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final BuilderCodec<RelativeVector3l> CODEC
private Vector3l vector
private boolean relative
