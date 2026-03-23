# ItemPlayerAnimations

Type: class | Package: com.hypixel.hytale.server.core.asset.type.itemanimation.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, ItemPlayerAnimations>>, NetworkSerializable<com.hypixel.hytale.protocol.ItemPlayerAnimations>

public class ItemPlayerAnimations implements JsonAssetWithMap<String, DefaultAssetMap<String, ItemPlayerAnimations>>, NetworkSerializable<com.hypixel.hytale.protocol.ItemPlayerAnimations>

Class in the config subsystem.

## Fields

- DEFAULT_ID | String | Static final String field.
- ASSET_STORE | AssetStore<String, ItemPlayerAnimations, DefaultAssetMap<String, ItemPlayerAnimations>> | Static AssetStore<String, ItemPlayerAnimations, DefaultAssetMap<String, ItemPlayerAnimations>> field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- id | String | String field.
- wiggleWeights | WiggleWeights | WiggleWeights field.
- camera | CameraSettings | CameraSettings field.
- pullbackConfig | ItemPullbackConfig | ItemPullbackConfig field.
- useFirstPersonOverrides | boolean | boolean field.
- cachedPacket | SoftReference<com.hypixel.hytale.protocol.ItemPlayerAnimations> | SoftReference<com.hypixel.hytale.protocol.ItemPlayerAnimations> field.

## Constructors

- ItemPlayerAnimations() | Creates a new ItemPlayerAnimations instance.

## Methods

- getAssetStore() | AssetStore<String, ItemPlayerAnimations, DefaultAssetMap<String, ItemPlayerAnimations>> | static public method.
- getAssetMap() | DefaultAssetMap<String, ItemPlayerAnimations> | static public method.
- getId() | String | public method.
- getAnimations() | Map<String, ItemAnimation> | public method.
- getWiggleWeights() | WiggleWeights | public method.
- getCamera() | CameraSettings | public method.
- toPacket() | com.hypixel.hytale.protocol.ItemPlayerAnimations | public method.
- toString() | String | public method.
