# PortalSpawnFinder

Type: final class | Package: com.hypixel.hytale.builtin.portals.ui | Extends: java.lang.Object

Utility class for finding valid spawn positions within portal fragment worlds. Uses a hinted-spawn system with fallback to ground scanning. Checks for solid ground below air blocks and validates portal fit using `FitsAPortal`. Maximum 10 attempts per world with 8 checks per chunk.

## Hierarchy

- **Extends:** `java.lang.Object`

## Methods

- computeSpawnTransform(World, List<Vector3d>) | Transform | Computes a spawn transform from hinted spawns or fallback. Returns null if both methods fail.
- guesstimateFromHints(World, List<Vector3d>) | Vector3d | Tries hinted spawn positions, checking chunk availability and ground quality.
- findGroundWithinChunk(WorldChunk, int, boolean) | Vector3d | Scans random positions within a chunk for valid ground.
- findWithGroundBelow(WorldChunk, int, int, int, int, boolean) | Vector3d | Scans downward from a position looking for air above solid ground.
- findFallbackPositionOnGround(World) | Vector3d | Falls back to scanning near world origin (0,0).

## Inner Types

### Material

*enum*

Block material classification: `SOLID`, `FLUID`, `AIR`, `UNKNOWN`.

Also in this package: CanSpawnPortal, Data, Data, Error, Error, InstanceKeyNotFound, Material, PortalDeviceActivePage, PortalDevicePageSupplier, PortalDeviceSummonPage, PortalIsOpen, PortalTypeNotFound, State, State

Complete API:
  public static Transform computeSpawnTransform(World world, List<Vector3d> hintedSpawns)
  private static Vector3d guesstimateFromHints(World world, List<Vector3d> hintedSpawns)
  private static Vector3d findGroundWithinChunk(WorldChunk chunk, int scanHeight, boolean checkIfPortalFitsNice)
  private static Vector3d findWithGroundBelow(WorldChunk chunk, int x, int y, int z, int scanHeight, boolean fluidsAreAcceptable)
  private static PortalSpawnFinder.Material getMaterial(ComponentAccessor<ChunkStore> chunkStore, ChunkColumn chunkColumnComponent, BlockChunk blockChunkComponent, double x, double y, double z)
  private static Vector3d findFallbackPositionOnGround(World world)

Fields:
private static final int MAX_ATTEMPTS_PER_WORLD
private static final int QUALITY_ATTEMPTS
private static final int CHECKS_PER_CHUNK
private static final Vector3d FALLBACK_POSITION
