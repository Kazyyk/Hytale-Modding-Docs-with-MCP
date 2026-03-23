# SpawnWrapper

Type: class | Package: com.hypixel.hytale.server.spawning.wrappers

public abstract class SpawnWrapper<T>

## Fields

- protected final int spawnIndex
- protected final T spawn
- protected Int2ObjectMap<RoleSpawnParameters> roles
- protected final LightRangePredicate lightRangePredicate
- protected final Set<String> invalidNPCs

## Methods

- @Nonnull public T getSpawn()
- public Int2ObjectMap<RoleSpawnParameters> getRoles()
- @Nullable public IntSet getSpawnBlockSet(int roleIndex)
- public int getSpawnFluidTag(int roleIndex)
- public int getSpawnIndex()
- @Nonnull public LightRangePredicate getLightRangePredicate()
- public boolean hasInvalidNPC(String name)
- public boolean spawnParametersMatch(ComponentAccessor<EntityStore> componentAccessor)
- public boolean shouldDespawn(World world, WorldTimeResource timeManager)
- public boolean withinLightRange(SpawningContext spawningContext)
- private void addRoles()

Known subclasses: BeaconSpawnWrapper, WorldSpawnWrapper

Also in this package: BeaconSpawnWrapper

Complete API:
  public T getSpawn()
  public Int2ObjectMap<RoleSpawnParameters> getRoles()
  public IntSet getSpawnBlockSet(int roleIndex)
  public int getSpawnFluidTag(int roleIndex)
  public int getSpawnIndex()
  public LightRangePredicate getLightRangePredicate()
  public boolean hasInvalidNPC(String name)
  public boolean spawnParametersMatch(ComponentAccessor<EntityStore> componentAccessor)
  public boolean shouldDespawn(World world, WorldTimeResource timeManager)
  public boolean withinLightRange(SpawningContext spawningContext)
  private void addRoles()

Fields:
protected final int spawnIndex
protected final T spawn
protected Int2ObjectMap<RoleSpawnParameters> roles
protected final LightRangePredicate lightRangePredicate
protected final Set<String> invalidNPCs
