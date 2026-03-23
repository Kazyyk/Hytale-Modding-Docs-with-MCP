# PlayerCommonAssets

Type: class | Package: com.hypixel.hytale.server.core.asset.common

public class PlayerCommonAssets

Tracks which common assets a specific player has received. Maintains maps of missing and sent asset hashes to manage incremental asset delivery during world loading.

## Constructors

- PlayerCommonAssets(@Nonnull Asset[] requiredAssets)

## Methods

- public void sent(@Nullable Asset[] hashes)

Also in this package: AddCommonAssetResult, BlockyAnimation, BlockyAnimationCache, ChannelValidator, CommonAsset, CommonAssetModule, CommonAssetMonitorHandler, CommonAssetRegistry, CommonAssetValidator, HytaleFileTypes, OggVorbisInfo, OggVorbisInfoCache, PackAsset, ResourceCommonAsset, SoundFileValidators

Complete API:
  public void sent(Asset[] hashes)

Fields:
private final Map<String,String> assetMissing
private final Map<String,String> assetSent
