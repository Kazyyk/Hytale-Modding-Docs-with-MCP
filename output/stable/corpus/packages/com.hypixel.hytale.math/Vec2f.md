# Vec2f

Type: class | Package: com.hypixel.hytale.math

public final class Vec2f

Class in the math subsystem.

## Fields

- SIZE | int | Static final int field.
- x | float | float field.
- y | float | float field.

## Constructors

- Vec2f(float x, float y) | Creates a new Vec2f instance.
- Vec2f() | Creates a new Vec2f instance.

## Methods

- deserialize(@Nonnull ByteBuf buf, int offset) | Vec2f | static public method.
- serialize(@Nonnull ByteBuf buf) | void | public method.
- toString() | String | public method.

Also in this package: Axis, Mat4f, Quatf, Range, Vec3f, Vec4f

Complete API:
  public static Vec2f deserialize(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public String toString()

Fields:
public static final int SIZE
public float x
public float y
