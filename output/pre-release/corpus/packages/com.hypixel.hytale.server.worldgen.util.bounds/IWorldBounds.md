# IWorldBounds

Type: interface | Package: com.hypixel.hytale.server.worldgen.util.bounds | Implements: com.hypixel.hytale.server.worldgen.util.bounds.IChunkBounds

public interface IWorldBounds extends IChunkBounds

Interface extending `IChunkBounds` with vertical bounds. Adds `getLowBoundY()` and `getHighBoundY()` methods. Provides default methods for random Y coordinate generation, fractional Y interpolation, chunk intersection, and validity checking.

Known implementors: CylinderCaveNodeShape, DistortedShape, EllipsoidCaveNodeShape, EmptyLineCaveNodeShape, PipeCaveNodeShape, PrefabCaveNodeShape, TetrahedronCaveNodeShape, WorldBounds

Also in this package: ChunkBounds, WorldBounds

Complete API:
  int getLowBoundY()
  int getHighBoundY()
  default boolean intersectsChunk(long chunkIndex)
  default int randomY(Random random)
  default double fractionY(double d)
  default boolean isValid()
