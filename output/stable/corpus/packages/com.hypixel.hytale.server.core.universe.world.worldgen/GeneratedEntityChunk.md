# GeneratedEntityChunk

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldgen

public class GeneratedEntityChunk

Collects entity holders generated during world generation and converts them to an `EntityChunk`. Handles entity rotation and position adjustment based on prefab rotation and offset.

Also in this package: EntityWrapperEntry, GeneratedBlockChunk, GeneratedBlockStateChunk, GeneratedChunk, GeneratedChunkSection, IBenchmarkableWorldGen, IWorldGen, IWorldGenBenchmark, ValidatableWorldGen, WorldGenLoadException, WorldGenTimingsCollector

Complete API:
  public List<GeneratedEntityChunk.EntityWrapperEntry> getEntities()
  public void forEachEntity(Consumer<GeneratedEntityChunk.EntityWrapperEntry> consumer)
  public void addEntities(Vector3i offset, PrefabRotation rotation, Holder<EntityStore>[] entityHolders, int objectId)
  public EntityChunk toEntityChunk()

Fields:
private final List<GeneratedEntityChunk.EntityWrapperEntry> entities
