# LegacyModule

Type: class | Package: com.hypixel.hytale.server.core.modules | Extends: JavaPlugin

public class LegacyModule extends JavaPlugin

Core server plugin that registers all fundamental chunk store component types and their ECS systems. Provides singleton access and component type getters for world chunk, block chunk, entity chunk, block component chunk, environment chunk, chunk column, chunk section, block section, fluid section, and block position provider. Also registers migration systems for legacy data formats.

Also in this package: LegacyBlockStateChunk, MigrateLegacyBlockStateChunkSystem, MigrateLegacySections

Complete API:
  public static LegacyModule get()
  protected void setup()
  public ComponentType<ChunkStore,WorldChunk> getWorldChunkComponentType()
  public ComponentType<ChunkStore,BlockChunk> getBlockChunkComponentType()
  public ComponentType<ChunkStore,EntityChunk> getEntityChunkComponentType()
  public ComponentType<ChunkStore,BlockComponentChunk> getBlockComponentChunkComponentType()
  public ComponentType<ChunkStore,EnvironmentChunk> getEnvironmentChunkComponentType()
  public ComponentType<ChunkStore,ChunkColumn> getChunkColumnComponentType()
  public ComponentType<ChunkStore,ChunkSection> getChunkSectionComponentType()
  public ComponentType<ChunkStore,BlockSection> getBlockSectionComponentType()
  public ComponentType<ChunkStore,FluidSection> getFluidSectionComponentType()
  public ComponentType<ChunkStore,BlockPositionProvider> getBlockPositionProviderComponentType()

Fields:
public static final PluginManifest MANIFEST
private static LegacyModule instance
private ComponentType<ChunkStore,WorldChunk> worldChunkComponentType
private ComponentType<ChunkStore,BlockChunk> blockChunkComponentType
private ComponentType<ChunkStore,EntityChunk> entityChunkComponentType
private ComponentType<ChunkStore,BlockComponentChunk> blockComponentChunkComponentType
private ComponentType<ChunkStore,EnvironmentChunk> environmentChunkComponentType
private ComponentType<ChunkStore,ChunkColumn> chunkColumnComponentType
private ComponentType<ChunkStore,ChunkSection> chunkSectionComponentType
private ComponentType<ChunkStore,BlockSection> blockSectionComponentType
private ComponentType<ChunkStore,FluidSection> fluidSectionComponentType
private ComponentType<ChunkStore,BlockPositionProvider> blockPositionProviderComponentType
