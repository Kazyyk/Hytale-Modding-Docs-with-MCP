---
title: "SavedMovementStates"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.SavedMovementStates"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "movement"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class SavedMovementStates
```

Protocol data structure in the Movement/Physics group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `boolean` | `flying` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 1 |
| `MAX_SIZE` | 1 |

Binary layout: 1 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static SavedMovementStates deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `SavedMovementStates` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `SavedMovementStates` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `SavedMovementStates` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.
