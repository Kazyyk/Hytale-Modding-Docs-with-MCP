---
title: "Role"
kind: "class"
package: "com.hypixel.hytale.server.npc.role"
fqcn: "com.hypixel.hytale.server.npc.role.Role"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.server.npc.util.IAnnotatedComponentCollection"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "role"
  - "behavior"
---

**Package:** `com.hypixel.hytale.server.npc.role`

```java
public class Role implements IAnnotatedComponentCollection
```

The central runtime object for an NPC. Constructed from a `BuilderRole` and `BuilderSupport`, it owns all support subsystems (`CombatSupport`, `StateSupport`, `MarkedEntitySupport`, `WorldSupport`, `EntitySupport`, `PositionCache`, `DebugSupport`), the behavior instruction tree, motion controller map, steering accumulators, avoidance/separation configuration, flock parameters, inventory configuration, and lifecycle methods. The `tick` method drives the NPC's per-frame behavior: deferred actions, instruction tree evaluation, motion step selection, and steering computation.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `double` | `INTERACTION_PLAYER_DISTANCE` | `10.0` |
| `public static final` | `boolean` | `DEBUG_APPLIED_FORCES` | `false` |

## Support Subsystem Accessors

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `CombatSupport` | `getCombatSupport()` |
| `@Nonnull public` | `StateSupport` | `getStateSupport()` |
| `@Nonnull public` | `WorldSupport` | `getWorldSupport()` |
| `@Nonnull public` | `MarkedEntitySupport` | `getMarkedEntitySupport()` |
| `@Nonnull public` | `PositionCache` | `getPositionCache()` |
| `@Nonnull public` | `EntitySupport` | `getEntitySupport()` |
| `@Nonnull public` | `DebugSupport` | `getDebugSupport()` |

## Lifecycle Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `postRoleBuilt(@Nonnull BuilderSupport builderSupport)` |
| `public` | `void` | `loaded()` |
| `public` | `void` | `spawned(@Nonnull Holder<EntityStore> holder, @Nonnull NPCEntity npcComponent)` |
| `public` | `void` | `unloaded()` |
| `public` | `void` | `removed()` |
| `public` | `void` | `teleported(@Nonnull World from, @Nonnull World to)` |
| `public` | `void` | `tick(@Nonnull Ref<EntityStore> ref, float tickTime, @Nonnull Store<EntityStore> store)` |

## Motion Controller Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `MotionController` | `getActiveMotionController()` |
| `public` | `boolean` | `setActiveMotionController(@Nullable Ref<EntityStore> ref, @Nonnull NPCEntity npcComponent, @Nonnull String name, @Nullable ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `setMotionControllers(@Nonnull NPCEntity npcComponent, @Nonnull Map<String, MotionController> motionControllers, @Nullable String initialMotionController)` |
| `public` | `void` | `updateMotionControllers(@Nullable Ref<EntityStore> ref, @Nullable Model model, @Nullable Box boundingBox, @Nullable ComponentAccessor<EntityStore> componentAccessor)` |

## Steering & Avoidance

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Steering` | `getBodySteering()` |
| `@Nonnull public` | `Steering` | `getHeadSteering()` |
| `public` | `void` | `blendSeparation(@Nonnull Ref<EntityStore> selfRef, @Nonnull Vector3d position, @Nonnull Steering steering, ...)` |
| `public` | `void` | `blendAvoidance(@Nonnull Ref<EntityStore> ref, @Nonnull Vector3d position, @Nonnull Steering steering, @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `@Nonnull public` | `Vector3d` | `getLastSeparationSteering()` |
| `@Nonnull public` | `Vector3d` | `getLastAvoidanceSteering()` |
| `public` | `AvoidanceMode` | `getAvoidanceMode()` |

## Key Accessors

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getRoleName()` |
| `public` | `int` | `getRoleIndex()` |
| `public` | `int` | `getInitialMaxHealth()` |
| `public` | `boolean` | `isInvulnerable()` |
| `public` | `boolean` | `isBreathesInAir()` |
| `public` | `boolean` | `isBreathesInWater()` |
| `public` | `boolean` | `canBreathe(@Nonnull BlockMaterial breathingMaterial, int fluidId)` |
| `public` | `boolean` | `isOnGround()` |
| `public` | `boolean` | `isFriendly(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `Instruction` | `getRootInstruction()` |
| `@Nullable public` | `Instruction` | `getInteractionInstruction()` |
| `@Nullable public` | `Instruction` | `getDeathInstruction()` |
| `public` | `String` | `getDropListId()` |
| `@Nullable public` | `String` | `getBalanceAsset()` |
| `public` | `boolean` | `isMemory()` |

## Inner Types

### AvoidanceMode (enum)

```java
public static enum AvoidanceMode implements Supplier<String> {
    Slowdown("Only slow down NPC"),
    Evade("Only evade"),
    Any("Any avoidance allowed");
}
```

### DeferredAction (functional interface)

```java
@FunctionalInterface
public interface DeferredAction {
    boolean tick(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store);
}
```

Returns `true` when the action is complete and should be removed.
