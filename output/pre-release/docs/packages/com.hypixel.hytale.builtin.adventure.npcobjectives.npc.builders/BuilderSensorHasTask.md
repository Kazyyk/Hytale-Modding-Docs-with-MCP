---
title: "BuilderSensorHasTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.npc.builders"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.npc.builders.BuilderSensorHasTask"
api_surface: false
extends: "BuilderSensorBase"
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
public class BuilderSensorHasTask extends BuilderSensorBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `StringArrayHolder` | `tasksById` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `Sensor` | `build(BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull @Override public` | `Builder<Sensor>` | `readConfig(JsonElement data)` |
| `@Nullable public` | `String[]` | `getTasksById(BuilderSupport support)` |
