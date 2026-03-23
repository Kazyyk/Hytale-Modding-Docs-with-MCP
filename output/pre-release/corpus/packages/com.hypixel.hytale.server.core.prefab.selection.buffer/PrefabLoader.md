# PrefabLoader

Type: class | Package: com.hypixel.hytale.server.core.prefab.selection.buffer | Extends: java.lang.Object

public class PrefabLoader

Loads prefab files from disk in either binary or BSON format. Detects the format by file extension and delegates to the appropriate codec. Supports caching and asynchronous loading.

Also in this package: BinaryPrefabBufferCodec, BlockIdEntry, BsonPrefabBufferDeserializer, CachedEntry, FluidIdEntry, PrefabBufferCall, PrefabBufferCodec, PrefabBufferDeserializer, PrefabBufferSerializer, PrefabBufferUtil, PrefabSupplier, UpdateBinaryPrefabException

Complete API:
  public Path getRootFolder()
  public void resolvePrefabs(String prefabName, Consumer<Path> pathConsumer)
  public static void resolvePrefabs(Path rootFolder, String prefabName, Consumer<Path> pathConsumer)
  public static void resolvePrefabFolder(Path rootFolder, String prefabName, Consumer<Path> pathConsumer)
  public static String resolveRelativeJsonPath(String prefabName, Path prefabPath, Path rootPrefabDir)
  private static int getFilepathLengthNoExtension(String filepath)

Fields:
private static final char JSON_FILEPATH_SEPARATOR
private final Path rootFolder
