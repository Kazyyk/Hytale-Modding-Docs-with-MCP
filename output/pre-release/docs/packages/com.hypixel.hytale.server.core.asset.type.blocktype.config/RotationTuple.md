---
title: "RotationTuple"
kind: "record"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.RotationTuple"
api_surface: true
extends: "java.lang.Record"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "asset"
  - "blocktype"
  - "rotation"
  - "math"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config`

```java
public record RotationTuple(int index, Rotation yaw, Rotation pitch, Rotation roll)
```

A compound rotation expressed as separate yaw, pitch, and roll [Rotation](Rotation.md) components. Pre-computed into a static lookup table of all 64 possible combinations (4 yaw x 4 pitch x 4 roll). Supports matrix-based composition and flip operations for editor tools.

## Record Components

| Component | Type | Description |
|---|---|---|
| `index` | `int` | Pre-computed index into the `VALUES` lookup table |
| `yaw` | [Rotation](Rotation.md) | Yaw component (Y-axis rotation) |
| `pitch` | [Rotation](Rotation.md) | Pitch component (X-axis rotation) |
| `roll` | [Rotation](Rotation.md) | Roll component (Z-axis rotation) |

## Constants

| Constant | Description |
|---|---|
| `NONE` | Identity rotation (all components `None`) |
| `NONE_INDEX` | `0` |
| `VALUES` | Pre-computed array of all 64 rotation tuples |

## Key Methods

```java
public static RotationTuple of(@Nonnull Rotation yaw, @Nonnull Rotation pitch, @Nonnull Rotation roll)
```

Returns the pre-computed `RotationTuple` for the given components.

```java
public static int index(@Nonnull Rotation yaw, @Nonnull Rotation pitch, @Nonnull Rotation roll)
```

Computes the lookup index for a yaw/pitch/roll combination.

```java
public static RotationTuple flip(@Nonnull RotationTuple blockRotation, @Nullable BlockFlipType flipType, @Nonnull Axis axis, int[][][] flipCorrections)
```

Computes the rotation after flipping along an axis using matrix math and flip corrections.

```java
@Nonnull
public RotationTuple composeOnAxis(@Nonnull Axis axis, @Nonnull Rotation rotation)
```

Composes an additional rotation on a specific axis using matrix multiplication.

## Related Types

- [Rotation](Rotation.md) -- individual rotation component
- [BlockFlipType](BlockFlipType.md) -- flip behavior used with this type
