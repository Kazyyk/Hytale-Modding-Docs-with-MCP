---
title: "ObjectiveLineAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.ObjectiveLineAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap<String, DefaultAssetMap<String, ObjectiveLineAsset>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "config"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.config`

```java
public class ObjectiveLineAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ObjectiveLineAsset>>
```

Asset definition for ObjectiveLine configuration data.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` | `new ValidatorCache<>(new AssetKeyValidator<>(ObjectiveLineAsset::getAssetStore))` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static` | `AssetStore<String, ObjectiveLineAsset, DefaultAssetMap<String, ObjectiveLineAsset>>` | `ASSET_STORE` |
| `protected` | `AssetExtraInfo.Data` | `extraData` |
| `protected` | `String` | `id` |
| `protected` | `String` | `category` |
| `protected` | `String[]` | `objectiveIds` |
| `protected` | `String` | `objectiveTitleKey` |
| `protected` | `String` | `objectiveDescriptionKey` |
| `protected` | `String[]` | `nextObjectiveLineIds` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `ObjectiveLineAsset(String id, String category, String[] objectiveIds, String objectiveTitleKey, String objectiveDescriptionKey, String[] nextObjectiveLineIds)` |
| `protected` | | `ObjectiveLineAsset()` |
| `public static` | `AssetStore<String, ObjectiveLineAsset, DefaultAssetMap<String, ObjectiveLineAsset>>` | `getAssetStore()` |
| `public static` | `DefaultAssetMap<String, ObjectiveLineAsset>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `String` | `getCategory()` |
| `public` | `String[]` | `getObjectiveIds()` |
| `@Nullable public` | `String` | `getNextObjectiveId(String currentObjectiveId)` |
| `public` | `String` | `getObjectiveTitleKey()` |
| `public` | `String` | `getObjectiveDescriptionKey()` |
| `public` | `String[]` | `getNextObjectiveLineIds()` |
| `@Nonnull @Override public` | `String` | `toString()` |
