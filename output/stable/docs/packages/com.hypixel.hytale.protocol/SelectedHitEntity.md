---
title: "SelectedHitEntity"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.SelectedHitEntity"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class SelectedHitEntity
```

Protocol data structure in the Projectile/Combat group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `networkId` | No | |
| [Vector3f](Vector3f.md) | `hitLocation` | Yes | |
| [Position](Position.md) | `position` | Yes | |
| [Direction](Direction.md) | `bodyRotation` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 53 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 53 |
| `MAX_SIZE` | 53 |

Binary layout: 1 null-bit byte + 53 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static SelectedHitEntity deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `SelectedHitEntity` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `SelectedHitEntity` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `SelectedHitEntity` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Direction](Direction.md)
- [Position](Position.md)
- [Vector3f](Vector3f.md)
