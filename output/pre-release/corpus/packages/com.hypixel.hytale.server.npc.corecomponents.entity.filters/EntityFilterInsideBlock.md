# EntityFilterInsideBlock

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters | Extends: EntityFilterBase

public class EntityFilterInsideBlock extends EntityFilterBase

Filters entities based on whether they are standing inside a block of a specific type or tag.

Also in this package: EntityFilterAltitude, EntityFilterAnd, EntityFilterAttitude, EntityFilterCombat, EntityFilterEntityEffect, EntityFilterHeightDifference, EntityFilterInventory, EntityFilterItemInHand, EntityFilterLineOfSight, EntityFilterMany, EntityFilterMovementState, EntityFilterNPCGroup, EntityFilterNot, EntityFilterOr, EntityFilterSpotsMe, EntityFilterStandingOnBlock, EntityFilterStat, EntityFilterViewSector, EntityStatTarget, Mode (and 1 more)

Complete API:
  public boolean matchesEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store)
  public int cost()
  private static boolean accept(int x, int y, int z, EntityFilterInsideBlock filter)

Fields:
public static final int COST
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected static final ComponentType<EntityStore,BoundingBox> BOUNDING_BOX_COMPONENT_TYPE
protected static final ComponentType<ChunkStore,BlockChunk> BLOCK_CHUNK_COMPONENT_TYPE
protected final int blockSet
protected ChunkStore chunkStore
protected long chunkIndex
protected BlockChunk blockChunk
protected int chunkSectionIndex
protected BlockSection chunkSection
protected boolean matches
