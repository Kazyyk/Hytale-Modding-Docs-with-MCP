---
title: "BlockPlacementRotationMode"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockPlacementRotationMode"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "enum"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public enum BlockPlacementRotationMode
```

Determines how a block is oriented when placed.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `FacingPlayer` | 0 |  |
| `StairFacingPlayer` | 1 |  |
| `BlockNormal` | 2 |  |
| `Default` | 3 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `BlockPlacementRotationMode` constant.

```java
public static BlockPlacementRotationMode fromValue(int value)
```

Returns the `BlockPlacementRotationMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [BlockPlacementSettings](BlockPlacementSettings.md)
