# BuilderSensorEntityBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderSensorWithEntityFilters

public abstract class BuilderSensorEntityBase extends BuilderSensorWithEntityFilters

Abstract base class in the `builders` package.

## Methods

- @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- @Override public boolean validate(String configName,
        @Nonnull NPCLoadTimeValidationHelper validationHelper,
        @Nonnull ExecutionContext context,
        Scope globalScope,
        @Nonnull List<String> errors)` |
| `` | `public double` | `getRange(@Nonnull BuilderSupport builderSupport)` |
| `` | `public double` | `getMinRange(@Nonnull BuilderSupport builderSupport)` |
| `` | `public boolean` | `isLockOnTarget(@Nonnull BuilderSupport builderSupport)` |
| `` | `public boolean` | `isOnlyLockedTarget(@Nonnull BuilderSupport builderSupport)` |
| `` | `public int` | `getLockedTargetSlot(@Nonnull BuilderSupport support)` |
| `` | `public int` | `getIgnoredTargetSlot(@Nonnull BuilderSupport support)` |
| `` | `public boolean` | `isAutoUnlockTarget(@Nonnull BuilderSupport builderSupport)` |
| `` | `public boolean` | `isUseProjectedDistance(@Nonnull BuilderSupport support)` |
| `@Nullable public` | `ISensorEntityPrioritiser` | `getPrioritiser(@Nonnull BuilderSupport support)` |
| `@Nullable public` | `ISensorEntityCollector` | `getCollector(@Nonnull BuilderSupport support)` |

Known subclasses: BuilderSensorEntity, BuilderSensorPlayer

Also in this package: BuilderActionBeacon, BuilderActionIgnoreForAvoidance, BuilderActionNotify, BuilderActionOverrideAttitude, BuilderActionReleaseTarget, BuilderActionSetMarkedTarget, BuilderActionSetStat, BuilderHeadMotionWatch, BuilderSensorBeacon, BuilderSensorCount, BuilderSensorEntity, BuilderSensorKill, BuilderSensorPlayer, BuilderSensorSelf, BuilderSensorTarget

Complete API:
  public Builder<Sensor> readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public double getRange(BuilderSupport builderSupport)
  public double getMinRange(BuilderSupport builderSupport)
  public boolean isLockOnTarget(BuilderSupport builderSupport)
  public boolean isOnlyLockedTarget(BuilderSupport builderSupport)
  public int getLockedTargetSlot(BuilderSupport support)
  public int getIgnoredTargetSlot(BuilderSupport support)
  public boolean isAutoUnlockTarget(BuilderSupport builderSupport)
  public boolean isUseProjectedDistance(BuilderSupport support)
  public ISensorEntityPrioritiser getPrioritiser(BuilderSupport support)
  public ISensorEntityCollector getCollector(BuilderSupport support)

Fields:
protected final DoubleHolder range
protected final DoubleHolder minRange
protected final BooleanHolder lockOnTarget
protected final BooleanHolder autoUnlockTarget
protected final BooleanHolder onlyLockedTarget
protected final StringHolder lockedTargetSlot
protected final StringHolder ignoredTargetSlot
protected final BooleanHolder useProjectedDistance
protected final BuilderObjectReferenceHelper<ISensorEntityPrioritiser> prioritiser
protected final BuilderObjectReferenceHelper<ISensorEntityCollector> collector
