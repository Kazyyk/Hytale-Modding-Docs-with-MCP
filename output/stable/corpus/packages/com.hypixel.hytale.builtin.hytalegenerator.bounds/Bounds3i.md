# Bounds3i

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.bounds | Implements: MemInstrument

public class Bounds3i implements MemInstrument

Implementation of `MemInstrument`.

## Fields

- min | Vector3i | final Vector3i field.
- max | Vector3i | final Vector3i field.

## Constructors

- Bounds3i() | Creates a new Bounds3i instance.
- Bounds3i(@Nonnull Vector3i min, @Nonnull Vector3i max) | Creates a new Bounds3i instance.

## Methods

- contains(@Nonnull Vector3i position) | boolean | public method.
- contains(@Nonnull Bounds3i other) | boolean | public method.
- intersects(@Nonnull Bounds3i other) | boolean | public method.
- isZeroVolume() | boolean | public method.
- getSize() | Vector3i | public method.
- assign(@Nonnull Bounds3i other) | Bounds3i | public method.
- assign(@Nonnull Vector3i min, @Nonnull Vector3i max) | Bounds3i | public method.
- offset(@Nonnull Vector3i vector) | Bounds3i | public method.
- intersect(@Nonnull Bounds3i other) | Bounds3i | public method.
- encompass(@Nonnull Bounds3i other) | Bounds3i | public method.
- encompass(@Nonnull Vector3i position) | Bounds3i | public method.
- stack(@Nonnull Bounds3i other) | Bounds3i | public method.
- flipOnOriginPoint() | Bounds3i | public method.
- flipOnOriginVoxel() | Bounds3i | public method.
- toBounds3d() | Bounds3d | public method.
- clone() | Bounds3i | public method.
- isCorrect() | boolean | public method.
- correct() | void | public method.
- getMemoryUsage() | MemInstrument.Report | public method.
