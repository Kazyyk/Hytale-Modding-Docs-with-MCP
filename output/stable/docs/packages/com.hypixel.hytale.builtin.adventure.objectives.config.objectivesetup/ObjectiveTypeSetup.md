---
title: "ObjectiveTypeSetup"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.objectivesetup"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.objectivesetup.ObjectiveTypeSetup"
api_surface: false
extends: null
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
public abstract class ObjectiveTypeSetup
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `CodecMapCodec<ObjectiveTypeSetup>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public abstract` | `String` | `getObjectiveIdToStart()` |
| `@Nullable public abstract` | `Objective` | `setup(Set<UUID> var1, UUID var2, UUID var3, Store<EntityStore> var4)` |
| `@Nonnull @Override public` | `String` | `toString()` |
