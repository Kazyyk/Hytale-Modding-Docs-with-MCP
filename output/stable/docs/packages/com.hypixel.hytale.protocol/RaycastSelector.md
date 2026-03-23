---
title: "RaycastSelector"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.RaycastSelector"
api_surface: false
extends: "Selector"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "selector"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class RaycastSelector extends Selector
```

A targeting selector that extends `Selector`. Part of the target-selection system (type ID 2).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Vector3f](Vector3f.md) | `offset` | Yes | |
| `int` | `distance` | No | |
| `int` | `blockTagIndex` | No | Default: `Integer.MIN_VALUE`. |
| `boolean` | `ignoreFluids` | No | |
| `boolean` | `ignoreEmptyCollisionMaterial` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 23 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 23 |
| `MAX_SIZE` | 23 |

Binary layout: 1 null-bit byte + 23 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static RaycastSelector deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `RaycastSelector` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `RaycastSelector` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `RaycastSelector` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Selector](Selector.md)
- [Vector3f](Vector3f.md)
