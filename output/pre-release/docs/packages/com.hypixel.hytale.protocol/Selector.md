---
title: "Selector"
kind: "abstract class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Selector"
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
public abstract class Selector
```

Base for target selection shapes. Subtypes: AOECircleSelector(0), AOECylinderSelector(1), RaycastSelector(2), HorizontalSelector(3), StabSelector(4). Uses VarInt type ID polymorphism.

## Serialization Layout

| Constant | Value |
|---|---|
| `MAX_SIZE` | 42 |

Binary layout: 0 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Selector deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Selector` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Selector` starting at the given offset.

```java
public int computeSize()
```

Returns the serialized size in bytes.
