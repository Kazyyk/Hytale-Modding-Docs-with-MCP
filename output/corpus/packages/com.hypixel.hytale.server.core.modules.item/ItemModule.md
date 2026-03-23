# ItemModule

Type: class | Package: com.hypixel.hytale.server.core.modules.item | Extends: JavaPlugin

public class ItemModule extends JavaPlugin

## Fields

- public static final PluginManifest MANIFEST
- private static ItemModule instance

## Constructors

- public ItemModule(@Nonnull JavaPluginInit init)

## Methods

- public static ItemModule get()
- @Override protected void setup()
- @Nonnull public List<String> getFlatItemCategoryList()
- private void flattenCategories(String parent, @Nonnull ItemCategory[] itemCategories, @Nonnull List<String> categoryIds)
- @Nonnull public List<ItemStack> getRandomItemDrops(@Nullable String dropListId)
- public static boolean exists(String key)
