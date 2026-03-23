---
title: "ItemBase"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemBase"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "item"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class ItemBase
```

Comprehensive item type definition containing all identity, visual, category, tool/weapon/armor/glider/utility specializations, interaction configuration, and durability properties.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| `String` | `model` | Yes |  |
| `float` | `scale` | No |  |
| `String` | `texture` | Yes |  |
| `String` | `animation` | Yes |  |
| `String` | `playerAnimationsId` | Yes |  |
| `boolean` | `usePlayerAnimations` | No |  |
| `int` | `maxStack` | No |  |
| `int` | `reticleIndex` | No |  |
| `String` | `icon` | Yes |  |
| [AssetIconProperties](AssetIconProperties.md) | `iconProperties` | Yes |  |
| [ItemTranslationProperties](ItemTranslationProperties.md) | `translationProperties` | Yes |  |
| `int` | `itemLevel` | No |  |
| `int` | `qualityIndex` | No |  |
| [ItemResourceType](ItemResourceType.md)`[]` | `resourceTypes` | Yes |  |
| `boolean` | `consumable` | No |  |
| `boolean` | `variant` | No |  |
| `int` | `blockId` | No |  |
| [ItemTool](ItemTool.md) | `tool` | Yes |  |
| [ItemWeapon](ItemWeapon.md) | `weapon` | Yes |  |
| [ItemArmor](ItemArmor.md) | `armor` | Yes |  |
| [ItemGlider](ItemGlider.md) | `gliderConfig` | Yes |  |
| [ItemUtility](ItemUtility.md) | `utility` | Yes |  |
| [BlockSelectorToolData](BlockSelectorToolData.md) | `blockSelectorTool` | Yes |  |
| [ItemBuilderToolData](ItemBuilderToolData.md) | `builderToolData` | Yes |  |
| [ItemEntityConfig](ItemEntityConfig.md) | `itemEntity` | Yes |  |
| `String` | `set` | Yes |  |
| `String``[]` | `categories` | Yes |  |
| [ModelParticle](ModelParticle.md)`[]` | `particles` | Yes |  |
| [ModelParticle](ModelParticle.md)`[]` | `firstPersonParticles` | Yes |  |
| [ModelTrail](ModelTrail.md)`[]` | `trails` | Yes |  |
| [ColorLight](ColorLight.md) | `light` | Yes |  |
| `double` | `durability` | No |  |
| `int` | `soundEventIndex` | No |  |
| `int` | `itemSoundSetIndex` | No |  |
| `Map<`[InteractionType](InteractionType.md)`, ``Integer``>` | `interactions` | Yes |  |
| `Map<``String``, ``Integer``>` | `interactionVars` | Yes |  |
| [InteractionConfiguration](InteractionConfiguration.md) | `interactionConfig` | Yes |  |
| `String` | `droppedItemAnimation` | Yes |  |
| `int``[]` | `tagIndexes` | Yes |  |
| `Map``<``Integer, ItemAppearanceCondition[]``>` | `itemAppearanceConditions` | Yes |  |
| `int``[]` | `displayEntityStatsHUD` | Yes |  |
| [ItemPullbackConfiguration](ItemPullbackConfiguration.md) | `pullbackConfig` | Yes |  |
| `boolean` | `clipsGeometry` | No |  |
| `boolean` | `renderDeployablePreview` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 4 |
| `FIXED_BLOCK_SIZE` | 147 |
| `VARIABLE_FIELD_COUNT` | 26 |
| `VARIABLE_BLOCK_START` | 251 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 4 null-bit bytes + 147 bytes of fixed fields + 26 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ItemBase deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ItemBase` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ItemBase` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ItemBase` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ItemTool](ItemTool.md)
- [ItemWeapon](ItemWeapon.md)
- [ItemArmor](ItemArmor.md)
- [ItemGlider](ItemGlider.md)
- [ItemUtility](ItemUtility.md)
- [ItemBuilderToolData](ItemBuilderToolData.md)
- [BlockSelectorToolData](BlockSelectorToolData.md)
- [AssetIconProperties](AssetIconProperties.md)
- [ItemTranslationProperties](ItemTranslationProperties.md)
- [ItemEntityConfig](ItemEntityConfig.md)
- [ItemCategory](ItemCategory.md)
- [ItemResourceType](ItemResourceType.md)
- [ItemAppearanceCondition](ItemAppearanceCondition.md)
- [InteractionConfiguration](InteractionConfiguration.md)
