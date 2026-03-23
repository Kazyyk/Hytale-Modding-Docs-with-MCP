---
title: "InteractionCameraSettings"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.InteractionCameraSettings"
api_surface: false
extends: ~
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
public class InteractionCameraSettings
```

Groups camera keyframe sequences for first-person and third-person views during interactions.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [InteractionCamera](InteractionCamera.md)`[]` | `firstPerson` | Yes |  |
| [InteractionCamera](InteractionCamera.md)`[]` | `thirdPerson` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 9 |
| `MAX_SIZE` | 237,568,019 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static InteractionCameraSettings deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `InteractionCameraSettings` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `InteractionCameraSettings` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `InteractionCameraSettings` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [InteractionCamera](InteractionCamera.md)
- [Interaction](Interaction.md)
