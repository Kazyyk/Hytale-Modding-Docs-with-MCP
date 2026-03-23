---
title: "KillObjectiveTaskAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.assets"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.assets.KillObjectiveTaskAsset"
api_surface: false
extends: "CountObjectiveTaskAsset"
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
public class KillObjectiveTaskAsset extends CountObjectiveTaskAsset
```

Asset definition for KillObjectiveTask configuration data.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `npcGroupId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `KillObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers, int count, String npcGroupId)` |
| `protected` | | `KillObjectiveTaskAsset()` |
| `@Nonnull @Override public` | `ObjectiveTaskAsset.TaskScope` | `getTaskScope()` |
| `public` | `String` | `getNpcGroupId()` |
| `@Override protected` | `boolean` | `matchesAsset0(ObjectiveTaskAsset task)` |
| `@Nonnull @Override public` | `String` | `toString()` |
