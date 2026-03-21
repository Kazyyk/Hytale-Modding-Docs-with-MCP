---
title: "ObjectiveAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.ObjectiveAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap<String, DefaultAssetMap<String, ObjectiveAsset>>"]
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
public class ObjectiveAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ObjectiveAsset>>
```

Asset definition for Objective configuration data.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` | `new ValidatorCache<>(new AssetKeyValidator<>(ObjectiveAsset::getAssetStore))` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static` | `AssetStore<String, ObjectiveAsset, DefaultAssetMap<String, ObjectiveAsset>>` | `ASSET_STORE` |
| `protected` | `AssetExtraInfo.Data` | `extraData` |
| `protected` | `String` | `id` |
| `protected` | `String` | `category` |
| `protected` | `TaskSet[]` | `taskSets` |
| `protected` | `ObjectiveCompletionAsset[]` | `completionHandlers` |
| `protected` | `String` | `objectiveTitleKey` |
| `protected` | `String` | `objectiveDescriptionKey` |
| `protected` | `boolean` | `removeOnItemDrop` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `ObjectiveAsset(String id,
        String category,
        TaskSet[] taskSets,
        ObjectiveCompletionAsset[] completionHandlers,
        String objectiveTitleKey,
        String objectiveDescriptionKey,
        boolean removeOnItemDrop)` |
| `protected` | | `ObjectiveAsset()` |
| `public static` | `AssetStore<String, ObjectiveAsset, DefaultAssetMap<String, ObjectiveAsset>>` | `getAssetStore()` |
| `public static` | `DefaultAssetMap<String, ObjectiveAsset>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `String` | `getCategory()` |
| `public` | `String` | `getTitleKey()` |
| `public` | `String` | `getDescriptionKey()` |
| `public` | `TaskSet[]` | `getTaskSets()` |
| `public` | `ObjectiveCompletionAsset[]` | `getCompletionHandlers()` |
| `public` | `String` | `getObjectiveTitleKey()` |
| `public` | `String` | `getObjectiveDescriptionKey()` |
| `public` | `boolean` | `isRemoveOnItemDrop()` |
| `public` | `boolean` | `isValidForPlayer()` |
| `public` | `boolean` | `isValidForMarker()` |
| `@Nonnull @Override public` | `String` | `toString()` |
