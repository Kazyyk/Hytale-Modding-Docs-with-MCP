# IChunkBounds

Type: interface | Package: com.hypixel.hytale.server.worldgen.util.bounds

public interface IChunkBounds

## Methods

- int getLowBoundX()
- int getLowBoundZ()
- int getHighBoundX()
- int getHighBoundZ()
- default int getLowBoundX(PrefabRotation rotation)
- default int getLowBoundZ(PrefabRotation rotation)
- default int getHighBoundX(PrefabRotation rotation)
- default int getHighBoundZ(PrefabRotation rotation)
- default boolean intersectsChunk(long chunkIndex)
- default boolean intersectsChunk(int chunkX, int chunkZ)
- default int randomX(Random random)
- default int randomZ(Random random)
- default double fractionX(double d)
- default double fractionZ(double d)
- default int getLowChunkX()
- default int getLowChunkZ()
- default int getHighChunkX()
- default int getHighChunkZ()
