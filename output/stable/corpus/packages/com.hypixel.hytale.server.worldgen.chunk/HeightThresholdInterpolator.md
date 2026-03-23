# HeightThresholdInterpolator

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk | Extends: null

public class HeightThresholdInterpolator

## Fields

- public static final int MAX_RADIUS
- public static final int MAX_RADIUS2
- private final ChunkGeneratorExecution execution
- private final CoreDataCacheEntry[] entries
- private final int radius
- private final int size
- private final int totalSize
- ChunkGenerator generator
- int cx
- int cz
- CoreDataCacheEntry entry
- InterpolatedBiomeCountList list
- ZoneBiomeResult center
- int radius
- int radius2
- int distance2
- ZoneBiomeResult biomeResult
- InterpolatedBiomeCountList.BiomeCountResult result

## Constructors

- public HeightThresholdInterpolator(ChunkGeneratorExecution execution)

## Methods

- public CoreDataCacheEntry[] getEntries()
- public HeightThresholdInterpolator populate(int seed)
- public void generateInterpolatedBiomeCountAt(int cx, int cz, @Nonnull InterpolatedBiomeCountList biomeCountList)
- public double getHeightNoise(int cx, int cz)
- public float getHeightThreshold(int seed, int x, int z, int y)
- private float interpolateHeightThreshold(int seed, int x, int z, int y)
- protected CoreDataCacheEntry tableEntry(int cx, int cz)
- protected void setTableEntry(int cx, int cz, CoreDataCacheEntry entry)
- protected ZoneBiomeResult zoneBiomeResult(int cx, int cz)
- public int getLowestNonOne(int cx, int cz)
- public int getHighestNonZero(int cx, int cz)
- protected int indexLocal(int x, int z)

## Related Types

- ChunkGenerator
- ChunkGeneratorExecution
- ZoneBiomeResult
