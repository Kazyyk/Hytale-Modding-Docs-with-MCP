---
title: "ObjectiveLocationMarkerAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.ObjectiveLocationMarkerAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap<String, DefaultAssetMap<String, ObjectiveLocationMarkerAsset>>"]
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
public class ObjectiveLocationMarkerAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ObjectiveLocationMarkerAsset>>
```

Asset definition for ObjectiveLocationMarker configuration data.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` | `new ValidatorCache<>(new AssetKeyValidator<>(ObjectiveLocationMarkerAsset::getAssetStore))` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static` | `AssetStore<String, ObjectiveLocationMarkerAsset, DefaultAssetMap<String, ObjectiveLocationMarkerAsset>>` | `ASSET_STORE` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `ObjectiveTypeSetup` | `objectiveTypeSetup` |
| `protected` | `ObjectiveLocationMarkerArea` | `area` |
| `protected` | `String[]` | `environmentIds` |
| `protected` | `int[]` | `environmentIndexes` |
| `protected` | `ObjectiveLocationTriggerCondition[]` | `triggerConditions` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String, ObjectiveLocationMarkerAsset, DefaultAssetMap<String, ObjectiveLocationMarkerAsset>>` | `getAssetStore()` |
| `public static` | `DefaultAssetMap<String, ObjectiveLocationMarkerAsset>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `ObjectiveTypeSetup` | `getObjectiveTypeSetup()` |
| `public` | `ObjectiveLocationMarkerArea` | `getArea()` |
| `public` | `String[]` | `getEnvironmentIds()` |
| `public` | `int[]` | `getEnvironmentIndexes()` |
| `public` | `ObjectiveLocationTriggerCondition[]` | `getTriggerConditions()` |
| `@Nonnull @Override public` | `String` | `toString()` |
