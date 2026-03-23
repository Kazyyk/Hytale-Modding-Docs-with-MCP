# Bounds3d

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.bounds | Implements: MemInstrument

public class Bounds3d implements MemInstrument

Implementation of `MemInstrument`.

## Fields

- min | Vector3d | final Vector3d field.
- max | Vector3d | final Vector3d field.

## Constructors

- Bounds3d() | Creates a new Bounds3d instance.
- Bounds3d(@Nonnull Vector3d min, @Nonnull Vector3d max) | Creates a new Bounds3d instance.

## Methods

- contains(@Nonnull Vector3d position) | boolean | public method.
- contains(@Nonnull Bounds3d other) | boolean | public method.
- intersects(@Nonnull Bounds3d other) | boolean | public method.
- isZeroVolume() | boolean | public method.
- getSize() | Vector3d | public method.
- assign(@Nonnull Bounds3d other) | Bounds3d | public method.
- assign(@Nonnull Vector3d min, @Nonnull Vector3d max) | Bounds3d | public method.
- offset(@Nonnull Vector3d vector) | Bounds3d | public method.
- intersect(@Nonnull Bounds3d other) | Bounds3d | public method.
- encompass(@Nonnull Bounds3d other) | Bounds3d | public method.
- encompass(@Nonnull Vector3d position) | Bounds3d | public method.
- stack(@Nonnull Bounds3d other) | Bounds3d | public method.
- flipOnOriginPoint() | Bounds3d | public method.
- flipOnOriginVoxel() | Bounds3d | public method.
- clone() | Bounds3d | public method.
- isCorrect() | boolean | public method.
- correct() | void | public method.
- getMemoryUsage() | MemInstrument.Report | public method.
