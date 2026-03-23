---
title: "BuilderActionStartObjective"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.npc.builders"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.npc.builders.BuilderActionStartObjective"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "npcobjectives"
  - "npc"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcobjectives.npc.builders`

```java
public class BuilderActionStartObjective extends BuilderActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `AssetHolder` | `objectiveId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `ActionStartObjective` | `build(BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `BuilderActionStartObjective` | `readConfig(JsonElement data)` |
| `public` | `String` | `getObjectiveId(BuilderSupport support)` |
