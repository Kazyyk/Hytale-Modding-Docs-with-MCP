# EntityFilterHeightDifference

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters | Extends: EntityFilterBase

public class EntityFilterHeightDifference extends EntityFilterBase

Filters entities by the vertical distance between the NPC and the target, checking against a configured range.

Also in this package: EntityFilterAltitude, EntityFilterAnd, EntityFilterAttitude, EntityFilterCombat, EntityFilterEntityEffect, EntityFilterInsideBlock, EntityFilterInventory, EntityFilterItemInHand, EntityFilterLineOfSight, EntityFilterMany, EntityFilterMovementState, EntityFilterNPCGroup, EntityFilterNot, EntityFilterOr, EntityFilterSpotsMe, EntityFilterStandingOnBlock, EntityFilterStat, EntityFilterViewSector, EntityStatTarget, Mode (and 1 more)

Complete API:
  public boolean matchesEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store)
  public int cost()

Fields:
public static final int COST
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected static final ComponentType<EntityStore,ModelComponent> MODEL_COMPONENT_TYPE
protected static final ComponentType<EntityStore,BoundingBox> BOUNDING_BOX_COMPONENT_TYPE
protected final double minHeightDifference
protected final double maxHeightDifference
protected final boolean useEyePosition
