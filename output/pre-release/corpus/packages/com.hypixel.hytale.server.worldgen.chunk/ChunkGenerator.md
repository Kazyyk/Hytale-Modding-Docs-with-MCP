# ChunkGenerator

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk | Implements: com.hypixel.hytale.server.core.universe.world.worldgen.IBenchmarkableWorldGen, com.hypixel.hytale.server.core.universe.world.worldgen.ValidatableWorldGen, com.hypixel.hytale.metrics.MetricProvider, com.hypixel.hytale.server.core.universe.world.worldmap.provider.IWorldMapProvider

public class ChunkGenerator implements IBenchmarkableWorldGen, ValidatableWorldGen, MetricProvider, IWorldMapProvider

Main chunk generation orchestrator. Manages a thread pool, caches for zone/biome results, interpolated biome counts, heights, caves, and unique prefabs. Generates chunks asynchronously by creating `ChunkGeneratorExecution` instances. Computes spawn points from unique prefabs.
