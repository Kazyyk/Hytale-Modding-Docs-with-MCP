# CombatActionEvaluatorConfig

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.evaluator

public class CombatActionEvaluatorConfig

Configuration class for the NPC combat action evaluator. Defines available combat actions, action sets per substate, run conditions, utility thresholds, and predictability settings. Deserialized from JSON via a `BuilderCodec`.

## Key Methods

- public static final BuilderCodec<CombatActionEvaluatorConfig> CODEC = BuilderCodec.builder( CombatActionEvaluatorConfig.class, CombatActionEvaluatorConfig::new )
- public Map<String, String> getAvailableActions()
- public Map<String, CombatActionEvaluatorConfig.ActionSet> getActionSets()
- public String[] getRunConditions()
- public double getMinRunUtility()
- public double getMinActionUtility()
- public double[] getPredictabilityRange()
- public String toString()
- public static final BuilderCodec<CombatActionEvaluatorConfig.ActionSet> CODEC = BuilderCodec.builder( CombatActionEvaluatorConfig.ActionSet.class, CombatActionEvaluatorConfig.ActionSet::new )
- public CombatActionEvaluatorConfig.BasicAttacks getBasicAttacks()
- public String[] getCombatActions()
- public String toString()
- public static final BuilderCodec<CombatActionEvaluatorConfig.BasicAttacks> CODEC = BuilderCodec.builder( CombatActionEvaluatorConfig.BasicAttacks.class, CombatActionEvaluatorConfig.BasicAttacks::new )
- public String[] getAttacks()
- public boolean isRandom()
- public double getMaxRange()
- public double getMaxRangeSquared()
- public float getTimeout()
- public double[] getCooldownRange()
- public Map<String, String> getInteractionVars(InteractionContext c)

Also in this package: ActionSet, BasicAttacks, CombatActionEvaluator, CombatOptionHolder, MultipleTargetCombatOptionHolder, RunOption, SelfCombatOptionHolder

Complete API:
  public Map<String,String> getAvailableActions()
  public Map<String,CombatActionEvaluatorConfig.ActionSet> getActionSets()
  public String[] getRunConditions()
  public double getMinRunUtility()
  public double getMinActionUtility()
  public double[] getPredictabilityRange()
  public String toString()

Fields:
public static final BuilderCodec<CombatActionEvaluatorConfig> CODEC
private static final double[] DEFAULT_PREDICTABILITY_RANGE
protected Map<String,String> availableActions
protected Map<String,CombatActionEvaluatorConfig.ActionSet> actionSets
protected String[] runConditions
protected double minRunUtility
protected double minActionUtility
protected double[] predictabilityRange
