---
title: "ReachLocationMarkerAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.markers.reachlocation"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.markers.reachlocation.ReachLocationMarkerAsset"
api_surface: false
extends: null
implements:
  - "JsonAssetWithMap"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "objectives"
  - "markers"
  - "reachlocation"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.markers.reachlocation`

```java
public class ReachLocationMarkerAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ReachLocationMarkerAsset>>
```

Implements `JsonAssetWithMap`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `String` | `name` |
| `protected` | `float` | `radius` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static AssetStore<String, ReachLocationMarkerAsset, DefaultAssetMap<String, ReachLocationMarkerAsset>>` | `getAssetStore()` |
| `` | `public static DefaultAssetMap<String, ReachLocationMarkerAsset>` | `getAssetMap()` |
| `` | `public String` | `getId()` |
| `` | `public float` | `getRadius()` |
| `` | `public String` | `getName()` |
| `@Override public` | `String` | `toString()` |
