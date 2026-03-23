---
title: "com.hypixel.hytale.assetstore.map"
package: "com.hypixel.hytale.assetstore.map"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
---

**Package:** `com.hypixel.hytale.assetstore.map`

This package provides the asset map infrastructure for the Hytale asset store. Asset maps store JSON-loaded game assets with case-insensitive keys, tag-based indexing, multi-pack override chains, and integer-indexed lookup tables for performance-critical paths like block type resolution.

## Interfaces

| Type | Description |
|---|---|
| [JsonAssetWithMap](JsonAssetWithMap.md) | Marker interface for assets stored in an AssetMap |

## Classes

| Type | Description |
|---|---|
| [CaseInsensitiveHashStrategy](CaseInsensitiveHashStrategy.md) | Singleton case-insensitive hash strategy for asset keys |
| [DefaultAssetMap](DefaultAssetMap.md) | Base asset map with pack chains, tags, and path mapping |
| [AssetMapWithIndexes](AssetMapWithIndexes.md) | Extends DefaultAssetMap with integer-indexed tag storage |
| [BlockTypeAssetMap](BlockTypeAssetMap.md) | Dense-array asset map for block types with group tracking |
| [IndexedAssetMap](IndexedAssetMap.md) | Auto-incrementing index assignment without dense array |
| [IndexedLookupTableAssetMap](IndexedLookupTableAssetMap.md) | Auto-incrementing indexes with dense array lookup |
| [LookupTableAssetMap](LookupTableAssetMap.md) | Externally-indexed dense array asset map |
| [ProvidedIndexAssetMap](ProvidedIndexAssetMap.md) | Asset map with externally-computed index function |
