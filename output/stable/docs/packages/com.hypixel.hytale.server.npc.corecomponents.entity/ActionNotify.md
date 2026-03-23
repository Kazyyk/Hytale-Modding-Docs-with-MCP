---
title: "ActionNotify"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.ActionNotify"
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
public class ActionNotify extends ActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `String` | `message` |
| `protected final` | `double` | `expirationTime` |
| `protected final` | `int` | `usedTargetSlot` |
| `` | `Ref<EntityStore>` | `targetRef` |
| `` | `BeaconSupport` | `beaconSupport` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ActionNotify(@Nonnull BuilderActionNotify builderActionBase, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
