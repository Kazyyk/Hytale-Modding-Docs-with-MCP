---
title: "BountyObjectiveTaskAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.assets"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.assets.BountyObjectiveTaskAsset"
api_surface: false
extends: "ObjectiveTaskAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "npcobjectives"
  - "assets"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcobjectives.assets`

```java
public class BountyObjectiveTaskAsset extends ObjectiveTaskAsset
```

Asset definition for BountyObjectiveTask configuration data.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `npcId` |
| `protected` | `WorldLocationProvider` | `worldLocationProvider` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `BountyObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers, String npcId, WorldLocationProvider worldLocationProvider)` |
| `protected` | | `BountyObjectiveTaskAsset()` |
| `@Nonnull @Override public` | `ObjectiveTaskAsset.TaskScope` | `getTaskScope()` |
| `public` | `String` | `getNpcId()` |
| `public` | `WorldLocationProvider` | `getWorldLocationProvider()` |
| `@Override protected` | `boolean` | `matchesAsset0(ObjectiveTaskAsset task)` |
| `@Nonnull @Override public` | `String` | `toString()` |
