# FillerBlockUtil

Type: class | Package: com.hypixel.hytale.server.core.util

public class FillerBlockUtil

Utility class for managing filler blocks -- the auxiliary blocks that occupy the bounding box of multi-block structures (blocks whose hitbox extends beyond a single unit cube). Handles creation, removal, validation, and iteration of filler blocks relative to a base block position.

Filler coordinates are packed into a single `int` using 5 bits per axis (x, z, y) with sign extension, supporting offsets in the range -16 to +15.

## Static Fields

- THRESHOLD | float | Default overlap threshold: `0.0`.
- NO_FILLER | int | Packed value representing no filler offset: `0`.

## Key Static Methods

- forEachFillerBlock(BlockBoundingBoxes.RotatedVariantBoxes, TriIntConsumer) | void | Iterates over all block positions within a bounding box.
- forEachFillerBlock(float, int, int, int, BlockBoundingBoxes.RotatedVariantBoxes, TriIntConsumer) | void | Iterates with configurable threshold and per-axis expansion.
- testFillerBlocks(BlockBoundingBoxes.RotatedVariantBoxes, TriIntPredicate) | boolean | Tests a predicate against all filler positions; returns false on first failure.
- validateBlock(int, int, int, int, int, int, A, B, FillerFetcher) | ValidationResult | Validates filler block integrity: checks base block existence, type match, and bounding box containment.
- removeFillerBlocksAt(ComponentAccessor, BlockSection, int, int, int, int, int, int, ChangeReason) | void | Removes all filler blocks associated with a base block, handling cross-section boundaries asynchronously.
- setFillerBlocksAt(ComponentAccessor, Ref, BlockSection, int, int, int, int, int, int, ChangeReason) | void | Places filler blocks for a base block, removing old fillers if overwriting.
- pack(int, int, int) | int | Packs x, y, z offsets into a single int.
- unpackX(int) | int | Extracts sign-extended x offset from packed value.
- unpackY(int) | int | Extracts sign-extended y offset from packed value.
- unpackZ(int) | int | Extracts sign-extended z offset from packed value.

## Inner Types

- ChangeReason | Enum: reason for filler change (NONE, NORMAL, BY_PHYSICS).
- FillerFetcher | Functional interface for reading block, filler, and rotation data.
- ValidationResult | Enum: OK, INVALID_BLOCK, INVALID_FILLER.

Also in this package: AssetUtil, BsonUtil, ChangeReason, Config, ConsoleColorUtil, DumpUtil, EventTitleUtil, FillerFetcher, HashUtil, MessageUtil, NotificationUtil, PlayerTextData, PositionUtil, PrefabUtil, ProcessUtil, ServiceHttpClientFactory, TargetBuffer, TargetBufferLocation, TargetUtil, TempAssetIdUtil (and 4 more)

Complete API:
  public static void forEachFillerBlock(BlockBoundingBoxes.RotatedVariantBoxes blockBoundingBoxes, TriIntConsumer consumer)
  public static void forEachFillerBlock(float threshold, BlockBoundingBoxes.RotatedVariantBoxes blockBoundingBoxes, TriIntConsumer consumer)
  public static void forEachFillerBlock(float threshold, int expand, BlockBoundingBoxes.RotatedVariantBoxes blockBoundingBoxes, TriIntConsumer consumer)
  public static void forEachFillerBlock(float threshold, int expandX, int expandY, int expandZ, BlockBoundingBoxes.RotatedVariantBoxes blockBoundingBoxes, TriIntConsumer consumer)
  public static boolean testFillerBlocks(BlockBoundingBoxes.RotatedVariantBoxes blockBoundingBoxes, TriIntPredicate predicate)
  public static boolean testFillerBlocks(float threshold, BlockBoundingBoxes.RotatedVariantBoxes blockBoundingBoxes, TriIntPredicate predicate)
  public static FillerBlockUtil.ValidationResult validateBlock(int x, int y, int z, int blockId, int rotation, int filler, A a, B b, FillerBlockUtil.FillerFetcher<A,B> fetcher)
  public static int pack(int x, int y, int z)
  public static int unpackX(int val)
  public static int unpackY(int val)
  public static int unpackZ(int val)
  private static void removeBlockEntity(ComponentAccessor<ChunkStore> accessor, BlockComponentChunk blockComponentChunk, int x, int y, int z)
  private static void removeFiller(ComponentAccessor<ChunkStore> accessor, BlockSection blockSection, int x, int y, int z, FillerBlockUtil.ChangeReason changeReason)
  public static void removeFillerBlocksAt(ComponentAccessor<ChunkStore> accessor, BlockSection blockSection, int x, int y, int z, int blockId, int filler, int rotation, FillerBlockUtil.ChangeReason changeReason)
  private static void setFiller(ComponentAccessor<ChunkStore> accessor, Ref<ChunkStore> ref, BlockSection blockSection, int x, int y, int z, int blockId, BlockType blockType, int filler, int rotation, FillerBlockUtil.ChangeReason changeReason)
  public static void setFillerBlocksAt(ComponentAccessor<ChunkStore> accessor, Ref<ChunkStore> ref, BlockSection blockSection, int x, int y, int z, int blockId, int filler, int rotation, FillerBlockUtil.ChangeReason changeReason)

Fields:
public static final float THRESHOLD
public static final int NO_FILLER
private static final int BITS_PER_AXIS
private static final int MASK
private static final int INVERT
