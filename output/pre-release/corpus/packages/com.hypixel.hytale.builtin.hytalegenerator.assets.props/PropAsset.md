# PropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Implements: Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, PropAsset>>

public class PropAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, PropAsset>>

Abstract base for all prop assets. Defines the CODEC hierarchy with common fields (Inputs, Condition, Mask) and the `build()` contract that subclasses implement to produce a `Prop` instance.
