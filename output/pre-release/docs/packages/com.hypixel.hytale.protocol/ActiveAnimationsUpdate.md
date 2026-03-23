---
title: "ActiveAnimationsUpdate"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ActiveAnimationsUpdate"
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
public class ActiveAnimationsUpdate extends ComponentUpdate
```

A component update (type ID 24) that synchronizes active animation states for an entity. Carries the set of currently playing animation names indexed by animation slot.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String``[]` | `activeAnimations` | No |  Default: `new String[0]`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 0 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 0 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ActiveAnimationsUpdate deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ActiveAnimationsUpdate` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ActiveAnimationsUpdate` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `ActiveAnimationsUpdate` into the given buffer. Returns the number of bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ComponentUpdate](ComponentUpdate.md)
- [ComponentUpdateType](ComponentUpdateType.md)
- [EntityUpdate](EntityUpdate.md)
