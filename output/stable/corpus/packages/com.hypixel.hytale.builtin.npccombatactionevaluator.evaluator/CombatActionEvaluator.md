# CombatActionEvaluator

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.evaluator | Extends: Evaluator | Implements: Component>

public class CombatActionEvaluator extends Evaluator<CombatActionOption> implements Component<EntityStore>

Core NPC combat action evaluator component. Extends `Evaluator` for `CombatActionOption` and implements `Component<EntityStore>`. Manages combat action selection via utility-based AI, tracking basic attacks, cooldowns, primary targets, timeouts, and interaction state. Evaluates and selects combat actions per-tick based on configured utility thresholds and predictability.

## Key Methods

- public static ComponentType<EntityStore, CombatActionEvaluator> getComponentType()
- public CombatActionEvaluator.RunOption getRunOption()
- public double getMinRunUtility()
- public EvaluationContext getEvaluationContext()
- public long getLastRunNanos()
- public void setLastRunNanos(long lastRunNanos)
- public int getRunInState()
- public Int2ObjectMap<List<Evaluator<CombatActionOption>.OptionHolder>> getOptionsBySubState()
- public CombatActionEvaluatorConfig.BasicAttacks getBasicAttacks(int subState)
- public void setCurrentBasicAttackSet(int subState, CombatActionEvaluatorConfig.BasicAttacks attacks)
- public String getCurrentBasicAttack()
- public CombatActionEvaluatorConfig.BasicAttacks getCurrentBasicAttackSet()
- public void setCurrentBasicAttack(String attack, boolean damageFriendlies, Function<InteractionContext, Map<String, String>> interactionVarsGetter)
- public int getNextBasicAttackIndex()
- public void setNextBasicAttackIndex(int next)
- public boolean canUseBasicAttack(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer)
- public void tickBasicAttackCoolDown(float dt)
- public Ref<EntityStore> getBasicAttackTarget()
- public void setBasicAttackTarget(Ref<EntityStore> target)
- public boolean tickBasicAttackTimeout(float dt)
