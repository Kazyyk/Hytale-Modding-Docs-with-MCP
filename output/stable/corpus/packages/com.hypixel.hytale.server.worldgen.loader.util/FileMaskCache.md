# FileMaskCache

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.util

public class FileMaskCache<T>

## Methods

- public T getIfPresentFileMask(String filename)
- public void putFileMask(String filename, T value)
- public JsonElement cachedFile(String filename, @Nonnull Function<String, JsonElement> function)

Known subclasses: BlockPlacementMaskRegistry

Also in this package: ColorUtil, Constants, Constants, Constants, EntryJsonLoader, NoiseBlockArrayJsonLoader, ResolvedBlockArrayJsonLoader, ResolvedVariantsBlockArrayLoader, Vector2dJsonLoader, Vector3dJsonLoader

Complete API:
  public T getIfPresentFileMask(String filename)
  public void putFileMask(String filename, T value)
  public JsonElement cachedFile(String filename, Function<String,JsonElement> function)

Fields:
private final Map<String,T> fileCache
private final Map<String,JsonElement> fileElements
