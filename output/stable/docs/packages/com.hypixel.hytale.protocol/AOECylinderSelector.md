---
title: "AOECylinderSelector"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AOECylinderSelector"
api_surface: false
extends: "Selector"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "selector"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class AOECylinderSelector extends Selector
```

A targeting selector (type ID 1) that selects entities within a cylindrical volume defined by range, height, and offset.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `range` | No |  |
| `float` | `height` | No |  |
| [Vector3f](Vector3f.md) | `offset` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 21 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 21 |
| `MAX_SIZE` | 21 |

Binary layout: 1 null-bit byte + 21 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AOECylinderSelector deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AOECylinderSelector` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AOECylinderSelector` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AOECylinderSelector` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AOECircleSelector](AOECircleSelector.md)
- [HorizontalSelector](HorizontalSelector.md)
