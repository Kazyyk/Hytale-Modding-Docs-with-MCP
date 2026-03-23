---
title: "BuilderActionParentState"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.statemachine.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.statemachine.builders.BuilderActionParentState"
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
public class BuilderActionParentState extends BuilderActionBase
```

NPC behavior tree builder for an action node. Configures execution logic.

## Fields

| Field | Type | Description |
|---|---|---|
| `state` | `String` | String field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `build(@Nonnull BuilderSupport builderSupport)` | `ActionParentState` | public method. |
| `getShortDescription()` | `String` | public method. |
| `getLongDescription()` | `String` | public method. |
| `getBuilderDescriptorState()` | `BuilderDescriptorState` | public method. |
| `readConfig(@Nonnull JsonElement data)` | `BuilderActionParentState` | public method. |
| `getStatePair(@Nonnull BuilderSupport support)` | `StatePair` | public method. |
