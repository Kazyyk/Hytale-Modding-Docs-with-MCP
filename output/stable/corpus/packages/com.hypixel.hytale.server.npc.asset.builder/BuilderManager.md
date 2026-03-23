# BuilderManager

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class BuilderManager

The central manager for loading, caching, validating, and hot-reloading NPC role JSON assets from asset packs. Maintains a concurrent cache of BuilderInfo entries indexed by integer IDs, a map of BuilderFactory instances by category class, and a case-insensitive name-to-index map.

The manager walks the `Server/NPC/Roles/` directory tree, parses each JSON file, selects the appropriate factory based on the `"Class"` key (defaulting to `"Role"`), creates and reads the builder, validates it, and caches it. It supports file-system monitoring for hot-reload during development.

## Constants

- CONTENT_KEY | String | "Content"

## Key Fields

- builderCache | Int2ObjectConcurrentHashMap<BuilderInfo> | Thread-safe builder cache indexed by integer ID.
- factoryMap | Map<Class<?>, BuilderFactory<?>> | Builder factories keyed by category class.
- categoryNames | Map<String, Class<?>> | Category name to class mapping.
- nameToIndexMap | Object2IntMap<String> | Case-insensitive name to index mapping.
- SCHEMA_BUILDER_MANAGER | BuilderManager | Static instance used for schema generation.

## Methods

### registerFactory


public <T> void registerFactory(@Nonnull BuilderFactory<T> factory)

Registers a builder factory for a category. Called by `NPCPlugin` during setup.

### addCategory


public void addCategory(String name, Class<?> clazz)

Maps a string name (e.g., `"Role"`, `"Action"`) to a category class.

### getIndex / getOrCreateIndex / lookupName


public int getIndex(@Nullable String name)
public int getOrCreateIndex(String name)
@Nullable
public String lookupName(int index)

Name-to-index mapping with read/write locking for thread safety.

### loadBuilders


public boolean loadBuilders(@Nonnull AssetPack pack, boolean includeTests)

Walks the NPC role asset directory, loads all JSON files, validates builders, resolves dependencies, and fires `AllNPCsLoadedEvent` on completion.

### unloadBuilders


public void unloadBuilders(AssetPack pack)

Removes all builders loaded from the given asset pack.

### getFactory


public <T> BuilderFactory<T> getFactory(Class<?> classType)

Returns the factory for the given category class.

### tryGetCachedValidBuilder / getCachedBuilder


@Nullable
public <T> Builder<T> tryGetCachedValidBuilder(int index, Class<?> classType)
public <T> Builder<T> getCachedBuilder(int index, Class<?> classType)

Retrieves a cached, validated builder by index.

### setAutoReload


public void setAutoReload(boolean autoReload)

Enables or disables file-system hot-reload.

## Related Types

- BuilderInfo -- cached builder metadata
- BuilderFactory -- creates builders by type
- Builder -- the builder interface
- BuilderSupport -- runtime context carrying a reference to this manager
