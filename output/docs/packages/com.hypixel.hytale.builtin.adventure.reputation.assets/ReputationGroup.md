---
title: "ReputationGroup"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.reputation.assets"
fqcn: "com.hypixel.hytale.builtin.adventure.reputation.assets.ReputationGroup"
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
public class ReputationGroup implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,ReputationGroup>` | `CODEC` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `private static` | `AssetStore<String,ReputationGroup,DefaultAssetMap<String,ReputationGroup>>` | `ASSET_STORE` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `String[]` | `npcGroups` |
| `protected` | `int` | `initialReputationValue` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `AssetStore<String,ReputationGroup,DefaultAssetMap<String,ReputationGroup>>` | `getAssetStore()` |
| `public static` | `DefaultAssetMap<String,ReputationGroup>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `String[]` | `getNpcGroups()` |
| `public` | `int` | `getInitialReputationValue()` |
