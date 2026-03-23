# MaterialProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders | Implements: Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, MaterialProviderAsset>>

public class MaterialProviderAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, MaterialProviderAsset>>

Abstract base for all material provider assets. Defines the CODEC hierarchy, skip/export functionality, and the `build()` contract that subclasses implement to produce a `MaterialProvider<Material>`.
