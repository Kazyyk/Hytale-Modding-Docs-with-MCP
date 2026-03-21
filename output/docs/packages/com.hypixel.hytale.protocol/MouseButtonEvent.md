---
title: "MouseButtonEvent"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.MouseButtonEvent"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "input"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class MouseButtonEvent
```

Protocol data structure in the Input Events group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [MouseButtonType](MouseButtonType.md) | `mouseButtonType` | No | Default: `MouseButtonType.Left`. |
| [MouseButtonState](MouseButtonState.md) | `state` | No | Default: `MouseButtonState.Pressed`. |
| `byte` | `clicks` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 3 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 3 |
| `MAX_SIZE` | 3 |

Binary layout: 3 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static MouseButtonEvent deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `MouseButtonEvent` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `MouseButtonEvent` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `MouseButtonEvent` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [MouseButtonState](MouseButtonState.md)
- [MouseButtonType](MouseButtonType.md)
