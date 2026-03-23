# ChunkBounds

Type: class | Package: com.hypixel.hytale.server.worldgen.util.bounds | Implements: IChunkBounds

public class ChunkBounds implements IChunkBounds

## Fields

- protected int minX
- protected int minZ
- protected int maxX
- protected int maxZ

## Methods

- @Override public int getLowBoundX()
- @Override public int getLowBoundZ()
- @Override public int getHighBoundX()
- @Override public int getHighBoundZ()
- public void expandNegative(int x, int z)
- public void expandPositive(int x, int z)
- public void expandNegative(double x, double z)
- public void expandPositive(double x, double z)
- public void include(int minX, int minZ, int maxX, int maxZ)
- public void include(int x, int z)
- public void include(IChunkBounds box)
- @Nonnull @Override public String toString()

Known subclasses: WorldBounds

Also in this package: IWorldBounds, WorldBounds

Complete API:
  public int getLowBoundX()
  public int getLowBoundZ()
  public int getHighBoundX()
  public int getHighBoundZ()
  public void expandNegative(int x, int z)
  public void expandPositive(int x, int z)
  public void expandNegative(double x, double z)
  public void expandPositive(double x, double z)
  public void include(int minX, int minZ, int maxX, int maxZ)
  public void include(int x, int z)
  public void include(IChunkBounds box)
  public String toString()

Fields:
protected int minX
protected int minZ
protected int maxX
protected int maxZ
