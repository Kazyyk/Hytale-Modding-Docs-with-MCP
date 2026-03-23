# EntityFilterEntityEffect

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters | Extends: EntityFilterBase

public class EntityFilterEntityEffect extends EntityFilterBase

NPC entity filter that checks whether a target entity has a specific active entity effect. Used in NPC AI decision-making to conditionally include or exclude entities based on applied effects (e.g., poison, buffs).

## Static Fields

- COST | int | Filter evaluation cost: `100`.

## Constructor


public EntityFilterEntityEffect(@Nonnull BuilderEntityFilterEntityEffect builder, @Nonnull BuilderSupport support)

Resolves the entity effect index from the builder at construction time.

## Methods

- matchesEntity(Ref<EntityStore>, Ref<EntityStore>, Role, Store<EntityStore>) | boolean | Returns `true` if the target entity's `EffectControllerComponent` has the specified effect active.
- cost() | int | Returns `100`.

Also in this package: EntityFilterAltitude, EntityFilterAnd, EntityFilterAttitude, EntityFilterCombat, EntityFilterHeightDifference, EntityFilterInsideBlock, EntityFilterInventory, EntityFilterItemInHand, EntityFilterLineOfSight, EntityFilterMany, EntityFilterMovementState, EntityFilterNPCGroup, EntityFilterNot, EntityFilterOr, EntityFilterSpotsMe, EntityFilterStandingOnBlock, EntityFilterStat, EntityFilterViewSector, EntityStatTarget, Mode (and 1 more)

Complete API:
  public boolean matchesEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store)
  public int cost()

Fields:
public static final int COST
private static final ComponentType<EntityStore,EffectControllerComponent> EFFECT_CONTROLLER_COMPONENT_TYPE
private final int entityEffectIndex
