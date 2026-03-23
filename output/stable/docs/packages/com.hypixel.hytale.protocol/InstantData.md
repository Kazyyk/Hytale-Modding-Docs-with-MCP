---
title: "InstantData"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.InstantData"
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
public class InstantData
```

Timestamp with nanosecond precision, carrying seconds and nanos components.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `long` | `seconds` | No |  |
| `int` | `nanos` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 12 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 12 |
| `MAX_SIZE` | 12 |

Binary layout: 12 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static InstantData deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `InstantData` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `InstantData` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `InstantData` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
