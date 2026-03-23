---
title: "BuilderSensorCount"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.builders.BuilderSensorCount"
api_surface: false
extends: "BuilderSensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "corecomponents"
  - "entity"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.entity.builders`

```java
public class BuilderSensorCount extends BuilderSensorBase
```

NPC sensor builder: Check if there is a certain number of NPCs or players within a specific range.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String[]` | `includeGroups` |
| `protected` | `String[]` | `excludeGroups` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `SensorCount` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `SensorCount(this, builderSupport)` |
| `@Override public` | `Builder<Sensor>` | `readConfig(@Nonnull JsonElement data)` |
| `` | `public int[]` | `getCount(@Nonnull BuilderSupport builderSupport)` |
| `` | `public double[]` | `getRange(@Nonnull BuilderSupport builderSupport)` |
| `` | `public int[]` | `getIncludeGroups()` |
| `` | `public int[]` | `getExcludeGroups()` |
