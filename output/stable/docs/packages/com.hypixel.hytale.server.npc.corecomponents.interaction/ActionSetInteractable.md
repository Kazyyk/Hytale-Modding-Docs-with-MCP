---
title: "ActionSetInteractable"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.interaction"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.interaction.ActionSetInteractable"
api_surface: false
extends: "ActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.interaction`

```java
public class ActionSetInteractable extends ActionBase
```

Concrete implementation extending `ActionBase`.

## Fields

| Field | Type | Description |
|---|---|---|
| `setTo` | `boolean` | final boolean field. |
| `hint` | `String` | final String field. |
| `showPrompt` | `boolean` | final boolean field. |

## Constructors

| Constructor | Description |
|---|---|
| `ActionSetInteractable(@Nonnull BuilderActionSetInteractable builder, @Nonnull BuilderSupport support)` | Creates a new ActionSetInteractable instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` | `boolean` | public method. |
| `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` | `boolean` | public method. |
