---
title: "BuilderToolShowAnchor"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BuilderToolShowAnchor"
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
public class BuilderToolShowAnchor implements Packet, ToClientPacket
```

Shows a builder tool anchor at a position with a label.

## Packet Info

| Property | Value |
|---|---|
| Packet ID | `417` |
| Direction | server-to-client |
| Channel | `Default` |

## Fields

| Field | Type |
|---|---|
| `x` | `float` |
| `y` | `float` |
| `z` | `float` |
| `label` | `String` |

## Protocol Methods

| Method | Return Type | Description |
|---|---|---|
| `deserialize(ByteBuf, int)` | `BuilderToolShowAnchor` | Reads this packet from a buffer at the given offset |
| `serialize(ByteBuf)` | `void` | Writes this packet to a buffer |
| `computeSize()` | `int` | Returns the serialized size in bytes |
| `validateStructure(ByteBuf, int)` | `ValidationResult` | Validates buffer structure without full deserialization |
| `getId()` | `int` | Returns the packet ID (`417`) |
| `getChannel()` | `NetworkChannel` | Returns `NetworkChannel.Default` |
