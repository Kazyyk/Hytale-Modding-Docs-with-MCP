# EmoteAsset

Type: class | Package: com.hypixel.hytale.server.core.cosmetics | Extends: java.lang.Object | Implements: JsonAssetWithMap, NetworkSerializable

public class EmoteAsset implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, EmoteAsset>>, NetworkSerializable<ProtocolEmote>

Asset definition for a player emote. Contains the emote's display name, animation file path, icon path, and whether the animation loops. Registered in an indexed asset store for efficient lookup and network serialization.

## Fields

- id | String | Asset key identifier
- name | String | Localization key for the emote name
- animationPath | String | Path to the animation file (in `HytaleAssets/Common/Characters`)
- iconPath | String | Path to the icon file (in `HytaleAssets/Common/Icons/Emotes`)
- isLooping | boolean | Whether the emote animation loops

## Methods


public static AssetStore<String, EmoteAsset, IndexedLookupTableAssetMap<String, EmoteAsset>> getAssetStore()

Returns the global asset store for emotes.


public static IndexedLookupTableAssetMap<String, EmoteAsset> getAssetMap()

Returns the asset map for emotes.


public String getId()

Returns the emote asset key.


public ProtocolEmote toPacket()

Converts this emote to its protocol representation.

## Related Types

- EmoteAssetPacketGenerator -- generates network packets for emote updates
- `CosmeticRegistry` -- manages cosmetic assets
