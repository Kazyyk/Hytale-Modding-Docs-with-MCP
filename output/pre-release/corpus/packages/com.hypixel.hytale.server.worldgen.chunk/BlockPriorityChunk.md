# BlockPriorityChunk

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk | Extends: null

public class BlockPriorityChunk

## Fields

- public static final byte NO_CHANGE
- public static final byte NONE
- public static final byte FILLING
- public static final byte LAYER
- public static final byte COVER
- public static final byte WATER
- public static final byte CAVE_COVER
- public static final byte CAVE
- public static final byte CAVE_PREFAB
- public static final byte PREFAB_CAVE
- public static final byte PREFAB
- public static final byte EXCLUSIVE_MAX_PRIORITY
- public static final byte MASK
- public static final byte FLAG_MASK
- public static final byte FLAG_SUBMERGE
- private final byte[] blocks

## Methods

- public BlockPriorityChunk reset()
- public byte get(int x, int y, int z)
- public byte getRaw(int x, int y, int z)
- public void set(int x, int y, int z, byte type)
- private static int index(int x, int y, int z)
