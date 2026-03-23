---
title: "CombatTextUpdate"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CombatTextUpdate"
api_surface: false
extends: "ComponentUpdate"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "component-update"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class CombatTextUpdate extends ComponentUpdate
```

A component update (type ID 2) that displays combat/damage text on an entity with directional hit angle.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `hitAngleDeg` | No |  |
| `String` | `text` | No |  Default: `""`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 4 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 4 |
| `MAX_SIZE` | 16,384,009 |

Binary layout: 4 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static CombatTextUpdate deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `CombatTextUpdate` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `CombatTextUpdate` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `CombatTextUpdate` into the given buffer. Returns the number of bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ComponentUpdate](ComponentUpdate.md)
- [ComponentUpdateType](ComponentUpdateType.md)
- [EntityUpdate](EntityUpdate.md)
