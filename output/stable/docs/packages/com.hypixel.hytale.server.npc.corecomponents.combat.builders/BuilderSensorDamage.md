---
title: "BuilderSensorDamage"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.combat.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.combat.builders.BuilderSensorDamage"
api_surface: false
extends: "BuilderSensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "combat"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.combat.builders`

```java
public class BuilderSensorDamage extends BuilderSensorBase
```

NPC behavior sensor builder for SensorDamage functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `String[]` | `REQUIRE_ONE_OF` | `new String[]{"Combat", "Drowning", "Environment", "Other"}` |
| `public static final` | `String[]` | `ANTECEDENT` | `new String[]{"TargetSlot"}` |
| `public static final` | `String[]` | `SUBSEQUENT` | `new String[]{"Drowning", "Environment", "Other"}` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `boolean` | `combatDamage` |
| `protected` | `boolean` | `friendlyDamage` |
| `protected` | `boolean` | `drowningDamage` |
| `protected` | `boolean` | `environmentDamage` |
| `protected` | `boolean` | `otherDamage` |
| `protected` | `String` | `targetSlot` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `SensorDamage` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull @Override public` | `Builder<Sensor>` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `boolean` | `isCombatDamage()` |
| `public` | `boolean` | `isFriendlyDamage()` |
| `public` | `boolean` | `isDrowningDamage()` |
| `public` | `boolean` | `isEnvironmentDamage()` |
| `public` | `boolean` | `isOtherDamage()` |
| `public` | `int` | `getTargetSlot(@Nonnull BuilderSupport support)` |
