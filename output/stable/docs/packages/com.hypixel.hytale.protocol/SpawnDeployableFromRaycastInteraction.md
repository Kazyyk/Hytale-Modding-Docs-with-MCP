---
title: "SpawnDeployableFromRaycastInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.SpawnDeployableFromRaycastInteraction"
api_surface: false
extends: "SimpleInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "interaction"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class SpawnDeployableFromRaycastInteraction extends SimpleInteraction
```

An interaction type that extends `SimpleInteraction` with chain pointers. Part of the interaction/ability system (type ID 29).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [DeployableConfig](DeployableConfig.md) | `deployableConfig` | Yes | |
| `float` | `maxDistance` | No | |
| `Map<``Integer``, ``Float``>` | `costs` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 23 |
| `VARIABLE_FIELD_COUNT` | 7 |
| `VARIABLE_BLOCK_START` | 51 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 23 bytes of fixed fields + 7 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static SpawnDeployableFromRaycastInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `SpawnDeployableFromRaycastInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `SpawnDeployableFromRaycastInteraction` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `SpawnDeployableFromRaycastInteraction` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [DeployableConfig](DeployableConfig.md)
- [Interaction](Interaction.md)
- [SimpleInteraction](SimpleInteraction.md)
