# BasicAttackTargetCombatAction

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.evaluator.combatactions

public class BasicAttackTargetCombatAction

Combat action for basic melee attacks on the current target. Evaluates weapon availability and selects appropriate hotbar slot.

Also in this package: AbilityCombatAction, AbilityType, CombatActionOption, Nothing, StateCombatAction, Target

Complete API:
  public void execute(int index, ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer, Role role, CombatActionEvaluator evaluator, ValueStore valueStore)
  public boolean isBasicAttackAllowed(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer, CombatActionEvaluator evaluator)
  public boolean cancelBasicAttackOnSelect()

Fields:
private static final double BASIC_ATTACK_DISTANCE_OFFSET
public static final BuilderCodec<BasicAttackTargetCombatAction> CODEC
protected int weaponSlot
protected int offhandSlot
