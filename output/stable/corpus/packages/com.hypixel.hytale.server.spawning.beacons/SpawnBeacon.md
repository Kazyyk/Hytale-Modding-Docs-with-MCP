# SpawnBeacon

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: Entity

public class SpawnBeacon extends Entity

The current-generation spawn beacon entity. A simplified, stateless version of LegacySpawnBeaconEntity that supports manual triggering via `manualTrigger`. Non-collidable and hidden from non-Creative players. Tracks a set of unspawnable roles and self-removes when all roles become unspawnable.

## Key Methods

- @Nullable public static ComponentType<EntityStore, SpawnBeacon> getComponentType()
- public BeaconSpawnWrapper getSpawnWrapper()
- public void setSpawnWrapper(@Nonnull BeaconSpawnWrapper spawnWrapper)
- public String getSpawnConfigId()
- public boolean manualTrigger(@Nonnull Ref<EntityStore> ref, @Nonnull FloodFillPositionSelector positionSelector, @Nonnull Ref<EntityStore> targetRef, @Nonnull Store<EntityStore> store)
- protected void markUnspawnable(Ref<EntityStore> ref, int index, ComponentAccessor<EntityStore> componentAccessor)
- protected static void postSpawn(@Nonnull NPCEntity npc, @Nonnull Ref<EntityStore> selfRef, @Nonnull BeaconNPCSpawn spawn, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)

Also in this package: CheckDespawn, ControllerTick, EntityAdded, InitialBeaconDelay, LegacyEntityAdded, LegacySpawnBeaconEntity, LoadTimeDelay, PositionSelectorUpdate, SpawnBeaconSystems, SpawnJobTick

Complete API:
  public static ComponentType<EntityStore,SpawnBeacon> getComponentType()
  public BeaconSpawnWrapper getSpawnWrapper()
  public void setSpawnWrapper(BeaconSpawnWrapper spawnWrapper)
  public String getSpawnConfigId()
  public boolean isHiddenFromLivingEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isCollidable()
  public void moveTo(Ref<EntityStore> ref, double locX, double locY, double locZ, ComponentAccessor<EntityStore> componentAccessor)
  public boolean manualTrigger(Ref<EntityStore> ref, FloodFillPositionSelector positionSelector, Ref<EntityStore> targetRef, Store<EntityStore> store)
  protected void markUnspawnable(Ref<EntityStore> ref, int index, ComponentAccessor<EntityStore> componentAccessor)
  protected static void postSpawn(NPCEntity npc, Ref<EntityStore> selfRef, BeaconNPCSpawn spawn, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public String toString()

Fields:
public static final BuilderCodec<SpawnBeacon> CODEC
private BeaconSpawnWrapper spawnWrapper
private String spawnConfigId
private final IntSet unspawnableRoles
private final SpawningContext spawningContext
