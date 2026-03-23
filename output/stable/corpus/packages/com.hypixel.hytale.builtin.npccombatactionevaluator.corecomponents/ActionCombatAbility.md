# ActionCombatAbility

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.corecomponents | Extends: ActionBase

public class ActionCombatAbility extends ActionBase

NPC action that triggers a combat ability execution during combat action evaluation.

Also in this package: ActionAddToTargetMemory, CombatTargetCollector, SensorCombatActionEvaluator, SensorHasHostileTargetMemory

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public void activate(Role role, InfoProvider infoProvider)
  public void deactivate(Role role, InfoProvider infoProvider)

Fields:
protected static final ComponentType<EntityStore,CombatActionEvaluator> COMPONENT_TYPE
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected static final float POSITIONING_ANGLE_THRESHOLD
protected final int id
protected final int positioningAngleProviderSlot
protected final double meleeConeAngle
protected String attack
protected DoubleParameterProvider cachedPositioningAngleProvider
protected boolean initialised
