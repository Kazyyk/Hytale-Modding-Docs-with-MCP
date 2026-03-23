# BuilderSensorBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.builders | Extends: BuilderBase<Sensor>

public abstract class BuilderSensorBase extends BuilderBase<Sensor>

## Fields

- protected boolean once
- protected final BooleanHolder enabled

## Methods

- @Nonnull @Override public Builder<Sensor> readCommonConfig(@Nonnull JsonElement data)
- @Nonnull @Override public Class<Sensor> category()
- public boolean getOnce()
- public void setOnce(boolean once)
- @Override public boolean isEnabled(ExecutionContext context)
- @Override public boolean validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)

Known subclasses: BuilderSensorAdjustPosition, BuilderSensorAge, BuilderSensorAlarm, BuilderSensorAnimation, BuilderSensorAny, BuilderSensorBeacon, BuilderSensorBlock, BuilderSensorBlockType, BuilderSensorCanInteract, BuilderSensorCanPlace, BuilderSensorCombatActionEvaluator, BuilderSensorCount, BuilderSensorDamage, BuilderSensorDroppedItem, BuilderSensorEval, BuilderSensorEvent, BuilderSensorFlag, BuilderSensorFlockCombatDamage, BuilderSensorFlockLeader, BuilderSensorHasHostileTargetMemory, BuilderSensorHasInteracted, BuilderSensorHasTask, BuilderSensorInAir, BuilderSensorInWater, BuilderSensorInflictedDamage, BuilderSensorInteractionContext, BuilderSensorIsBackingAway, BuilderSensorIsBusy, BuilderSensorKill, BuilderSensorLeash, BuilderSensorLight, BuilderSensorMany, BuilderSensorMotionController, BuilderSensorNav, BuilderSensorNot, BuilderSensorOnGround, BuilderSensorPath, BuilderSensorRandom, BuilderSensorReadPosition, BuilderSensorSearchRay, BuilderSensorState, BuilderSensorSwitch, BuilderSensorTime, BuilderSensorTimer, BuilderSensorValueProviderWrapper, BuilderSensorWeather, BuilderSensorWithEntityFilters

Also in this package: BuilderActionBase, BuilderActionWithDelay, BuilderBodyMotionBase, BuilderEntityFilterBase, BuilderEntityFilterWithToggle, BuilderHeadMotionBase, BuilderMotionBase, BuilderSensorEntityPrioritiserBase, BuilderSensorWithEntityFilters, BuilderWeightedAction

Complete API:
  public Builder<Sensor> readCommonConfig(JsonElement data)
  public Class<Sensor> category()
  public boolean getOnce()
  public void setOnce(boolean once)
  public boolean isEnabled(ExecutionContext context)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)

Fields:
protected boolean once
protected final BooleanHolder enabled
