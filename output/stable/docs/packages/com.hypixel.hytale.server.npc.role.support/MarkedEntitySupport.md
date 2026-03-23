---
title: "MarkedEntitySupport"
kind: "class"
package: "com.hypixel.hytale.server.npc.role.support"
fqcn: "com.hypixel.hytale.server.npc.role.support.MarkedEntitySupport"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "role"
  - "targeting"
---

**Package:** `com.hypixel.hytale.server.npc.role.support`

```java
public class MarkedEntitySupport
```

Named target slot system for NPC roles. Behavior tree instructions mark entities into named slots (e.g. `"LockedTarget"`) and later retrieve them by slot name or index. Slot mappings are configured by `BuilderSupport` after role construction. Also manages stored position slots and flock-wide target propagation.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `String` | `DEFAULT_TARGET_SLOT` | `"LockedTarget"` |

## Constructors

| Signature |
|---|
| `public MarkedEntitySupport(NPCEntity parent)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Ref<EntityStore>[]` | `getEntityTargets()` |
| `public` | `void` | `postRoleBuilder(@Nonnull BuilderSupport support)` |
| `public` | `void` | `clearMarkedEntity(int targetSlot)` |
| `public` | `void` | `setMarkedEntity(String targetSlot, Ref<EntityStore> target)` |
| `public` | `void` | `setMarkedEntity(int targetSlot, @Nullable Ref<EntityStore> target)` |
| `@Nullable public` | `Ref<EntityStore>` | `getMarkedEntityRef(String targetSlot)` |
| `@Nullable public` | `Ref<EntityStore>` | `getMarkedEntityRef(int targetSlot)` |
| `public` | `int` | `getMarkedEntitySlotCount()` |
| `public` | `Vector3d` | `getStoredPosition(int slot)` |
| `public` | `boolean` | `hasMarkedEntity(@Nonnull Ref<EntityStore> entityReference, int targetSlot)` |
| `public` | `boolean` | `hasMarkedEntityInSlot(String targetSlot)` |
| `public` | `boolean` | `hasMarkedEntityInSlot(int targetSlot)` |
| `public` | `void` | `flockSetTarget(@Nonnull String targetSlot, @Nullable Ref<EntityStore> targetRef, @Nonnull Store<EntityStore> store)` |
| `public` | `void` | `setTargetSlotToIgnoreForAvoidance(int targetSlotToIgnoreForAvoidance)` |
| `@Nullable public` | `Ref<EntityStore>` | `getTargetReferenceToIgnoreForAvoidance()` |
| `public` | `String` | `getSlotName(int slot)` |
| `public` | `void` | `unloaded()` |

## Behavior

`flockSetTarget` propagates a target assignment to all flock members by iterating over the entity group and calling `onFlockSetTarget` on each member's `NPCEntity`. `getTargetReferenceToIgnoreForAvoidance` returns the entity in the avoidance-ignore slot (or the default slot if none is explicitly set).
