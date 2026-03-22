---
title: "ActionLockOnInteractionTarget"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.interaction"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.interaction.ActionLockOnInteractionTarget"
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
public class ActionLockOnInteractionTarget extends ActionBase
```

Concrete implementation extending `ActionBase`.

## Fields

| Field | Type | Description |
|---|---|---|
| `targetSlot` | `int` | final int field. |

## Constructors

| Constructor | Description |
|---|---|
| `ActionLockOnInteractionTarget(@Nonnull BuilderActionLockOnInteractionTarget builderActionBase, @Nonnull BuilderSupport support)` | Creates a new ActionLockOnInteractionTarget instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` | `boolean` | public method. |
| `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` | `boolean` | public method. |
