# NPropStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages | Implements: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NStage

public class NPropStage implements NStage

Places props (vegetation, structures, objects) into the material and entity buffers. Iterates biomes in the input area, evaluates position providers to generate candidate positions, checks biome ownership and edge distance, then scans and places each prop.

## Methods

- public void run(@Nonnull NStage.Context context)
- @Nonnull public Map<NBufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull public List<NBufferType> getOutputTypes()
- @Nonnull public String getName()
