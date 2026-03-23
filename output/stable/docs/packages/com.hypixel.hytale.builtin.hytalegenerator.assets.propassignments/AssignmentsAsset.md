---
title: "AssignmentsAsset"
kind: "abstract class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.propassignments"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.propassignments.AssignmentsAsset"
api_surface: false
extends: ~
implements: ["Cleanable", "JsonAssetWithMap<String, DefaultAssetMap<String, AssignmentsAsset>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "propassignments"
  - "abstract class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.propassignments`

```java
public abstract class AssignmentsAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, AssignmentsAsset>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final Map<String,` | `AssignmentsAsset>` | `exportedNodes` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `boolean` | `skip` |
| `private` | `String` | `exportName` |
| `public` | `SeedBox` | `parentSeed` |
| `public` | `MaterialCache` | `materialCache` |
| `public` | `ReferenceBundle` | `referenceBundle` |
| `public` | `int` | `runtime` |
| `public` | `WorkerIndexer.Id` | `workerId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `Assignments` | `build(@Nonnull AssignmentsAsset.Argument var1)` |
| `public` | `boolean` | `skip()` |
| `public static` | `AssignmentsAsset` | `getExportedAsset(@Nonnull String name)` |
| `public` | `String` | `getId()` |
| `@Override public` | `void` | `cleanUp()` |

## Inner Types

- `AssignmentsAsset.Argument`
