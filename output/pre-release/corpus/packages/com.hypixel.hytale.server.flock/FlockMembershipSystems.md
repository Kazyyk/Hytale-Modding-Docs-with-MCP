# FlockMembershipSystems

Type: class | Package: com.hypixel.hytale.server.flock | Extends: java.lang.Object

public class FlockMembershipSystems

Contains the core membership logic for flocks: join/leave processing, leader election, damage tracking, and friendly-fire prevention. The most complex class in the flock package.

## Static Methods


public static boolean canJoinFlock(@Nonnull Ref<EntityStore> reference, @Nonnull Ref<EntityStore> flockReference, @Nonnull Store<EntityStore> store)

Checks whether an entity can join a flock: flock data must be loaded, group must not be at max grow size, and the entity's role must be in the allowed roles list.


public static void join(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> flockRef, @Nonnull Store<EntityStore> store)

Initiates joining by creating a FlockMembership with `JOINING` type and adding it to the entity via `putComponent`.

## Inner Classes

### EntityRef


public static class EntityRef extends RefSystem<EntityStore>

Handles entity add/remove for entities with FlockMembership. On add: resolves the flock UUID to a Ref, creates the flock entity if it does not exist, adds the member to `EntityGroup`, and handles leader assignment from persisted data. On remove with `REMOVE`: leaves the flock and triggers leader re-election. On remove with `UNLOAD`: assigns an interim leader and clears the flock ref.

### RefChange


public static class RefChange extends RefChangeSystem<EntityStore, FlockMembership>

Processes FlockMembership component add/set/remove events. Validates join conditions: entity must be alive, players must be in Adventure mode, flock data must be loaded, role must be allowed, only one player per flock. On successful join: adds to `EntityGroup`, elects leader (players always become leader), increments size. On leave: removes from group, re-elects leader, dissolves flock if size drops below 2.

### FilterPlayerFlockDamageSystem


public static class FilterPlayerFlockDamageSystem extends DamageEventSystem

Cancels damage between flock members -- if the attacker and target are in the same flock, the damage is cancelled (friendly-fire prevention). Query matches players with FlockMembership.

### OnDamageDealt


public static class OnDamageDealt extends DamageEventSystem

Records damage dealt by flock members into the flock's `DamageData`. If the attacker is acting as leader, also records in the leader-specific damage data.

### OnDamageReceived


public static class OnDamageReceived extends DamageEventSystem

Records damage received by flock members into the flock's `DamageData`.

### NPCAddedFromWorldGen


public static class NPCAddedFromWorldGen extends HolderSystem<EntityStore>

Strips FlockMembership from NPCs that arrive from world generation. Prevents stale flock references from persisting across world-gen boundaries.

## Related Types

- FlockMembership -- the component these systems process
- Flock -- the flock entity component
- FlockPlugin -- registers these systems

Also in this package: EntityDeath, EntityRef, EntityRemoved, FilterPlayerFlockDamageSystem, Flock, FlockDeathSystems, FlockDebugSystem, FlockMembership, FlockPlugin, FlockRemovedStatus, FlockSystems, NPCAddedFromWorldGen, OnDamageDealt, OnDamageReceived, PersistentFlockData, PlayerChangeGameModeEventSystem, PlayerDeath, PrefabPasteEventSystem, RefChange, StoredFlock (and 2 more)

Complete API:
  public static boolean canJoinFlock(Ref<EntityStore> reference, Ref<EntityStore> flockReference, Store<EntityStore> store)
  public static void join(Ref<EntityStore> ref, Ref<EntityStore> flockRef, Store<EntityStore> store)
  private static boolean canBecomeLeader(Ref<EntityStore> ref)
  private static void markChunkNeedsSaving(Ref<EntityStore> ref, Store<EntityStore> store)
  private static void registerFlockDebugListener(Ref<EntityStore> ref, FlockMembership membership, Flock flock, ComponentAccessor<EntityStore> accessor)
  private static void unregisterFlockDebugListener(Ref<EntityStore> ref, FlockMembership membership, Flock flock, ComponentAccessor<EntityStore> accessor)
