# ModelVFX

Type: class | Package: com.hypixel.hytale.server.core.asset.type.modelvfx.config | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ModelVFX>>, NetworkSerializable<com.hypixel.hytale.protocol.ModelVFX>

public class ModelVFX implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ModelVFX>>, NetworkSerializable<com.hypixel.hytale.protocol.ModelVFX>

Class in the config subsystem.

## Fields

- STORE | AssetStore<String, ModelVFX, IndexedLookupTableAssetMap<String, ModelVFX>> | Static AssetStore<String, ModelVFX, IndexedLookupTableAssetMap<String, ModelVFX>> field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- id | String | String field.
- switchTo | SwitchTo | SwitchTo field.
- effectDirection | EffectDirection | EffectDirection field.
- animationDuration | float | float field.
- loopOption | LoopOption | LoopOption field.
- curveType | CurveType | CurveType field.
- highlightThickness | float | float field.
- useBloomOnHighlight | boolean | boolean field.
- useProgressiveHighlight | boolean | boolean field.
- noiseScrollSpeed | Vector2f | Vector2f field.
- postColorOpacity | float | float field.

## Constructors

- ModelVFX(String id) | Creates a new ModelVFX instance.
- ModelVFX() | Creates a new ModelVFX instance.

## Methods

- getAssetStore() | AssetStore<String, ModelVFX, IndexedLookupTableAssetMap<String, ModelVFX>> | static public method.
- getAssetMap() | IndexedLookupTableAssetMap<String, ModelVFX> | static public method.
- toPacket() | com.hypixel.hytale.protocol.ModelVFX | public method.
- getId() | String | public method.
- getSwitchTo() | SwitchTo | public method.
- getEffectDirection() | EffectDirection | public method.
- getAnimationDuration() | float | public method.
- getAnimationRange() | Vector2f | public method.
- getLoopOption() | LoopOption | public method.
- getCurveType() | CurveType | public method.
- getHighlightColor() | Color | public method.
- useBloomOnHighlight() | boolean | public method.
- useProgessiveHighlight() | boolean | public method.
- getHighlightThickness() | float | public method.
- getNoiseScale() | Vector2f | public method.
- getNoiseScrollSpeed() | Vector2f | public method.
- getPostColor() | Color | public method.
- getPostColorOpacity() | float | public method.
- toString() | String | public method.
