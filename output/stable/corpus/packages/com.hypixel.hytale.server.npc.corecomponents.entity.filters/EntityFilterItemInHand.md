# EntityFilterItemInHand

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters | Extends: EntityFilterBase

public class EntityFilterItemInHand extends EntityFilterBase

Filters entities based on the item currently held in their hand.

Also in this package: EntityFilterAltitude, EntityFilterAnd, EntityFilterAttitude, EntityFilterCombat, EntityFilterHeightDifference, EntityFilterInsideBlock, EntityFilterInventory, EntityFilterLineOfSight, EntityFilterMany, EntityFilterMovementState, EntityFilterNPCGroup, EntityFilterNot, EntityFilterOr, EntityFilterSpotsMe, EntityFilterStandingOnBlock, EntityFilterStat, EntityFilterViewSector, EntityStatTarget, Mode, WieldingHand

Complete API:
  public boolean matchesEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store)
  public int cost()

Fields:
public static final int COST
protected final List<String> items
protected final EntityFilterItemInHand.WieldingHand hand
