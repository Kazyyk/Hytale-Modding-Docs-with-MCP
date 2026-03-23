---
title: "BuilderToolLaserPointer"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BuilderToolLaserPointer"
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
public class BuilderToolLaserPointer implements Packet, ToClientPacket
```

Renders a laser pointer line between two 3D points for a player with configurable color and duration.

## Packet Info

| Property | Value |
|---|---|
| Packet ID | `419` |
| Direction | server-to-client |
| Channel | `Default` |

## Fields

| Field | Type |
|---|---|
| `playerNetworkId` | `int` |
| `startX` | `float` |
| `startY` | `float` |
| `startZ` | `float` |
| `endX` | `float` |
| `endY` | `float` |
| `endZ` | `float` |
| `color` | `int` |
| `durationMs` | `int` |

## Protocol Methods

| Method | Return Type | Description |
|---|---|---|
| `deserialize(ByteBuf, int)` | `BuilderToolLaserPointer` | Reads this packet from a buffer at the given offset |
| `serialize(ByteBuf)` | `void` | Writes this packet to a buffer |
| `computeSize()` | `int` | Returns the serialized size in bytes |
| `validateStructure(ByteBuf, int)` | `ValidationResult` | Validates buffer structure without full deserialization |
| `getId()` | `int` | Returns the packet ID (`419`) |
| `getChannel()` | `NetworkChannel` | Returns `NetworkChannel.Default` |
