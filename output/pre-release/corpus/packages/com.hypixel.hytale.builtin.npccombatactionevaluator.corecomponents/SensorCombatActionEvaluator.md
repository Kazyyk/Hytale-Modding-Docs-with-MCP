# SensorCombatActionEvaluator

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.corecomponents

public class SensorCombatActionEvaluator

Sensor component that evaluates combat actions based on current sensor information and target state.

Also in this package: ActionAddToTargetMemory, ActionCombatAbility, CombatTargetCollector, SensorHasHostileTargetMemory

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()

Fields:
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected final boolean targetInRange
protected final double allowableDeviation
protected final int minRangeStoreSlot
protected final int maxRangeStoreSlot
protected final int positioningAngleStoreSlot
protected final int targetSlot
protected final SingleDoubleParameterProvider minRangeParameterProvider
protected final SingleDoubleParameterProvider maxRangeParameterProvider
protected final SingleDoubleParameterProvider positioningAngleParameterProvider
protected final MultipleParameterProvider parameterProvider
protected final EntityPositionProvider positionProvider
protected final ComponentType<EntityStore,ValueStore> valueStoreComponentType
