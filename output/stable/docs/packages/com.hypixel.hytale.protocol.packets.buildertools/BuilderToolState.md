---
title: "BuilderToolState"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BuilderToolState"
api_surface: false
implements: "Packet, ToClientPacket"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "protocol"
  - "buildertools"
  - "packet"
---

**Package:** `com.hypixel.hytale.protocol.packets.buildertools`

```java
public class BuilderToolState implements Packet, ToClientPacket
```

Server-to-client packet defining the full state of the builder tool including sections, args, and brush data.

## Packet Info

| Property | Value |
|---|---|
| Packet ID | `402` |
| Direction | server-to-client |
| Channel | `Default` |

## Fields

| Field | Type |
|---|---|
| `token` | `int` |
| `sections` | `BuilderToolState.Section[]` |

## Protocol Methods

| Method | Return Type | Description |
|---|---|---|
| `deserialize(ByteBuf, int)` | `BuilderToolState` | Reads this packet from a buffer at the given offset |
| `serialize(ByteBuf)` | `void` | Writes this packet to a buffer |
| `computeSize()` | `int` | Returns the serialized size in bytes |
| `validateStructure(ByteBuf, int)` | `ValidationResult` | Validates buffer structure without full deserialization |
| `getId()` | `int` | Returns the packet ID (`402`) |
| `getChannel()` | `NetworkChannel` | Returns `NetworkChannel.Default` |
