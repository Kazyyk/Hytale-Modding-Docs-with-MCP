---
title: "BuilderToolLineAction"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BuilderToolLineAction"
api_surface: false
implements: "Packet, ToServerPacket"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "protocol"
  - "buildertools"
  - "packet"
---

**Package:** `com.hypixel.hytale.protocol.packets.buildertools`

```java
public class BuilderToolLineAction implements Packet, ToServerPacket
```

Draws a line of blocks between two positions.

## Packet Info

| Property | Value |
|---|---|
| Packet ID | `414` |
| Direction | client-to-server |
| Channel | `Default` |

## Fields

| Field | Type |
|---|---|
| `xStart` | `int` |
| `yStart` | `int` |
| `zStart` | `int` |
| `xEnd` | `int` |
| `yEnd` | `int` |
| `zEnd` | `int` |

## Protocol Methods

| Method | Return Type | Description |
|---|---|---|
| `deserialize(ByteBuf, int)` | `BuilderToolLineAction` | Reads this packet from a buffer at the given offset |
| `serialize(ByteBuf)` | `void` | Writes this packet to a buffer |
| `computeSize()` | `int` | Returns the serialized size in bytes |
| `validateStructure(ByteBuf, int)` | `ValidationResult` | Validates buffer structure without full deserialization |
| `getId()` | `int` | Returns the packet ID (`414`) |
| `getChannel()` | `NetworkChannel` | Returns `NetworkChannel.Default` |
