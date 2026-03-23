---
title: "Rotation"
kind: "enum"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.Rotation"
api_surface: true
extends: "java.lang.Enum"
implements:
  - "NetworkSerializable"
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
public enum Rotation implements NetworkSerializable<com.hypixel.hytale.protocol.Rotation>
```

Represents a 90-degree-increment rotation used for block placement, prefab transforms, and vector math. Provides methods for rotating `Vector3i`, `Vector3f`, and `Vector3d` around each axis.

## Enum Constants

| Constant | Degrees | Axis of Alignment |
|---|---|---|
| `None` | 0 | Z |
| `Ninety` | 90 | X |
| `OneEighty` | 180 | Z |
| `TwoSeventy` | 270 | X |

## Key Methods

```java
public com.hypixel.hytale.protocol.Rotation toPacket()
```

Converts to the protocol rotation enum.

```java
public int getDegrees()
```

Returns the rotation in degrees.

```java
public double getRadians()
```

Returns the rotation in radians.

```java
@Nonnull
public Rotation flip()
```

Returns the rotation flipped by 180 degrees.

```java
@Nonnull
public Rotation add(@Nullable Rotation rotation)
```

Adds another rotation to this one.

```java
@Nonnull
public Rotation subtract(@Nullable Rotation rotation)
```

Subtracts another rotation from this one.

```java
@Nonnull
public static Rotation ofDegrees(int degrees)
```

Returns the `Rotation` for the given degree value (must be a multiple of 90).

```java
public Rotation toInverse()
```

Returns the inverse of this rotation.

## Related Types

- [RotationTuple](RotationTuple.md) -- compound yaw/pitch/roll rotation
- [BlockFlipType](BlockFlipType.md) -- uses rotations for flip computation
- [BlockType](BlockType.md) -- blocks use rotations for placement
