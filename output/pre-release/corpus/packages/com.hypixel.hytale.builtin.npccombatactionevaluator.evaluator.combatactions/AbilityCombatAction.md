# AbilityCombatAction

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.evaluator.combatactions

public class AbilityCombatAction

Combat action that triggers an NPC ability interaction (e.g., ranged attack, special ability) based on positioning and cooldown conditions.

Also in this package: AbilityType, BasicAttackTargetCombatAction, CombatActionOption, Nothing, StateCombatAction, Target

Complete API:
  public String getAbility()
  public float getChargeFor()
  public double[] getAttackRange()
  public int getWeaponSlot()
  public int getOffhandSlot()
  public float getFailureTimeout()
  public boolean isDamageFriendlies()
  public boolean isPositionFirst()
  public void execute(int index, ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer, Role role, CombatActionEvaluator evaluator, ValueStore valueStore)
  public boolean isBasicAttackAllowed(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer, CombatActionEvaluator evaluator)
  private Map<String,String> getInteractionVars(InteractionContext c)
  public String toString()

Fields:
public static final EnumCodec<AbilityCombatAction.AbilityType> MODE_CODEC
public static final EnumCodec<Positioning> POSITIONING_CODEC
public static final BuilderCodec<AbilityCombatAction> CODEC
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected String ability
protected AbilityCombatAction.AbilityType abilityType
protected float chargeFor
protected double[] attackRange
protected double maxRangeSquared
protected int weaponSlot
protected int offhandSlot
protected float failureTimeout
protected String subState
protected Map<String,String> interactionVars
protected boolean damageFriendlies
protected boolean requireAiming
protected Positioning positioning
protected boolean positionFirst
protected double chargeDistance
