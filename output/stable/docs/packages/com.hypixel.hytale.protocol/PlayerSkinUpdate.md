---
title: "PlayerSkinUpdate"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.PlayerSkinUpdate"
api_surface: false
extends: "ComponentUpdate"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "component-update"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class PlayerSkinUpdate extends ComponentUpdate
```

An entity component update sent from server to client. Extends `ComponentUpdate` (type ID 4).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [PlayerSkin](PlayerSkin.md) | `skin` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 1 |
| `MAX_SIZE` | 327,680,184 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static PlayerSkinUpdate deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `PlayerSkinUpdate` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `PlayerSkinUpdate` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `PlayerSkinUpdate` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ComponentUpdate](ComponentUpdate.md)
- [PlayerSkin](PlayerSkin.md)
