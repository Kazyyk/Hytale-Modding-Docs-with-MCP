# OggVorbisInfoCache

Type: class | Package: com.hypixel.hytale.server.core.asset.common

public class OggVorbisInfoCache

Cache for OGG Vorbis audio file metadata (channels, sample rate, duration). Parses the Vorbis identification header from the raw bytes to extract audio properties. Supports both synchronous and asynchronous retrieval.

## Methods

- @Nonnull public static CompletableFuture<OggVorbisInfo> get(String name)
- @Nonnull public static CompletableFuture<OggVorbisInfo> get(@Nonnull CommonAsset asset)
- @Nullable public static OggVorbisInfo getNow(String name)
- public static OggVorbisInfo getNow(@Nonnull CommonAsset asset)
- public static void invalidate(String name)

## Inner Classes

### OggVorbisInfo

- channels | int | Number of audio channels
- sampleRate | int | Sample rate in Hz
- duration | double | Duration in seconds (-1.0 if undetermined)

Also in this package: AddCommonAssetResult, BlockyAnimation, BlockyAnimationCache, ChannelValidator, CommonAsset, CommonAssetModule, CommonAssetMonitorHandler, CommonAssetRegistry, CommonAssetValidator, HytaleFileTypes, OggVorbisInfo, PackAsset, PlayerCommonAssets, ResourceCommonAsset, SoundFileValidators

Complete API:
  public static CompletableFuture<OggVorbisInfoCache.OggVorbisInfo> get(String name)
  public static CompletableFuture<OggVorbisInfoCache.OggVorbisInfo> get(CommonAsset asset)
  public static OggVorbisInfoCache.OggVorbisInfo getNow(String name)
  public static OggVorbisInfoCache.OggVorbisInfo getNow(CommonAsset asset)
  private static CompletableFuture<OggVorbisInfoCache.OggVorbisInfo> get0(CommonAsset asset)
  public static void invalidate(String name)

Fields:
public static final HytaleLogger LOGGER
private static final Map<String,OggVorbisInfoCache.OggVorbisInfo> vorbisFiles
