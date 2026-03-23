# WorldPathConfig

Type: class | Package: com.hypixel.hytale.server.core.universe.world.path

public class WorldPathConfig

## Fields

- public static final BuilderCodec<WorldPathConfig> CODEC
- protected Map<String,WorldPath> paths

## Methods

- public WorldPath getPath(String name)
- @Nonnull public Map<String,WorldPath> getPaths()
- @Nullable public WorldPath putPath(WorldPath worldPath)
- public WorldPath removePath(String path)
- @Nonnull public CompletableFuture<Void> save(World world)
- @Nonnull public static CompletableFuture<WorldPathConfig> load(World world)
- @Nonnull @Override public String toString()
