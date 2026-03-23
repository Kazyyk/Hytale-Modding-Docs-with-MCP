# BlockPositionProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.blockpositions | Implements: Component

public class BlockPositionProvider implements Component

## Fields

- private final BitSet searchedBlockSets
- private final Int2ObjectMap<List<IBlockPositionData>> blockData
- private final short lightChangeCounter

## Methods

- public static ComponentType<ChunkStore,BlockPositionProvider> getComponentType()
- public boolean isStale(int currentBlockSet, BlockSection section)
- public void findBlocks(List<IBlockPositionData> resultList, int blockSet, double range, double yRange, Ref<EntityStore> ref, BiPredicate<IBlockPositionData,T> filter, T obj, ComponentAccessor<EntityStore> componentAccessor)
- public BitSet getSearchedBlockSets()
- public void forEachBlockSet(IntObjectConsumer<List<IBlockPositionData>> listConsumer)
- @Nonnull @Override public Component<ChunkStore> clone()

Also in this package: BlockPositionData, IBlockPositionData

Complete API:
  public static ComponentType<ChunkStore,BlockPositionProvider> getComponentType()
  public boolean isStale(int currentBlockSet, BlockSection section)
  public void findBlocks(List<IBlockPositionData> resultList, int blockSet, double range, double yRange, Ref<EntityStore> ref, BiPredicate<IBlockPositionData,T> filter, T obj, ComponentAccessor<EntityStore> componentAccessor)
  public BitSet getSearchedBlockSets()
  public void forEachBlockSet(IntObjectConsumer<List<IBlockPositionData>> listConsumer)
  public Component<ChunkStore> clone()

Fields:
private final BitSet searchedBlockSets
private final Int2ObjectMap<List<IBlockPositionData>> blockData
private final short lightChangeCounter
