---
title: "BlockRotationUtil"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.BlockRotationUtil"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "block"
  - "rotation"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk`

```java
public class BlockRotationUtil
```

Utility class for computing rotated and flipped block orientations. Used by builder tools and world editing operations to transform block rotation tuples around axes and to transform filler block offsets accordingly.

## Static Methods

```java
@Nullable
public static RotationTuple getFlipped(@Nonnull RotationTuple blockRotation, @Nullable BlockFlipType flipType, @Nonnull Axis axis, @Nonnull VariantRotation variantRotation)
```

Computes the flipped rotation of a block around the given axis. Applies the flip type's yaw transformation and then rotates by 180 degrees. Returns `null` if the resulting rotation is not valid for the variant.

```java
@Nullable
public static RotationTuple getRotated(@Nonnull RotationTuple blockRotation, @Nonnull Axis axis, Rotation rotation, @Nonnull VariantRotation variantRotation)
```

Computes the rotated orientation of a block around the given axis by the specified rotation amount. Returns `null` if the result is not valid for the variant.

```java
public static int getFlippedFiller(int filler, @Nonnull Axis axis)
```

Computes the flipped filler offset (180-degree rotation around the axis).

```java
public static int getRotatedFiller(int filler, @Nonnull Axis axis, Rotation rotation)
```

Computes the rotated filler offset around the given axis.
