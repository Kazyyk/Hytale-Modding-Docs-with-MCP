---
title: "SetupObjectiveLine"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.objectivesetup"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.objectivesetup.SetupObjectiveLine"
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
public class SetupObjectiveLine extends ObjectiveTypeSetup
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<SetupObjectiveLine>` | `CODEC` |
| `protected` | `String` | `objectiveLineId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable @Override public` | `String` | `getObjectiveIdToStart()` |
| `@Nullable @Override public` | `Objective` | `setup(Set<UUID> playerUUIDs, UUID worldUUID, UUID markerUUID, Store<EntityStore> store)` |
| `@Nonnull @Override public` | `String` | `toString()` |
