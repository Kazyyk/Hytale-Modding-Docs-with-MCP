# BlockFilter

Type: class | Package: com.hypixel.hytale.server.core.prefab.selection.mask

public class BlockFilter

Defines a filter condition for block operations. Supports filter types: `TargetBlock`, `AboveBlock`, `BelowBlock`, `AdjacentBlock`, `NeighborBlock`, cardinal directions, diagonals, and `Selection`. Can be inverted. Resolves block names to IDs lazily and supports fluid matching.

Also in this package: BlockEntry, BlockMask, BlockPattern, BlocksAndFluids, FilterType, MultiBlockMask, ParsedFilterParts

Complete API:
  public void resolve()
  public boolean hasInvalidBlocks()
  public BlockFilter.FilterType getBlockFilterType()
  public String[] getBlocks()
  public boolean isInverted()
  public boolean isExcluded(ChunkAccessor accessor, int x, int y, int z, Vector3i min, Vector3i max, int blockId)
  public boolean isExcluded(ChunkAccessor accessor, int x, int y, int z, Vector3i min, Vector3i max, int blockId, int fluidId)
  private boolean isIncluded(ChunkAccessor accessor, int x, int y, int z, Vector3i min, Vector3i max, int blockId)
  private boolean isIncluded(ChunkAccessor accessor, int x, int y, int z, Vector3i min, Vector3i max, int blockId, int fluidId)
  private boolean matchesAt(ChunkAccessor accessor, int x, int y, int z)
  public String toString()
  public String toString0()
  public String informativeToString()
  public static BlockFilter parse(String str)
  public static BlockFilter.ParsedFilterParts parseComponents(String str)
  public static IntSet parseBlocks(String[] blocksArgs)
  private static BlockFilter.BlocksAndFluids parseBlocksAndFluids(String[] blocksArgs)
  private static int getFluidIdFromItem(Item item)

Fields:
public static final BlockFilter[] EMPTY_ARRAY
public static final Codec<BlockFilter> CODEC
public static final String BLOCK_SEPARATOR
public static final Pattern BLOCK_SEPARATOR_PATTERN
private final BlockFilter.FilterType blockFilterType
private final String[] blocks
private final boolean inverted
private final transient String toString0
private IntSet resolvedBlocks
private IntSet resolvedFluids
private boolean hasInvalidBlocks
