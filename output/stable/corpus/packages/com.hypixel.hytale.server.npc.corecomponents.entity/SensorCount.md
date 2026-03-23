# SensorCount

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity | Extends: SensorBase

public class SensorCount extends SensorBase

## Fields

- protected final int minCount
- protected final int maxCount
- protected final double minRange
- protected final double maxRange
- protected final int[] includeGroups
- protected final int[] excludeGroups
- protected boolean findPlayers
- protected final boolean haveIncludeGroups
- protected final boolean haveExcludeGroups
- int[] count
- double[] range
- int roleIndex

## Constructors

- public SensorCount(@Nonnull BuilderSensorCount builderSensorCount, @Nonnull BuilderSupport support)

## Methods

- public void registerWithSupport(@Nonnull Role role)
- public boolean matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- public InfoProvider getSensorInfo()
- protected static boolean groupListHasPlayer(@Nonnull int[] groups)
- protected boolean filterNPC(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
