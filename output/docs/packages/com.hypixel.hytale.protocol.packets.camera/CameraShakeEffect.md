---
title: "CameraShakeEffect"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.camera"
fqcn: "com.hypixel.hytale.protocol.packets.camera.CameraShakeEffect"
api_surface: false
extends: ~
implements: 
  - "Packet"
  - "ToClientPacket"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "protocol"
  - "camera"
---

**Package:** `com.hypixel.hytale.protocol.packets.camera`

```java
public class CameraShakeEffect implements Packet, ToClientPacket
```

Implementation of `Packet, ToClientPacket`.

## Fields

| Field | Type | Description |
|---|---|---|
| `PACKET_ID` | `int` | Static final int field. |
| `IS_COMPRESSED` | `boolean` | Static final boolean field. |
| `NULLABLE_BIT_FIELD_SIZE` | `int` | Static final int field. |
| `FIXED_BLOCK_SIZE` | `int` | Static final int field. |
| `VARIABLE_FIELD_COUNT` | `int` | Static final int field. |
| `VARIABLE_BLOCK_START` | `int` | Static final int field. |
| `MAX_SIZE` | `int` | Static final int field. |
| `cameraShakeId` | `int` | int field. |
| `intensity` | `float` | float field. |
| `mode` | `AccumulationMode` | AccumulationMode field. |

## Constructors

| Constructor | Description |
|---|---|
| `CameraShakeEffect()` | Creates a new CameraShakeEffect instance. |
| `CameraShakeEffect(int cameraShakeId, float intensity, @Nonnull AccumulationMode mode)` | Creates a new CameraShakeEffect instance. |
| `CameraShakeEffect(@Nonnull CameraShakeEffect other)` | Creates a new CameraShakeEffect instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getId()` | `int` | public method. |
| `getChannel()` | `NetworkChannel` | public method. |
| `deserialize(@Nonnull ByteBuf buf, int offset)` | `CameraShakeEffect` | static public method. |
| `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` | `int` | static public method. |
| `serialize(@Nonnull ByteBuf buf)` | `void` | public method. |
| `computeSize()` | `int` | public method. |
| `validateStructure(@Nonnull ByteBuf buffer, int offset)` | `ValidationResult` | static public method. |
| `clone()` | `CameraShakeEffect` | public method. |
| `equals(Object obj)` | `boolean` | public method. |
| `hashCode()` | `int` | public method. |
