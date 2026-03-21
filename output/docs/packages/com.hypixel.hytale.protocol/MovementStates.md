---
title: "MovementStates"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.MovementStates"
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
public class MovementStates
```

Protocol data structure in the Movement/Physics group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `boolean` | `idle` | No | |
| `boolean` | `horizontalIdle` | No | |
| `boolean` | `jumping` | No | |
| `boolean` | `flying` | No | |
| `boolean` | `walking` | No | |
| `boolean` | `running` | No | |
| `boolean` | `sprinting` | No | |
| `boolean` | `crouching` | No | |
| `boolean` | `forcedCrouching` | No | |
| `boolean` | `falling` | No | |
| `boolean` | `climbing` | No | |
| `boolean` | `inFluid` | No | |
| `boolean` | `swimming` | No | |
| `boolean` | `swimJumping` | No | |
| `boolean` | `onGround` | No | |
| `boolean` | `mantling` | No | |
| `boolean` | `sliding` | No | |
| `boolean` | `mounting` | No | |
| `boolean` | `rolling` | No | |
| `boolean` | `sitting` | No | |
| `boolean` | `gliding` | No | |
| `boolean` | `sleeping` | No | |

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
public static MovementStates deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `MovementStates` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `MovementStates` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `MovementStates` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.
