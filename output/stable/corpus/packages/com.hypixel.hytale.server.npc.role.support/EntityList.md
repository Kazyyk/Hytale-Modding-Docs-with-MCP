# EntityList

Type: class | Package: com.hypixel.hytale.server.npc.role.support | Extends: com.hypixel.hytale.common.collection.BucketList

public class EntityList extends BucketList<Ref<EntityStore>>

Distance-bucketed entity list used by PositionCache for efficient spatial queries over nearby players and NPCs. Entities are organized into 6 buckets based on squared distance. Supports three distance categories -- sorted, unsorted, and avoidance -- each with independent maximum ranges. After configuration is finalized, buckets are set up with pre-sorted boundary arrays.

## Constants

- protected static final int BUCKET_COUNT
- protected static final int BUCKET_DISTANCE_NEAR
- protected static final int BUCKET_DISTANCE_NEARER

## Constructors

- public EntityList(@Nullable BucketItemPool<Ref<EntityStore>> holderPool, @Nonnull BiPredicate<Ref<EntityStore>, ComponentAccessor<EntityStore>> validator)

## Configuration Methods

- public int requireDistanceSorted(int value)
- public int requireDistanceUnsorted(int value)
- public int requireDistanceAvoidance(int value)
- public void finalizeConfiguration()

## Query Methods

- @Nullable public Ref<EntityStore> getClosestEntityInRange(double minRange, double maxRange, @Nonnull Predicate<Ref<EntityStore>> filter, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Nullable public Ref<EntityStore> getClosestEntityInRange(@Nullable Ref<EntityStore> ignoredEntityReference, double minRange, double maxRange, ...)
- @Nullable public Ref<EntityStore> getClosestEntityInRangeProjected(@Nonnull Ref<EntityStore> parentRef, ...)
- public int countEntitiesInRange(double minRange, double maxRange, int maxCount, ...)
- public boolean testAnyEntity(double maxDistance, ...)
- public boolean testAnyEntityDistanceSquared(double maxDistanceSquared, ...)

## Iteration Methods

- public void forEachEntity(...)
- public void forEachEntityUnordered(double maxDistance, ...)
- public void forEachEntityAvoidance(@Nonnull Set<Ref<EntityStore>> ignoredEntitiesForAvoidance, ...)

## Accessors

- public int getMaxDistanceUnsorted()
- public int getMaxDistanceSorted()
- public int getMaxDistanceAvoidance()
- public int getSearchRadius()
- public IntArrayList getBucketRanges()

## Related Types

- PositionCache -- owns player and NPC entity lists

Also in this package: CombatSupport, DebugFlagsChangeListener, DebugSupport, EntitySupport, EntityVisData, LineOfSightBuffer, LineOfSightEntityBuffer, MarkedEntitySupport, PositionCache, RangeType, RayPredicate, RoleStats, SensorVisData, StateSupport, WorldSupport

Complete API:
  public int getMaxDistanceUnsorted()
  public int getMaxDistanceSorted()
  public int getMaxDistanceAvoidance()
  public int getSearchRadius()
  public IntArrayList getBucketRanges()
  public void reset()
  public int requireDistanceSorted(int value)
  public int requireDistanceUnsorted(int value)
  public int requireDistanceAvoidance(int value)
  public void finalizeConfiguration()
  public void add(Ref<EntityStore> ref, Vector3d parentPosition, CommandBuffer<EntityStore> commandBuffer)
  public void forEachEntity(DoubleQuadObjectConsumer<Ref<EntityStore>,T,U,V> consumer, T t, U u, V v, double d, ComponentAccessor<EntityStore> componentAccessor)
  public void forEachEntityUnordered(double maxDistance, QuadPredicate<Ref<EntityStore>,T,U,ComponentAccessor<EntityStore>> predicate, QuadConsumer<Ref<EntityStore>,T,V,R> consumer, T t, U u, V v, R r, ComponentAccessor<EntityStore> componentAccessor)
  public void forEachEntityAvoidance(Set<Ref<EntityStore>> ignoredEntitiesForAvoidance, TriConsumer<Ref<EntityStore>,T,CommandBuffer<EntityStore>> consumer, T t, CommandBuffer<EntityStore> commandBuffer)
  public void forEachEntityAvoidance(Set<Ref<EntityStore>> ignoredEntitiesForAvoidance, QuadConsumer<Ref<EntityStore>,T,U,CommandBuffer<EntityStore>> consumer, T t, U u, CommandBuffer<EntityStore> commandBuffer)
  public int countEntitiesInRange(double minRange, double maxRange, int maxCount, QuadPredicate<S,Ref<EntityStore>,T,ComponentAccessor<EntityStore>> filter, S s, T t, ComponentAccessor<EntityStore> componentAccessor)
  public Ref<EntityStore> getClosestEntityInRange(double minRange, double maxRange, Predicate<Ref<EntityStore>> filter, ComponentAccessor<EntityStore> componentAccessor)
  public Ref<EntityStore> getClosestEntityInRange(Ref<EntityStore> ignoredEntityReference, double minRange, double maxRange, QuadPredicate<S,Ref<EntityStore>,Role,T> filter, Role role, S s, T t, ComponentAccessor<EntityStore> componentAccessor)
  public Ref<EntityStore> getClosestEntityInRangeProjected(Ref<EntityStore> parentRef, Ref<EntityStore> ignoredEntityReference, MotionController motionController, double minRange, double maxRange, QuadPredicate<S,Ref<EntityStore>,Role,T> filter, Role role, S s, T t, ComponentAccessor<EntityStore> componentAccessor)
  public boolean testAnyEntity(double maxDistance, QuadObjectDoublePredicate<S,Ref<EntityStore>,T,ComponentAccessor<EntityStore>> predicate, S s, T t, ComponentAccessor<EntityStore> componentAccessor)
  public boolean testAnyEntityDistanceSquared(double maxDistanceSquared, QuadObjectDoublePredicate<S,Ref<EntityStore>,T,ComponentAccessor<EntityStore>> predicate, S s, T t, ComponentAccessor<EntityStore> componentAccessor)
  public boolean testAnyEntityDistanceSquared(double maxDistanceSquared, QuadObjectDoublePredicate<S,Ref<EntityStore>,T,ComponentAccessor<EntityStore>> predicate, S s, T t, double d, ComponentAccessor<EntityStore> componentAccessor)
  protected Ref<EntityStore> validateEntityRef(BucketItem<Ref<EntityStore>> holder, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected static final int BUCKET_COUNT
protected static final int BUCKET_DISTANCE_NEAR
protected static final int BUCKET_DISTANCE_NEARER
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected final BiPredicate<Ref<EntityStore>,ComponentAccessor<EntityStore>> validator
protected IntArrayList bucketRanges
protected int maxDistanceUnsorted
protected int maxDistanceSorted
protected int maxDistanceAvoidance
protected int squaredMaxDistanceSorted
protected int squaredMaxDistanceAvoidance
protected int squaredMaxDistanceUnsorted
protected int searchRadius
