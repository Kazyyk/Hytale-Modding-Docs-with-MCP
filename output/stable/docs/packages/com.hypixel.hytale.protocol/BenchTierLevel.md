---
title: "BenchTierLevel"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BenchTierLevel"
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
public class BenchTierLevel
```

Defines a single tier level of a crafting bench, including upgrade requirements and crafting bonuses.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [BenchUpgradeRequirement](BenchUpgradeRequirement.md) | `benchUpgradeRequirement` | Yes |  |
| `double` | `craftingTimeReductionModifier` | No |  |
| `int` | `extraInputSlot` | No |  |
| `int` | `extraOutputSlot` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 17 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 17 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 17 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static BenchTierLevel deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `BenchTierLevel` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `BenchTierLevel` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `BenchTierLevel` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BenchUpgradeRequirement](BenchUpgradeRequirement.md)
- [Bench](Bench.md)
