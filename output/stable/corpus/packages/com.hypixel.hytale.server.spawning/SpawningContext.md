# SpawningContext

Type: class | Package: com.hypixel.hytale.server.spawning

public class SpawningContext

Central position validation mechanism shared by all spawn modes (world spawning, beacons, and spawn markers). Resolves a spawn position within a chunk column by analyzing spawn spans (contiguous empty blocks), checking ground level, water level, air height, block materials, and model bounding box fit.

## Key Fields

- world | World | Target world
- worldChunk | WorldChunk | Target chunk
- xBlock` / `zBlock | int | Block position within chunk
- groundLevel | int | Y level of the ground block
- groundBlockType | BlockType | Block type at ground level
- waterLevel | int | Y level of water surface (-1 if no water)
- airHeight | int | Y level of first air block above ground/water
- xSpawn` / `ySpawn` / `zSpawn | double | Final computed spawn position

## Key Methods

- setSpawnable(ISpawnableWithModel) | boolean | Resolves the model and bounding box for spawn fit checks
- setSpawnable(ISpawnableWithModel, boolean) | boolean | Resolves model with optional max-scale mode
- setChunk(WorldChunk, int) | void | Sets the target chunk and environment index
- setColumn(int, int, int, int[]) | boolean | Scans a column for valid spawn spans within Y range
- setColumn(int, int, int, int[], SuppressionSpanHelper) | boolean | Scans a column with suppression zone exclusions
- set(World, double, double, double) | boolean | Sets a specific world position and resolves the nearest spawn span
- canSpawn(boolean, boolean) | SpawnTestResult | Master validation checking block and entity overlap
- canSpawn() | SpawnTestResult | Validates both block and entity overlap
- isOnSolidGround() | boolean | Checks for solid block beneath spawn position
- isInWater(float) | boolean | Checks for sufficient water depth
- isInAir(double) | boolean | Checks for air spawn at given height
- canBreathe(boolean, boolean) | boolean | Breathing validation for air/water respiration
- validatePosition(int) | boolean | Collision module position check against invalid materials
- selectRandomSpawnSpan() | boolean | Selects a random valid spawn span from the current set
- newPosition() | Vector3d | Creates a new position vector from computed spawn coordinates
- newRotation() | Vector3f | Creates a new rotation vector with random yaw

## Inner Classes

- `SpawnSpan` -- private data holder for a contiguous span of empty blocks with bottom, top, water level, and ground level.
