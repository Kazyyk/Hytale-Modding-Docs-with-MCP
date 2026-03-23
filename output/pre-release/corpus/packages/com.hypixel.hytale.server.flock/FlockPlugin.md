# FlockPlugin

Type: class | Package: com.hypixel.hytale.server.flock | Extends: JavaPlugin

public class FlockPlugin extends JavaPlugin

Central plugin for the flock/group behavior system. Registers all ECS components (Flock, FlockMembership, PersistentFlockData), systems (FlockSystems, FlockMembershipSystems, FlockDeathSystems), the FlockAsset store, 10 NPC core component types for AI integration, and the `FlockSize` decision-maker condition.

## Static Methods


public static FlockPlugin get()

Returns the singleton instance.


@Nullable
public static Ref<EntityStore> trySpawnFlock(@Nonnull Ref<EntityStore> npcRef, @Nonnull NPCEntity npc, @Nonnull Store<EntityStore> store, int roleIndex, @Nonnull Vector3d position, Vector3f rotation, @Nullable FlockAsset flockDefinition, TriConsumer<NPCEntity, Ref<EntityStore>, Store<EntityStore>> postSpawn)

Attempts to spawn a flock of NPCs around a leader. Picks the flock size from the FlockAsset, creates a flock entity, joins the leader, then spawns additional members at randomized positions around the leader. Each member is spawned via `NPCPlugin.spawnEntity()` and joined to the flock.


@Nonnull
public static Ref<EntityStore> createFlock(@Nonnull Store<EntityStore> store, @Nullable FlockAsset flockDefinition, @Nonnull String[] allowedRoles)

Creates a new flock entity with `UUIDComponent`, `EntityGroup`, and Flock components.


@Nullable
public static Ref<EntityStore> getFlockReference(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)

Returns the flock entity reference for a member, or `null` if not in a flock.


public static boolean isFlockMember(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)

Returns `true` if the entity has a FlockMembership component.


@Nullable
@Deprecated
public static Flock getFlock(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> reference)

Deprecated -- returns the Flock component for a member's flock entity.

## Instance Methods


public ComponentType<EntityStore, Flock> getFlockComponentType()


public ComponentType<EntityStore, FlockMembership> getFlockMembershipComponentType()


public ComponentType<EntityStore, PersistentFlockData> getPersistentFlockDataComponentType()


@Nonnull
public UUID getPrefabRemappedFlockReference(int prefabId, UUID oldId)

Returns a remapped UUID for flock references during prefab paste operations.

## Registered NPC Core Component Types

- Flock | BuilderBodyMotionFlock | BodyMotionFlock | BodyMotion
- JoinFlock | BuilderActionFlockJoin | ActionFlockJoin | Action
- LeaveFlock | BuilderActionFlockLeave | ActionFlockLeave | Action
- FlockState | BuilderActionFlockState | ActionFlockState | Action
- FlockTarget | BuilderActionFlockSetTarget | ActionFlockSetTarget | Action
- FlockBeacon | BuilderActionFlockBeacon | ActionFlockBeacon | Action
- Flock | BuilderEntityFilterFlock | EntityFilterFlock | EntityFilter
- FlockCombatDamage | BuilderSensorFlockCombatDamage | SensorFlockCombatDamage | Sensor
- InflictedDamage | BuilderSensorInflictedDamage | SensorInflictedDamage | Sensor
- FlockLeader | BuilderSensorFlockLeader | SensorFlockLeader | Sensor

## Related Types

- Flock -- core flock entity component
- FlockMembership -- per-member component
- PersistentFlockData -- serialized flock metadata
- FlockAsset -- JSON configuration for flock definitions
- FlockSystems -- flock entity lifecycle systems
- FlockMembershipSystems -- membership processing systems

Also in this package: EntityDeath, EntityRef, EntityRemoved, FilterPlayerFlockDamageSystem, Flock, FlockDeathSystems, FlockDebugSystem, FlockMembership, FlockMembershipSystems, FlockRemovedStatus, FlockSystems, NPCAddedFromWorldGen, OnDamageDealt, OnDamageReceived, PersistentFlockData, PlayerChangeGameModeEventSystem, PlayerDeath, PrefabPasteEventSystem, RefChange, StoredFlock (and 2 more)

Complete API:
  public static FlockPlugin get()
  public void setup()
  public void start()
  public void shutdown()
  public ComponentType<EntityStore,Flock> getFlockComponentType()
  public ComponentType<EntityStore,FlockMembership> getFlockMembershipComponentType()
  public ComponentType<EntityStore,PersistentFlockData> getPersistentFlockDataComponentType()
  public UUID getPrefabRemappedFlockReference(int prefabId, UUID oldId)
  public static Ref<EntityStore> trySpawnFlock(Ref<EntityStore> npcRef, NPCEntity npc, Store<EntityStore> store, int roleIndex, Vector3d position, Vector3f rotation, FlockAsset flockDefinition, TriConsumer<NPCEntity,Ref<EntityStore>,Store<EntityStore>> postSpawn)
  public static Ref<EntityStore> trySpawnFlock(Ref<EntityStore> npcRef, NPCEntity npc, Store<EntityStore> store, int roleIndex, Vector3d position, Vector3f rotation, int flockSize, TriConsumer<NPCEntity,Ref<EntityStore>,Store<EntityStore>> postSpawn)
  public static Ref<EntityStore> trySpawnFlock(Ref<EntityStore> npcRef, NPCEntity npc, int roleIndex, Vector3d position, Vector3f rotation, int flockSize, FlockAsset flockDefinition, TriConsumer<NPCEntity,Holder<EntityStore>,Store<EntityStore>> preAddToWorld, TriConsumer<NPCEntity,Ref<EntityStore>,Store<EntityStore>> postSpawn, Store<EntityStore> store)
  public static Flock getFlock(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> reference)
  public static Ref<EntityStore> createFlock(Store<EntityStore> store, Role role)
  public static Ref<EntityStore> createFlock(Store<EntityStore> store, FlockAsset flockDefinition, String[] allowedRoles)
  public static Ref<EntityStore> getFlockReference(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public static boolean isFlockMember(Ref<EntityStore> ref, Store<EntityStore> store)

Fields:
private static FlockPlugin instance
private final Int2ObjectConcurrentHashMap<Map<UUID,UUID>> prefabFlockRemappings
private ComponentType<EntityStore,Flock> flockComponentType
private ComponentType<EntityStore,FlockMembership> flockMembershipComponentType
private ComponentType<EntityStore,PersistentFlockData> persistentFlockDataComponentType
