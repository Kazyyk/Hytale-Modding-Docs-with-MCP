---
title: "BlockPlacementSettings"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockPlacementSettings"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "block"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class BlockPlacementSettings
```

Comprehensive configuration for block placement behavior including preview visibility, rotation mode, placement constraints, and override rules.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `boolean` | `allowRotationKey` | No |  |
| `boolean` | `placeInEmptyBlocks` | No |  |
| [BlockPreviewVisibility](BlockPreviewVisibility.md) | `previewVisibility` | No |  Default: `BlockPreviewVisibility.AlwaysVisible`. |
| [BlockPlacementRotationMode](BlockPlacementRotationMode.md) | `rotationMode` | No |  Default: `BlockPlacementRotationMode.FacingPlayer`. |
| `int` | `wallPlacementOverrideBlockId` | No |  |
| `int` | `floorPlacementOverrideBlockId` | No |  |
| `int` | `ceilingPlacementOverrideBlockId` | No |  |
| `boolean` | `allowBreakReplace` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 17 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 17 |
| `MAX_SIZE` | 17 |

Binary layout: 17 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static BlockPlacementSettings deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `BlockPlacementSettings` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `BlockPlacementSettings` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `BlockPlacementSettings` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockPlacementRotationMode](BlockPlacementRotationMode.md)
- [BlockPreviewVisibility](BlockPreviewVisibility.md)
- [BlockType](BlockType.md)
