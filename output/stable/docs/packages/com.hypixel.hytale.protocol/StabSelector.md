---
title: "StabSelector"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.StabSelector"
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
public class StabSelector extends Selector
```

A targeting selector that extends `Selector`. Part of the target-selection system (type ID 4).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `extendTop` | No | |
| `float` | `extendBottom` | No | |
| `float` | `extendLeft` | No | |
| `float` | `extendRight` | No | |
| `float` | `yawOffset` | No | |
| `float` | `pitchOffset` | No | |
| `float` | `rollOffset` | No | |
| `float` | `startDistance` | No | |
| `float` | `endDistance` | No | |
| `boolean` | `testLineOfSight` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 37 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 37 |
| `MAX_SIZE` | 37 |

Binary layout: 37 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static StabSelector deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `StabSelector` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `StabSelector` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `StabSelector` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Selector](Selector.md)
