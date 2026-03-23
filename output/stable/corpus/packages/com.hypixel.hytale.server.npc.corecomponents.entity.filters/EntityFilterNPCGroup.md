# EntityFilterNPCGroup

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters | Extends: EntityFilterBase

public class EntityFilterNPCGroup extends EntityFilterBase

Filters entities by NPC group membership, checking if the target belongs to a specified group.

Also in this package: EntityFilterAltitude, EntityFilterAnd, EntityFilterAttitude, EntityFilterCombat, EntityFilterHeightDifference, EntityFilterInsideBlock, EntityFilterInventory, EntityFilterItemInHand, EntityFilterLineOfSight, EntityFilterMany, EntityFilterMovementState, EntityFilterNot, EntityFilterOr, EntityFilterSpotsMe, EntityFilterStandingOnBlock, EntityFilterStat, EntityFilterViewSector, EntityStatTarget, Mode, WieldingHand

Complete API:
  public boolean matchesEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store)
  public int cost()

Fields:
public static final int COST
protected final int[] includeGroups
protected final int[] excludeGroups
