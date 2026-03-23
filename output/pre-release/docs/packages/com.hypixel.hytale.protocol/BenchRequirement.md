---
title: "BenchRequirement"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BenchRequirement"
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
public class BenchRequirement
```

Specifies the bench type, identifier, categories, and minimum tier level required to craft a recipe.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [BenchType](BenchType.md) | `type` | No |  Default: `BenchType.Crafting`. |
| `String` | `id` | No |  Default: `""`. |
| `String``[]` | `categories` | Yes |  |
| `int` | `requiredTierLevel` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 6 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 14 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static BenchRequirement deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `BenchRequirement` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `BenchRequirement` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `BenchRequirement` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BenchType](BenchType.md)
- [CraftingRecipe](CraftingRecipe.md)
