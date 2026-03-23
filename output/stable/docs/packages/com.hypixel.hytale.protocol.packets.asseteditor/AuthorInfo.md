---
title: "AuthorInfo"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.AuthorInfo"
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
public class AuthorInfo
```

Information about an asset pack author.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `name` | Yes |  |
| `String` | `email` | Yes |  |
| `String` | `url` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 3 |
| `VARIABLE_BLOCK_START` | 13 |
| `MAX_SIZE` | 49,152,028 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AuthorInfo deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AuthorInfo` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AuthorInfo` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AuthorInfo` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
