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

Also in this package: ActionBeacon, ActionIgnoreForAvoidance, ActionNotify, ActionOverrideAttitude, ActionReleaseTarget, ActionSetMarkedTarget, ActionSetStat, HeadMotionWatch, SensorBeacon, SensorEntity, SensorEntityBase, SensorKill, SensorPlayer, SensorSelf, SensorTarget

Complete API:
  public void registerWithSupport(Role role)
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
  protected static boolean groupListHasPlayer(int[] groups)
  protected boolean filterNPC(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected final int minCount
protected final int maxCount
protected final double minRange
protected final double maxRange
protected final int[] includeGroups
protected final int[] excludeGroups
protected boolean findPlayers
protected final boolean haveIncludeGroups
protected final boolean haveExcludeGroups
