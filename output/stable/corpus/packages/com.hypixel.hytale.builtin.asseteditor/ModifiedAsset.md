# ModifiedAsset

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.data

public class ModifiedAsset

Tracks a modified asset's state, location, and edit metadata. Serialized to disk via a `BuilderCodec<ModifiedAsset>` for persistent recent-modifications tracking across server restarts.

## Fields

- dataFile | Path | Path to the data file (nullable)
- path | Path | Current asset path
- oldPath | Path | Previous path if renamed (nullable)
- state | AssetState | Modification state (default: `CHANGED`)
- lastModificationTimestamp | Instant | When the modification occurred
- lastModificationPlayerUuid | UUID | UUID of the editing player
- lastModificationUsername | String | Username of the editing player

## Key Methods

- void markEditedBy(EditorClient) | Sets timestamp, UUID, and username from the editor client
- AssetInfo toAssetInfoPacket(String assetPack) | Converts to an `AssetInfo` protocol packet

## Codec


public static final BuilderCodec<ModifiedAsset> CODEC

Serializes/deserializes the asset modification record with fields: `File`, `Path`, `OldPath`, `State`, `LastModificationTimestamp`, `LastModificationPlayerUuid`, `LastModificationUsername`. Legacy `IsNew`/`IsDeleted` boolean fields are supported for deserialization.
