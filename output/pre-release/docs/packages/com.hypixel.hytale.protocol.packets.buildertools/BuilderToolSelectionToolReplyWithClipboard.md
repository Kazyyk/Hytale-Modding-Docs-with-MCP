---
title: "BuilderToolSelectionToolReplyWithClipboard"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BuilderToolSelectionToolReplyWithClipboard"
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
public class BuilderToolSelectionToolReplyWithClipboard implements Packet, ToClientPacket
```

Server response containing clipboard block and fluid change data. Compressed packet.

## Packet Info

| Property | Value |
|---|---|
| Packet ID | `411` |
| Direction | server-to-client |
| Channel | `Default` |

## Fields

| Field | Type |
|---|---|
| `blocksChange` | `BlockChange[]` |
| `fluidsChange` | `FluidChange[]` |

## Protocol Methods

| Method | Return Type | Description |
|---|---|---|
| `deserialize(ByteBuf, int)` | `BuilderToolSelectionToolReplyWithClipboard` | Reads this packet from a buffer at the given offset |
| `serialize(ByteBuf)` | `void` | Writes this packet to a buffer |
| `computeSize()` | `int` | Returns the serialized size in bytes |
| `validateStructure(ByteBuf, int)` | `ValidationResult` | Validates buffer structure without full deserialization |
| `getId()` | `int` | Returns the packet ID (`411`) |
| `getChannel()` | `NetworkChannel` | Returns `NetworkChannel.Default` |
