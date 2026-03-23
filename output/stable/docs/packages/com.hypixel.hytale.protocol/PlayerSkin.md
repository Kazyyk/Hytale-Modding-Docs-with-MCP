---
title: "PlayerSkin"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.PlayerSkin"
api_surface: true
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
public class PlayerSkin
```

Protocol data structure in the Model/Rendering group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `bodyCharacteristic` | Yes | |
| `String` | `underwear` | Yes | |
| `String` | `face` | Yes | |
| `String` | `eyes` | Yes | |
| `String` | `ears` | Yes | |
| `String` | `mouth` | Yes | |
| `String` | `facialHair` | Yes | |
| `String` | `haircut` | Yes | |
| `String` | `eyebrows` | Yes | |
| `String` | `pants` | Yes | |
| `String` | `overpants` | Yes | |
| `String` | `undertop` | Yes | |
| `String` | `overtop` | Yes | |
| `String` | `shoes` | Yes | |
| `String` | `headAccessory` | Yes | |
| `String` | `faceAccessory` | Yes | |
| `String` | `earAccessory` | Yes | |
| `String` | `skinFeature` | Yes | |
| `String` | `gloves` | Yes | |
| `String` | `cape` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 3 |
| `FIXED_BLOCK_SIZE` | 3 |
| `VARIABLE_FIELD_COUNT` | 20 |
| `VARIABLE_BLOCK_START` | 83 |
| `MAX_SIZE` | 327,680,183 |

Binary layout: 3 null-bit bytes + 3 bytes of fixed fields + 20 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static PlayerSkin deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `PlayerSkin` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `PlayerSkin` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `PlayerSkin` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.
