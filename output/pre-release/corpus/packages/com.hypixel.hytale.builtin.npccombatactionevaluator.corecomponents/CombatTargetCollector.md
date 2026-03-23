# CombatTargetCollector

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.corecomponents

public class CombatTargetCollector

Collects and prioritizes potential combat targets for NPC combat action evaluation.

Also in this package: ActionAddToTargetMemory, ActionCombatAbility, SensorCombatActionEvaluator, SensorHasHostileTargetMemory

Complete API:
  public void registerWithSupport(Role role)
  public void init(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public void collectMatching(Ref<EntityStore> ref, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public void collectNonMatching(Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public boolean terminateOnFirstMatch()
  public void cleanup()

Fields:
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
private Role role
private TargetMemory targetMemory
private double closestHostileDistanceSquared
