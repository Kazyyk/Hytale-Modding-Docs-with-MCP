# Quatf

Type: class | Package: com.hypixel.hytale.math

public class Quatf

Class in the math subsystem.

## Fields

- SIZE | int | Static final int field.
- x | float | final float field.
- y | float | final float field.
- z | float | final float field.
- w | float | final float field.

## Constructors

- Quatf(float x, float y, float z, float w) | Creates a new Quatf instance.

## Methods

- deserialize(@Nonnull ByteBuf buf, int offset) | Quatf | static public method.
- serialize(@Nonnull ByteBuf buf) | void | public method.

Also in this package: Axis, Mat4f, Range, Vec2f, Vec3f, Vec4f

Complete API:
  public static Quatf deserialize(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)

Fields:
public static final int SIZE
public final float x
public final float y
public final float z
public final float w
