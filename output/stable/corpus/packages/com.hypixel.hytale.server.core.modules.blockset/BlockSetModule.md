# BlockSetModule

Type: class | Package: com.hypixel.hytale.server.core.modules.blockset | Extends: JavaPlugin

@Deprecated(forRemoval = true) public class BlockSetModule extends JavaPlugin

## Fields

- public static final PluginManifest MANIFEST
- private static BlockSetModule INSTANCE
- @Nonnull private Int2ObjectMap<IntSet> flattenedBlockSets
- @Nonnull private Int2ObjectMap<IntSet> unmodifiableFlattenedBlockSets
- private BlockSetLookupTable blockSetLookupTable

## Constructors

- public BlockSetModule(@Nonnull JavaPluginInit module)

## Methods

- @Override protected void setup()
- private void onBlockTypesChanged(@Nonnull LoadedAssetsEvent<String, BlockType, BlockTypeAssetMap<String, BlockType>> event)
- private void onBlockSetsChanged(LoadedAssetsEvent<String, BlockSet, DefaultAssetMap<String, BlockSet>> event)
- @Nonnull private Int2ObjectMap<IntSet> flattenBlockSets(@Nonnull BlockSetLookupTable lookupTable)
- @Nonnull private IntOpenHashSet createSet(@Nonnull BlockSet blockSet, @Nonnull BlockSetLookupTable lookupTable, @Nonnull Int2ObjectMap<IntSet> flattenedSets)
- private void consume(@Nullable String[] values, @Nonnull Map<String, IntSet> map, String typeString, @Nonnull Consumer<IntSet> addAll)
- private void consume(@Nullable String[][] values, @Nonnull BlockSetLookupTable lookupTable, @Nonnull Consumer<IntSet> addAll)
- @Nonnull private IntOpenHashSet createSet(String name, @Nonnull BlockSetLookupTable lookupTable, @Nonnull Int2ObjectMap<IntSet> flattenedSets)
- private void consumeCategory(@Nullable String[] categories, @Nonnull Consumer<IntSet> predicate, @Nonnull BlockSetLookupTable lookupTable)
- private void consumeEntry(@Nonnull String name, @Nonnull Consumer<IntSet> predicate, @Nonnull Map<String, IntSet> nameIdMap, String typeString)
- @Nonnull public Int2ObjectMap<IntSet> getBlockSets()
- public boolean blockInSet(int set, int blockId)
- public boolean blockInSet(int set, @Nullable BlockType blockType)
- public boolean blockInSet(int set, @Nullable String blockTypeKey)
- public static BlockSetModule getInstance()

Also in this package: BlockSetLookupTable

Complete API:
  protected void setup()
  private void onBlockTypesChanged(LoadedAssetsEvent<String,BlockType,BlockTypeAssetMap<String,BlockType>> event)
  private void onBlockSetsChanged(LoadedAssetsEvent<String,BlockSet,DefaultAssetMap<String,BlockSet>> event)
  private Int2ObjectMap<IntSet> flattenBlockSets(BlockSetLookupTable lookupTable)
  private IntOpenHashSet createSet(BlockSet blockSet, BlockSetLookupTable lookupTable, Int2ObjectMap<IntSet> flattenedSets)
  private void consume(String[] values, Map<String,IntSet> map, String typeString, Consumer<IntSet> addAll)
  private void consume(String[][] values, BlockSetLookupTable lookupTable, Consumer<IntSet> addAll)
  private IntOpenHashSet createSet(String name, BlockSetLookupTable lookupTable, Int2ObjectMap<IntSet> flattenedSets)
  private void consumeCategory(String[] categories, Consumer<IntSet> predicate, BlockSetLookupTable lookupTable)
  private void consumeEntry(String name, Consumer<IntSet> predicate, Map<String,IntSet> nameIdMap, String typeString)
  public Int2ObjectMap<IntSet> getBlockSets()
  public boolean blockInSet(int set, int blockId)
  public boolean blockInSet(int set, BlockType blockType)
  public boolean blockInSet(int set, String blockTypeKey)
  public static BlockSetModule getInstance()

Fields:
public static final PluginManifest MANIFEST
private static BlockSetModule INSTANCE
private Int2ObjectMap<IntSet> flattenedBlockSets
private Int2ObjectMap<IntSet> unmodifiableFlattenedBlockSets
private BlockSetLookupTable blockSetLookupTable
