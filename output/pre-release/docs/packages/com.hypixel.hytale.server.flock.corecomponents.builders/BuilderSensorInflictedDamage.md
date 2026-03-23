---
title: "BuilderSensorInflictedDamage"
kind: "class"
package: "com.hypixel.hytale.server.flock.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.flock.corecomponents.builders.BuilderSensorInflictedDamage"
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
public class BuilderSensorInflictedDamage extends BuilderSensorBase
```

NPC behavior sensor builder for SensorInflictedDamage functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `SensorInflictedDamage.Target` | `target` |
| `protected` | `boolean` | `friendlyFire` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `SensorInflictedDamage` | `build(BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull @Override public` | `Builder<Sensor>` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `boolean` | `isFriendlyFire()` |
| `public` | `SensorInflictedDamage.Target` | `getTarget()` |
