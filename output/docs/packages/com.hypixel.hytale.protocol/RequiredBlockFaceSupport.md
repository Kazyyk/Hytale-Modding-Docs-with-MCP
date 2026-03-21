---
title: "RequiredBlockFaceSupport"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.RequiredBlockFaceSupport"
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
public class RequiredBlockFaceSupport
```

Protocol data structure in the Block/Connected Block Rules group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `faceType` | Yes | |
| `String` | `selfFaceType` | Yes | |
| `String` | `blockSetId` | Yes | |
| `int` | `blockTypeId` | No | |
| `int` | `tagIndex` | No | |
| `int` | `fluidId` | No | |
| [SupportMatch](SupportMatch.md) | `support` | No | Default: `SupportMatch.Ignored`. |
| [SupportMatch](SupportMatch.md) | `matchSelf` | No | Default: `SupportMatch.Ignored`. |
| `boolean` | `allowSupportPropagation` | No | |
| `boolean` | `rotate` | No | |
| [Vector3i](Vector3i.md)`[]` | `filler` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 17 |
| `VARIABLE_FIELD_COUNT` | 4 |
| `VARIABLE_BLOCK_START` | 33 |
| `MAX_SIZE` | 98,304,053 |

Binary layout: 1 null-bit byte + 17 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static RequiredBlockFaceSupport deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `RequiredBlockFaceSupport` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `RequiredBlockFaceSupport` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `RequiredBlockFaceSupport` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [SupportMatch](SupportMatch.md)
- [Vector3i](Vector3i.md)
