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
