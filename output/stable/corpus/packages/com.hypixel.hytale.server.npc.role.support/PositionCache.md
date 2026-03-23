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
