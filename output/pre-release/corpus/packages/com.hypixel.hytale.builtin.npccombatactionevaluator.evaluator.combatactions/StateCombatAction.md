# StateCombatAction

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.evaluator.combatactions

public class StateCombatAction

Combat action that transitions the NPC to a specific behavioral state, useful for flee, defensive, or special combat states.

Also in this package: AbilityCombatAction, AbilityType, BasicAttackTargetCombatAction, CombatActionOption, Nothing, Target

Complete API:
  public String getState()
  public String getSubState()
  public void execute(int index, ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer, Role role, CombatActionEvaluator evaluator, ValueStore valueStore)
  public boolean isBasicAttackAllowed(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer, CombatActionEvaluator evaluator)
  public String toString()

Fields:
public static final BuilderCodec<StateCombatAction> CODEC
protected String state
protected String subState
