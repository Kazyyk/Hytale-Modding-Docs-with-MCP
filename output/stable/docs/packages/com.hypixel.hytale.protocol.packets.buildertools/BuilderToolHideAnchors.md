---
title: "BuilderToolHideAnchors"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BuilderToolHideAnchors"
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
public class BuilderToolHideAnchors implements Packet, ToClientPacket
```

Instructs the client to hide all builder tool anchors. Contains no fields.

## Packet Info

| Property | Value |
|---|---|
| Packet ID | `416` |
| Direction | server-to-client |
| Channel | `Default` |

## Protocol Methods

| Method | Return Type | Description |
|---|---|---|
| `deserialize(ByteBuf, int)` | `BuilderToolHideAnchors` | Reads this packet from a buffer at the given offset |
| `serialize(ByteBuf)` | `void` | Writes this packet to a buffer |
| `computeSize()` | `int` | Returns the serialized size in bytes |
| `validateStructure(ByteBuf, int)` | `ValidationResult` | Validates buffer structure without full deserialization |
| `getId()` | `int` | Returns the packet ID (`416`) |
| `getChannel()` | `NetworkChannel` | Returns `NetworkChannel.Default` |
