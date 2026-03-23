# BuilderActionAttack

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.combat.builders | Extends: BuilderActionBase

public class BuilderActionAttack extends BuilderActionBase

NPC behavior action builder for ActionAttack functionality.

## Constants

- private static final String ATTACK_PARAMETER
- public static final String[] ANTECEDENT
- public static final String[] SUBSEQUENT
- public static final double[] DEFAULT_ATTACK_PAUSE_RANGE
- public static final double[] DEFAULT_AIMING_TIME_RANGE

## Fields

- protected final AssetHolder attack
- protected final EnumHolder<ActionAttack.AttackType> attackType
- protected final FloatHolder chargeFor
- protected final NumberArrayHolder attackPauseRange
- protected final NumberArrayHolder aimingTimeRange
- protected double meleeConeAngle
- protected ActionAttack.BallisticMode ballisticMode
- protected boolean checkLineOfSight
- protected boolean avoidFriendlyFire
- protected boolean damageFriendlies
- protected boolean skipAiming
- protected DoubleHolder chargeDistance
- protected boolean attackProvided

## Methods

- @Nonnull public ActionAttack build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public BuilderActionAttack readConfig(@Nonnull JsonElement data)
- @Nullable public String getAttack(@Nonnull BuilderSupport builderSupport)
- public ActionAttack.AttackType getAttackType(@Nonnull BuilderSupport support)
- public float getChargeTime(@Nonnull BuilderSupport support)
- public double[] getAttackPauseRange(@Nonnull BuilderSupport support)
- public double[] getAimingTimeRange(@Nonnull BuilderSupport support)
- public double getMeleeConeAngle()
- public ActionAttack.BallisticMode getBallisticMode()
- public boolean isCheckLineOfSight()
- public boolean isAvoidFriendlyFire()
- public boolean isDamageFriendlies()
- public boolean isSkipAiming()
- public double getChargeDistance(@Nonnull BuilderSupport support)
- public int getAttackParameterSlot(@Nonnull BuilderSupport support)
- @Nullable public Map<String, String> getInteractionVars()
