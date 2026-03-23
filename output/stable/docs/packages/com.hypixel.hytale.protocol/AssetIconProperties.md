---
title: "AssetIconProperties"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AssetIconProperties"
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
public class AssetIconProperties
```

Defines visual transformation properties for rendering an asset as an icon, including scale, translation, and rotation.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `scale` | No |  |
| [Vector2f](Vector2f.md) | `translation` | Yes |  |
| [Vector3f](Vector3f.md) | `rotation` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 25 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 25 |
| `MAX_SIZE` | 25 |

Binary layout: 1 null-bit byte + 25 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetIconProperties deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetIconProperties` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetIconProperties` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetIconProperties` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Asset](Asset.md)
- [ItemBase](ItemBase.md)
