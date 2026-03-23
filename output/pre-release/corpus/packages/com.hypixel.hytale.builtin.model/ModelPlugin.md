# ModelPlugin

Type: class | Package: com.hypixel.hytale.builtin.model | Extends: JavaPlugin

public class ModelPlugin extends JavaPlugin

Server plugin that initializes the Model system and registers related features.

## Accessors

Complete API:
  protected void setup()
  private void checkForModelUpdate(Map<String,ModelAsset> reloadedModelAssets, int index, ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer)
  private void updateModelAssets(LoadedAssetsEvent<String,ModelAsset,DefaultAssetMap<String,ModelAsset>> event)
