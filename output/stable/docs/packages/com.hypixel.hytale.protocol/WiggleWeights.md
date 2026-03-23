---
title: "WiggleWeights"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.WiggleWeights"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class WiggleWeights
```

Protocol data structure in the Camera/View group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `x` | No | |
| `float` | `xDeceleration` | No | |
| `float` | `y` | No | |
| `float` | `yDeceleration` | No | |
| `float` | `z` | No | |
| `float` | `zDeceleration` | No | |
| `float` | `roll` | No | |
| `float` | `rollDeceleration` | No | |
| `float` | `pitch` | No | |
| `float` | `pitchDeceleration` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 40 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 40 |
| `MAX_SIZE` | 40 |

Binary layout: 40 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static WiggleWeights deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `WiggleWeights` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `WiggleWeights` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `WiggleWeights` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.
