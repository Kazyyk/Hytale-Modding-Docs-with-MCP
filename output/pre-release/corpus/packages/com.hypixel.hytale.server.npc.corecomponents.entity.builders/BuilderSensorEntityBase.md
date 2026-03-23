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
