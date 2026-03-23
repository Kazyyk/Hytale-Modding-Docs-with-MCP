# ActionApplyEntityEffect

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.combat | Extends: ActionBase

public class ActionApplyEntityEffect extends ActionBase

NPC action that applies an entity effect to a target.

Also in this package: ActionAttack, AttackType, BallisticMode, BodyMotionAimCharge, HeadMotionAim, SensorDamage, SensorIsBackingAway

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final int entityEffectId
protected final boolean useTarget
