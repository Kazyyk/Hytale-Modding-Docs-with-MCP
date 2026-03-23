# EntityFilterViewSector

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters | Extends: EntityFilterBase

public class EntityFilterViewSector extends EntityFilterBase

Filters entities based on whether the target is within the evaluating NPC's view sector (angle and distance).

Also in this package: EntityFilterAltitude, EntityFilterAnd, EntityFilterAttitude, EntityFilterCombat, EntityFilterEntityEffect, EntityFilterHeightDifference, EntityFilterInsideBlock, EntityFilterInventory, EntityFilterItemInHand, EntityFilterLineOfSight, EntityFilterMany, EntityFilterMovementState, EntityFilterNPCGroup, EntityFilterNot, EntityFilterOr, EntityFilterSpotsMe, EntityFilterStandingOnBlock, EntityFilterStat, EntityStatTarget, Mode (and 1 more)

Complete API:
  public boolean matchesEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store)
  public int cost()
  public float getViewAngle()

Fields:
public static final int COST
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected final float viewCone
