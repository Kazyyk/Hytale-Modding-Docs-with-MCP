# SpaceSize

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.bounds

public class SpaceSize

Class in the bounds subsystem.

## Fields

- minInclusive | Vector3i | final Vector3i field.
- maxExclusive | Vector3i | final Vector3i field.
- maxInclusive | Vector3i | final Vector3i field.

## Constructors

- SpaceSize(@Nonnull Vector3i minInclusive, @Nonnull Vector3i maxExclusive) | Creates a new SpaceSize instance.
- SpaceSize(@Nonnull Vector3i voxel) | Creates a new SpaceSize instance.
- SpaceSize() | Creates a new SpaceSize instance.

## Methods

- moveBy(@Nonnull Vector3i delta) | SpaceSize | public method.
- getMinInclusive() | Vector3i | public method.
- getMaxExclusive() | Vector3i | public method.
- getMaxInclusive() | Vector3i | public method.
- getRange() | Vector3i | public method.
- toBounds3i() | Bounds3i | public method.
- clone() | SpaceSize | public method.
- merge(@Nonnull SpaceSize a, @Nonnull SpaceSize b) | SpaceSize | static public method.
- stack(@Nonnull SpaceSize a, @Nonnull SpaceSize b) | SpaceSize | static public method.
- empty() | SpaceSize | static public method.

Also in this package: Bounds3d, Bounds3i

Complete API:
  public SpaceSize moveBy(Vector3i delta)
  public Vector3i getMinInclusive()
  public Vector3i getMaxExclusive()
  public Vector3i getMaxInclusive()
  public Vector3i getRange()
  public Bounds3i toBounds3i()
  public SpaceSize clone()
  public static SpaceSize merge(SpaceSize a, SpaceSize b)
  public static SpaceSize stack(SpaceSize a, SpaceSize b)
  public static SpaceSize empty()

Fields:
private final Vector3i minInclusive
private final Vector3i maxExclusive
private final Vector3i maxInclusive
