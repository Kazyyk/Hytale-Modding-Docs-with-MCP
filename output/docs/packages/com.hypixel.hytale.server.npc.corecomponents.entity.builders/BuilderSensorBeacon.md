---
title: "BuilderSensorBeacon"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.builders.BuilderSensorBeacon"
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
public class BuilderSensorBeacon extends BuilderSensorBase
```

NPC sensor builder: Checks to see if any messages have been broadcasted by nearby NPCs.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `targetSlot` |
| `protected` | `boolean` | `consume` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `SensorBeacon` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `SensorBeacon(this, builderSupport)` |
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Override public` | `Builder<Sensor>` | `readConfig(@Nonnull JsonElement data)` |
| `` | `public int` | `getMessageSlot(@Nonnull BuilderSupport builderSupport)` |
| `` | `public double` | `getRange(@Nonnull BuilderSupport builderSupport)` |
| `` | `public int` | `getTargetSlot(@Nonnull BuilderSupport support)` |
| `` | `public boolean` | `isConsume()` |
