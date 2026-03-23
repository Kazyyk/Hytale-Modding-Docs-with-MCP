# KnockbackSimulation

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: Component<EntityStore>

public class KnockbackSimulation implements Component<EntityStore>

An ECS component that holds the state for server-side knockback prediction. Tracks client position, server simulation position, velocities, movement states, collision results, and timing. Created when a player receives knockback and removed when the simulation expires.

## Constants

- KNOCKBACK_SIMULATION_TIME | float | 0.5F | Total duration of the knockback simulation in seconds.
- BLEND_DELAY | float | 0.2F | Time before the end at which server/client positions begin blending.

## Static Methods


public static ComponentType<EntityStore, KnockbackSimulation> getComponentType()

Returns the component type from `EntityModule.get().getKnockbackSimulationComponentType()`.

## Methods


public float getTickBuffer()

Returns the accumulated tick time buffer.


public void setTickBuffer(float tickBuffer)

Sets the tick time buffer.


@Nonnull
public Vector3d getRequestedVelocity()

Returns the pending velocity change vector.


public void addRequestedVelocity(@Nonnull Vector3d velocity)

Adds to the requested velocity. Sets the change type to `Add` if not already `Set`.


public void setRequestedVelocity(@Nonnull Vector3d velocity)

Sets the requested velocity. Sets the change type to `Set`.


@Nullable
public ChangeVelocityType getRequestedVelocityChangeType()

Returns the type of velocity change (`Add` or `Set`), or `null` if none pending.


public void setRequestedVelocityChangeType(ChangeVelocityType requestedVelocityChangeType)

Sets the velocity change type.


@Nonnull
public Vector3d getClientLastPosition()

Returns the client's position from the previous tick.


@Nonnull
public Vector3d getClientPosition()

Returns the client's current position.


@Nonnull
public Vector3d getRelativeMovement()

Returns the relative movement vector from client input.


@Nonnull
public Vector3d getSimPosition()

Returns the server simulation position.


@Nonnull
public Vector3d getSimVelocity()

Returns the server simulation velocity.


public float getRemainingTime()

Returns the remaining simulation time in seconds.


public void setRemainingTime(float remainingTime)

Sets the remaining simulation time.


public void reset()

Resets the remaining time to `KNOCKBACK_SIMULATION_TIME` (0.5s).


public boolean consumeWasJumping()

Returns and clears the "was jumping" flag. Used to trigger a jump in the simulation.


public void setWasJumping(boolean wasJumping)

Sets the "was jumping" flag.


public boolean hadWishMovement()

Returns `true` if the client has sent wish-based movement during knockback.


public void setHadWishMovement(boolean hadWishMovement)

Sets the wish movement flag.


public boolean isClientFinished()

Returns `true` if the client has stopped sending wish movement.


public void setClientFinished(boolean clientFinished)

Sets the client finished flag.


public int getJumpCombo()

Returns the current jump combo count (0 to 3).


public void setJumpCombo(int jumpCombo)

Sets the jump combo count.


public boolean wasOnGround()

Returns `true` if the entity was on ground in the previous simulation step.


public void setWasOnGround(boolean wasOnGround)

Sets the previous on-ground state.


public MovementStates getClientMovementStates()

Returns the client's movement states during knockback.


public void setClientMovementStates(MovementStates clientMovementStates)

Sets the client's movement states.


@Nonnull
public Vector3d getMovementOffset()

Returns the movement offset vector used during collision checks.


@Nonnull
public CollisionResult getCollisionResult()

Returns the reusable collision result object.


@Nonnull
public Vector3d getCheckPosition()

Returns the reusable check position vector.


@Nonnull
public Vector3d getTempPosition()

Returns the reusable temporary position vector.


@Nonnull
@Override
public Component<EntityStore> clone()

Returns a shallow clone with copied requested velocity.

## Related Types

- KnockbackPredictionSystems -- systems that operate on this component
