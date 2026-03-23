# ResourceCommonAsset

Type: class | Package: com.hypixel.hytale.server.core.asset.common | Extends: CommonAsset

public class ResourceCommonAsset extends CommonAsset

A common asset backed by a Java classpath resource. Loads binary data via `Class.getResourceAsStream`.

## Methods

- public String getPath()
- @Nonnull @Override protected CompletableFuture<byte[]> getBlob0()
- @Nullable public static ResourceCommonAsset of(@Nonnull Class<?> clazz, @Nonnull String path, @Nonnull String name)

Also in this package: AddCommonAssetResult, BlockyAnimation, BlockyAnimationCache, ChannelValidator, CommonAsset, CommonAssetModule, CommonAssetMonitorHandler, CommonAssetRegistry, CommonAssetValidator, HytaleFileTypes, OggVorbisInfo, OggVorbisInfoCache, PackAsset, PlayerCommonAssets, SoundFileValidators

Complete API:
  public String getPath()
  public CompletableFuture<byte[]> getBlob0()
  public String toString()
  public static ResourceCommonAsset of(Class<?> clazz, String path, String name)

Fields:
private final Class<?> clazz
private final String path
