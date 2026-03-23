---
title: "SetupObjective"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.objectivesetup"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.objectivesetup.SetupObjective"
api_surface: false
extends: "ObjectiveTypeSetup"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "config"
  - "objectivesetup"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.config.objectivesetup`

```java
public class SetupObjective extends ObjectiveTypeSetup
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<SetupObjective>` | `CODEC` |
| `protected` | `String` | `objectiveId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `String` | `getObjectiveIdToStart()` |
| `@Nullable @Override public` | `Objective` | `setup(Set<UUID> playerUUIDs, UUID worldUUID, UUID markerUUID, Store<EntityStore> store)` |
| `@Nonnull @Override public` | `String` | `toString()` |
