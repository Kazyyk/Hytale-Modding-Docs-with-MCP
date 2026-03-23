---
title: "ShopAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.shop"
fqcn: "com.hypixel.hytale.builtin.adventure.shop.ShopAsset"
api_surface: false
extends: ~
implements:
  - "JsonAssetWithMap<String, DefaultAssetMap<String, ShopAsset>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "adventure"
  - "shop"
---

**Package:** `com.hypixel.hytale.builtin.adventure.shop`

```java
public class ShopAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ShopAsset>>
```

Implementation of `JsonAssetWithMap<String, DefaultAssetMap<String, ShopAsset>>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `ASSET_STORE` | `AssetStore<String, ShopAsset, DefaultAssetMap<String, ShopAsset>>` | Static AssetStore<String, ShopAsset, DefaultAssetMap<String, ShopAsset>> field. |
| `extraData` | `AssetExtraInfo.Data` | AssetExtraInfo.Data field. |
| `id` | `String` | String field. |
| `elements` | `ChoiceElement[]` | ChoiceElement[] field. |

## Constructors

| Constructor | Description |
|---|---|
| `ShopAsset(String id, ChoiceElement[] elements)` | Creates a new ShopAsset instance. |
| `ShopAsset()` | Creates a new ShopAsset instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getAssetStore()` | `AssetStore<String, ShopAsset, DefaultAssetMap<String, ShopAsset>>` | static public method. |
| `getAssetMap()` | `DefaultAssetMap<String, ShopAsset>` | static public method. |
| `getId()` | `String` | public method. |
| `getElements()` | `ChoiceElement[]` | public method. |
| `toString()` | `String` | public method. |
