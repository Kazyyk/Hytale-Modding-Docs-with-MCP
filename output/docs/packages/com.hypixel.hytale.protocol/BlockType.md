---
title: "BlockType"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockType"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "block"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class BlockType
```

Comprehensive block type definition containing all rendering, physics, gameplay, and metadata properties for a block in the game world.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `item` | Yes |  |
| `String` | `name` | Yes |  |
| `boolean` | `unknown` | No |  |
| [DrawType](DrawType.md) | `drawType` | No |  Default: `DrawType.Empty`. |
| [BlockMaterial](BlockMaterial.md) | `material` | No |  Default: `BlockMaterial.Empty`. |
| [Opacity](Opacity.md) | `opacity` | No |  Default: `Opacity.Solid`. |
| [ShaderType](ShaderType.md)`[]` | `shaderEffect` | Yes |  |
| `int` | `hitbox` | No |  |
| `int` | `interactionHitbox` | No |  |
| `String` | `model` | Yes |  |
| [ModelTexture](ModelTexture.md)`[]` | `modelTexture` | Yes |  |
| `float` | `modelScale` | No |  |
| `String` | `modelAnimation` | Yes |  |
| `boolean` | `looping` | No |  |
| `int` | `maxSupportDistance` | No |  |
| [BlockSupportsRequiredForType](BlockSupportsRequiredForType.md) | `blockSupportsRequiredFor` | No |  Default: `BlockSupportsRequiredForType.Any`. |
| `Map``<``BlockNeighbor, RequiredBlockFaceSupport[]``>` | `support` | Yes |  |
| `Map``<``BlockNeighbor, BlockFaceSupport[]``>` | `supporting` | Yes |  |
| `boolean` | `requiresAlphaBlending` | No |  |
| [BlockTextures](BlockTextures.md)`[]` | `cubeTextures` | Yes |  |
| `String` | `cubeSideMaskTexture` | Yes |  |
| [ShadingMode](ShadingMode.md) | `cubeShadingMode` | No |  Default: `ShadingMode.Standard`. |
| [RandomRotation](RandomRotation.md) | `randomRotation` | No |  Default: `RandomRotation.None`. |
| [VariantRotation](VariantRotation.md) | `variantRotation` | No |  Default: `VariantRotation.None`. |
| [Rotation](Rotation.md) | `rotationYawPlacementOffset` | No |  Default: `Rotation.None`. |
| `int` | `blockSoundSetIndex` | No |  |
| `int` | `ambientSoundEventIndex` | No |  |
| [ModelParticle](ModelParticle.md)`[]` | `particles` | Yes |  |
| `String` | `blockParticleSetId` | Yes |  |
| `String` | `blockBreakingDecalId` | Yes |  |
| [Color](Color.md) | `particleColor` | Yes |  |
| [ColorLight](ColorLight.md) | `light` | Yes |  |
| [Tint](Tint.md) | `tint` | Yes |  |
| [Tint](Tint.md) | `biomeTint` | Yes |  |
| `int` | `group` | No |  |
| `String` | `transitionTexture` | Yes |  |
| `int``[]` | `transitionToGroups` | Yes |  |
| [BlockMovementSettings](BlockMovementSettings.md) | `movementSettings` | Yes |  |
| [BlockFlags](BlockFlags.md) | `flags` | Yes |  |
| `String` | `interactionHint` | Yes |  |
| [BlockGathering](BlockGathering.md) | `gathering` | Yes |  |
| [BlockPlacementSettings](BlockPlacementSettings.md) | `placementSettings` | Yes |  |
| [ModelDisplay](ModelDisplay.md) | `display` | Yes |  |
| [RailConfig](RailConfig.md) | `rail` | Yes |  |
| `boolean` | `ignoreSupportWhenPlaced` | No |  |
| `Map<`[InteractionType](InteractionType.md)`, ``Integer``>` | `interactions` | Yes |  |
| `Map<``String``, ``Integer``>` | `states` | Yes |  |
| `int` | `transitionToTag` | No |  |
| `int``[]` | `tagIndexes` | Yes |  |
| [Bench](Bench.md) | `bench` | Yes |  |
| [ConnectedBlockRuleSet](ConnectedBlockRuleSet.md) | `connectedBlockRuleSet` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 4 |
| `FIXED_BLOCK_SIZE` | 164 |
| `VARIABLE_FIELD_COUNT` | 24 |
| `VARIABLE_BLOCK_START` | 260 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 4 null-bit bytes + 164 bytes of fixed fields + 24 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static BlockType deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `BlockType` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `BlockType` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `BlockType` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockTextures](BlockTextures.md)
- [BlockFlags](BlockFlags.md)
- [BlockMaterial](BlockMaterial.md)
- [DrawType](DrawType.md)
- [BlockMovementSettings](BlockMovementSettings.md)
- [BlockGathering](BlockGathering.md)
- [BlockPlacementSettings](BlockPlacementSettings.md)
- [BlockMount](BlockMount.md)
- [BlockParticleSet](BlockParticleSet.md)
- [ColorLight](ColorLight.md)
- [Hitbox](Hitbox.md)
- [BlockRotation](BlockRotation.md)
- [BlockBreakingDecal](BlockBreakingDecal.md)
