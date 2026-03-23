# Item

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, Item>>, NetworkSerializable<ItemBase>

public class Item implements JsonAssetWithMap<String, DefaultAssetMap<String, Item>>, NetworkSerializable<ItemBase>

Primary item asset definition. Central configuration class for all items in the game, loaded from JSON via `BuilderCodec`. Defines item identity, appearance, behavior (weapon, tool, armor, glider, utility), interactions, sounds, models, resource types, crafting categories, and placement rules. Provides static asset map access for runtime lookup by string ID or integer index.
