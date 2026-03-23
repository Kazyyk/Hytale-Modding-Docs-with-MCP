---
title: "EntityStatOnHit"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EntityStatOnHit"
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
public class EntityStatOnHit
```

Defines stat modifications applied on hit, with per-entity-count multipliers.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `entityStatIndex` | No |  |
| `float` | `amount` | No |  |
| `float``[]` | `multipliersPerEntitiesHit` | Yes |  |
| `float` | `multiplierPerExtraEntityHit` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 13 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 13 |
| `MAX_SIZE` | 16,384,018 |

Binary layout: 1 null-bit byte + 13 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static EntityStatOnHit deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `EntityStatOnHit` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `EntityStatOnHit` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `EntityStatOnHit` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [DamageEntityInteraction](DamageEntityInteraction.md)
