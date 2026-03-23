# EntityFilterSpotsMe

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters | Extends: EntityFilterBase

public class EntityFilterSpotsMe extends EntityFilterBase

Filters entities based on whether the target entity has spotted (detected) the evaluating NPC.

Also in this package: EntityFilterAltitude, EntityFilterAnd, EntityFilterAttitude, EntityFilterCombat, EntityFilterEntityEffect, EntityFilterHeightDifference, EntityFilterInsideBlock, EntityFilterInventory, EntityFilterItemInHand, EntityFilterLineOfSight, EntityFilterMany, EntityFilterMovementState, EntityFilterNPCGroup, EntityFilterNot, EntityFilterOr, EntityFilterStandingOnBlock, EntityFilterStat, EntityFilterViewSector, EntityStatTarget, Mode (and 1 more)

Complete API:
  public boolean matchesEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store)
  public int cost()
  protected boolean inViewTest(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Store<EntityStore> store)
  protected boolean inViewSector(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Store<EntityStore> store)
  protected boolean inViewCone(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Store<EntityStore> store)

Fields:
public static final int COST
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected final float viewAngle
protected final boolean testLineOfSight
protected final ViewTest viewTest
protected final Vector3d view
