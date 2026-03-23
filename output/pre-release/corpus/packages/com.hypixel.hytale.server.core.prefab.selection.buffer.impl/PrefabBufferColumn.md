# PrefabBufferColumn

Type: class | Package: com.hypixel.hytale.server.core.prefab.selection.buffer.impl

public class PrefabBufferColumn

Metadata for a single column within a PrefabBuffer. Stores the reader index into the binary buffer, optional entity holders, and optional block component holders.

## Fields

- int readerIndex
- Holder<EntityStore>[] entityHolders
- Int2ObjectMap<Holder<ChunkStore>> blockComponents

## Constructors


public PrefabBufferColumn(int readerIndex, Holder<EntityStore>[] entityHolders, Int2ObjectMap<Holder<ChunkStore>> blockComponents)

## Methods


public int getReaderIndex()

Returns the byte offset into the buffer.


@Nullable
public Holder<EntityStore>[] getEntityHolders()

Returns the entity holders array, or `null` if this column has no entities.


public Int2ObjectMap<Holder<ChunkStore>> getBlockComponents()

Returns the block component holder map.

Also in this package: BlockComparingPredicate, BlockComparingPrefabPredicate, BlockConsumer, BlockMaskConstants, Builder, ChildConsumer, ChildPrefab, ColumnPredicate, EntityConsumer, EntityPredicate, FluidConsumer, FluidPredicate, IPrefabBuffer, PrefabBuffer, PrefabBufferAccessor, PrefabBufferBlockEntry, RawBlockConsumer, RawBlockPredicate

Complete API:
  public int getReaderIndex()
  public Holder<EntityStore>[] getEntityHolders()
  public Int2ObjectMap<Holder<ChunkStore>> getBlockComponents()

Fields:
private final int readerIndex
private final Holder<EntityStore>[] entityHolders
private final Int2ObjectMap<Holder<ChunkStore>> blockComponents
