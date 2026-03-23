# BlockTypeView

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view.blocktype

public class BlockTypeView

NPC blackboard view that provides information about block types in the world around an NPC entity.

Also in this package: BlockPositionEntryGenerator, BlockTypeViewManager, FoundBlockConsumer

Complete API:
  public long getIndex()
  public boolean isOutdated(Ref<EntityStore> ref, Store<EntityStore> store)
  public BlockTypeView getUpdatedView(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void initialiseEntity(Ref<EntityStore> ref, NPCEntity npcComponent)
  public void cleanup()
  public void onWorldRemoved()
  public void addSearchedBlockSets(Ref<EntityStore> ref, NPCEntity entity, IntList blockSets)
  private void addSearchedBlockSet(int blockSet)
  public void removeSearchedBlockSets(Ref<EntityStore> ref, NPCEntity npcComponent, IntList blockSets)
  private void removeSearchedBlockSet(int blockSet)
  public IBlockPositionData findBlock(int blockSet, double range, double yMax, boolean pickRandom, Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public Set<Ref<EntityStore>> getEntities()
  public BitSet getAllBlockSets()
  public Int2IntMap getBlockSetCounts()
  private static void rebuildBlockTypeAggregate(IntArrayList aggregate, BitSet searchedBlockSets)

Fields:
private final long index
private final Blackboard blackboard
private final BitSet allBlockSets
private final Set<Ref<EntityStore>> entities
private final IntArrayList blockSetAggregate
private final IntArrayList crossViewBlockSetAggregate
private boolean aggregateNeedsRebuild
private final Int2IntMap blockSetCounts
private final List<IBlockPositionData> foundBlocks
private final BlockPositionEntryGenerator generator
private final BiPredicate<IBlockPositionData,ResourceView> reservedBlockFilter
