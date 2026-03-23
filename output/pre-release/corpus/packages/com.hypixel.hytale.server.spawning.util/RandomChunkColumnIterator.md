# RandomChunkColumnIterator

Type: class | Package: com.hypixel.hytale.server.spawning.util

public class RandomChunkColumnIterator

Iterator that visits chunk columns in pseudo-random order. Uses a seeded `Random` and `ChunkColumnMask` to track which columns remain. Supports border avoidance and save/restore of iterator position.

## Constructors

- RandomChunkColumnIterator()
- RandomChunkColumnIterator(@Nonnull ChunkColumnMask initialPositions)
- RandomChunkColumnIterator(ChunkColumnMask initialPositions, @Nonnull WorldChunk chunk)

## Methods

- public int getCurrentIndex()
- public int getCurrentX()
- public int getCurrentZ()
- @Nullable public ChunkColumnMask getInitialPositions()
- public int nextPosition()
- public int nextPositionAvoidBorders()
- public void saveIteratorPosition()
- public boolean isAtSavedIteratorPosition()
- public int positionsLeft()
- public void markPositionVisited(int index)
- public void markPositionVisited()

Also in this package: ChunkColumnMask, Debug, FloodFillEntryPoolProviderSimple, FloodFillEntryPoolSimple, FloodFillPositionSelector, LightRangePredicate, SortBufferProvider, WeightedPosition

Complete API:
  public int getCurrentIndex()
  public int getCurrentX()
  public int getCurrentZ()
  public ChunkColumnMask getInitialPositions()
  public int nextPosition()
  public int nextPositionAvoidBorders()
  public void saveIteratorPosition()
  public boolean isAtSavedIteratorPosition()
  public int positionsLeft()
  public void markPositionVisited(int index)
  public void markPositionVisited()
  private void reset()
  private int nextPosition(int index)

Fields:
private final ChunkColumnMask availablePositions
private final ChunkColumnMask initialPositions
private final Random random
private final long seed
private int currentIndex
private int lastSavedIteratorPosition
