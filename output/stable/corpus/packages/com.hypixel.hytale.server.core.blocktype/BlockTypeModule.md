# BlockTypeModule

Type: class | Package: com.hypixel.hytale.server.core.blocktype | Extends: JavaPlugin

public class BlockTypeModule extends JavaPlugin

Core plugin that manages block type processing within chunks. Handles filler block validation and placement for multi-block structures (blocks whose hitbox spans multiple grid cells), block state initialization on newly generated chunks, and legacy section migration.

On setup, this plugin:
- Registers bench codecs for `Crafting`, `Processing`, `DiagramCrafting`, and `StructuralCrafting` bench types
- Registers the BlockPhysics component on the `ChunkStore` registry
- Registers the `MigrateLegacySections` system for legacy chunk data migration

## Fields

- public static final PluginManifest MANIFEST
- public static final int SET_BLOCK_SETTINGS
- public static final String DEBUG_CUBE_TEXTURE_UP
- public static final String DEBUG_CUBE_TEXTURE_DOWN
- public static final String DEBUG_CUBE_TEXTURE_NORTH
- public static final String DEBUG_CUBE_TEXTURE_SOUTH
- public static final String DEBUG_CUBE_TEXTURE_EAST
- public static final String DEBUG_CUBE_TEXTURE_WEST
- public static final String DEBUG_MODEL_MODEL
- public static final String DEBUG_MODEL_BLOCK_TEXTURE
- public static final String DEBUG_MODEL_ENTITY_TEXTURE
- private static BlockTypeModule instance
- private ComponentType<ChunkStore, BlockPhysics> blockPhysicsComponentType

## Methods

- public static BlockTypeModule get()
- public BlockTypeModule(@Nonnull JavaPluginInit init)
- protected void setup()
- public ComponentType<ChunkStore, BlockPhysics> getBlockPhysicsComponentType()
- public static void breakOrSetFillerBlocks(@Nonnull BlockTypeAssetMap<String, BlockType> blockTypeAssetMap, @Nonnull IndexedLookupTableAssetMap<String, BlockBoundingBoxes> hitboxAssetMap, @Nonnull ChunkAccessor<?> accessor, @Nonnull BlockAccessor chunk, int finalX, int finalY, int finalZ, @Nonnull BlockType blockType, int rotation)

## Inner Classes

- FixFillerBlocksSystem: Deprecated system that fixed filler blocks for newly generated chunks by checking neighboring chunks.
- MigrateLegacySections: Deprecated migration system that moves legacy `BlockPhysics` data from `BlockSection` to section holders.

## Related Types

- BlockPhysics -- registered component for block physics/support data
- `ItemModule` -- dependency
- `LegacyModule` -- dependency

Also in this package: FixFillerBlocksSystem, MigrateLegacySections

Complete API:
  public static BlockTypeModule get()
  protected void setup()
  public ComponentType<ChunkStore,BlockPhysics> getBlockPhysicsComponentType()
  private static void onChunkPreLoadProcessEnsureBlockState(ChunkPreLoadProcessEvent event)
  private static void onChunkPreLoadProcess(ChunkPreLoadProcessEvent event)
  private static void onChunksectionPreLoadProcess(WorldChunk chunk, BlockSection section, int sectionIndex, BlockType[] blocks)
  private static BlockType getBlockType(BlockTypeAssetMap<String,BlockType> blockTypeAssetMap, BlockType[] blocks, BlockSection section, int blockX, int blockY, int blockZ, boolean skipEmpty)
  public static void breakOrSetFillerBlocks(BlockTypeAssetMap<String,BlockType> blockTypeAssetMap, IndexedLookupTableAssetMap<String,BlockBoundingBoxes> hitboxAssetMap, ChunkAccessor<?> accessor, BlockAccessor chunk, int finalX, int finalY, int finalZ, BlockType blockType, int rotation)
  private static BlockType getOriginBlockType(BlockTypeAssetMap<String,BlockType> blockTypeAssetMap, ChunkAccessor<?> accessor, BlockAccessor section, int originX, int originY, int originZ)
  private static void setFillerBlocks(BlockTypeAssetMap<String,BlockType> blockTypeAssetMap, IndexedLookupTableAssetMap<String,BlockBoundingBoxes> hitboxAssetMap, ChunkAccessor<?> accessor, BlockAccessor chunk, int finalX, int finalY, int finalZ, BlockType originBlockType, int rotation)
  private static boolean isFillerValid(BlockTypeAssetMap<String,BlockType> blockTypeAssetMap, ChunkAccessor<?> accessor, BlockAccessor chunk, BlockType blockType, int filler, int x, int y, int z)

Fields:
public static final PluginManifest MANIFEST
public static final int SET_BLOCK_SETTINGS
public static final String DEBUG_CUBE_TEXTURE_UP
public static final String DEBUG_CUBE_TEXTURE_DOWN
public static final String DEBUG_CUBE_TEXTURE_NORTH
public static final String DEBUG_CUBE_TEXTURE_SOUTH
public static final String DEBUG_CUBE_TEXTURE_EAST
public static final String DEBUG_CUBE_TEXTURE_WEST
public static final String DEBUG_MODEL_MODEL
public static final String DEBUG_MODEL_BLOCK_TEXTURE
public static final String DEBUG_MODEL_ENTITY_TEXTURE
private static final ThreadLocal<BlockType[]> TEMP_BLOCKS
private static BlockTypeModule instance
private ComponentType<ChunkStore,BlockPhysics> blockPhysicsComponentType
