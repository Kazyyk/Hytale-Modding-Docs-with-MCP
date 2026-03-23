# StoredFlock

Type: class | Package: com.hypixel.hytale.server.flock | Extends: java.lang.Object

public class StoredFlock

Serializable container for persisting flock NPC entities when a spawn marker deactivates. Stores NPCs as `Holder<EntityStore>` arrays. Used by the spawning system's `SpawnMarkerEntity` to save/restore NPCs when players leave the deactivation range.

## Methods


public void storeNPCs(@Nonnull List<Ref<EntityStore>> refs, @Nonnull Store<EntityStore> store)

Removes entities from the store (with `UNLOAD` reason) and saves their serializable data as holders.


public boolean hasStoredNPCs()

Returns `true` if this container has stored entity data.


public void restoreNPCs(@Nonnull List<Ref<EntityStore>> output, @Nonnull Store<EntityStore> store)

Re-adds stored entities to the store (with `LOAD` reason) and appends the new refs to the output list.


public void clear()

Releases stored holder data.


@Nonnull
public StoredFlock clone()


@Nonnull
public StoredFlock cloneSerializable()

## Related Types

- FlockPlugin -- the flock system
- `SpawnMarkerEntity` -- uses StoredFlock for deactivation persistence

Also in this package: EntityDeath, EntityRef, EntityRemoved, FilterPlayerFlockDamageSystem, Flock, FlockDeathSystems, FlockDebugSystem, FlockMembership, FlockMembershipSystems, FlockPlugin, FlockRemovedStatus, FlockSystems, NPCAddedFromWorldGen, OnDamageDealt, OnDamageReceived, PersistentFlockData, PlayerChangeGameModeEventSystem, PlayerDeath, PrefabPasteEventSystem, RefChange (and 2 more)

Complete API:
  public void storeNPCs(List<Ref<EntityStore>> refs, Store<EntityStore> store)
  public boolean hasStoredNPCs()
  public void restoreNPCs(List<Ref<EntityStore>> output, Store<EntityStore> store)
  public void clear()
  public String toString()
  public StoredFlock clone()
  public StoredFlock cloneSerializable()

Fields:
public static final BuilderCodec<StoredFlock> CODEC
private Holder<EntityStore>[] members
