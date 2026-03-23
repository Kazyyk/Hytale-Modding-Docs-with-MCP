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

Also in this package: GiveItemInteraction, ShopElement, ShopPage, ShopPageSupplier, ShopPlugin

Complete API:
  public static AssetStore<String,ShopAsset,DefaultAssetMap<String,ShopAsset>> getAssetStore()
  public static DefaultAssetMap<String,ShopAsset> getAssetMap()
  public String getId()
  public ChoiceElement[] getElements()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,ShopAsset> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ShopAsset,DefaultAssetMap<String,ShopAsset>> ASSET_STORE
protected AssetExtraInfo.Data extraData
protected String id
protected ChoiceElement[] elements
