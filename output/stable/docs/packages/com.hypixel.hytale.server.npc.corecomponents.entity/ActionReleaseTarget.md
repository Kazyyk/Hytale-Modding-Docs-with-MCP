---
title: "ActionReleaseTarget"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.ActionReleaseTarget"
api_surface: false
extends: "ActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "entity"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.entity`

```java
public class ActionReleaseTarget extends ActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `int` | `targetSlot` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ActionReleaseTarget(@Nonnull BuilderActionReleaseTarget builder, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
