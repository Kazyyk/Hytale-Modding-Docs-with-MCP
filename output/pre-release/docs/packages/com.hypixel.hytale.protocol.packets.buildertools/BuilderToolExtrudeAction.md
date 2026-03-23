---
title: "BuilderToolExtrudeAction"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BuilderToolExtrudeAction"
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
public class BuilderToolExtrudeAction implements Packet, ToServerPacket
```

Extrudes a block face at a position along a normal direction.

## Packet Info

| Property | Value |
|---|---|
| Packet ID | `403` |
| Direction | client-to-server |
| Channel | `Default` |

## Fields

| Field | Type |
|---|---|
| `x` | `int` |
| `y` | `int` |
| `z` | `int` |
| `xNormal` | `int` |
| `yNormal` | `int` |
| `zNormal` | `int` |

## Protocol Methods

| Method | Return Type | Description |
|---|---|---|
| `deserialize(ByteBuf, int)` | `BuilderToolExtrudeAction` | Reads this packet from a buffer at the given offset |
| `serialize(ByteBuf)` | `void` | Writes this packet to a buffer |
| `computeSize()` | `int` | Returns the serialized size in bytes |
| `validateStructure(ByteBuf, int)` | `ValidationResult` | Validates buffer structure without full deserialization |
| `getId()` | `int` | Returns the packet ID (`403`) |
| `getChannel()` | `NetworkChannel` | Returns `NetworkChannel.Default` |
