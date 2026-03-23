# BlockPattern

Type: class | Package: com.hypixel.hytale.server.core.prefab.selection.mask

public class BlockPattern

Weighted random block pattern for builder tools and prefab operations. Parses pattern strings with optional percentage weights (e.g., `50%Stone,50%Dirt`). Resolves block names to IDs lazily and supports `BlockTypeListAsset` expansion.

Also in this package: BlockEntry, BlockFilter, BlockMask, BlocksAndFluids, FilterType, MultiBlockMask, ParsedFilterParts

Complete API:
  public Integer[] getResolvedKeys()
  public void resolve()
  public boolean isEmpty()
  public boolean hasInvalidBlocks()
  public int nextBlock(Random random)
  public BlockPattern.BlockEntry nextBlockTypeKey(Random random)
  public int firstBlock()
  public String toString()
  private String toString0()
  public static BlockPattern parse(String str)
  private static IWeightedMap<String> parseBlockPattern(String blocksArgs)
  public static int parseBlock(String blockText)
  public static BlockPattern.BlockEntry tryParseBlockTypeKey(String blockText)

Fields:
private static final HytaleLogger LOGGER
public static final Codec<BlockPattern> CODEC
public static final BlockPattern EMPTY
public static final BlockPattern[] EMPTY_ARRAY
private static final Pattern FILLER_TEMP_REMOVER_PATTERN
private static final String BLOCK_SEPARATOR
private static final String ALT_BLOCK_SEPARATOR
private static final String CHANCE_SUFFIX
private static final double DEFAULT_CHANCE
private final IWeightedMap<String> weightedMap
private final transient String toString0
private IWeightedMap<Integer> resolvedWeightedMap
private IWeightedMap<BlockPattern.BlockEntry> resolvedWeightedMapBtk
private boolean hasInvalidBlocks
