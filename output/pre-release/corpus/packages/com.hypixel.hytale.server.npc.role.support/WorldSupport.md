# WorldSupport

Type: class | Package: com.hypixel.hytale.server.npc.role.support

public class WorldSupport

World-interaction support for NPC roles. Manages the attitude system (default player/NPC attitudes, attitude group lookups, attitude override memory with TTL), block sensor cached targets, search ray cached positions, block placement state, environment ID caching, and weather index caching. The attitude cache clears every 100ms.

## Constants

- public static final double ATTITUDE_CACHE_CLEAR_FREQUENCY

## Constructors

- public WorldSupport(NPCEntity parent, @Nonnull BuilderRole builder, @Nonnull BuilderSupport support)

## Attitude Methods

- public Attitude getDefaultPlayerAttitude()
- public Attitude getDefaultNPCAttitude()
- public int getAttitudeGroup()
- public int getItemAttitudeGroup()
- @Nonnull public Attitude getAttitude(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Nullable public Attitude getItemAttitude(@Nullable ItemStack item)
- public void overrideAttitude(Ref<EntityStore> target, Attitude attitude, double duration)
- @Nullable public Attitude getOverriddenAttitude(Ref<EntityStore> target)
- public void requireAttitudeCache()

## Block Sensor Methods

- public BlockTarget getCachedBlockTarget(int blockSet)
- public void resetBlockSensorFoundBlock(int blockSet)
- public void resetAllBlockSensors()

## Search Ray Methods

- public Vector3d getCachedSearchRayPosition(int id)
- public void resetCachedSearchRayPosition(int id)
- public void resetAllCachedSearchRayPositions()

## Environment/Weather Methods

- public int getEnvironmentId(@Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public int getCurrentWeatherIndex(@Nonnull ComponentAccessor<EntityStore> componentAccessor)

## Static Methods

- public static boolean hasTagInGroup(int group, int tag)
- public static boolean isGroupMember(int parentRoleIndex, @Nonnull Ref<EntityStore> ref, @Nullable int[] groups, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static boolean isGroupMember(int parentRoleIndex, @Nullable Ref<EntityStore> ref, int group, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static int[] createTagSetIndexArray(@Nullable String[] tagSets)

## Related Types

- CombatSupport -- uses `isGroupMember` for damage group filtering

Also in this package: CombatSupport, DebugFlagsChangeListener, DebugSupport, EntityList, EntitySupport, EntityVisData, LineOfSightBuffer, LineOfSightEntityBuffer, MarkedEntitySupport, PathWaypointVisData, PositionCache, RangeType, RayPredicate, RoleStats, SensorVisData, StateSupport

Complete API:
  public void tick(float dt)
  public void postRoleBuilt(BuilderSupport support)
  public BlockTarget getCachedBlockTarget(int blockSet)
  public void resetBlockSensorFoundBlock(int blockSet)
  public void resetAllBlockSensors()
  public Vector3d getCachedSearchRayPosition(int id)
  public void resetCachedSearchRayPosition(int id)
  public void resetAllCachedSearchRayPositions()
  public void setBlockToPlace(String block)
  public String getBlockToPlace()
  public Attitude getDefaultPlayerAttitude()
  public Attitude getDefaultNPCAttitude()
  public int getAttitudeGroup()
  public int getItemAttitudeGroup()
  public Attitude getAttitude(Ref<EntityStore> ref, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public Attitude getItemAttitude(ItemStack item)
  public void overrideAttitude(Ref<EntityStore> target, Attitude attitude, double duration)
  public Attitude getOverriddenAttitude(Ref<EntityStore> target)
  public void requireAttitudeCache()
  public void requestNewPath()
  public boolean hasRequestedNewPath()
  public boolean consumeNewPathRequested()
  public int getEnvironmentId(ComponentAccessor<EntityStore> componentAccessor)
  public int getCurrentWeatherIndex(ComponentAccessor<EntityStore> componentAccessor)
  public static boolean hasTagInGroup(int group, int tag)
  public static boolean isGroupMember(int parentRoleIndex, Ref<EntityStore> ref, int[] groups, ComponentAccessor<EntityStore> componentAccessor)
  public static boolean isGroupMember(int parentRoleIndex, Ref<EntityStore> ref, int group, ComponentAccessor<EntityStore> componentAccessor)
  public static int[] createTagSetIndexArray(String[] tagSets)
  public void unloaded()

Fields:
public static final double ATTITUDE_CACHE_CLEAR_FREQUENCY
protected static final ResourceType<EntityStore,Blackboard> BLACKBOARD_RESOURCE_TYPE
protected final NPCEntity parent
protected Int2ObjectMap<BlockTarget> blockSensorCachedTargets
protected Vector3d[] searchRayCachedPositions
protected String blockToPlace
protected final Attitude defaultPlayerAttitude
protected final Attitude defaultNPCAttitude
protected final int attitudeGroup
protected final int itemAttitudeGroup
protected AttitudeView attitudeView
protected Int2ObjectMap<Attitude> attitudeCache
protected Int2ObjectMap<AttitudeMemoryEntry> attitudeOverrideMemory
protected double nextAttitudeCacheClear
protected boolean newPathRequested
protected int changeCount
protected int environmentIdChangeCount
protected int cachedEnvironmentId
protected int weatherChangeCount
protected int cachedWeatherIndex
