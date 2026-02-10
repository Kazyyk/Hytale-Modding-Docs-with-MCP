---
title: "Item Schema"
kind: "schema"
asset_type: "Item"
package: "com.hypixel.hytale.server.core.asset.type.item.config"
api_surface: "public"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - "schemas"
  - "json"
  - "item"
  - "asset"
---

> Class: `com.hypixel.hytale.server.core.asset.type.item.config.Item`
> Codec: `AssetBuilderCodec<String, Item>`

Items are the primary asset type in Hytale. Blocks are defined as nested [BlockType](block.md) definitions within items. Most fields support inheritance via `appendInherited`, allowing asset pack items to extend base game items. The codec has an `afterDecode` hook (`processConfig`) that computes defaults for `MaxStack`, interactions, and other derived fields.

## Schema Fields

### Identity & Display

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `Icon` | `String` | `string` | no | `null` | Path to the item icon image (e.g., `Icons/ItemsGenerated/{assetId}.png`). |
| `Categories` | `String[]` | `array of strings` | no | `null` | Categories this item appears in on the creative library menu. |
| `IconProperties` | `AssetIconProperties` | `object` | no | `null` | Advanced icon rendering properties. Hidden in the editor UI. |
| `TranslationProperties` | `ItemTranslationProperties` | `object` | no | `null` | Custom translation keys for item name and description. |
| `ItemLevel` | `Integer` | `integer` | no | `0` | Item power/tier level. |
| `Quality` | `String` | `string` | no | `null` | Reference to an ItemQuality asset (affects item entity rendering). |
| `Set` | `String` | `string` | no | `null` | Item set identifier for grouping related items (e.g., armor sets). |
| `Variant` | `Boolean` | `boolean` | no | `false` | Whether this item is a visual variant (e.g., connected block variant). Filtered from creative library by default. |

### Model & Rendering

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `Model` | `String` | `string` | no | `null` | Path to a `.blockymodel` file for item rendering. |
| `Scale` | `Double` | `number` | no | `1.0` | Scale factor for item model rendering. |
| `Texture` | `String` | `string` | no | `"Items/Unknown.png"` | Path to the item model texture. |
| `Animation` | `String` | `string` | no | `null` | Animation file path for item model. |
| `UsePlayerAnimations` | `Boolean` | `boolean` | no | `false` | Whether this item uses player animation overrides. |
| `PlayerAnimationsId` | `String` | `string` | no | `"Default"` | Reference to an ItemPlayerAnimations asset for player hold/use animations. |
| `DroppedItemAnimation` | `String` | `string` | no | `null` | Animation for the item when dropped in the world. |
| `Reticle` | `String` | `string` | no | `null` | Reference to an ItemReticleConfig asset for custom crosshair. |
| `ClipsGeometry` | `Boolean` | `boolean` | no | `false` | Whether the item model clips through world geometry. |
| `RenderDeployablePreview` | `Boolean` | `boolean` | no | `false` | Whether to show a placement preview ghost when holding this item. |
| `PullbackConfig` | `ItemPullbackConfig` | `object` | no | `null` | Overrides first-person arm offset when close to obstacles. |

### Effects

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `Particles` | `ModelParticle[]` | `array of objects` | no | `null` | Particles played when this item is held (third person). |
| `FirstPersonParticles` | `ModelParticle[]` | `array of objects` | no | `null` | Particles played when this item is held (first person). |
| `Trails` | `ModelTrail[]` | `array of objects` | no | `null` | Trail effects attached to this item when held. |
| `Light` | `ColorLight` | `object` (color + intensity) | no | `null` | Light emitted when this item is held or dropped. |

### Inventory & Stacking

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `MaxStack` | `Integer` | `integer` (>0) | no | auto | Maximum stack size in inventory. Auto-computed if not set: 100 for plain items, 1 for tools/weapons/armor. |
| `MaxDurability` | `Double` | `number` | no | `0.0` | Maximum durability points. 0 means unbreakable. |
| `DurabilityLossOnHit` | `Double` | `number` | no | `0.0` | Durability points lost per hit when used as a weapon. |
| `FuelQuality` | `Double` | `number` | no | `1.0` | Fuel quality multiplier when used as furnace fuel. |
| `Consumable` | `Boolean` | `boolean` | no | `false` | Whether this item is consumed on use. |
| `DropOnDeath` | `Boolean` | `boolean` | no | `false` | Whether this item drops on player death. |
| `Container` | `ItemStackContainerConfig` | `object` | no | `ItemStackContainerConfig.DEFAULT` | Item stack container configuration (e.g., bags that hold other items). |
| `ItemEntity` | `ItemEntityConfig` | `object` | yes | `ItemEntityConfig.DEFAULT` | Configuration for how this item appears as a dropped entity in the world. |

### Gameplay Systems

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `Tool` | `ItemTool` | `object` | no | `null` | Tool configuration (mining speed, tool type, harvest level). |
| `Weapon` | `ItemWeapon` | `object` | no | `null` | Weapon configuration (damage, attack speed, range, combos). |
| `Armor` | `ItemArmor` | `object` | no | `null` | Armor configuration (defense, slot, equip model). |
| `Glider` | `ItemGlider` | `object` | no | `null` | Glider configuration for hang-glider items. |
| `Utility` | `ItemUtility` | `object` | no | `ItemUtility.DEFAULT` | Utility item configuration (consumables, throwables). |
| `BlockSelectorTool` | `BlockSelectorToolData` | `object` | no | `null` | Block selector tool configuration for builder tools. |
| `BuilderTool` | `BuilderToolData` | `object` | no | `null` | Builder tool configuration for creative building tools. |
| `PortalKey` | `PortalKey` | `object` | no | `null` | Portal key configuration for items that open portals. |

### Block Type

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `BlockType` | `String` (contained BlockType asset) | `object` (inline BlockType definition) | no | `null` | Inline [block type definition](block.md). Makes this item placeable as a block. The BlockType inherits the item's ID. |

### Interactions

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `Interactions` | `Map<InteractionType, String>` | `object` (enum keys -> RootInteraction asset refs) | no | `null` | Maps interaction types (Primary, Secondary, SwapFrom, etc.) to RootInteraction assets. |
| `InteractionConfig` | `InteractionConfiguration` | `object` | no | auto | Interaction configuration (aim distance, cooldowns). Auto-set based on weapon presence. |
| `InteractionVars` | `Map<String, String>` | `object` (string -> RootInteraction refs) | no | `null` | Named interaction variables for dynamic interaction resolution. |

### Crafting & Resources

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `Recipe` | `CraftingRecipe` | `object` | no | `null` | Inline [crafting recipe](crafting-recipe.md) that produces this item. Auto-generates a CraftingRecipe asset with this item as primary output. |
| `ResourceTypes` | `ItemResourceType[]` | `array of {Id: string, Quantity: integer(>0)}` | no | `null` | Resource types and quantities this item provides when used as a crafting ingredient. |

### Sound

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `SoundEventId` | `String` | `string` | no | `null` | Reference to a SoundEvent asset played when using this item. |
| `ItemSoundSetId` | `String` | `string` | no | `"ISS_Default"` | Reference to an ItemSoundSet asset for item interaction sounds. |

### HUD & Appearance

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `ItemAppearanceConditions` | `Map<String, ItemAppearanceCondition[]>` | `object` (EntityStat -> conditions) | no | `null` | Per-EntityStat array of appearance conditions. Only one condition active at a time. |
| `DisplayEntityStatsHUD` | `String[]` | `array of strings` | no | `null` | EntityStat IDs whose HUD UI should be displayed when holding this item. |

### States

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `State` | `Map<String, Item>` | `object` (state name -> contained Item) | no | `null` | State variants of this item. Each entry is a contained Item asset inheriting from the parent. |

## Related

- **[Block Type Schema](block.md)** — Nested block type definition
- **[Crafting Recipe Schema](crafting-recipe.md)** — Inline recipe definition
- **[JSON Asset Schemas Overview](index.md)** — BuilderCodec pattern documentation
