# EmoteAssetPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.cosmetics | Extends: AssetPacketGenerator

public class EmoteAssetPacketGenerator extends AssetPacketGenerator<String, EmoteAsset, IndexedLookupTableAssetMap<String, EmoteAsset>>

Generates `UpdateEmotes` network packets for synchronizing emote assets to clients. Produces init packets (full state), update packets (add/modify), and remove packets.

## Methods


public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String, EmoteAsset> assetMap, Map<String, EmoteAsset> assets)

Generates an `UpdateEmotes` packet with `UpdateType.Init` containing all emote assets.


public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String, EmoteAsset> assetMap, Map<String, EmoteAsset> loadedAssets, @NonNullDecl AssetUpdateQuery query)

Generates an `UpdateEmotes` packet with `UpdateType.AddOrUpdate` for changed emotes.


@NullableDecl
public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String, EmoteAsset> assetMap, Set<String> removedAssets, @NonNullDecl AssetUpdateQuery query)

Generates an `UpdateEmotes` packet with `UpdateType.Remove` for deleted emotes.

## Related Types

- EmoteAsset -- the emote asset this generates packets for
- `AssetPacketGenerator` -- abstract base class

Also in this package: BodyType, CosmeticAssetValidator, CosmeticRegistry, CosmeticType, CosmeticsModule, Emote, EmoteAsset, HaircutType, HeadAccessoryType, InvalidSkinException, PlayerSkin, PlayerSkinGradient, PlayerSkinGradientSet, PlayerSkinPart, PlayerSkinPartId, PlayerSkinPartTexture, PlayerSkinPartType, PlayerSkinTintColor, Variant

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,EmoteAsset> assetMap, Map<String,EmoteAsset> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,EmoteAsset> assetMap, Map<String,EmoteAsset> loadedAssets, AssetUpdateQuery query)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,EmoteAsset> assetMap, Set<String> removedAssets, AssetUpdateQuery query)
