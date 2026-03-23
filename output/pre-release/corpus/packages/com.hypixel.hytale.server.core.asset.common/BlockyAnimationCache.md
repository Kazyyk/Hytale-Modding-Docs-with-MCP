# BlockyAnimationCache

Type: class | Package: com.hypixel.hytale.server.core.asset.common

public class BlockyAnimationCache

Cache for blocky animation data parsed from common assets. Stores `BlockyAnimation` instances keyed by name, loading and decoding them on demand from `CommonAssetRegistry`. Supports both synchronous (`getNow`) and asynchronous (`get`) retrieval.

## Fields

- public static final HytaleLogger LOGGER

## Methods

- @Nonnull public static CompletableFuture<BlockyAnimation> get(String name)
- @Nonnull public static CompletableFuture<BlockyAnimation> get(@Nonnull CommonAsset asset)
- @Nullable public static BlockyAnimation getNow(String name)
- public static BlockyAnimation getNow(@Nonnull CommonAsset asset)
- public static void invalidate(String name)

## Inner Classes

### BlockyAnimation

Static inner class representing a parsed blocky animation with duration.

- public static final BuilderCodec<BlockyAnimation> CODEC
- public static final double FRAMES_PER_SECOND

- public int getDurationFrames()
- public double getDurationMillis()
- public double getDurationSeconds()

Also in this package: AddCommonAssetResult, BlockyAnimation, ChannelValidator, CommonAsset, CommonAssetModule, CommonAssetMonitorHandler, CommonAssetRegistry, CommonAssetValidator, HytaleFileTypes, OggVorbisInfo, OggVorbisInfoCache, PackAsset, PlayerCommonAssets, ResourceCommonAsset, SoundFileValidators

Complete API:
  public static CompletableFuture<BlockyAnimationCache.BlockyAnimation> get(String name)
  public static CompletableFuture<BlockyAnimationCache.BlockyAnimation> get(CommonAsset asset)
  public static BlockyAnimationCache.BlockyAnimation getNow(String name)
  public static BlockyAnimationCache.BlockyAnimation getNow(CommonAsset asset)
  private static CompletableFuture<BlockyAnimationCache.BlockyAnimation> get0(CommonAsset asset)
  public static void invalidate(String name)

Fields:
public static final HytaleLogger LOGGER
private static final Map<String,BlockyAnimationCache.BlockyAnimation> animations
