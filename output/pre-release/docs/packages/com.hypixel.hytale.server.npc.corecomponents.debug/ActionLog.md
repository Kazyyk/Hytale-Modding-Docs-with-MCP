---
title: "ActionLog"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.debug"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.debug.ActionLog"
api_surface: false
extends: "ActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.debug`

```java
public class ActionLog extends ActionBase
```

Concrete implementation extending `ActionBase`.

## Fields

| Field | Type | Description |
|---|---|---|
| `text` | `String` | final String field. |

## Constructors

| Constructor | Description |
|---|---|
| `ActionLog(@Nonnull BuilderActionLog builder, @Nonnull BuilderSupport support)` | Creates a new ActionLog instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` | `boolean` | public method. |
| `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` | `boolean` | public method. |
