---
title: "com.hypixel.hytale.server.core.asset.type.item.config.container"
package: "com.hypixel.hytale.server.core.asset.type.item.config.container"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "item"
  - "drop-container"
  - "package-index"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.item.config.container`

Item drop container hierarchy for loot table evaluation. Containers are composed into trees that produce randomized item drops. Deserialized polymorphically via `CodecMapCodec` using a `"Type"` discriminator key. None of the types in this package are part of the public API surface.

## Types

| Type | Kind | Description |
|---|---|---|
| [ItemDropContainer](ItemDropContainer.md) | class | Abstract base with weighted selection and polymorphic codec. |
| [SingleItemDropContainer](SingleItemDropContainer.md) | class | Produces a single item drop. |
| [MultipleItemDropContainer](MultipleItemDropContainer.md) | class | Produces a random count of drops from children. |
| [ChoiceItemDropContainer](ChoiceItemDropContainer.md) | class | Weighted random selection with configurable roll count. |
| [DroplistItemDropContainer](DroplistItemDropContainer.md) | class | Delegates to a named `ItemDropList` asset. |
| [EmptyItemDropContainer](EmptyItemDropContainer.md) | class | Produces no drops (null container). |
