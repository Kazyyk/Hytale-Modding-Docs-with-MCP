---
title: "CameraInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CameraInteraction"
api_surface: false
extends: "SimpleInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "interaction"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class CameraInteraction extends SimpleInteraction
```

Protocol data type in the Hytale client-server protocol.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [CameraActionType](CameraActionType.md) | `cameraAction` | No |  Default: `CameraActionType.ForcePerspective`. |
| [CameraPerspectiveType](CameraPerspectiveType.md) | `cameraPerspective` | No |  Default: `CameraPerspectiveType.First`. |
| `boolean` | `cameraPersist` | No |  |
| `float` | `cameraInteractionTime` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 26 |
| `VARIABLE_FIELD_COUNT` | 5 |
| `VARIABLE_BLOCK_START` | 46 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 26 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static CameraInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `CameraInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `CameraInteraction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `CameraInteraction` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
