---
title: "Model"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Model"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "model"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class Model
```

Protocol data structure in the Model/Rendering group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `assetId` | Yes | |
| `String` | `path` | Yes | |
| `String` | `texture` | Yes | |
| `String` | `gradientSet` | Yes | |
| `String` | `gradientId` | Yes | |
| [CameraSettings](CameraSettings.md) | `camera` | Yes | |
| `float` | `scale` | No | |
| `float` | `eyeHeight` | No | |
| `float` | `crouchOffset` | No | |
| `float` | `sittingOffset` | No | |
| `float` | `sleepingOffset` | No | |
| `Map<``String``, `[AnimationSet](AnimationSet.md)`>` | `animationSets` | Yes | |
| [ModelAttachment](ModelAttachment.md)`[]` | `attachments` | Yes | |
| [Hitbox](Hitbox.md) | `hitbox` | Yes | |
| [ModelParticle](ModelParticle.md)`[]` | `particles` | Yes | |
| [ModelTrail](ModelTrail.md)`[]` | `trails` | Yes | |
| [ColorLight](ColorLight.md) | `light` | Yes | |
| `Map<String, DetailBox[]>` | `detailBoxes` | Yes | |
| [Phobia](Phobia.md) | `phobia` | No | Default: `Phobia.None`. |
| [Model](Model.md) | `phobiaModel` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 2 |
| `FIXED_BLOCK_SIZE` | 51 |
| `VARIABLE_FIELD_COUNT` | 12 |
| `VARIABLE_BLOCK_START` | 99 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 2 null-bit bytes + 51 bytes of fixed fields + 12 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Model deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Model` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Model` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Model` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AnimationSet](AnimationSet.md)
- [CameraSettings](CameraSettings.md)
- [ColorLight](ColorLight.md)
- [DetailBox](DetailBox.md)
- [Hitbox](Hitbox.md)
- [ModelAttachment](ModelAttachment.md)
- [ModelParticle](ModelParticle.md)
- [ModelTrail](ModelTrail.md)
- [Phobia](Phobia.md)
