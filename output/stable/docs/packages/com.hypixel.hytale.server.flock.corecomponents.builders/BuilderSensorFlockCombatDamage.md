---
title: "BuilderSensorFlockCombatDamage"
kind: "class"
package: "com.hypixel.hytale.server.flock.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.flock.corecomponents.builders.BuilderSensorFlockCombatDamage"
api_surface: false
extends: "BuilderSensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "flock"
  - "corecomponents"
  - "builders"
---

**Package:** `com.hypixel.hytale.server.flock.corecomponents.builders`

```java
public class BuilderSensorFlockCombatDamage extends BuilderSensorBase
```

NPC behavior sensor builder for SensorFlockCombatDamage functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `boolean` | `leaderOnly` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `SensorFlockCombatDamage` | `build(BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull @Override public` | `Builder<Sensor>` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `boolean` | `isLeaderOnly()` |
