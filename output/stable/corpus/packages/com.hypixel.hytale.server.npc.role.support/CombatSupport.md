# CombatSupport

Type: class | Package: com.hypixel.hytale.server.npc.role.support

public class CombatSupport

Manages NPC combat state including active attack chains, friendly fire toggles, damage group filtering, and attack sequence overrides. Uses asset registry tags to categorize attacks (melee, ranged, block).

## Constants

- public static final String ATTACK_TAG
- public static final int ATTACK_TAG_INDEX
- public static final String AIMING_REFERENCE_TAG
- public static final int AIMING_REFERENCE_TAG_INDEX
- public static final String MELEE_TAG
- public static final int MELEE_TAG_INDEX
- public static final String RANGED_TAG
- public static final int RANGED_TAG_INDEX
- public static final String BLOCK_TAG
- public static final int BLOCK_TAG_INDEX

## Constructors

- public CombatSupport(NPCEntity parent, @Nonnull BuilderRole builder, @Nonnull BuilderSupport support)

## Methods

- public boolean isDealingFriendlyDamage()
- public int[] getDisableDamageGroups()
- public boolean isExecutingAttack()
- public void tick(double dt)
- public boolean getCanCauseDamage(@Nonnull Ref<EntityStore> attackerRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void setExecutingAttack(InteractionChain chain, boolean damageFriendlies, double attackPause)
- public void addAttackOverride(String attackSequence)
- public void clearAttackOverrides()
- @Nullable public String getNextAttackOverride()

## Behavior

`getCanCauseDamage` checks whether the NPC can deal damage to a given attacker entity. It first checks flock membership (if `disableDamageFlock` is set, flock members cannot damage each other), then checks damage group membership via WorldSupport`.isGroupMember()`. Friendly fire is allowed when the attacking NPC's combat support has `dealFriendlyDamage` set to true.

Attack overrides cycle through a list of attack sequence names, wrapping to index 0 after the last entry.

## Related Types

- WorldSupport -- group membership checks

Also in this package: DebugFlagsChangeListener, DebugSupport, EntityList, EntitySupport, EntityVisData, LineOfSightBuffer, LineOfSightEntityBuffer, MarkedEntitySupport, PositionCache, RangeType, RayPredicate, RoleStats, SensorVisData, StateSupport, WorldSupport

Complete API:
  public boolean isDealingFriendlyDamage()
  public int[] getDisableDamageGroups()
  public boolean isExecutingAttack()
  public void tick(double dt)
  public boolean getCanCauseDamage(Ref<EntityStore> attackerRef, ComponentAccessor<EntityStore> componentAccessor)
  public void setExecutingAttack(InteractionChain chain, boolean damageFriendlies, double attackPause)
  public void addAttackOverride(String attackSequence)
  public void clearAttackOverrides()
  public String getNextAttackOverride()

Fields:
public static final String ATTACK_TAG
public static final int ATTACK_TAG_INDEX
public static final String AIMING_REFERENCE_TAG
public static final int AIMING_REFERENCE_TAG_INDEX
public static final String MELEE_TAG
public static final int MELEE_TAG_INDEX
public static final String RANGED_TAG
public static final int RANGED_TAG_INDEX
public static final String BLOCK_TAG
public static final int BLOCK_TAG_INDEX
protected final NPCEntity parent
protected final boolean disableDamageFlock
protected final int[] disableDamageGroups
protected InteractionChain activeAttack
protected boolean dealFriendlyDamage
protected double attackPause
protected final List<String> attackOverrides
protected int attackOverrideIndex
