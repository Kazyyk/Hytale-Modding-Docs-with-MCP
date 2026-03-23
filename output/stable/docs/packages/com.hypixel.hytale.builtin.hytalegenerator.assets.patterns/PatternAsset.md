---
title: "PatternAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.patterns.PatternAsset"
api_surface: false
extends: null
implements:
  - "Cleanable"
  - "JsonAssetWithMap"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "builtin"
  - "patterns"
---
**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.patterns`

```java
public abstract class PatternAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, PatternAsset>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `boolean` | `skip` |
| `private` | `String` | `exportName` |
| `public` | `SeedBox` | `parentSeed` |
| `public` | `MaterialCache` | `materialCache` |
| `public` | `ReferenceBundle` | `referenceBundle` |
| `public` | `WorkerIndexer.Id` | `workerId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `` | `PatternAsset()` |
| `public abstract` | `Pattern` | `build(@Nonnull PatternAsset.Argument var1)` |
| `public` | `boolean` | `isSkipped()` |
| `public static` | `PatternAsset` | `getExportedAsset(@Nonnull String name)` |
| `public` | `String` | `getId()` |
| `public` | `void` | `cleanUp()` |
| `public static` | `PatternAsset.Argument` | `argumentFrom(@Nonnull DirectionalityAsset.Argument argument)` |
| `public static` | `PatternAsset.Argument` | `argumentFrom(@Nonnull PropAsset.Argument argument)` |
