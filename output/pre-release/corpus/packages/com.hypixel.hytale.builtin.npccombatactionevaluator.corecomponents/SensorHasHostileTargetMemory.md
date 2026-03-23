# SensorHasHostileTargetMemory

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.corecomponents

public class SensorHasHostileTargetMemory

Sensor that checks whether the NPC has hostile targets in its target memory.

Also in this package: ActionAddToTargetMemory, ActionCombatAbility, CombatTargetCollector, SensorCombatActionEvaluator

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()

Fields:
private static final ComponentType<EntityStore,TargetMemory> TARGET_MEMORY
