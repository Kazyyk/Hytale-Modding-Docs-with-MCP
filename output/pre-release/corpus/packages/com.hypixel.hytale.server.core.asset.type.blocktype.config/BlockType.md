# BlockType

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: JsonAssetWithMap, NetworkSerializable

public class BlockType implements JsonAssetWithMap<String, BlockTypeAssetMap<String, BlockType>>, NetworkSerializable<com.hypixel.hytale.protocol.BlockType>

The primary asset definition for a block in the game. Defines all visual, physical, and gameplay properties of a block type including textures, draw type, material, opacity, collision shapes, sound sets, particle effects, tick procedures, interaction types, farming data, bench configuration, connected block rules, and state data. Cannot be defined standalone -- must be defined within an `Item` asset.

## Key Methods


@Nullable
public static BlockType fromString(@Nonnull String input)

Looks up a block type by its string asset key.


public static AssetStore<String, BlockType, BlockTypeAssetMap<String, BlockType>> getAssetStore()

Returns the global asset store for block types.


public static BlockTypeAssetMap<String, BlockType> getAssetMap()

Returns the asset map for block types.


public String getId()

Returns the asset key of this block type.


@Nullable
public Item getItem()

Returns the parent `Item` that defines this block type.


public boolean isState()

Returns whether this block type is a state variant of another block type.


@Nullable
public BlockType getBlockForState(@Nonnull String state)

Returns the block type associated with the given state name.


public DrawType getDrawType()

Returns the draw type (rendering mode) for this block.


public BlockMaterial getMaterial()

Returns the physical material of this block.


public Opacity getOpacity()

Returns the opacity setting of this block.

## Related Types

- StateData -- block state variant mapping
- Rotation -- block rotation
- ConditionalBlockSound -- conditional sounds for this block
- BlockFlipType -- flip type for editor mirroring
- `Item` -- parent item asset
