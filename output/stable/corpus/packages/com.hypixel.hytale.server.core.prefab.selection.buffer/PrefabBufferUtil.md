# PrefabBufferUtil

Type: class | Package: com.hypixel.hytale.server.core.prefab.selection.buffer | Extends: java.lang.Object

public class PrefabBufferUtil

Utility class providing static helper methods for prefab buffer operations including block placement, entity spawning, rotation, and clipboard paste. Contains the core logic for applying a prefab buffer to a world region.

Also in this package: BinaryPrefabBufferCodec, BlockIdEntry, BsonPrefabBufferDeserializer, CachedEntry, FluidIdEntry, PrefabBufferCall, PrefabBufferCodec, PrefabBufferDeserializer, PrefabBufferSerializer, PrefabLoader, PrefabSupplier, UpdateBinaryPrefabException

Complete API:
  public static IPrefabBuffer getCached(Path path)
  public static PrefabBuffer loadBuffer(Path path)
  public static CompletableFuture<Void> writeToFileAsync(PrefabBuffer prefab, Path path)
  public static PrefabBuffer readFromFile(Path path)
  public static CompletableFuture<PrefabBuffer> readFromFileAsync(Path path)
  public static PrefabBuffer loadFromLPF(Path path, Path realPath)
  public static PrefabBuffer loadFromJson(AssetPack pack, Path path, Path cachedLpfPath, Path jsonPath)
  private static PrefabBufferUtil.CachedEntry getOrCreateCacheEntry(Path path)

Fields:
public static final Path CACHE_PATH
public static final String LPF_FILE_SUFFIX
public static final String JSON_FILE_SUFFIX
public static final String JSON_LPF_FILE_SUFFIX
public static final String FILE_SUFFIX_REGEX
public static final Pattern FILE_SUFFIX_PATTERN
public static final HytaleLogger LOGGER
private static final Map<Path,WeakReference<PrefabBufferUtil.CachedEntry>> CACHE
