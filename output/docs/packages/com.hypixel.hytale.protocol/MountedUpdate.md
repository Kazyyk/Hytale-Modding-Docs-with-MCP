---
title: "MountedUpdate"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.MountedUpdate"
api_surface: false
extends: "ComponentUpdate"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "component-update"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class MountedUpdate extends ComponentUpdate
```

An entity component update sent from server to client. Extends `ComponentUpdate` (type ID 22).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `mountedToEntity` | No | |
| [Vector3f](Vector3f.md) | `attachmentOffset` | Yes | |
| [MountController](MountController.md) | `controller` | No | Default: `MountController.Minecart`. |
| [BlockMount](BlockMount.md) | `block` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 48 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 48 |
| `MAX_SIZE` | 48 |

Binary layout: 1 null-bit byte + 48 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static MountedUpdate deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `MountedUpdate` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `MountedUpdate` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `MountedUpdate` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockMount](BlockMount.md)
- [ComponentUpdate](ComponentUpdate.md)
- [MountController](MountController.md)
- [Vector3f](Vector3f.md)
