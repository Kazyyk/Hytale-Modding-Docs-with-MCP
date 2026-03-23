---
title: "DynamicLightUpdate"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.DynamicLightUpdate"
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
public class DynamicLightUpdate extends ComponentUpdate
```

A component update (type ID 13) that synchronizes an entity's dynamic light emission color and radius.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [ColorLight](ColorLight.md) | `dynamicLight` | No |  Default: `new ColorLight()`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 4 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 4 |
| `MAX_SIZE` | 4 |

Binary layout: 4 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static DynamicLightUpdate deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `DynamicLightUpdate` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `DynamicLightUpdate` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `DynamicLightUpdate` into the given buffer. Returns the number of bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ColorLight](ColorLight.md)
- [ComponentUpdate](ComponentUpdate.md)
- [EntityUpdate](EntityUpdate.md)
