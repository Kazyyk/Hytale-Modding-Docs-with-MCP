---
title: "BuilderSensorTarget"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.builders.BuilderSensorTarget"
api_surface: false
extends: "BuilderSensorWithEntityFilters"
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
public class BuilderSensorTarget extends BuilderSensorWithEntityFilters
```

Extends `BuilderSensorWithEntityFilters`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `SensorTarget` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `SensorTarget(this, builderSupport)` |
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `Builder<Sensor>` | `readConfig(@Nonnull JsonElement data)` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `` | `public double` | `getRange(@Nonnull BuilderSupport support)` |
| `` | `public boolean` | `getAutoUnlockTarget(@Nonnull BuilderSupport support)` |
| `` | `public int` | `getTargetSlot(@Nonnull BuilderSupport builderSupport)` |
