---
title: "PlayerInput"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerInput"
api_surface: false
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "component"
  - "input"
  - "movement"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public class PlayerInput implements Component<EntityStore>
```

An ECS component that queues player input updates received from the client. Each tick, the `ProcessPlayerInput` system drains the queue and applies each update to the entity's transform, head rotation, velocity, and movement states.

## Static Methods

```java
public static ComponentType<EntityStore, PlayerInput> getComponentType()
```

Returns the component type from `EntityModule.get().getPlayerInputComponentType()`.

## Methods

```java
public void queue(PlayerInput.InputUpdate inputUpdate)
```

Adds an input update to the queue.

```java
@Nonnull
public List<PlayerInput.InputUpdate> getMovementUpdateQueue()
```

Returns the current input update queue.

```java
public int getMountId()
```

Returns the ID of the entity this player is mounting, or `0` if not mounted.

```java
public void setMountId(int mountId)
```

Sets the mount entity ID.

```java
@Nonnull
@Override
public Component<EntityStore> clone()
```

Returns a copy with a cloned input queue.

## Inner Types

- [PlayerInput.InputUpdate](PlayerInput.InputUpdate.md) -- interface for all input update types
- [PlayerInput.AbsoluteMovement](PlayerInput.AbsoluteMovement.md) -- sets position to absolute coordinates
- [PlayerInput.RelativeMovement](PlayerInput.RelativeMovement.md) -- adds a relative offset to position
- [PlayerInput.WishMovement](PlayerInput.WishMovement.md) -- wish-based movement direction for knockback
- [PlayerInput.SetBody](PlayerInput.SetBody.md) -- sets body rotation
- [PlayerInput.SetHead](PlayerInput.SetHead.md) -- sets head rotation
- [PlayerInput.SetClientVelocity](PlayerInput.SetClientVelocity.md) -- sets client-reported velocity
- [PlayerInput.SetMovementStates](PlayerInput.SetMovementStates.md) -- sets movement state flags
- [PlayerInput.SetRiderMovementStates](PlayerInput.SetRiderMovementStates.md) -- sets rider movement state flags

## Related Types

- [PlayerSystems.ProcessPlayerInput](PlayerSystems.ProcessPlayerInput.md) -- system that drains and applies the queue
- [PlayerSystems.EnsurePlayerInput](PlayerSystems.EnsurePlayerInput.md) -- system that ensures this component exists
- [KnockbackPredictionSystems.CaptureKnockbackInput](KnockbackPredictionSystems.CaptureKnockbackInput.md) -- consumes input during knockback
