---
title: "PropRuntimeAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.propstageiterations"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.propstageiterations.PropRuntimeAsset"
api_surface: false
extends: null
implements: ["Cleanable", "JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "propstageiterations"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.propstageiterations`

```java
public class PropRuntimeAsset implements Cleanable, JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,PropRuntimeAsset>` | `CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `boolean` | `skip` |
| `private` | `int` | `runtime` |
| `private` | `PositionProviderAsset` | `positionProviderAsset` |
| `private` | `AssignmentsAsset` | `assignmentsAsset` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `isSkip()` |
| `@Override public` | `void` | `cleanUp()` |
| `public` | `PositionProvider` | `buildPositionProvider(SeedBox parentSeed, ReferenceBundle referenceBundle, WorkerIndexer.Id workerId)` |
| `public` | `Assignments` | `buildPropDistribution(SeedBox parentSeed, MaterialCache materialCache, int runtime, ReferenceBundle referenceBundle, WorkerIndexer.Id workerId)` |
| `public` | `int` | `getRuntime()` |
| `public` | `String` | `getId()` |
