# BlockPlacementHelper

Type: class | Package: com.hypixel.hytale.server.npc.util

public class BlockPlacementHelper

Static utility class for NPC block placement logic. Validates whether blocks can be placed at specified world positions by checking material compatibility and supporting block requirements.

## Key Methods

- public static boolean canPlaceUnitBlock(World world, BlockType placedBlockType, boolean allowEmptyMaterials, int x, int y, int z)
- public static boolean canPlaceBlock( World world, BlockType placedBlockType, int rotationIndex, boolean allowEmptyMaterials, int x, int y, int z )
- public static boolean testBlock(BlockType placedBlockType, BlockType blockType, boolean allowEmptyMaterials)
- public static boolean testSupportingBlock(BlockType blockType, int rotation, int filler)
