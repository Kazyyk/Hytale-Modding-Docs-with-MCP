---
title: "BuilderRole"
kind: "class"
package: "com.hypixel.hytale.server.npc.role.builders"
fqcn: "com.hypixel.hytale.server.npc.role.builders.BuilderRole"
api_surface: false
extends: "com.hypixel.hytale.server.npc.asset.builder.SpawnableWithModelBuilder"
implements:
  - "com.hypixel.hytale.server.npc.role.SpawnEffect"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:28:03Z"
tags:
  - "server"
  - "npc"
  - "role"
  - "builder"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.role.builders`

```java
public class BuilderRole extends SpawnableWithModelBuilder<Role> implements SpawnEffect
```

Builder that reads JSON role configuration and constructs `Role` instances for NPCs. Defines a large set of configurable properties including health, inventory, avoidance, separation, flock behaviour, combat, motion controllers, and state transitions.

## Key Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String[]` | `displayNames` |
| `protected` | `AssetHolder` | `appearance` |
| `protected` | `AssetHolder` | `dropListId` |
| `protected` | `IntHolder` | `maxHealth` |
| `protected` | `String` | `startState` |
| `protected` | `String` | `defaultSubState` |
| `protected` | `double` | `inertia` |
| `protected` | `DoubleHolder` | `knockbackScale` |
| `protected` | `boolean` | `applyAvoidance` |
| `protected` | `BooleanHolder` | `applySeparation` |
| `protected` | `BooleanHolder` | `invulnerable` |
| `protected` | `AssetArrayHolder` | `hotbarItems` |
| `protected` | `AssetArrayHolder` | `offHandItems` |
| `protected` | `DoubleHolder` | `deathAnimationTime` |
| `protected` | `BuilderObjectListHelper<Instruction>` | `instructionList` |
| `protected` | `BuilderObjectReferenceHelper<Map<String, MotionController>>` | `motionControllers` |

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `protected static final` | `double[]` | `DEFAULT_HEAD_PITCH_RANGE` | `new double[]{-89.0, 89.0}` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getShortDescription()` |
| `public` | `String` | `getLongDescription()` |
| `public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `public` | `Role` | `build(@Nonnull BuilderSupport builderSupport)` |
| `public` | `boolean` | `validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, @Nonnull ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)` |
| `public` | `BuilderRole` | `readConfig(@Nonnull JsonElement data)` |
