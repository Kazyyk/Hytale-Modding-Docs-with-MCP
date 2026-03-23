---
title: "DeployableConfig"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.DeployableConfig"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class DeployableConfig
```

Configuration for deployable items including models and wall-placement rules.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Model](Model.md) | `model` | Yes |  |
| [Model](Model.md) | `modelPreview` | Yes |  |
| `boolean` | `allowPlaceOnWalls` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 2 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 10 |
| `MAX_SIZE` | 2,058 |

Binary layout: 1 null-bit byte + 2 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static DeployableConfig deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `DeployableConfig` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `DeployableConfig` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `DeployableConfig` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
