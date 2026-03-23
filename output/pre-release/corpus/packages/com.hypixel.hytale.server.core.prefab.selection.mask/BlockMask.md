# BlockMask

Type: class | Package: com.hypixel.hytale.server.core.prefab.selection.mask

public class BlockMask

Composite mask of multiple `BlockFilter` instances combined with AND logic. Supports parsing from comma-separated filter strings, inversion, combination of multiple masks, and automatic grouping of filters by type.

Known subclasses: MultiBlockMask

Also in this package: BlockEntry, BlockFilter, BlockPattern, BlocksAndFluids, FilterType, MultiBlockMask, ParsedFilterParts

Complete API:
  public BlockMask withOptions(BlockFilter.FilterType filterType, boolean inverted)
  public BlockFilter[] getFilters()
  public void setInverted(boolean inverted)
  public boolean isInverted()
  public boolean hasInvalidBlocks()
  public boolean isExcluded(ChunkAccessor accessor, int x, int y, int z, Vector3i min, Vector3i max, int blockId)
  public boolean isExcluded(ChunkAccessor accessor, int x, int y, int z, Vector3i min, Vector3i max, int blockId, int fluidId)
  public String toString()
  public String informativeToString()
  protected static String joinElements(String separator, Object[] elements)
  public static BlockMask parse(String masks)
  public static BlockMask parse(String[] masks)
  public static BlockMask combine(BlockMask masks)
  private static BlockMask groupFilters(BlockFilter[] inputFilters)

Fields:
public static final BlockMask EMPTY
public static final Codec<BlockMask> CODEC
public static final String MASK_SEPARATOR
public static final String ALT_MASK_SEPARATOR
public static final String EMPTY_MASK_CHARACTER
private final BlockFilter[] filters
private boolean inverted
