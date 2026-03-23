# FullBrightLightCalculation

Type: class | Package: com.hypixel.hytale.server.core.universe.world.lighting | Extends: null | Implements: LightCalculation

public class FullBrightLightCalculation implements LightCalculation

## Fields

- private final ChunkLightingManager chunkLightingManager
- private LightCalculation delegate
- CalculationResult result
- WorldChunk worldChunk
- boolean handled
- BlockSection section
- ChunkLightDataBuilder light

## Constructors

- public FullBrightLightCalculation(ChunkLightingManager chunkLightingManager, LightCalculation delegate)

## Methods

- public void init(@Nonnull WorldChunk worldChunk)
- public CalculationResult calculateLight(@Nonnull Vector3i chunkPosition)
- public boolean invalidateLightAtBlock(@Nonnull WorldChunk worldChunk, int blockX, int blockY, int blockZ, @Nonnull BlockType blockType, int oldHeight, int newHeight)
- public boolean invalidateLightInChunkSections(@Nonnull WorldChunk worldChunk, int sectionIndexFrom, int sectionIndexTo)
- public void setFullBright(@Nonnull WorldChunk worldChunk, int chunkY)

## Related Types

- CalculationResult
- ChunkLightingManager
- LightCalculation

Also in this package: CalculationResult, ChunkLightingManager, FloodLightCalculation, LightCalculation

Complete API:
  public void init(WorldChunk worldChunk)
  public CalculationResult calculateLight(Vector3i chunkPosition)
  public boolean invalidateLightAtBlock(WorldChunk worldChunk, int blockX, int blockY, int blockZ, BlockType blockType, int oldHeight, int newHeight)
  public boolean invalidateLightInChunkSections(WorldChunk worldChunk, int sectionIndexFrom, int sectionIndexTo)
  public void setFullBright(WorldChunk worldChunk, int chunkY)

Fields:
private final ChunkLightingManager chunkLightingManager
private LightCalculation delegate
