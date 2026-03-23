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

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper, BuilderObjectStaticHelper (and 29 more)

Complete API:
  public void registerFactory(BuilderFactory<T> factory)
  public void addCategory(String name, Class<?> clazz)
  public String getCategoryName(Class<?> factoryClass)
  public int getIndex(String name)
  public void setAutoReload(boolean autoReload)
  public String lookupName(int index)
  public int getOrCreateIndex(String name)
  public BuilderInfo tryGetBuilderInfo(int builderIndex)
  public void unloadBuilders(AssetPack pack)
  public boolean loadBuilders(AssetPack pack, boolean includeTests)
  private void finishLoadingBuilders(Int2ObjectOpenHashMap<BuilderInfo> loadedBuilders, List<String> errors)
  public void assetEditorLoadFile(Path fileName)
  public void assetEditorRemoveFile(Path filePath)
  public int loadFile(Path fileName, boolean reloading, List<String> errors)
  public int loadFile(Path fileName, List<String> errors, Object2IntMap<String> typeCounter, boolean includeTests, boolean reloading)
  public boolean validateBuilder(BuilderInfo builderInfo)
  public BuilderFactory<T> getFactory(Class<?> clazz)
  public BuilderInfo getCachedBuilderInfo(int index, Class<?> classType)
  public Builder<T> tryGetCachedValidBuilder(int index, Class<?> classType)
  public Builder<T> getCachedBuilder(int index, Class<?> classType)
  public boolean isEmpty()
  public Int2ObjectMap<BuilderInfo> getAllBuilders()
  public T collectMatchingBuilders(T collection, Predicate<BuilderInfo> filter, BiConsumer<BuilderInfo,T> consumer)
  public Object2IntMap<String> getNameToIndexMap()
  public BuilderInfo findMatchingBuilder(BiPredicate<BuilderInfo,T> filter, T t)
  public BuilderInfo getBuilderInfo(Builder<?> builder)
  public List<String> getTemplateNames()
  public void forceValidation(int builderIndex)
  public void checkIfDeprecated(Builder<?> builder, BuilderFactory<?> builderFactory, JsonElement element, String fileName, String context)
  public Schema generateSchema(SchemaContext context)
  public List<BuilderDescriptor> generateDescriptors()
  public static void saveDescriptors(List<BuilderDescriptor> builderDescriptors, Path fileName)
  public Builder<Role> tryGetCachedValidRole(int builderIndex)
  public void validateAllLoadedBuilders(Int2ObjectMap<BuilderInfo> loadedBuilders, boolean validateDependents, List<String> errors)
  public void onAllBuildersLoaded(Int2ObjectMap<BuilderInfo> loadedBuilders)
  public static void onBuilderReloaded(BuilderInfo builderInfo)
  public static int getPlayerGroupID()
  public static int getSelfGroupID()
  protected static void onBuilderAdded(BuilderInfo builderInfo)
  protected boolean isDependant(Builder<?> builder, int builderIndex, int dependencyIndex)
  protected int cacheBuilder(String name, Builder<?> builder, Path path)
  private void removeBuilder(int index)
  private void removeBuilder(String name)
  private Builder<?> tryGetCachedBuilder(int index)
  private BuilderInfo tryGetCachedBuilderInfo(int index, Class<?> classType)
  private static void validateAllSpawnableNPCs(Int2ObjectMap<BuilderInfo> builders, List<String> errors)
  private static void sendReloadNotification(Message message, Set<String> builders)
  private static boolean isIgnoredFile(Path path)
  private static boolean isJsonFile(Path path)
  private static boolean isJsonFileName(Path path, EventKind eventKind)
  private static String builderNameFromPath(Path path)
  private String buildPathString(IntArrayList path, int index)
  private boolean validateBuilder(BuilderInfo builderInfo, IntSet validatedDependencies, IntArrayList path)
  private IntSet computeAllDependencies(Builder<?> builder, int builderIndex)
  private IntSet computeAllDependencies(Builder<?> builder, int builderIndex, IntSet dependencies, IntArrayList path)
  private void iterateDependencies(IntIterator iterator, IntSet dependencies, IntArrayList path)
  private void reloadDependants(int dependency)

Fields:
public static final String CONTENT_KEY
private static final String CLASS_KEY
private static final String TEST_TYPE_KEY
private static final String FAIL_REASON_KEY
private static final String PLAYER_GROUP_TAG
private static final String SELF_GROUP_TAG
private static int playerGroupID
private static int selfGroupID
private final Int2ObjectConcurrentHashMap<BuilderInfo> builderCache
private final String elementTypeName
private final String defaultFileType
private boolean autoReload
private final Map<Class<?>,BuilderFactory<?>> factoryMap
private final Map<String,Class<?>> categoryNames
private final Object2IntMap<String> nameToIndexMap
private final AtomicInteger nextIndex
private final ReentrantReadWriteLock indexLock
private boolean setup
public static BuilderManager SCHEMA_BUILDER_MANAGER
