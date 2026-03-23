---
title: "HorizontalSelector"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.HorizontalSelector"
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
public class HorizontalSelector extends Selector
```

A targeting selector (type ID 3) that selects entities in a horizontal arc defined by direction, extents, yaw length, and distance range.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `extendTop` | No |  |
| `float` | `extendBottom` | No |  |
| `float` | `yawLength` | No |  |
| `float` | `yawStartOffset` | No |  |
| `float` | `pitchOffset` | No |  |
| `float` | `rollOffset` | No |  |
| `float` | `startDistance` | No |  |
| `float` | `endDistance` | No |  |
| [HorizontalSelectorDirection](HorizontalSelectorDirection.md) | `direction` | No |  Default: `HorizontalSelectorDirection.ToLeft`. |
| `boolean` | `testLineOfSight` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 34 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 34 |
| `MAX_SIZE` | 34 |

Binary layout: 34 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static HorizontalSelector deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `HorizontalSelector` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `HorizontalSelector` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `HorizontalSelector` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [HorizontalSelectorDirection](HorizontalSelectorDirection.md)
- [AOECircleSelector](AOECircleSelector.md)
- [AOECylinderSelector](AOECylinderSelector.md)
