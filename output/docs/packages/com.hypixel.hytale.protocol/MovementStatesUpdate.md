---
title: "MovementStatesUpdate"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.MovementStatesUpdate"
api_surface: false
extends: "ComponentUpdate"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "component-update"
  - "movement"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class MovementStatesUpdate extends ComponentUpdate
```

An entity component update sent from server to client. Extends `ComponentUpdate` (type ID 10).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [MovementStates](MovementStates.md) | `movementStates` | No | Default: `new MovementStates()`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 22 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 22 |
| `MAX_SIZE` | 22 |

Binary layout: 22 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static MovementStatesUpdate deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `MovementStatesUpdate` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `MovementStatesUpdate` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `MovementStatesUpdate` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ComponentUpdate](ComponentUpdate.md)
- [MovementStates](MovementStates.md)
