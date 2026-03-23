---
title: "SetServerCamera"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.camera"
fqcn: "com.hypixel.hytale.protocol.packets.camera.SetServerCamera"
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
public class SetServerCamera implements Packet, ToClientPacket
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
| `clientCameraView` | `ClientCameraView` | ClientCameraView field. |
| `isLocked` | `boolean` | boolean field. |
| `cameraSettings` | `ServerCameraSettings` | ServerCameraSettings field. |

## Constructors

| Constructor | Description |
|---|---|
| `SetServerCamera()` | Creates a new SetServerCamera instance. |
| `SetServerCamera(@Nonnull ClientCameraView clientCameraView, boolean isLocked, @Nullable ServerCameraSettings cameraSettings)` | Creates a new SetServerCamera instance. |
| `SetServerCamera(@Nonnull SetServerCamera other)` | Creates a new SetServerCamera instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getId()` | `int` | public method. |
| `getChannel()` | `NetworkChannel` | public method. |
| `deserialize(@Nonnull ByteBuf buf, int offset)` | `SetServerCamera` | static public method. |
| `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` | `int` | static public method. |
| `serialize(@Nonnull ByteBuf buf)` | `void` | public method. |
| `computeSize()` | `int` | public method. |
| `validateStructure(@Nonnull ByteBuf buffer, int offset)` | `ValidationResult` | static public method. |
| `clone()` | `SetServerCamera` | public method. |
| `equals(Object obj)` | `boolean` | public method. |
| `hashCode()` | `int` | public method. |
