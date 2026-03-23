# BuilderActionWithDelay

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.builders | Extends: BuilderActionBase

public abstract class BuilderActionWithDelay extends BuilderActionBase

## Fields

- protected final NumberArrayHolder delayRange

## Methods

- @Nonnull @Override public Builder<Action> readCommonConfig(@Nonnull JsonElement data)
- public double[] getDelayRange(@Nonnull BuilderSupport support)
- protected double[] getDefaultTimeoutRange()

Known subclasses: BuilderActionDropItem, BuilderActionPickUpItem, BuilderActionTimeout

Also in this package: BuilderActionBase, BuilderBodyMotionBase, BuilderEntityFilterBase, BuilderEntityFilterWithToggle, BuilderHeadMotionBase, BuilderMotionBase, BuilderSensorBase, BuilderSensorEntityPrioritiserBase, BuilderSensorWithEntityFilters, BuilderWeightedAction

Complete API:
  public Builder<Action> readCommonConfig(JsonElement data)
  public double[] getDelayRange(BuilderSupport support)
  protected double[] getDefaultTimeoutRange()

Fields:
public static final double[] DEFAULT_TIMEOUT_RANGE
protected final NumberArrayHolder delayRange
