# IWorldBounds

Type: interface | Package: com.hypixel.hytale.server.worldgen.util.bounds | Implements: IChunkBounds

public interface IWorldBounds extends IChunkBounds

## Methods

- int getLowBoundY()
- int getHighBoundY()
- @Override default boolean intersectsChunk(long chunkIndex)
- default int randomY(Random random)
- default double fractionY(double d)
