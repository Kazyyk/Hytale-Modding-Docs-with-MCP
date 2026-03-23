# SensorBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents | Extends: AnnotatedComponentBase | Implements: Sensor

public abstract class SensorBase extends AnnotatedComponentBase implements Sensor

## Fields

- protected final boolean once
- protected boolean triggered

## Constructors

- public SensorBase(@Nonnull BuilderSensorBase builderSensorBase)

## Methods

- @Override public boolean matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- @Override public void clearOnce()
- @Override public void setOnce()
- @Override public boolean isTriggered()
- @Override public boolean processDelay(float dt)

Known subclasses: SensorAdjustPosition, SensorAge, SensorAlarm, SensorAnimation, SensorAny, SensorBeacon, SensorBlock, SensorBlockType, SensorCanInteract, SensorCanPlace, SensorCombatActionEvaluator, SensorCount, SensorDamage, SensorDroppedItem, SensorEval, SensorEvent, SensorFlag, SensorFlockCombatDamage, SensorFlockLeader, SensorHasHostileTargetMemory, SensorHasInteracted, SensorHasTask, SensorInAir, SensorInWater, SensorInflictedDamage, SensorInteractionContext, SensorIsBackingAway, SensorIsBusy, SensorKill, SensorLeash, SensorLight, SensorMany, SensorMotionController, SensorNav, SensorNot, SensorOnGround, SensorPath, SensorRandom, SensorReadPosition, SensorSearchRay, SensorState, SensorSwitch, SensorTime, SensorTimer, SensorValueProviderWrapper, SensorWeather, SensorWithEntityFilters

Also in this package: ActionBase, ActionWithDelay, AnnotatedComponentBase, BlockTarget, BodyMotionBase, EntityFilterBase, HeadMotionBase, IEntityFilter, ISensorEntityCollector, ISensorEntityPrioritiser, MotionBase, SensorWithEntityFilters, WeightedAction

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public void clearOnce()
  public void setOnce()
  public boolean isTriggered()
  public boolean processDelay(float dt)

Fields:
protected final boolean once
protected boolean triggered
