---
title: "FogOptions"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.FogOptions"
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
public class FogOptions
```

Global fog rendering configuration with distance and height parameters.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `boolean` | `ignoreFogLimits` | No |  |
| `float` | `effectiveViewDistanceMultiplier` | No |  |
| `float` | `fogFarViewDistance` | No |  |
| `float` | `fogHeightCameraOffset` | No |  |
| `boolean` | `fogHeightCameraOverriden` | No |  |
| `float` | `fogHeightCameraFixed` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 18 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 18 |
| `MAX_SIZE` | 18 |

Binary layout: 18 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static FogOptions deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `FogOptions` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `FogOptions` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `FogOptions` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
