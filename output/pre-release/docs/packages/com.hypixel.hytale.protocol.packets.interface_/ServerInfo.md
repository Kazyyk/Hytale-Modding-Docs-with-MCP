---
title: "ServerInfo"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.interface_"
fqcn: "com.hypixel.hytale.protocol.packets.interface_.ServerInfo"
api_surface: false
extends: "java.lang.Object"
implements:
  - "Packet"
  - "ToClientPacket"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "protocol"
  - "packet"
  - "server"
---

**Package:** `com.hypixel.hytale.protocol.packets.interface_`

```java
public class ServerInfo implements Packet, ToClientPacket
```

Server-to-client packet that delivers basic server metadata to the connected client: the server name, message of the day, maximum player count, and an optional fallback server address.

## Protocol Constants

| Constant | Value |
|---|---|
| `PACKET_ID` | `223` |
| `IS_COMPRESSED` | `false` |

## Fields

| Field | Type | Nullable | Description |
|---|---|---|---|
| `serverName` | `String` | yes | Display name of the server |
| `motd` | `String` | yes | Message of the day |
| `maxPlayers` | `int` | no | Maximum player capacity |
| `fallbackServer` | `HostAddress` | yes | Address of a fallback server for redirection |

## Methods

```java
@Override
public int getId()
```

Returns the packet ID (`223`).

```java
@Override
public NetworkChannel getChannel()
```

Returns `NetworkChannel.Default`.

```java
@Nonnull
public static ServerInfo deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ServerInfo` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the number of bytes consumed by this packet in the buffer.

```java
@Override
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this packet into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

```java
public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
```

Validates buffer structure without full deserialization.

```java
public ServerInfo clone()
```

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
- `HostAddress` -- host/port address pair
