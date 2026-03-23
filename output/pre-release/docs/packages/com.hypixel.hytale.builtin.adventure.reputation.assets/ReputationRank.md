---
title: "ReputationRank"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.reputation.assets"
fqcn: "com.hypixel.hytale.builtin.adventure.reputation.assets.ReputationRank"
api_surface: false
extends: null
implements: ["JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "reputation"
  - "assets"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.reputation.assets`

```java
public class ReputationRank implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,ReputationRank>` | `CODEC` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `private static` | `AssetStore<String,ReputationRank,DefaultAssetMap<String,ReputationRank>>` | `ASSET_STORE` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `int` | `minValue` |
| `protected` | `int` | `maxValue` |
| `protected` | `Attitude` | `attitude` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `AssetStore<String,ReputationRank,DefaultAssetMap<String,ReputationRank>>` | `getAssetStore()` |
| `public static` | `DefaultAssetMap<String,ReputationRank>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `int` | `getMinValue()` |
| `public` | `int` | `getMaxValue()` |
| `public` | `Attitude` | `getAttitude()` |
| `public` | `boolean` | `containsValue(int value)` |
| `@Nonnull @Override public` | `String` | `toString()` |
