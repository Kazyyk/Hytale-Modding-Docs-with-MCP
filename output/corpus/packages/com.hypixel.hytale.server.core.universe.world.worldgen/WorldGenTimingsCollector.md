# WorldGenTimingsCollector

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldgen

public class WorldGenTimingsCollector

Collects and reports timing metrics for world generation phases: zone/biome resolution, preparation, block generation, cave generation, and prefab generation. Uses atomic counters for thread safety. Skips warmup period (first 100 chunks).
