---
title: "BuilderActionState"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.statemachine.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.statemachine.builders.BuilderActionState"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
  - "state-machine"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.statemachine.builders`

```java
public class BuilderActionState extends BuilderActionBase
```

NPC behavior tree builder for an action node. Configures execution logic.

## Fields

| Field | Type | Description |
|---|---|---|
| `state` | `String` | String field. |
| `subState` | `String` | String field. |
| `stateIndex` | `int` | int field. |
| `subStateIndex` | `int` | int field. |
| `clearState` | `boolean` | boolean field. |
| `componentLocal` | `boolean` | boolean field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `build(@Nonnull BuilderSupport builderSupport)` | `ActionState` | public method. |
| `getShortDescription()` | `String` | public method. |
| `getLongDescription()` | `String` | public method. |
| `getBuilderDescriptorState()` | `BuilderDescriptorState` | public method. |
| `readConfig(@Nonnull JsonElement data)` | `BuilderActionState` | public method. |
| `getStateIndex()` | `int` | public method. |
| `getSubStateIndex()` | `int` | public method. |
| `isClearState()` | `boolean` | public method. |
| `isComponentLocal()` | `boolean` | public method. |
