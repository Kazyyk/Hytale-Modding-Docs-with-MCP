# ActionAddToTargetMemory

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.corecomponents | Extends: ActionBase

public class ActionAddToTargetMemory extends ActionBase

NPC action that adds the current target to the entity's target memory component, enabling threat tracking for combat decisions.

Also in this package: ActionCombatAbility, CombatTargetCollector, SensorCombatActionEvaluator, SensorHasHostileTargetMemory

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
private static final ComponentType<EntityStore,TargetMemory> TARGET_MEMORY
