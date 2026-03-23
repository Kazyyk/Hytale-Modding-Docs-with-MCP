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

Also in this package: ActionSet, BasicAttacks, CombatActionEvaluatorConfig, CombatOptionHolder, MultipleTargetCombatOptionHolder, RunOption, SelfCombatOptionHolder

Complete API:
  public static ComponentType<EntityStore,CombatActionEvaluator> getComponentType()
  public CombatActionEvaluator.RunOption getRunOption()
  public double getMinRunUtility()
  public EvaluationContext getEvaluationContext()
  public long getLastRunNanos()
  public void setLastRunNanos(long lastRunNanos)
  public int getRunInState()
  public Int2ObjectMap<List<Evaluator<CombatActionOption>.OptionHolder>> getOptionsBySubState()
  public CombatActionEvaluatorConfig.BasicAttacks getBasicAttacks(int subState)
  public void setCurrentBasicAttackSet(int subState, CombatActionEvaluatorConfig.BasicAttacks attacks)
  public String getCurrentBasicAttack()
  public CombatActionEvaluatorConfig.BasicAttacks getCurrentBasicAttackSet()
  public void setCurrentBasicAttack(String attack, boolean damageFriendlies, Function<InteractionContext,Map<String,String>> interactionVarsGetter)
  public int getNextBasicAttackIndex()
  public void setNextBasicAttackIndex(int next)
  public boolean canUseBasicAttack(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer)
  public void tickBasicAttackCoolDown(float dt)
  public Ref<EntityStore> getBasicAttackTarget()
  public void setBasicAttackTarget(Ref<EntityStore> target)
  public boolean tickBasicAttackTimeout(float dt)
  public void setBasicAttackTimeout(double timeout)
  public Ref<EntityStore> getPrimaryTarget()
  public void clearPrimaryTarget()
  public void setActiveOptions(List<Evaluator<CombatActionOption>.OptionHolder> options)
  public int getMarkedTargetSlot()
  public int getMaxRangeSlot()
  public int getMinRangeSlot()
  public int getPositioningAngleSlot()
  public String getCurrentAttack()
  public float getChargeFor()
  public InteractionType getCurrentInteractionType()
  public Function<InteractionContext,Map<String,String>> getCurrentInteractionVarsGetter()
  public boolean shouldDamageFriendlies()
  public boolean requiresAiming()
  public boolean shouldPositionFirst()
  public double getChargeDistance()
  public void setCurrentInteraction(String currentInteraction, InteractionType interactionType, float chargeFor, boolean damageFriendlies, boolean requireAiming, boolean positionFirst, double chargeDistance, Function<InteractionContext,Map<String,String>> interactionVarsGetter)
  public CombatActionEvaluator.CombatOptionHolder getCurrentAction()
  public double[] consumePostExecutionDistanceRange()
  public void setTimeout(float timeout)
  public void clearTimeout()
  public boolean hasTimedOut(float dt)
  public void selectNextCombatAction(int index, ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer, Role role, ValueStore valueStore)
  public void completeCurrentAction(boolean forceClearAbility, boolean clearBasicAttack)
  public void terminateCurrentAction()
  public void clearCurrentBasicAttack()
  public void setupNPC(Role role)
  public void setupNPC(Holder<EntityStore> holder)
  public Component<EntityStore> clone()

Fields:
protected static final float NO_TIMEOUT
protected CombatActionEvaluator.RunOption runOption
protected double minRunUtility
protected long lastRunNanos
protected int runInState
protected float predictability
protected double minActionUtility
protected final Int2ObjectMap<List<Evaluator<CombatActionOption>.OptionHolder>> optionsBySubState
protected final Int2ObjectMap<CombatActionEvaluatorConfig.BasicAttacks> basicAttacksBySubState
protected int currentBasicAttackSubState
protected CombatActionEvaluatorConfig.BasicAttacks currentBasicAttackSet
protected String currentBasicAttack
protected Function<InteractionContext,Map<String,String>> currentBasicAttacksInteractionVarsGetter
protected boolean currentBasicAttackDamageFriendlies
protected int nextBasicAttackIndex
protected double basicAttackCooldown
protected Ref<EntityStore> basicAttackTarget
protected double basicAttackTimeout
protected Ref<EntityStore> primaryTarget
protected Ref<EntityStore> previousTarget
protected CombatActionEvaluator.CombatOptionHolder currentAction
protected double[] postExecutionDistanceRange
protected int markedTargetSlot
protected int minRangeSlot
protected int maxRangeSlot
protected int positioningAngleSlot
protected String currentInteraction
protected Function<InteractionContext,Map<String,String>> currentInteractionVarsGetter
protected InteractionType currentInteractionType
protected float chargeFor
protected boolean currentDamageFriendlies
protected boolean requireAiming
protected boolean positionFirst
protected double chargeDistance
protected float timeout
protected final EvaluationContext evaluationContext
