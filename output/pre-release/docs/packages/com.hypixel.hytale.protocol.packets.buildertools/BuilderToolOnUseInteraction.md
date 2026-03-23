---
title: "BuilderToolOnUseInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BuilderToolOnUseInteraction"
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
public class BuilderToolOnUseInteraction implements Packet, ToServerPacket
```

Sent when the player uses a builder tool interaction at a block position. Includes interaction type, position, paint mode offsets, and modifier key states.

## Packet Info

| Property | Value |
|---|---|
| Packet ID | `413` |
| Direction | client-to-server |
| Channel | `Default` |

## Fields

| Field | Type |
|---|---|
| `type` | `InteractionType` |
| `x` | `int` |
| `y` | `int` |
| `z` | `int` |
| `offsetForPaintModeX` | `int` |
| `offsetForPaintModeY` | `int` |
| `offsetForPaintModeZ` | `int` |
| `isAltPlaySculptBrushModDown` | `boolean` |
| `isHoldDownInteraction` | `boolean` |
| `isDoServerRaytraceForPosition` | `boolean` |

## Protocol Methods

| Method | Return Type | Description |
|---|---|---|
| `deserialize(ByteBuf, int)` | `BuilderToolOnUseInteraction` | Reads this packet from a buffer at the given offset |
| `serialize(ByteBuf)` | `void` | Writes this packet to a buffer |
| `computeSize()` | `int` | Returns the serialized size in bytes |
| `validateStructure(ByteBuf, int)` | `ValidationResult` | Validates buffer structure without full deserialization |
| `getId()` | `int` | Returns the packet ID (`413`) |
| `getChannel()` | `NetworkChannel` | Returns `NetworkChannel.Default` |
