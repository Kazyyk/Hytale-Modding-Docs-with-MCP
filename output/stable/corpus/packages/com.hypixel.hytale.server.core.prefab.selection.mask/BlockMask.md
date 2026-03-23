# BlockMask

Type: class | Package: com.hypixel.hytale.server.core.prefab.selection.mask | Extends: java.lang.Object

public class BlockMask

A compound block mask that combines one or more BlockFilter instances. A block is excluded by the mask if any individual filter excludes it (logical AND of all filters). The entire mask can be inverted to flip the result.

Masks are parsed from comma-separated (or semicolon-separated) strings where each element is a filter string. The special value `"-"` represents an empty mask.

## Fields


public static final BlockMask EMPTY = new BlockMask(BlockFilter.EMPTY_ARRAY);

Singleton empty mask that never excludes any block.


public static final Codec<BlockMask> CODEC = new FunctionCodec<>(Codec.STRING, BlockMask::parse, BlockMask::toString);

Codec for serializing/deserializing a BlockMask to/from a string.


public static final String MASK_SEPARATOR = ",";


public static final String ALT_MASK_SEPARATOR = ";";


public static final String EMPTY_MASK_CHARACTER = "-";

## Constructors


public BlockMask(BlockFilter[] filters)

Creates a mask from the given array of filters.

## Methods


@Nonnull
public BlockMask withOptions(@Nonnull BlockFilter.FilterType filterType, boolean inverted)

Returns a new mask with all filters overridden to the given filter type and inversion state. Returns `this` if already matching.


public BlockFilter[] getFilters()

Returns the array of filters in this mask.


public void setInverted(boolean inverted)

Sets the global inversion flag for this mask.


public boolean isInverted()

Returns the global inversion flag.


public boolean isExcluded(@Nonnull ChunkAccessor accessor, int x, int y, int z, Vector3i min, Vector3i max, int blockId)

Tests exclusion with `fluidId = -1`.


public boolean isExcluded(@Nonnull ChunkAccessor accessor, int x, int y, int z, Vector3i min, Vector3i max, int blockId, int fluidId)

Returns `true` if the block at the given position is excluded by this mask, considering all contained filters and the global inversion flag.


@Nonnull
@Override
public String toString()

Serializes the mask to its string representation.


@Nonnull
public String informativeToString()

Returns a human-readable version with `AND` between filters.


public static BlockMask parse(@Nonnull String masks)

Parses a mask from a comma/semicolon-separated string. Returns `EMPTY` for empty or `"-"` input.


public static BlockMask parse(@Nonnull String[] masks)

Parses a mask from an array of filter strings, grouping filters with the same type and inversion.


public static BlockMask combine(@Nullable BlockMask... masks)

Combines multiple masks into one by merging all filters, grouping compatible filters together.

## Related Types

- BlockFilter -- individual filter condition within a mask
- MultiBlockMask -- extends BlockMask to combine multiple mask instances
- BlockPattern -- weighted block selection pattern

Known subclasses: MultiBlockMask

Also in this package: BlockEntry, BlockFilter, BlockPattern, BlocksAndFluids, FilterType, MultiBlockMask, ParsedFilterParts

Complete API:
  public BlockMask withOptions(BlockFilter.FilterType filterType, boolean inverted)
  public BlockFilter[] getFilters()
  public void setInverted(boolean inverted)
  public boolean isInverted()
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
