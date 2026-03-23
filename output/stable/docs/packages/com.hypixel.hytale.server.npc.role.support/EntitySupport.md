---
title: "EntitySupport"
kind: "class"
package: "com.hypixel.hytale.server.npc.role.support"
fqcn: "com.hypixel.hytale.server.npc.role.support.EntitySupport"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "role"
  - "entity"
---

**Package:** `com.hypixel.hytale.server.npc.role.support`

```java
public class EntitySupport
```

Entity-level support for NPC roles. Manages display name selection, sensor scope ownership, body/head motion step scheduling, component execution delay tracking, and target player task lists. Provides static utility methods for setting display names on arbitrary entity references.

## Constructors

| Signature |
|---|
| `public EntitySupport(NPCEntity parent, @Nonnull BuilderRole builder)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `StdScope` | `getSensorScope()` |
| `@Nullable public` | `Instruction` | `getNextBodyMotionStep()` |
| `public` | `boolean` | `setNextBodyMotionStep(Instruction step)` |
| `public` | `void` | `clearNextBodyMotionStep()` |
| `@Nullable public` | `Instruction` | `getNextHeadMotionStep()` |
| `public` | `boolean` | `setNextHeadMotionStep(Instruction step)` |
| `public` | `void` | `clearNextHeadMotionStep()` |
| `public` | `void` | `postRoleBuilt(@Nonnull BuilderSupport builderSupport)` |
| `public` | `void` | `tick(float dt)` |
| `public` | `void` | `handleNominatedDisplayName(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `nominateDisplayName(@Nonnull String displayName)` |
| `public` | `void` | `pickRandomDisplayName(@Nonnull Holder<EntityStore> holder, boolean override)` |
| `public` | `void` | `pickRandomDisplayName(@Nonnull Ref<EntityStore> ref, boolean override, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `addTargetPlayerActiveTask(@Nonnull String task)` |
| `public` | `void` | `clearTargetPlayerActiveTasks()` |
| `@Nullable public` | `List<String>` | `getTargetPlayerActiveTasks()` |
| `public` | `void` | `registerDelay(@Nonnull IComponentExecutionControl component)` |

## Static Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `setDisplayName(@Nonnull Holder<EntityStore> holder, @Nonnull String displayName)` |
| `public static` | `void` | `setDisplayName(@Nonnull Holder<EntityStore> holder, @Nullable String displayName, boolean override)` |
| `public static` | `void` | `setRandomDisplayName(@Nonnull Ref<EntityStore> ref, @Nullable String[] names, boolean override, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public static` | `void` | `setDisplayName(@Nonnull Ref<EntityStore> ref, @Nonnull String displayName, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public static` | `void` | `setDisplayName(@Nonnull Ref<EntityStore> ref, @Nullable String displayName, boolean override, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Nonnull public static` | `StdScope` | `createScope(@Nonnull NPCEntity entity)` |

`createScope` builds a new `StdScope` parented to `StdLib.getInstance()` with two supplier-backed variables: `blocked` (whether the active motion controller is obstructed) and `health` (health as a percentage).
