---
title: "UpdateEnvironments"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.assets"
fqcn: "com.hypixel.hytale.protocol.packets.assets.UpdateEnvironments"
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
public class UpdateEnvironments implements Packet, ToClientPacket
```

Server-to-client packet (ID 61, compressed). Transmits Environments asset data to the client on the `Default` channel.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `UpdateType` | `type` | No | Whether this is an init or incremental update. |
| `int` | `maxId` | No | Maximum assigned ID for this asset category. |
| `Map<Integer, WorldEnvironment>` | `environments` | Yes |  |
| `boolean` | `rebuildMapGeometry` | No | Controls whether to refresh MapGeometry. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 7 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 7 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte(s) + 7 bytes of fixed fields + 1 variable-length field(s) (VarInt length prefixes). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static UpdateEnvironments deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `UpdateEnvironments` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `UpdateEnvironments` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `UpdateEnvironments` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

```java
public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
```

Validates the binary structure of a `UpdateEnvironments` at the given offset without deserializing.
