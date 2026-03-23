---
title: "CraftingRecipe"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CraftingRecipe"
api_surface: false
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
public class CraftingRecipe
```

Complete crafting recipe definition including inputs, outputs, bench requirements, knowledge gating, and crafting duration.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| [MaterialQuantity](MaterialQuantity.md)`[]` | `inputs` | Yes |  |
| [MaterialQuantity](MaterialQuantity.md)`[]` | `outputs` | Yes |  |
| [MaterialQuantity](MaterialQuantity.md) | `primaryOutput` | Yes |  |
| [BenchRequirement](BenchRequirement.md)`[]` | `benchRequirement` | Yes |  |
| `boolean` | `knowledgeRequired` | No |  |
| `float` | `timeSeconds` | No |  |
| `int` | `requiredMemoriesLevel` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 10 |
| `VARIABLE_FIELD_COUNT` | 5 |
| `VARIABLE_BLOCK_START` | 30 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 10 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static CraftingRecipe deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `CraftingRecipe` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `CraftingRecipe` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `CraftingRecipe` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ItemQuantity](ItemQuantity.md)
- [BenchRequirement](BenchRequirement.md)
