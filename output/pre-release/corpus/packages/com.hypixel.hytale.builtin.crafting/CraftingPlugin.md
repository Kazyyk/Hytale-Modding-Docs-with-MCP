# CraftingPlugin

Type: class | Package: com.hypixel.hytale.builtin.crafting | Extends: JavaPlugin

public class CraftingPlugin extends JavaPlugin

## Fields

- private static CraftingPlugin instance
- private ComponentType<EntityStore, CraftingManager> craftingManagerComponentType
- private final Query<EntityStore> query

## Methods

- public CraftingPlugin(@Nonnull JavaPluginInit init)
- public static Set<String> getAvailableRecipesForCategory(@Nonnull String benchId, @Nonnull String benchCategoryId)
- public static boolean isValidCraftingMaterialForBench(@Nonnull BenchState benchState, @Nonnull ItemStack itemStack)
- public static boolean isValidUpgradeMaterialForBench(@Nonnull BenchState benchState, @Nonnull ItemStack itemStack)
- protected void setup()
- private static void onItemAssetLoad(@Nonnull LoadedAssetsEvent<String, Item, DefaultAssetMap<String, Item>> event)
- private static void onItemAssetRemove(@Nonnull RemovedAssetsEvent<String, Item, DefaultAssetMap<String, Item>> event)
- private static void onRecipeLoad(@Nonnull LoadedAssetsEvent<String, CraftingRecipe, DefaultAssetMap<String, CraftingRecipe>> event)
- private static void onRecipeRemove(@Nonnull RemovedAssetsEvent<String, CraftingRecipe, DefaultAssetMap<String, CraftingRecipe>> event)
- private static void computeBenchRecipeRegistries()
- public static List<CraftingRecipe> getBenchRecipes(@Nonnull Bench bench)
- public static List<CraftingRecipe> getBenchRecipes(BenchType benchType, String name)
- public static List<CraftingRecipe> getBenchRecipes(BenchType benchType, String benchId, @Nullable String category)
- private static boolean hasCategory(@Nonnull CraftingRecipe recipe, String category)
- public static boolean learnRecipe(@Nonnull Ref<EntityStore> ref, @Nonnull String recipeId, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static boolean forgetRecipe(@Nonnull Ref<EntityStore> ref, @Nonnull String itemId, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static void sendKnownRecipes(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public ComponentType<EntityStore, CraftingManager> getCraftingManagerComponentType()
- public static CraftingPlugin get()
- public Query<EntityStore> getQuery()
- public void onEntityAdded( @Nonnull Ref<EntityStore> ref, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- public void onEntityRemove( @Nonnull Ref<EntityStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )

Also in this package: BenchRecipeRegistry, MigrateCrafting, PlayerAddedSystem

Complete API:
  public static Set<String> getAvailableRecipesForCategory(String benchId, String benchCategoryId)
  public static boolean isValidCraftingMaterialForBench(Bench bench, ItemStack itemStack)
  public static boolean isValidUpgradeMaterialForBench(Bench bench, int tierLevel, ItemStack itemStack)
  protected void setup()
  private static void onItemAssetLoad(LoadedAssetsEvent<String,Item,DefaultAssetMap<String,Item>> event)
  private static void onItemAssetRemove(RemovedAssetsEvent<String,Item,DefaultAssetMap<String,Item>> event)
  private static void onRecipeLoad(LoadedAssetsEvent<String,CraftingRecipe,DefaultAssetMap<String,CraftingRecipe>> event)
  private static void onRecipeRemove(RemovedAssetsEvent<String,CraftingRecipe,DefaultAssetMap<String,CraftingRecipe>> event)
  private static void computeBenchRecipeRegistries()
  public static List<CraftingRecipe> getBenchRecipes(Bench bench)
  public static List<CraftingRecipe> getBenchRecipes(BenchType benchType, String name)
  public static List<CraftingRecipe> getBenchRecipes(BenchType benchType, String benchId, String category)
  private static boolean hasCategory(CraftingRecipe recipe, String category)
  public static boolean learnRecipe(Ref<EntityStore> ref, String recipeId, ComponentAccessor<EntityStore> componentAccessor)
  public static boolean forgetRecipe(Ref<EntityStore> ref, String itemId, ComponentAccessor<EntityStore> componentAccessor)
  public static void sendKnownRecipes(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public ComponentType<EntityStore,CraftingManager> getCraftingManagerComponentType()
  public ComponentType<ChunkStore,BenchBlock> getBenchBlockComponentType()
  public ComponentType<ChunkStore,ProcessingBenchBlock> getProcessingBenchBlockComponentType()
  public static CraftingPlugin get()

Fields:
private static CraftingPlugin instance
private static final Map<String,BenchRecipeRegistry> registries
private static final Map<String,String[]> itemGeneratedRecipes
private ComponentType<EntityStore,CraftingManager> craftingManagerComponentType
private ComponentType<ChunkStore,BenchBlock> benchBlockComponentType
private ComponentType<ChunkStore,ProcessingBenchBlock> processingBenchBlockComponentType
