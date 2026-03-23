# ShopAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.shop | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, ShopAsset>>

public class ShopAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ShopAsset>>

Implementation of `JsonAssetWithMap<String, DefaultAssetMap<String, ShopAsset>>`.

## Fields

- ASSET_STORE | AssetStore<String, ShopAsset, DefaultAssetMap<String, ShopAsset>> | Static AssetStore<String, ShopAsset, DefaultAssetMap<String, ShopAsset>> field.
- extraData | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- id | String | String field.
- elements | ChoiceElement[] | ChoiceElement[] field.

## Constructors

- ShopAsset(String id, ChoiceElement[] elements) | Creates a new ShopAsset instance.
- ShopAsset() | Creates a new ShopAsset instance.

## Methods

- getAssetStore() | AssetStore<String, ShopAsset, DefaultAssetMap<String, ShopAsset>> | static public method.
- getAssetMap() | DefaultAssetMap<String, ShopAsset> | static public method.
- getId() | String | public method.
- getElements() | ChoiceElement[] | public method.
- toString() | String | public method.
