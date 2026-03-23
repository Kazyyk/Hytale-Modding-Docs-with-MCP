---
title: "KnockbackSimulation"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.KnockbackSimulation"
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
  - "knockback"
  - "physics"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public class KnockbackSimulation implements Component<EntityStore>
```

An ECS component that holds the state for server-side knockback prediction. Tracks client position, server simulation position, velocities, movement states, collision results, and timing. Created when a player receives knockback and removed when the simulation expires.

## Constants

| Constant | Type | Value | Description |
|---|---|---|---|
| `KNOCKBACK_SIMULATION_TIME` | `float` | `0.5F` | Total duration of the knockback simulation in seconds. |
| `BLEND_DELAY` | `float` | `0.2F` | Time before the end at which server/client positions begin blending. |

## Static Methods

```java
public static ComponentType<EntityStore, KnockbackSimulation> getComponentType()
```

Returns the component type from `EntityModule.get().getKnockbackSimulationComponentType()`.

## Methods

```java
public float getTickBuffer()
```

Returns the accumulated tick time buffer.

```java
public void setTickBuffer(float tickBuffer)
```

Sets the tick time buffer.

```java
@Nonnull
public Vector3d getRequestedVelocity()
```

Returns the pending velocity change vector.

```java
public void addRequestedVelocity(@Nonnull Vector3d velocity)
```

Adds to the requested velocity. Sets the change type to `Add` if not already `Set`.

```java
public void setRequestedVelocity(@Nonnull Vector3d velocity)
```

Sets the requested velocity. Sets the change type to `Set`.

```java
@Nullable
public ChangeVelocityType getRequestedVelocityChangeType()
```

Returns the type of velocity change (`Add` or `Set`), or `null` if none pending.

```java
public void setRequestedVelocityChangeType(ChangeVelocityType requestedVelocityChangeType)
```

Sets the velocity change type.

```java
@Nonnull
public Vector3d getClientLastPosition()
```

Returns the client's position from the previous tick.

```java
@Nonnull
public Vector3d getClientPosition()
```

Returns the client's current position.

```java
@Nonnull
public Vector3d getRelativeMovement()
```

Returns the relative movement vector from client input.

```java
@Nonnull
public Vector3d getSimPosition()
```

Returns the server simulation position.

```java
@Nonnull
public Vector3d getSimVelocity()
```

Returns the server simulation velocity.

```java
public float getRemainingTime()
```

Returns the remaining simulation time in seconds.

```java
public void setRemainingTime(float remainingTime)
```

Sets the remaining simulation time.

```java
public void reset()
```

Resets the remaining time to `KNOCKBACK_SIMULATION_TIME` (0.5s).

```java
public boolean consumeWasJumping()
```

Returns and clears the "was jumping" flag. Used to trigger a jump in the simulation.

```java
public void setWasJumping(boolean wasJumping)
```

Sets the "was jumping" flag.

```java
public boolean hadWishMovement()
```

Returns `true` if the client has sent wish-based movement during knockback.

```java
public void setHadWishMovement(boolean hadWishMovement)
```

Sets the wish movement flag.

```java
public boolean isClientFinished()
```

Returns `true` if the client has stopped sending wish movement.

```java
public void setClientFinished(boolean clientFinished)
```

Sets the client finished flag.

```java
public int getJumpCombo()
```

Returns the current jump combo count (0 to 3).

```java
public void setJumpCombo(int jumpCombo)
```

Sets the jump combo count.

```java
public boolean wasOnGround()
```

Returns `true` if the entity was on ground in the previous simulation step.

```java
public void setWasOnGround(boolean wasOnGround)
```

Sets the previous on-ground state.

```java
public MovementStates getClientMovementStates()
```

Returns the client's movement states during knockback.

```java
public void setClientMovementStates(MovementStates clientMovementStates)
```

Sets the client's movement states.

```java
@Nonnull
public Vector3d getMovementOffset()
```

Returns the movement offset vector used during collision checks.

```java
@Nonnull
public CollisionResult getCollisionResult()
```

Returns the reusable collision result object.

```java
@Nonnull
public Vector3d getCheckPosition()
```

Returns the reusable check position vector.

```java
@Nonnull
public Vector3d getTempPosition()
```

Returns the reusable temporary position vector.

```java
@Nonnull
@Override
public Component<EntityStore> clone()
```

Returns a shallow clone with copied requested velocity.

## Related Types

- [KnockbackPredictionSystems](KnockbackPredictionSystems.md) -- systems that operate on this component
