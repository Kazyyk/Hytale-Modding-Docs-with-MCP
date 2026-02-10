---
title: "Entity"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
api_surface: "public"
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:45:00Z"
tags:
  - "entity"
  - "ecs"
  - "class"
---

> Package: `com.hypixel.hytale.server.core.entity`

```java
public abstract class Entity implements Component<EntityStore>
```

The abstract base class for all entities in the Hytale server. `Entity` is itself an ECS component -- it implements `Component<EntityStore>`, which means every entity instance is stored as a component on an `EntityStore` ref. This design allows entity identity, world membership, and lifecycle to be managed uniformly through the ECS.

Subclasses include [LivingEntity](LivingEntity.md) (entities with health, inventory, and movement) and ultimately [Player](Player.md).

## Constants

```java
public static final int UNASSIGNED_ID = -1
```

Sentinel value indicating an entity that has not been assigned a network ID. Entities receive a network ID when loaded into a world and revert to `UNASSIGNED_ID` when removed.

## Fields

| Field | Type | Description |
|-------|------|-------------|
| `networkId` | `int` | Network-visible identifier assigned when loaded into a world |
| `legacyUuid` | `UUID` | Legacy UUID retained for backwards compatibility. Deprecated. |
| `world` | `World` | The world this entity currently belongs to, or `null` if unloaded |
| `reference` | `Ref<EntityStore>` | The ECS ref handle for this entity within its store |
| `wasRemoved` | `boolean` | Whether this entity has been removed from its world |

## Serialization

```java
public static final BuilderCodec<Entity> CODEC
```

A `BuilderCodec` for serializing and deserializing entity data. Subclasses (e.g., `LivingEntity.CODEC`, `Player.CODEC`) extend this codec with their additional fields.

## Methods

### Lifecycle

```java
public boolean remove()
```

Removes this entity from its world. Returns `true` if the entity was successfully removed, `false` if it was already removed or not loaded into a world. After removal, `wasRemoved()` returns `true` and the entity's `Ref` is invalidated.

```java
public void loadIntoWorld(@Nonnull World world)
```

Loads this entity into the given world. Assigns the entity a network ID and establishes its world reference. Called by the world loading system -- plugin code should not call this directly.

```java
public void unloadFromWorld()
```

Unloads this entity from its current world. Clears the world reference and resets the network ID to `UNASSIGNED_ID`. Called during world unloading or entity transfer.

```java
public boolean wasRemoved()
```

Returns `true` if this entity has been removed from its world via `remove()`.

### Identity

```java
@Deprecated(forRemoval = true)
public int getNetworkId()
```

Returns the entity's network ID. Deprecated -- network identity is being replaced by ref-based addressing.

```java
@Nullable
@Deprecated(forRemoval = true)
public UUID getUuid()
```

Returns the entity's legacy UUID. Deprecated -- use ref-based identity instead.

### World Access

```java
@Nullable
public World getWorld()
```

Returns the world this entity is loaded into, or `null` if the entity is not currently in a world.

### ECS Reference

```java
public void setReference(@Nonnull Ref<EntityStore> reference)
```

Sets the ECS ref handle for this entity. Called by the store when the entity is added. Plugin code should not call this directly.

```java
@Nullable
public Ref<EntityStore> getReference()
```

Returns the ECS ref handle for this entity, or `null` if the entity has not been added to a store.

```java
public Holder<EntityStore> toHolder()
```

Creates a `Holder` snapshot of this entity's component data. Used for entity transfer between stores or for serialization.

### Movement

```java
@Deprecated
public void moveTo(@Nonnull Ref<EntityStore> ref, double locX, double locY, double locZ, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Moves this entity to the specified coordinates. Deprecated -- movement is now handled through dedicated movement components and systems.

### Collision

```java
public boolean isCollidable()
```

Returns whether this entity participates in collision detection. Subclasses override this to control collision behavior.

```java
public boolean isHiddenFromLivingEntity(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Returns whether this entity is hidden from the given living entity. Used by visibility systems to filter entities from a target's perception (e.g., spectator mode, invisibility effects).

## Inner Classes

### DefaultAnimations

Static inner class containing animation ID helper constants for default entity animations. Provides standardized animation identifiers used across the animation system.

## Related Types

- [LivingEntity](LivingEntity.md) -- extends `Entity` with health, inventory, and stat modifiers
- [Player](Player.md) -- concrete player entity extending `LivingEntity`
- [Store](Store.md) -- the `EntityStore` that holds entity components
- [Ref](Ref.md) -- entity reference handle used with `getReference()` / `setReference()`
- [ComponentType](ComponentType.md) -- type key for accessing `Entity` as a component
- `Component` -- the ECS component interface that `Entity` implements
- `World` -- the world container that entities are loaded into
- `BuilderCodec` -- serialization codec for entity data
- `Holder` -- snapshot container created by `toHolder()`
