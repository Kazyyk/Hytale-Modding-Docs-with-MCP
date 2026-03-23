---
title: "ItemGlider"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemGlider"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "item"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class ItemGlider
```

Glider-specific item configuration.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `terminalVelocity` | No |  |
| `float` | `fallSpeedMultiplier` | No |  |
| `float` | `horizontalSpeedMultiplier` | No |  |
| `float` | `speed` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 16 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 16 |
| `MAX_SIZE` | 16 |

Binary layout: 16 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ItemGlider deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ItemGlider` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ItemGlider` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ItemGlider` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ItemBase](ItemBase.md)
