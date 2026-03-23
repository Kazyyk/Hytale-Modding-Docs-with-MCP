# EntityFilterAttitude

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters | Extends: EntityFilterBase

public class EntityFilterAttitude extends EntityFilterBase

Filters entities by their attitude (friendly, neutral, hostile) relative to the evaluating NPC.

Also in this package: EntityFilterAltitude, EntityFilterAnd, EntityFilterCombat, EntityFilterHeightDifference, EntityFilterInsideBlock, EntityFilterInventory, EntityFilterItemInHand, EntityFilterLineOfSight, EntityFilterMany, EntityFilterMovementState, EntityFilterNPCGroup, EntityFilterNot, EntityFilterOr, EntityFilterSpotsMe, EntityFilterStandingOnBlock, EntityFilterStat, EntityFilterViewSector, EntityStatTarget, Mode, WieldingHand

Complete API:
  public boolean matchesEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store)
  public int cost()
  public void registerWithSupport(Role role)

Fields:
public static final String TYPE
public static final int COST
protected final EnumSet<Attitude> attitudes
