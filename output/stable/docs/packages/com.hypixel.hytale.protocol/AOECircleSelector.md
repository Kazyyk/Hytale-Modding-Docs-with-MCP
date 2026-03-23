---
title: "AOECircleSelector"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AOECircleSelector"
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
public class AOECircleSelector extends Selector
```

A targeting selector (type ID 0) that selects entities within a circular area defined by range and offset.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `range` | No |  |
| [Vector3f](Vector3f.md) | `offset` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 17 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 17 |
| `MAX_SIZE` | 17 |

Binary layout: 1 null-bit byte + 17 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AOECircleSelector deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AOECircleSelector` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AOECircleSelector` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AOECircleSelector` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AOECylinderSelector](AOECylinderSelector.md)
- [HorizontalSelector](HorizontalSelector.md)
