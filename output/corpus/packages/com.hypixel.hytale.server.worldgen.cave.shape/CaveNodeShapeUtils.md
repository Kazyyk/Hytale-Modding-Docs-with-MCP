# CaveNodeShapeUtils

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape

public class CaveNodeShapeUtils

Utility class providing shared geometric computations for cave node shapes: anchor point calculation (box, line, sphere, pipe projections), end-radius inheritance from parent shapes, filling block selection based on fluid levels, cover height determination, cover validation, and radial surface projection.

## Constants


public static final BiDoubleToDoubleFunction LEFT


public static final BiDoubleToDoubleFunction RIGHT


public static final BiDoubleToDoubleFunction MIN


public static final BiDoubleToDoubleFunction MAX

## Static Methods


public static Vector3d getBoxAnchor(@Nonnull Vector3d vector, @Nonnull IWorldBounds bounds, double tx, double ty, double tz)


public static Vector3d getLineAnchor(@Nonnull Vector3d vector, @Nonnull Vector3d o, @Nonnull Vector3d v, double t)


public static Vector3d getSphereAnchor(@Nonnull Vector3d vector, @Nonnull Vector3d origin, double rx, double ry, double rz, double tx, double ty, double tz)


public static Vector3d getPipeAnchor(@Nonnull Vector3d vector, @Nonnull Vector3d o, @Nonnull Vector3d v, double rx, double ry, double rz, double t, double tv, double th)


public static Vector3d getOffset(@Nullable CaveNode parent, @Nonnull CaveNodeType.CaveNodeChildEntry childEntry)


public static double getEndRadius(@Nullable CaveNode node, @Nonnull IDoubleRange range, Random random)


public static double getEndWidth(@Nullable CaveNode node, @Nonnull IDoubleRange range, Random random)


public static double getEndHeight(@Nullable CaveNode node, @Nonnull IDoubleRange range, Random random)


public static double getEndRadius(@Nonnull CaveNodeShape shape, @Nonnull BiDoubleToDoubleFunction widthHeightSelector)


public static BlockFluidEntry getFillingBlock(@Nonnull CaveType cave, @Nonnull CaveNodeType node, int y, @Nonnull Random random)

Returns the cave fluid block if below the fluid level, otherwise the node's filling block.


public static boolean isCoverMatchingParent(int cx, int cz, int y, @Nonnull ChunkGeneratorExecution execution, @Nonnull CaveNodeType.CaveNodeCoverEntry cover)


public static boolean invalidateCover(int x, int y, int z, CaveNodeType.CaveNodeCoverType type, @Nonnull ChunkGeneratorExecution execution, @Nonnull BlockTypeAssetMap<String, BlockType> blockTypeMap)
