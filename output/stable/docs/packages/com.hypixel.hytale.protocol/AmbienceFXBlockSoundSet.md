---
title: "AmbienceFXBlockSoundSet"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AmbienceFXBlockSoundSet"
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
public class AmbienceFXBlockSoundSet
```

Associates a block sound set index with a required percentage range. Used in ambience conditions to match surrounding block types.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `blockSoundSetIndex` | No |  |
| [Rangef](Rangef.md) | `percent` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 13 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 13 |
| `MAX_SIZE` | 13 |

Binary layout: 1 null-bit byte + 13 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AmbienceFXBlockSoundSet deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AmbienceFXBlockSoundSet` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AmbienceFXBlockSoundSet` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AmbienceFXBlockSoundSet` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AmbienceFXConditions](AmbienceFXConditions.md)
