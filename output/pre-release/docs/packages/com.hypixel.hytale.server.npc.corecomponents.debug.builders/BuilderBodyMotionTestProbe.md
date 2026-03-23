---
title: "BuilderBodyMotionTestProbe"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.debug.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.debug.builders.BuilderBodyMotionTestProbe"
api_surface: false
extends: "BuilderBodyMotionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.debug.builders`

```java
public class BuilderBodyMotionTestProbe extends BuilderBodyMotionBase
```

NPC behavior tree component builder.

## Fields

| Field | Type | Description |
|---|---|---|
| `adjustX` | `double` | double field. |
| `adjustZ` | `double` | double field. |
| `adjustDistance` | `double` | double field. |
| `snapAngle` | `float` | float field. |
| `isAvoidingBlockDamage` | `boolean` | boolean field. |
| `isRelaxedMoveConstraints` | `boolean` | boolean field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `build(BuilderSupport builderSupport)` | `BodyMotionTestProbe` | public method. |
| `getShortDescription()` | `String` | public method. |
| `getLongDescription()` | `String` | public method. |
| `getBuilderDescriptorState()` | `BuilderDescriptorState` | public method. |
| `readConfig(@Nonnull JsonElement data)` | `BuilderBodyMotionTestProbe` | public method. |
| `getAdjustX()` | `double` | public method. |
| `getAdjustZ()` | `double` | public method. |
| `getAdjustDistance()` | `double` | public method. |
| `getSnapAngle()` | `float` | public method. |
| `isAvoidingBlockDamage()` | `boolean` | public method. |
| `isRelaxedMoveConstraints()` | `boolean` | public method. |
