# LightCalculation

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.lighting | Extends: null

public interface LightCalculation

## Methods

- void init(@Nonnull WorldChunk var1)
- CalculationResult calculateLight(@Nonnull Vector3i var1)
- boolean invalidateLightAtBlock(@Nonnull WorldChunk var1, int var2, int var3, int var4, @Nonnull BlockType var5, int var6, int var7)
- boolean invalidateLightInChunkSections(@Nonnull WorldChunk var1, int var2, int var3)

## Related Types

- CalculationResult

Known implementors: FloodLightCalculation, FullBrightLightCalculation

Also in this package: CalculationResult, ChunkLightingManager, FloodLightCalculation, FullBrightLightCalculation

Complete API:
  void init(WorldChunk var1)
  CalculationResult calculateLight(Vector3i var1)
  boolean invalidateLightAtBlock(WorldChunk var1, int var2, int var3, int var4, BlockType var5, int var6, int var7)
  boolean invalidateLightInChunkSections(WorldChunk var1, int var2, int var3)
