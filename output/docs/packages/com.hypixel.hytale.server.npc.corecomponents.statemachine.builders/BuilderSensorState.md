---
title: "BuilderSensorState"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.statemachine.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.statemachine.builders.BuilderSensorState"
api_surface: false
extends: "BuilderSensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
  - "state-machine"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.statemachine.builders`

```java
public class BuilderSensorState extends BuilderSensorBase
```

NPC behavior tree builder for a sensor node. Configures detection or query logic.

## Fields

| Field | Type | Description |
|---|---|---|
| `state` | `String` | String field. |
| `subState` | `String` | String field. |
| `stateIndex` | `int` | int field. |
| `subStateIndex` | `int` | int field. |
| `defaultSubState` | `boolean` | boolean field. |
| `ignoreMissingSetState` | `boolean` | boolean field. |
| `componentLocal` | `boolean` | boolean field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `build(@Nonnull BuilderSupport builderSupport)` | `SensorState` | public method. |
| `getShortDescription()` | `String` | public method. |
| `getLongDescription()` | `String` | public method. |
| `getBuilderDescriptorState()` | `BuilderDescriptorState` | public method. |
| `readConfig(@Nonnull JsonElement data)` | `Builder<Sensor>` | public method. |
| `getState()` | `int` | public method. |
| `setIndexes(int main, int sub)` | `void` | public method. |
| `isDefaultSubState()` | `boolean` | public method. |
| `getSubStateIndex()` | `int` | public method. |
| `isComponentLocal()` | `boolean` | public method. |
