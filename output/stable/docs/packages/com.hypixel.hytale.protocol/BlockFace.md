---
title: "BlockFace"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockFace"
api_surface: false
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
public enum BlockFace
```

Identifies a face of a block in 3D space.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `None` | 0 | No face specified. |
| `Up` | 1 | Top face (+Y). |
| `Down` | 2 | Bottom face (-Y). |
| `North` | 3 | North face (-Z). |
| `South` | 4 | South face (+Z). |
| `East` | 5 | East face (+X). |
| `West` | 6 | West face (-X). |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `BlockFace` constant.

```java
public static BlockFace fromValue(int value)
```

Returns the `BlockFace` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`6`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [BlockPosition](BlockPosition.md)
- [InteractionSyncData](InteractionSyncData.md)
