# CommonAssetModule

Type: class | Package: com.hypixel.hytale.server.core.asset.common | Extends: JavaPlugin

public class CommonAssetModule extends JavaPlugin

Plugin that manages the common asset pipeline: loading assets from asset packs (via hash index files, cache files, or file-tree walking), distributing them to connected clients, and hot-reloading changed files through the asset monitor system.

## Constants

- public static final PluginManifest MANIFEST
- public static final Set<Path> IGNORED_FILES
- public static final int MAX_FRAME

## Methods

- public static CommonAssetModule get()
- public void loadCommonAssets(@Nonnull AssetPack pack, long bootTime)
- public <T extends CommonAsset> void addCommonAsset(String pack, @Nonnull T asset)
- public <T extends CommonAsset> void addCommonAsset(String pack, @Nonnull T asset, boolean log)
- @Nullable public Asset[] getRequiredAssets()
- public void sendAssetsToPlayer(@Nonnull PacketHandler packetHandler, @Nullable Asset[] requested, boolean forceRebuild)
- public void sendAssets(@Nonnull List<CommonAsset> toSend, boolean forceRebuild)
- public void sendAsset(@Nonnull CommonAsset asset, boolean forceRebuild)
- public void sendRemoveAssets(@Nonnull List<CommonAssetRegistry.PackAsset> assets, boolean forceRebuild)
