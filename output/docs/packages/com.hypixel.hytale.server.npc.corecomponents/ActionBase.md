---
title: "ActionBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.ActionBase"
api_surface: false
extends: "AnnotatedComponentBase"
implements: ["Action"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents`

```java
public abstract class ActionBase extends AnnotatedComponentBase implements Action
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `boolean` | `once` |
| `protected` | `boolean` | `triggered` |
| `protected` | `boolean` | `active` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ActionBase(@Nonnull BuilderActionBase builderActionBase)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `boolean` | `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `void` | `activate(Role role, InfoProvider infoProvider)` |
| `@Override public` | `void` | `deactivate(Role role, InfoProvider infoProvider)` |
| `@Override public` | `boolean` | `isActivated()` |
| `@Override public` | `boolean` | `isTriggered()` |
| `@Override public` | `void` | `clearOnce()` |
| `@Override public` | `void` | `setOnce()` |
| `@Override public` | `boolean` | `processDelay(float dt)` |
