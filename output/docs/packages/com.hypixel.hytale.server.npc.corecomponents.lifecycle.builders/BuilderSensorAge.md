---
title: "BuilderSensorAge"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders.BuilderSensorAge"
api_surface: false
extends: "BuilderSensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "lifecycle"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders`

```java
public class BuilderSensorAge extends BuilderSensorBase
```

NPC behavior sensor builder for SensorAge functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `TemporalAmount` | `MIN_TIME` | `Duration.ZERO` |
| `public static final` | `TemporalAmount` | `MAX_TIME` | `Period.ofDays(Integer.MAX_VALUE)` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected final` | `TemporalArrayHolder` | `ageRange` | `new TemporalArrayHolder()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `Sensor` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull @Override public` | `Builder<Sensor>` | `readConfig(@Nonnull JsonElement data)` |
| `@Nonnull public` | `Instant[]` | `getAgeRange(@Nonnull BuilderSupport support)` |
