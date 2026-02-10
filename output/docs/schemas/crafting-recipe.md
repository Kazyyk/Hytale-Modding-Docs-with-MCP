---
title: "Crafting Recipe Schema"
kind: "schema"
asset_type: "CraftingRecipe"
package: "com.hypixel.hytale.server.core.asset.type.item.config"
api_surface: "public"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - "schemas"
  - "json"
  - "crafting"
  - "asset"
---

> Class: `com.hypixel.hytale.server.core.asset.type.item.config.CraftingRecipe`
> Codec: `AssetBuilderCodec<String, CraftingRecipe>`

Crafting recipes define how items are created from input materials at crafting stations. Recipes can be defined as standalone assets or inline within an [Item](item.md) definition (via the `Recipe` field). When inline, the item auto-generates outputs.

## Schema Fields

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `Input` | `MaterialQuantity[]` | `array of MaterialQuantity` | yes | — | Required input materials. Each entry specifies an item (by Material ID), resource type, or tags, plus a quantity. |
| `Output` | `MaterialQuantity[]` | `array of MaterialQuantity` | no | `[]` | Output materials produced by the recipe. If empty and `PrimaryOutput` is set, auto-populated. |
| `PrimaryOutput` | `MaterialQuantity` | `object` | no | `null` | Primary output material. When recipe is inline on an Item, this is auto-set to the parent item. |
| `OutputQuantity` | `Integer` | `integer` | no | `1` | Quantity of primary output produced per craft. |
| `BenchRequirement` | `BenchRequirement[]` | `array of objects` | no | `null` | Required crafting stations (see below). |
| `TimeSeconds` | `Double` | `number` (>=0) | no | `0.0` | Crafting time in seconds. 0 means instant. Should not be set for Fieldcraft recipes. |
| `KnowledgeRequired` | `Boolean` | `boolean` | no | `false` | Whether this recipe must be discovered/learned before use. Only valid for Crafting and DiagramCrafting bench types. |
| `RequiredMemoriesLevel` | `Integer` | `integer` (>=1) | no | `1` | Minimum Memories level required. Level 1 means always available. Higher levels gate recipes behind progression. |

## MaterialQuantity Sub-Schema

Each entry in `Input` and `Output` is a `MaterialQuantity` object:

| JSON Key | Java Type | JSON Type | Required | Description |
|----------|-----------|-----------|----------|-------------|
| `Material` | `String` | `string` | no | Reference to an Item asset ID. |
| `ResourceType` | `String` | `string` | no | Resource type identifier (alternative to specific material). |
| `Tags` | `String[]` | `array of strings` | no | Tag-based matching (any item with matching tags). |
| `Quantity` | `Integer` | `integer` | yes | Number of items required/produced. |
| `Quality` | `String` | `string` | no | Quality level requirement. |

At least one of `Material`, `ResourceType`, or `Tags` should be specified per entry.

## BenchRequirement Sub-Schema

Each entry in `BenchRequirement` specifies a crafting station constraint:

| JSON Key | Java Type | JSON Type | Required | Description |
|----------|-----------|-----------|----------|-------------|
| `Type` | `BenchType` | `string` (enum) | yes | Bench type: Crafting, Smelting, DiagramCrafting, Fieldcraft, etc. |
| `Id` | `String` | `string` | no | Reference to a specific bench asset. |
| `Categories` | `String[]` | `array of strings` | no | Bench categories that satisfy the requirement. |
| `RequiredTierLevel` | `Integer` | `integer` | no | Minimum bench tier level required. |

## Validation Rules

The codec enforces these validation constraints:

- `KnowledgeRequired` is only valid when `BenchRequirement` includes a `Crafting` or `DiagramCrafting` bench type
- `DiagramCrafting` recipes may have at most 1 output
- `Fieldcraft` recipes should not have `TimeSeconds` set (instant crafting only)

## Example

### Standalone Recipe

```json
{
  "Input": [
    { "Material": "Wood_Oak_Planks", "Quantity": 4 },
    { "Material": "Iron_Ingot", "Quantity": 2 }
  ],
  "OutputQuantity": 1,
  "BenchRequirement": [
    { "Type": "Crafting" }
  ],
  "TimeSeconds": 5.0
}
```

### Inline Recipe (within an Item)

```json
{
  "Icon": "Icons/ItemsGenerated/Iron_Sword.png",
  "Weapon": { ... },
  "Recipe": {
    "Input": [
      { "Material": "Iron_Ingot", "Quantity": 3 },
      { "Material": "Wood_Oak_Planks", "Quantity": 1 }
    ],
    "BenchRequirement": [
      { "Type": "Crafting" }
    ]
  }
}
```

When defined inline, `PrimaryOutput` is auto-set to the containing item.

## Related

- **[Item Schema](item.md)** — Parent asset type with inline `Recipe` field
- **[JSON Asset Schemas Overview](index.md)** — BuilderCodec pattern documentation
