---
title: "AssetPackManifest"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AssetPackManifest"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "protocol"
  - "asset-editor"
---

**Package:** `com.hypixel.hytale.protocol.packets.asseteditor`

```java
public class AssetPackManifest
```

Manifest describing an asset pack including name, author, version, and configuration.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `name` | Yes |  |
| `String` | `group` | Yes |  |
| `String` | `website` | Yes |  |
| `String` | `description` | Yes |  |
| `String` | `version` | Yes |  |
| [AuthorInfo](AuthorInfo.md)[] | `authors` | Yes |  |
| `String` | `serverVersion` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 7 |
| `VARIABLE_BLOCK_START` | 29 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 7 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AssetPackManifest deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AssetPackManifest` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AssetPackManifest` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AssetPackManifest` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AuthorInfo](AuthorInfo.md)
