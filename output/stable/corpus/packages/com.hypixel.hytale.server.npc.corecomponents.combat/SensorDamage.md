# SensorDamage

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.combat | Extends: SensorBase

public class SensorDamage extends SensorBase

Sensor that detects when the NPC has taken damage.

Also in this package: ActionApplyEntityEffect, ActionAttack, AttackType, BallisticMode, BodyMotionAimCharge, HeadMotionAim, SensorIsBackingAway

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()

Fields:
protected final boolean combatDamage
protected final boolean friendlyDamage
protected final boolean drowningDamage
protected final boolean environmentDamage
protected final boolean otherDamage
protected final int targetSlot
protected final EntityPositionProvider positionProvider
