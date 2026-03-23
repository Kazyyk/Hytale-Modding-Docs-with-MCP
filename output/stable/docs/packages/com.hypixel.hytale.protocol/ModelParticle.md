---
title: "ModelParticle"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ModelParticle"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "model"
  - "particle"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class ModelParticle
```

Protocol data structure in the Model/Rendering group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `systemId` | Yes | |
| `float` | `scale` | No | |
| [Color](Color.md) | `color` | Yes | |
| [EntityPart](EntityPart.md) | `targetEntityPart` | No | Default: `EntityPart.Self`. |
| `String` | `targetNodeName` | Yes | |
| [Vector3f](Vector3f.md) | `positionOffset` | Yes | |
| [Direction](Direction.md) | `rotationOffset` | Yes | |
| `boolean` | `detachedFromModel` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 34 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 42 |
| `MAX_SIZE` | 32,768,052 |

Binary layout: 1 null-bit byte + 34 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ModelParticle deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ModelParticle` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ModelParticle` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ModelParticle` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Color](Color.md)
- [Direction](Direction.md)
- [EntityPart](EntityPart.md)
- [Vector3f](Vector3f.md)
