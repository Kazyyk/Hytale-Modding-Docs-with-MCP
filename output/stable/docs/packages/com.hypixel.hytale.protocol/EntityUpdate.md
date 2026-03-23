---
title: "EntityUpdate"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EntityUpdate"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "entity"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class EntityUpdate
```

Core entity replication message carrying a network ID, removed component types, and component updates.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `networkId` | No |  |
| [ComponentUpdateType](ComponentUpdateType.md)`[]` | `removed` | Yes |  |
| [ComponentUpdate](ComponentUpdate.md)`[]` | `updates` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 5 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 13 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static EntityUpdate deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `EntityUpdate` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `EntityUpdate` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `EntityUpdate` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ComponentUpdate](ComponentUpdate.md)
- [ComponentUpdateType](ComponentUpdateType.md)
