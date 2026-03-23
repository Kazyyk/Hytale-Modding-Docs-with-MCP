# ModifiedAsset

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.data

public class ModifiedAsset

## Fields

- public static final BuilderCodec<ModifiedAsset> CODEC
- public Path dataFile
- public Path path
- public Path oldPath
- public AssetState state
- public Instant lastModificationTimestamp
- public UUID lastModificationPlayerUuid
- public String lastModificationUsername

## Methods

- public void markEditedBy(EditorClient editorClient)
- @Nonnull public AssetInfo toAssetInfoPacket(String assetPack)
