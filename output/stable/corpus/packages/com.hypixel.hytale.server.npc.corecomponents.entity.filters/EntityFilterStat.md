# EntityFilterStat

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters | Extends: EntityFilterBase

public class EntityFilterStat extends EntityFilterBase

Filters entities based on a stat value, comparing it against a configured threshold using a comparison operator.

Also in this package: EntityFilterAltitude, EntityFilterAnd, EntityFilterAttitude, EntityFilterCombat, EntityFilterHeightDifference, EntityFilterInsideBlock, EntityFilterInventory, EntityFilterItemInHand, EntityFilterLineOfSight, EntityFilterMany, EntityFilterMovementState, EntityFilterNPCGroup, EntityFilterNot, EntityFilterOr, EntityFilterSpotsMe, EntityFilterStandingOnBlock, EntityFilterViewSector, EntityStatTarget, Mode, WieldingHand

Complete API:
  public boolean matchesEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store)
  public int cost()

Fields:
public static final int COST
protected static final ComponentType<EntityStore,EntityStatMap> ENTITY_STAT_MAP_COMPONENT_TYPE
protected final int stat
protected final EntityFilterStat.EntityStatTarget statTarget
protected final int relativeTo
protected final EntityFilterStat.EntityStatTarget relativeToTarget
protected final double minValue
protected final double maxValue
