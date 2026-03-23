---
title: "ModelSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.system"
fqcn: "com.hypixel.hytale.server.core.modules.entity.system.ModelSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "ecs"
  - "entity"
  - "model"
  - "bounding-box"
  - "animation"
  - "tracker"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.system`

```java
public class ModelSystems
```

Container class for ECS systems that manage entity models, bounding boxes, animations, skins, and model-related network tracking. Contains ten inner systems covering the full model lifecycle from initial assignment through bounding box computation and network synchronization.

## Fields

```java
@Nonnull
private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass()
```

## Inner Classes

### AnimationEntityTrackerUpdate

```java
public static class AnimationEntityTrackerUpdate extends EntityTickingSystem<EntityStore>
```

Per-tick system that queues `ActiveAnimationsUpdate` packets for visible players. Runs in the `EntityTrackerSystems.QUEUE_UPDATE_GROUP` system group. Supports parallel execution.

On each tick:
1. If `ActiveAnimationComponent.consumeNetworkOutdated()` returns true, queues an update with the current active animations to all viewers.
2. Otherwise, if `newlyVisibleTo` is non-empty, queues the same update to newly visible viewers only.

### ApplyRandomSkin

```java
public static class ApplyRandomSkin extends HolderSystem<EntityStore>
```

Holder system that assigns a random `PlayerSkin` to entities with both `ApplyRandomSkinPersistedComponent` and `ModelComponent`. On entity add, generates a random skin via `CosmeticsModule.get().generateRandomSkin()` and adds a `PlayerSkinComponent` to the entity.

### AssignNetworkIdToProps

```java
public static class AssignNetworkIdToProps extends HolderSystem<EntityStore>
```

Holder system that ensures prop entities receive a `NetworkId`. Queries for entities with `PropComponent` but without `NetworkId`. On entity add, assigns a new `NetworkId` from the world's network ID counter.

### EnsurePropsPrefabCopyable

```java
public static class EnsurePropsPrefabCopyable extends HolderSystem<EntityStore>
```

Holder system that ensures all prop entities have the `PrefabCopyableComponent`. Queries for entities with `PropComponent`. On entity add, calls `holder.ensureComponent()` for `PrefabCopyableComponent`.

### ModelChange

```java
public static class ModelChange extends RefChangeSystem<EntityStore, ModelComponent>
```

Reactive system that synchronizes model changes to the `PersistentModel` component. Queries for entities with `PersistentModel`.

- **onComponentAdded**: No-op.
- **onComponentSet**: Updates `PersistentModel.setModelReference()` with the new model's reference.
- **onComponentRemoved**: Removes the `PersistentModel` component.

### ModelSpawned

```java
public static class ModelSpawned extends HolderSystem<EntityStore>
```

Holder system that initializes the `BoundingBox` component from the model's bounding box when an entity with a `ModelComponent` is first added. Declares a dependency to run `AFTER` `SetRenderedModel`.

On entity add:
1. Reads the `ModelComponent` and gets the `Model`.
2. Extracts the model's `BoundingBox` and detail boxes.
3. Creates or updates the `BoundingBox` component.
4. Logs a warning if the model or its bounding box is null.

### PlayerConnect

```java
public static class PlayerConnect extends HolderSystem<EntityStore>
```

Holder system that assigns a model to player entities when they connect. Queries for entities with `Player` but without `ModelComponent`. Declares a dependency to run `BEFORE` `ModelSpawned`.

On entity add:
1. Reads the player's preset from `PlayerConfigData`.
2. Looks up the corresponding `ModelAsset` in the asset map.
3. If found, creates a unit-scale `Model` and adds `ModelComponent`.
4. Falls back to the `"Player"` default model asset if no preset is found.

### PlayerUpdateMovementManager

```java
public static class PlayerUpdateMovementManager extends RefChangeSystem<EntityStore, ModelComponent>
```

Reactive system that resets the player's `MovementManager` when the model changes. Queries for entities with `Player` and `MovementManager`. Declares a dependency to run `AFTER` `UpdateBoundingBox`.

On component added, set, or removed: calls `MovementManager.resetDefaultsAndUpdate()` to recalculate movement parameters for the new model.

### SetRenderedModel

```java
public static class SetRenderedModel extends HolderSystem<EntityStore>
```

Holder system that restores a `ModelComponent` from the `PersistentModel` reference when an entity is loaded with a `PersistentModel` but no `ModelComponent`. Resolves the `ModelReference` back to a `Model` and adds it. Logs a warning if the model reference cannot be resolved.

### UpdateBoundingBox

```java
public static class UpdateBoundingBox extends RefChangeSystem<EntityStore, ModelComponent>
```

Reactive system that updates the `BoundingBox` component whenever the `ModelComponent` changes.

- **onComponentAdded/onComponentSet**: Recalculates the bounding box from the model, taking into account the current `MovementStates` (for crouching, sliding, etc.).
- **onComponentRemoved**: Resets the bounding box to an empty `Box`.

Provides two static utility methods:

```java
protected static void updateBoundingBox(@Nonnull Model model, @Nonnull BoundingBox boundingBox, @Nullable MovementStatesComponent movementStatesComponent)
```

```java
protected static void updateBoundingBox(@Nonnull Model model, @Nonnull BoundingBox boundingBox, @Nullable MovementStates movementStates)
```

### UpdateMovementStateBoundingBox

```java
public static class UpdateMovementStateBoundingBox extends EntityTickingSystem<EntityStore>
```

Per-tick system that recalculates the bounding box when movement states change. Declares a dependency to run `BEFORE` `MovementStatesSystems.TickingSystem`. Supports parallel execution.

Queries for entities matching `MovementStatesComponent`, `BoundingBox`, and `ModelComponent`.

On each tick, compares the current and previously sent movement states. If crouching, sliding, sitting, or sleeping has changed, calls `UpdateBoundingBox.updateBoundingBox()` with the new movement states.

## Related Types

- [AudioSystems](AudioSystems.md) -- audio tracker systems following a similar pattern
- [TransformSystems](TransformSystems.md) -- transform tracker update
- [EntitySystems](EntitySystems.md) -- general entity systems
- `ModelComponent` -- the ECS component holding the entity's rendered model
- `PersistentModel` -- serialized model reference for persistence
- `BoundingBox` -- ECS component for entity collision bounds
- `ActiveAnimationComponent` -- ECS component tracking active animations
- `MovementStatesComponent` -- ECS component tracking crouching/sliding/sitting/sleeping
- `EntityTrackerSystems.Visible` -- visibility tracking component
- `CosmeticsModule` -- provides random skin generation
