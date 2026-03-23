---
title: "InteractionSyncData"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.InteractionSyncData"
api_surface: true
extends: ~
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
public class InteractionSyncData
```

Comprehensive interaction synchronization payload carrying progress, operation state, spatial data, hit entities, and force state.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [InteractionState](InteractionState.md) | `state` | No |  Default: `InteractionState.Finished`. |
| `float` | `progress` | No |  |
| `int` | `operationCounter` | No |  |
| `int` | `rootInteraction` | No |  |
| `int` | `totalForks` | No |  |
| `int` | `entityId` | No |  |
| `int` | `enteredRootInteraction` | No |  Default: `Integer.MIN_VALUE`. |
| [BlockPosition](BlockPosition.md) | `blockPosition` | Yes |  |
| [BlockFace](BlockFace.md) | `blockFace` | No |  Default: `BlockFace.None`. |
| [BlockRotation](BlockRotation.md) | `blockRotation` | Yes |  |
| `int` | `placedBlockId` | No |  Default: `Integer.MIN_VALUE`. |
| `float` | `chargeValue` | No |  Default: `-1.0F`. |
| `Map<`[InteractionType](InteractionType.md)`, ``Integer``>` | `forkCounts` | Yes |  |
| `int` | `chainingIndex` | No |  Default: `-1`. |
| `int` | `flagIndex` | No |  Default: `-1`. |
| [SelectedHitEntity](SelectedHitEntity.md)`[]` | `hitEntities` | Yes |  |
| [Position](Position.md) | `attackerPos` | Yes |  |
| [Direction](Direction.md) | `attackerRot` | Yes |  |
| [Position](Position.md) | `raycastHit` | Yes |  |
| `float` | `raycastDistance` | No |  |
| [Vector3f](Vector3f.md) | `raycastNormal` | Yes |  |
| [MovementDirection](MovementDirection.md) | `movementDirection` | No |  Default: `MovementDirection.None`. |
| [ApplyForceState](ApplyForceState.md) | `applyForceState` | No |  Default: `ApplyForceState.Waiting`. |
| `int` | `nextLabel` | No |  |
| `UUID` | `generatedUUID` | Yes |  Default: `null`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 2 |
| `FIXED_BLOCK_SIZE` | 157 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 165 |
| `MAX_SIZE` | 237,568,175 |

Binary layout: 2 null-bit bytes + 157 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static InteractionSyncData deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `InteractionSyncData` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `InteractionSyncData` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `InteractionSyncData` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [InteractionState](InteractionState.md)
- [BlockPosition](BlockPosition.md)
- [BlockFace](BlockFace.md)
- [Direction](Direction.md)
- [ApplyForceState](ApplyForceState.md)
