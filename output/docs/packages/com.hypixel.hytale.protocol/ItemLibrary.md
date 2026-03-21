---
title: "ItemLibrary"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemLibrary"
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
public class ItemLibrary
```

Container for the complete set of item definitions. Transmitted during world loading.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [ItemBase](ItemBase.md)`[]` | `items` | Yes |  |
| `Map<``Integer``, ``String``>` | `blockMap` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 9 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ItemLibrary deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ItemLibrary` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ItemLibrary` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ItemLibrary` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ItemBase](ItemBase.md)
