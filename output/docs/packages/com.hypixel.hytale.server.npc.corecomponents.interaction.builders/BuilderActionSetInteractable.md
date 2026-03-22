---
title: "BuilderActionSetInteractable"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.interaction.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.interaction.builders.BuilderActionSetInteractable"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.interaction.builders`

```java
public class BuilderActionSetInteractable extends BuilderActionBase
```

NPC behavior tree builder for an action node. Configures execution logic.

## Fields

| Field | Type | Description |
|---|---|---|
| `hint` | `String` | String field. |
| `showPrompt` | `boolean` | boolean field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getShortDescription()` | `String` | public method. |
| `getLongDescription()` | `String` | public method. |
| `build(@Nonnull BuilderSupport builderSupport)` | `Action` | public method. |
| `getBuilderDescriptorState()` | `BuilderDescriptorState` | public method. |
| `readConfig(@Nonnull JsonElement data)` | `BuilderActionSetInteractable` | public method. |
| `getSetTo(@Nonnull BuilderSupport support)` | `boolean` | public method. |
| `getHint()` | `String` | public method. |
| `getShowPrompt()` | `boolean` | public method. |
