---
title: "com.hypixel.hytale.server.core.asset.type.item.config"
package: "com.hypixel.hytale.server.core.asset.type.item.config"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "item"
  - "config"
  - "asset"
  - "package-index"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.item.config`

Item and crafting recipe asset configuration types. Defines the data model for all items, recipes, tools, weapons, armor, and related configurations. Types marked as API surface are used by multiple game systems. The package includes two subpackages: `container` for drop table logic and `metadata` for system-specific item metadata.

## Primary Asset Types

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [Item](Item.md) | class | yes | Central item asset definition with all item properties. |
| [CraftingRecipe](CraftingRecipe.md) | class | yes | Crafting recipe with inputs, outputs, bench requirements. |
| [ItemDropList](ItemDropList.md) | class | no | Reusable named drop list asset. |
| [BlockGroup](BlockGroup.md) | class | no | Named group of block types for recipes and tools. |

## Item Behavior Types

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [ItemWeapon](ItemWeapon.md) | class | yes | Weapon damage, speed, and knockback configuration. |
| [ItemTool](ItemTool.md) | class | yes | Tool mining speed and durability configuration. |
| [ItemTool.DurabilityLossBlockTypes](ItemTool.DurabilityLossBlockTypes.md) | class | yes | Per-block-type durability loss rates. |
| [ItemToolSpec](ItemToolSpec.md) | class | yes | Tool capability specifications. |
| [ItemArmor](ItemArmor.md) | class | yes | Armor defense and slot configuration. |
| [ItemGlider](ItemGlider.md) | class | yes | Glider physics parameters. |
| [ItemUtility](ItemUtility.md) | class | yes | Consumable/usable item behavior. |
| [PortalKey](PortalKey.md) | class | yes | Portal access key configuration. |

## Display & Appearance

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [AssetIconProperties](AssetIconProperties.md) | class | yes | Icon rendering configuration (scale, translation, rotation). |
| [ItemTranslationProperties](ItemTranslationProperties.md) | class | yes | Localization/translation keys. |
| [ItemAppearanceCondition](ItemAppearanceCondition.md) | class | yes | Conditional visual appearance rules. |
| [ItemReticleConfig](ItemReticleConfig.md) | class | no | Crosshair/reticle configuration. |
| [ItemReticle](ItemReticle.md) | class | no | Single reticle definition. |
| [ItemReticleWithDuration](ItemReticleWithDuration.md) | class | no | Duration-based reticle state. |

## Item Systems

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [ItemEntityConfig](ItemEntityConfig.md) | class | yes | Dropped entity spawning configuration. |
| [ItemPullbackConfig](ItemPullbackConfig.md) | class | yes | Charge/pullback mechanics for bows. |
| [ItemStackContainerConfig](ItemStackContainerConfig.md) | class | yes | Container item (bag/pouch) configuration. |
| [BlockSelectorToolData](BlockSelectorToolData.md) | class | yes | Block selector tool UI configuration. |
| [BuilderToolItemReferenceAsset](BuilderToolItemReferenceAsset.md) | class | no | Builder tool item reference. |

## Categorization

| Type | Kind | Description |
|---|---|---|
| [ItemCategory](ItemCategory.md) | class | UI sorting categories. |
| [ItemQuality](ItemQuality.md) | class | Quality/rarity tiers. |
| [FieldcraftCategory](FieldcraftCategory.md) | class | Field crafting recipe categories. |
| [ResourceType](ResourceType.md) | class | Material-based crafting resource types. |
| [ItemDrop](ItemDrop.md) | class | Single drop entry (item, quantity, chance). |
| [InteractionModifierId](InteractionModifierId.md) | enum | Interaction modifier identifiers. |

## Subpackages

| Package | Description |
|---|---|
| [container](../com.hypixel.hytale.server.core.asset.type.item.config.container/index.md) | Item drop container hierarchy for loot tables. |
| [metadata](../com.hypixel.hytale.server.core.asset.type.item.config.metadata/index.md) | System-specific item metadata extensions. |
