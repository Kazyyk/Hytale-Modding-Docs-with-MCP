# WorldBounds

Type: class | Package: com.hypixel.hytale.server.worldgen.util.bounds | Extends: ChunkBounds | Implements: IWorldBounds

public class WorldBounds extends ChunkBounds implements IWorldBounds

## Fields

- protected int minY
- protected int maxY

## Methods

- @Override public int getLowBoundY()
- @Override public int getHighBoundY()
- public void expandNegative(double x, double y, double z)
- public void expandPositive(double x, double y, double z)
- @Override public void include(IChunkBounds bounds)
