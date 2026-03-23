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
