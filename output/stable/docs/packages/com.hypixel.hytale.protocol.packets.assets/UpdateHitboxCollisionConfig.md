---
title: "UpdateHitboxCollisionConfig"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.assets"
fqcn: "com.hypixel.hytale.protocol.packets.assets.UpdateHitboxCollisionConfig"
api_surface: false
extends: ~
implements: ["Packet", "ToClientPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T02:59:19Z"
tags:
  - "protocol"
  - "packet"
  - "assets"
  - "server-to-client"
  - "compressed"
---

**Package:** `com.hypixel.hytale.protocol.packets.assets`

```java
public class UpdateHitboxCollisionConfig implements Packet, ToClientPacket
```

Server-to-client packet (ID 74, compressed). Transmits HitboxCollisionConfig asset data to the client on the `Default` channel.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `UpdateType` | `type` | No | Whether this is an init or incremental update. |
| `int` | `maxId` | No | Maximum assigned ID for this asset category. |
| `Map<Integer, HitboxCollisionConfig>` | `hitboxCollisionConfigs` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 6 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 6 |
| `MAX_SIZE` | 36,864,011 |

Binary layout: 1 null-bit byte(s) + 6 bytes of fixed fields + 1 variable-length field(s) (VarInt length prefixes). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static UpdateHitboxCollisionConfig deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `UpdateHitboxCollisionConfig` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `UpdateHitboxCollisionConfig` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `UpdateHitboxCollisionConfig` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

```java
public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
```

Validates the binary structure of a `UpdateHitboxCollisionConfig` at the given offset without deserializing.
