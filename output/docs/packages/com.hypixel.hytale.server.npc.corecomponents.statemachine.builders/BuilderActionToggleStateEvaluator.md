---
title: "BuilderActionToggleStateEvaluator"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.statemachine.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.statemachine.builders.BuilderActionToggleStateEvaluator"
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
public class BuilderActionToggleStateEvaluator extends BuilderActionBase
```

NPC behavior tree builder for an action node. Configures execution logic.

## Fields

| Field | Type | Description |
|---|---|---|
| `enable` | `boolean` | boolean field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `build(BuilderSupport builderSupport)` | `ActionToggleStateEvaluator` | public method. |
| `getShortDescription()` | `String` | public method. |
| `getLongDescription()` | `String` | public method. |
| `getBuilderDescriptorState()` | `BuilderDescriptorState` | public method. |
| `readConfig(@Nonnull JsonElement data)` | `BuilderActionToggleStateEvaluator` | public method. |
| `isEnable()` | `boolean` | public method. |
