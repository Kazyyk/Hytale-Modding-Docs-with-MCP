# PositionCache

Type: class | Package: com.hypixel.hytale.server.npc.role.support

public class PositionCache

Central spatial perception cache for an NPC role. Owns two EntityList instances (one for players, one for NPCs) and maintains line-of-sight caches, dropped item lists, spawn marker lists, and spawn beacon lists. Line-of-sight results are cached with a TTL of 90-110ms and refreshed on a 200ms position cache update cycle.

## Constants

- public static final BiPredicate<...> IS_VALID_PLAYER
- public static final BiPredicate<...> IS_VALID_NPC
- public static final double MIN_LOS_BLOCKING_DISTANCE_SQUARED

## Constructors

- public PositionCache(@Nonnull Role role)

## Key Methods

- public EntityList getPlayers()
- public EntityList getNpcs()
- public boolean hasLineOfSight(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public boolean hasInverseLineOfSight(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public boolean isFriendlyBlockingLineOfSight(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Nullable public Ref<EntityStore> getClosestPlayerInRange(double minRange, double maxRange, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Nullable public Ref<EntityStore> getClosestNPCInRange(double minRange, double maxRange, @Nonnull Predicate<Ref<EntityStore>> filter, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Nullable public Ref<EntityStore> getClosestDroppedItemInRange(...)
- public boolean isEntityCountInRange(...)
- public int countEntitiesInRange(...)

## Configuration Methods

- public void requirePlayerDistanceSorted(double v)
- public void requirePlayerDistanceUnsorted(double v)
- public void requirePlayerDistanceAvoidance(double v)
- public void requireEntityDistanceSorted(double v)
- public void requireEntityDistanceUnsorted(double v)
- public void requireEntityDistanceAvoidance(double v)
- public void requireDroppedItemDistance(double value)
- public void requireSpawnMarkerDistance(double value)
- public void requireSpawnBeaconDistance(int value)

## Inner Types

### LineOfSightBuffer (private static)

Internal buffer for block-level line-of-sight ray tracing, holding world/chunk references and an opaque block set.

### LineOfSightEntityBuffer (private static)

Internal buffer for entity-level line-of-sight ray testing with position, direction, and min/max vectors.

### RayPredicate (functional interface)


@FunctionalInterface
public interface RayPredicate<T> {
    boolean test(double sx, double sy, double sz, double tx, double ty, double tz, T context, @Nonnull ComponentAccessor<EntityStore> componentAccessor);
}

## Related Types

- EntityList -- the bucketed entity lists owned by this cache
- RoleStats -- receives range tracking data from configuration methods

Also in this package: CombatSupport, DebugFlagsChangeListener, DebugSupport, EntityList, EntitySupport, EntityVisData, LineOfSightBuffer, LineOfSightEntityBuffer, MarkedEntitySupport, PathWaypointVisData, RangeType, RayPredicate, RoleStats, SensorVisData, StateSupport, WorldSupport

Complete API:
  public boolean isBenchmarking()
  public void setBenchmarking(boolean benchmarking)
  public void setCouldBreathe(boolean couldBreathe)
  public EntityList getPlayers()
  public EntityList getNpcs()
  public boolean tickPositionCacheNextUpdate(float dt)
  public void resetPositionCacheNextUpdate()
  public double getMaxDroppedItemDistance()
  public double getMaxSpawnMarkerDistance()
  public int getMaxSpawnBeaconDistance()
  public void addExternalPositionCacheRegistration(Consumer<Role> registration)
  public List<Consumer<Role>> getExternalRegistrations()
  public void reset(boolean isConfiguring)
  public void finalizeConfiguration()
  public void clear(double tickTime)
  public boolean couldBreatheCached()
  public void forEachPlayer(DoubleQuadObjectConsumer<Ref<EntityStore>,T,U,V> consumer, T t, U u, V v, double d, ComponentAccessor<EntityStore> componentAccessor)
  public Ref<EntityStore> getClosestPlayerInRange(double minRange, double maxRange, ComponentAccessor<EntityStore> componentAccessor)
  public Ref<EntityStore> getClosestPlayerInRange(double minRange, double maxRange, Predicate<Ref<EntityStore>> filter, ComponentAccessor<EntityStore> componentAccessor)
  public Ref<EntityStore> getClosestNPCInRange(double minRange, double maxRange, Predicate<Ref<EntityStore>> filter, ComponentAccessor<EntityStore> componentAccessor)
  public void processNPCsInRange(Ref<EntityStore> ref, double minRange, double maxRange, boolean useProjectedDistance, Ref<EntityStore> ignoredEntityReference, Role role, QuadPredicate<S,Ref<EntityStore>,Role,T> filter, S s, T t, ComponentAccessor<EntityStore> componentAccessor)
  public void processPlayersInRange(Ref<EntityStore> ref, double minRange, double maxRange, boolean useProjectedDistance, Ref<EntityStore> ignoredEntityReference, Role role, QuadPredicate<S,Ref<EntityStore>,Role,T> filter, S s, T t, ComponentAccessor<EntityStore> componentAccessor)
  public void processEntitiesInRange(Ref<EntityStore> ref, EntityList entities, double minRange, double maxRange, boolean useProjectedDistance, Ref<EntityStore> ignoredEntityReference, Role role, QuadPredicate<S,Ref<EntityStore>,Role,T> filter, S s, T t, ComponentAccessor<EntityStore> componentAccessor)
  public Ref<EntityStore> getClosestDroppedItemInRange(Ref<EntityStore> ref, double minRange, double maxRange, QuadPredicate<S,Ref<EntityStore>,Role,ComponentAccessor<EntityStore>> filter, Role role, S s, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isEntityCountInRange(double minRange, double maxRange, int minCount, int maxCount, boolean findPlayers, Role role, QuadPredicate<S,Ref<EntityStore>,Role,ComponentAccessor<EntityStore>> filter, S s, ComponentAccessor<EntityStore> componentAccessor)
  public int countEntitiesInRange(double minRange, double maxRange, boolean findPlayers, QuadPredicate<S,Ref<EntityStore>,T,ComponentAccessor<EntityStore>> filter, S s, T t, ComponentAccessor<EntityStore> componentAccessor)
  public void requirePlayerDistanceSorted(double v)
  public void requirePlayerDistanceUnsorted(double v)
  public void requirePlayerDistanceAvoidance(double v)
  public void requireEntityDistanceSorted(double v)
  public void requireEntityDistanceUnsorted(double v)
  public void requireEntityDistanceAvoidance(double v)
  public void requireDroppedItemDistance(double value)
  public void requireSpawnMarkerDistance(double value)
  public void requireSpawnBeaconDistance(int value)
  public Role getRole()
  public void forEachNPCUnordered(double maxDistance, QuadPredicate<Ref<EntityStore>,T,U,ComponentAccessor<EntityStore>> predicate, QuadConsumer<Ref<EntityStore>,T,V,R> consumer, T t, U u, V v, R r, ComponentAccessor<EntityStore> componentAccessor)
  public void forEachEntityInAvoidanceRange(Set<Ref<EntityStore>> ignoredEntitiesForAvoidance, TriConsumer<Ref<EntityStore>,T,CommandBuffer<EntityStore>> consumer, T t, CommandBuffer<EntityStore> commandBuffer)
  public void forEachEntityInAvoidanceRange(Set<Ref<EntityStore>> ignoredEntitiesForAvoidance, QuadConsumer<Ref<EntityStore>,T,U,CommandBuffer<EntityStore>> consumer, T t, U u, CommandBuffer<EntityStore> commandBuffer)
  public void setOpaqueBlockSet(int blockSet)
  private static boolean testLineOfSightRays(Ref<EntityStore> ref, Ref<EntityStore> targetRef, PositionCache.RayPredicate<T> predicate, T t, ComponentAccessor<EntityStore> componentAccessor)
  private boolean hasLineOfSightInternal(Ref<EntityStore> ref, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public boolean hasLineOfSight(Ref<EntityStore> ref, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public boolean hasInverseLineOfSight(Ref<EntityStore> ref, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isFriendlyBlockingLineOfSight(Ref<EntityStore> ref, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  private boolean testLineOfSightEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, PositionCache.LineOfSightEntityBuffer buffer, ComponentAccessor<EntityStore> componentAccessor, double length2)
  private void clearLineOfSightCache(double tickTime)
  private void clearLineOfSightCache()
  protected static boolean rayIsIntersectingEntity(Ref<EntityStore> ref, Vector3d pos, Vector3d dir, Vector2d minMax, double length2, ComponentAccessor<EntityStore> componentAccessor)
  public List<Ref<EntityStore>> getDroppedItemList()
  public List<Ref<EntityStore>> getSpawnMarkerList()
  public List<Ref<EntityStore>> getSpawnBeaconList()

Fields:
public static final BiPredicate<Ref<EntityStore>,ComponentAccessor<EntityStore>> IS_VALID_PLAYER
public static final BiPredicate<Ref<EntityStore>,ComponentAccessor<EntityStore>> IS_VALID_NPC
public static final double MIN_LOS_BLOCKING_DISTANCE_SQUARED
public static final String FUNCTION_CAN_BE_ONLY_CALLED_WHILE_CONFIGURING_POSITION_CACHE
private static final float LOS_CACHE_TTL_MIN_SECONDS
private static final float LOS_CACHE_TTL_MAX_SECONDS
private static final float POSITION_CACHE_TTL_SECONDS
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
private static final ComponentType<EntityStore,ItemComponent> ITEM_COMPONENT_TYPE
private static final ComponentType<EntityStore,ModelComponent> MODEL_COMPONENT_TYPE
protected static final ComponentType<EntityStore,BoundingBox> BOUNDING_BOX_COMPONENT_TYPE
private double maxDroppedItemDistance
private double maxSpawnMarkerDistance
private int maxSpawnBeaconDistance
private final Role role
private int opaqueBlockSet
protected EntityList players
protected EntityList npcs
protected final List<Consumer<Role>> externalRegistrations
private final List<Ref<EntityStore>> droppedItems
private final List<Ref<EntityStore>> spawnMarkers
private final List<Ref<EntityStore>> spawnBeacons
private final Reference2ByteMap<Ref<EntityStore>> lineOfSightCache
private final Reference2ByteMap<Ref<EntityStore>> inverseLineOfSightCache
private final Reference2ByteMap<Ref<EntityStore>> friendlyFireCache
protected final PositionCache.LineOfSightBuffer lineOfSightComputeBuffer
protected final PositionCache.LineOfSightEntityBuffer lineOfSightEntityComputeBuffer
private float cacheTTL
private float positionCacheNextUpdate
private boolean isBenchmarking
private boolean isConfiguring
private boolean couldBreathe
