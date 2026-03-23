# RoleStats

Type: class | Package: com.hypixel.hytale.server.npc.role.support

public class RoleStats

Diagnostic tracking of sensor distance ranges and bucket configurations per NPC role. Records which distance ranges are requested (sorted, unsorted, avoidance) for both players and NPCs, and stores the final bucket range arrays. Used for debugging and performance analysis of the PositionCache spatial query system.

## Methods

- public void clear()
- public void trackRange(boolean isPlayer, RangeType type, int value)
- public IntSet getRanges(boolean isPlayer, RangeType type)
- public int[] getRangesSorted(boolean isPlayer, RangeType type)
- public void trackBuckets(boolean isPlayer, IntArrayList bucketRanges)
- @Nullable public IntArrayList getBuckets(boolean isPlayer)

## Inner Types

### RangeType (enum)


public static enum RangeType {
    SORTED,
    UNSORTED,
    AVOIDANCE;
}

Categorizes the three kinds of distance ranges tracked by the position cache.

## Related Types

- PositionCache -- uses this class for range diagnostics

Also in this package: CombatSupport, DebugFlagsChangeListener, DebugSupport, EntityList, EntitySupport, EntityVisData, LineOfSightBuffer, LineOfSightEntityBuffer, MarkedEntitySupport, PathWaypointVisData, PositionCache, RangeType, RayPredicate, SensorVisData, StateSupport, WorldSupport

Complete API:
  public void clear()
  public void trackRange(boolean isPlayer, RoleStats.RangeType type, int value)
  public IntSet getRanges(boolean isPlayer, RoleStats.RangeType type)
  public int[] getRangesSorted(boolean isPlayer, RoleStats.RangeType type)
  public void trackBuckets(boolean isPlayer, IntArrayList bucketRanges)
  public IntArrayList getBuckets(boolean isPlayer)

Fields:
protected final EnumMap<RoleStats.RangeType,IntSet> playerRanges
protected final EnumMap<RoleStats.RangeType,IntSet> npcRanges
protected IntArrayList playerBucketRanges
protected IntArrayList npcBucketRanges
