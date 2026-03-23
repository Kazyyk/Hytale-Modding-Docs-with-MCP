---
title: "BuilderToolSetEntityLight"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BuilderToolSetEntityLight"
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
public class BuilderToolSetEntityLight implements Packet, ToServerPacket
```

Sets light properties on an entity.

## Packet Info

| Property | Value |
|---|---|
| Packet ID | `424` |
| Direction | client-to-server |
| Channel | `Default` |

## Fields

| Field | Type |
|---|---|
| `entityId` | `int` |
| `lightR` | `float` |
| `lightG` | `float` |
| `lightB` | `float` |
| `lightRadius` | `float` |

## Protocol Methods

| Method | Return Type | Description |
|---|---|---|
| `deserialize(ByteBuf, int)` | `BuilderToolSetEntityLight` | Reads this packet from a buffer at the given offset |
| `serialize(ByteBuf)` | `void` | Writes this packet to a buffer |
| `computeSize()` | `int` | Returns the serialized size in bytes |
| `validateStructure(ByteBuf, int)` | `ValidationResult` | Validates buffer structure without full deserialization |
| `getId()` | `int` | Returns the packet ID (`424`) |
| `getChannel()` | `NetworkChannel` | Returns `NetworkChannel.Default` |
