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
