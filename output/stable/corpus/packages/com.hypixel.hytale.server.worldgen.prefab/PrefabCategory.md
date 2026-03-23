# PrefabCategory

Type: record | Package: com.hypixel.hytale.server.worldgen.prefab

public record PrefabCategory(String name, int priority)

Represents a named prefab category with a priority value used to resolve placement conflicts during world generation. Higher priority categories take precedence.

## Fields

- public static final | String | FILENAME | Source filename ("PrefabCategories.json")
- public static final | int | MIN_PRIORITY | Minimum priority value (Integer.MIN_VALUE)
- public static final | int | MAX_PRIORITY | Maximum priority value (Integer.MAX_VALUE)
- public static final | PrefabCategory | NONE | Default "None" category with minimum priority
- public static final | PrefabCategory | UNIQUE | "Unique" category with maximum priority

## Methods

- public static void parse(JsonElement json, BiConsumer<String, PrefabCategory> consumer)

Also in this package: PrefabLoadingCache, PrefabPasteBuffer, PrefabPasteUtil, PrefabPatternGenerator, PrefabStoreRoot

Complete API:
  public static void parse(JsonElement json, BiConsumer<String,PrefabCategory> consumer)

Fields:
public static final String FILENAME
public static final int MIN_PRIORITY
public static final int MAX_PRIORITY
public static final PrefabCategory NONE
public static final PrefabCategory UNIQUE
