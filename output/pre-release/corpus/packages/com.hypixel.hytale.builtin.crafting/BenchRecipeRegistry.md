# BenchRecipeRegistry

Type: class | Package: com.hypixel.hytale.builtin.crafting

public class BenchRecipeRegistry

## Fields

- private final String benchId

## Methods

- public BenchRecipeRegistry(String benchId)
- public Iterable<String> getIncomingRecipesForItem(@Nonnull String itemId)
- public void removeRecipe(@Nonnull String id)
- public void addRecipe(@Nonnull BenchRequirement benchRequirement, @Nonnull CraftingRecipe recipe)
- public CraftingRecipe[] getAllRecipes()
- public Set<String> getRecipesForCategory(@Nonnull String benchCategoryId)
- public void recompute()
- private void extractMaterialFromRecipes(@Nonnull Set<String> recipes)
- public boolean isValidCraftingMaterial(@Nonnull ItemStack itemStack)
- public boolean equals(@Nullable Object o)
- public int hashCode()
- public String toString()

Also in this package: CraftingPlugin, MigrateCrafting, PlayerAddedSystem

Complete API:
  public Iterable<String> getIncomingRecipesForItem(String itemId)
  public void removeRecipe(String id)
  public void addRecipe(BenchRequirement benchRequirement, CraftingRecipe recipe)
  public CraftingRecipe[] getAllRecipes()
  public Set<String> getRecipesForCategory(String benchCategoryId)
  public void recompute()
  private void extractMaterialFromRecipes(Set<String> recipes)
  public boolean isValidCraftingMaterial(ItemStack itemStack)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
private final String benchId
private final Map<String,Set<String>> categoryMap
private final Map<String,Set<String>> itemToIncomingRecipe
private final Set<String> uncategorizedRecipes
private final Set<String> allMaterialIds
private final Set<String> allMaterialResourceType
