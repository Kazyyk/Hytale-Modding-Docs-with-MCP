---
title: "UntrackObjective"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.assets"
fqcn: "com.hypixel.hytale.protocol.packets.assets.UntrackObjective"
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
---

**Package:** `com.hypixel.hytale.protocol.packets.assets`

```java
public class UntrackObjective implements Packet, ToClientPacket
```

Server-to-client packet (ID 70). Transmits Objective asset data to the client on the `Default` channel.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `UUID` | `objectiveUuid` | No | UUID of the objective. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 16 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 16 |
| `MAX_SIZE` | 16 |

Binary layout: 16 bytes of fixed fields. No nullable fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static UntrackObjective deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `UntrackObjective` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `UntrackObjective` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `UntrackObjective` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

```java
public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
```

Validates the binary structure of a `UntrackObjective` at the given offset without deserializing.
