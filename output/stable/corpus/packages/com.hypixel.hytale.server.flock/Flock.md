# Flock

Type: class | Package: com.hypixel.hytale.server.flock | Extends: java.lang.Object | Implements: Component<EntityStore>

public class Flock implements Component<EntityStore>

The core ECS component attached to flock entities (not individual members). A flock entity is composed of this component, an `EntityGroup`, and a `UUIDComponent`. Flock holds the group's PersistentFlockData, double-buffered damage tracking for the whole group and leader separately, removal status, and debug visualization state.

The double-buffered `DamageData` system tracks incoming/outgoing damage per tick. Each tick, `swapDamageDataBuffers()` rotates the current and next buffers and resets the next buffer, giving sensors access to the previous tick's damage data.

## Static Methods


public static ComponentType<EntityStore, Flock> getComponentType()

Returns the component type, obtained from FlockPlugin.

## Constructors


public Flock()

Default constructor for deserialization.


public Flock(@Nullable FlockAsset flockDefinition, @Nonnull String[] allowedRoles)

Creates a flock with initial PersistentFlockData derived from the asset and allowed roles.

## Methods


public DamageData getDamageData()

Returns the current tick's group damage data (read by sensors).


public DamageData getNextDamageData()

Returns the next tick's group damage data (written by damage systems).


public DamageData getLeaderDamageData()

Returns the current tick's leader-only damage data.


public DamageData getNextLeaderDamageData()

Returns the next tick's leader-only damage data.


public PersistentFlockData getFlockData()


public void setFlockData(PersistentFlockData flockData)


public Flock.FlockRemovedStatus getRemovedStatus()


public void setRemovedStatus(Flock.FlockRemovedStatus status)


public boolean isTrace()


public void setTrace(boolean trace)

Enables trace-level logging for flock operations. Controlled by the `RoleDebugFlags.Flock` flag.


public boolean hasVisFlockMember()

Returns `true` if any member has the `VisFlock` debug flag set.


public void onTargetKilled(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> targetEntityReference)

Records a kill in the damage tracking. Called by FlockDeathSystems when an attacker's flock target dies.


public void swapDamageDataBuffers()

Rotates double-buffered damage data. Called each tick by FlockSystems.Ticking.

## Inner Classes

### FlockRemovedStatus


public static enum FlockRemovedStatus

- NOT_REMOVED | Flock is active.
- DISSOLVED | Flock was permanently dissolved (all members had FlockMembership removed).
- UNLOADED | Flock was unloaded (members may be restored later).

## Related Types

- FlockMembership -- per-member component linking to the flock
- PersistentFlockData -- serialized flock metadata
- FlockPlugin -- registers this component type
- FlockSystems -- systems operating on flock entities
