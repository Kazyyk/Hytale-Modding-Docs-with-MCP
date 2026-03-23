# ActionAttack

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.combat | Extends: ActionBase

public class ActionAttack extends ActionBase

NPC action that executes a melee or ranged attack against a target.

Also in this package: ActionApplyEntityEffect, AttackType, BallisticMode, BodyMotionAimCharge, HeadMotionAim, SensorDamage, SensorIsBackingAway

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public void activate(Role role, InfoProvider infoProvider)
  public void deactivate(Role role, InfoProvider infoProvider)
  protected boolean hasTimeForAiming(double dt)
  protected double newAimingTime()
  protected double newAttackPause()
  private Map<String,String> getInteractionVars(InteractionContext c)

Fields:
public static final ThreadLocal<SingleCollector<BallisticData>> THREAD_LOCAL_COLLECTOR
protected final int id
protected String attack
protected final InteractionType interactionType
protected final float chargeFor
protected final double[] attackPauseRange
protected final double[] aimingTimeRange
protected final double meleeConeAngle
protected final ActionAttack.BallisticMode ballisticMode
protected final boolean checkLineOfSight
protected final boolean avoidFriendlyFire
protected final boolean damageFriendlies
protected final boolean skipAiming
protected final double chargeDistance
protected final int attackParameterSlot
protected final Map<String,String> interactionVars
protected boolean attackReady
protected String attackInteraction
protected boolean ballisticShort
protected StringParameterProvider cachedAttackProvider
protected boolean initialised
protected double aimingTimeRemaining
protected Role ownerRole
