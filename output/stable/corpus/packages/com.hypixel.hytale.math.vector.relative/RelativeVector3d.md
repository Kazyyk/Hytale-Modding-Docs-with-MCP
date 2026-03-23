# RelativeVector3d

Type: class | Package: com.hypixel.hytale.math.vector.relative

public class RelativeVector3d

Class in the relative subsystem.

## Fields

- vector | Vector3d | Vector3d field.
- relative | boolean | boolean field.

## Constructors

- RelativeVector3d(@Nonnull Vector3d vector, boolean relative) | Creates a new RelativeVector3d instance.
- RelativeVector3d() | Creates a new RelativeVector3d instance.

## Methods

- getVector() | Vector3d | public method.
- isRelative() | boolean | public method.
- resolve(@Nonnull Vector3d vector) | Vector3d | public method.
- equals(@Nullable Object o) | boolean | public method.
- hashCode() | int | public method.
- toString() | String | public method.

Also in this package: RelativeVector2d, RelativeVector2i, RelativeVector2l, RelativeVector3i, RelativeVector3l

Complete API:
  public Vector3d getVector()
  public boolean isRelative()
  public Vector3d resolve(Vector3d vector)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final BuilderCodec<RelativeVector3d> CODEC
private Vector3d vector
private boolean relative
