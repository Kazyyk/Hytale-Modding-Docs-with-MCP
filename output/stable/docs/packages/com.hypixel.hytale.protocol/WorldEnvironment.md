---
title: "WorldEnvironment"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.WorldEnvironment"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "world"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class WorldEnvironment
```

Protocol data structure in the World/Environment group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes | |
| [Color](Color.md) | `waterTint` | Yes | |
| `Map<``Integer``, `[FluidParticle](FluidParticle.md)`>` | `fluidParticles` | Yes | |
| `int``[]` | `tagIndexes` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 4 |
| `VARIABLE_FIELD_COUNT` | 3 |
| `VARIABLE_BLOCK_START` | 16 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 4 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static WorldEnvironment deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `WorldEnvironment` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `WorldEnvironment` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `WorldEnvironment` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Color](Color.md)
- [FluidParticle](FluidParticle.md)
