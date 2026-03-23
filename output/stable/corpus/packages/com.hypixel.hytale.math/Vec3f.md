# Vec3f

Type: class | Package: com.hypixel.hytale.math

public final class Vec3f

Class in the math subsystem.

## Fields

- SIZE | int | Static final int field.
- x | float | float field.
- y | float | float field.
- z | float | float field.

## Constructors

- Vec3f(float x, float y, float z) | Creates a new Vec3f instance.
- Vec3f() | Creates a new Vec3f instance.

## Methods

- deserialize(@Nonnull ByteBuf buf, int offset) | Vec3f | static public method.
- serialize(@Nonnull ByteBuf buf) | void | public method.
- toString() | String | public method.

Also in this package: Axis, Mat4f, Quatf, Range, Vec2f, Vec4f

Complete API:
  public static Vec3f deserialize(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public String toString()

Fields:
public static final int SIZE
public float x
public float y
public float z
