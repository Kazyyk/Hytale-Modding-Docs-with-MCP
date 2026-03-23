# FileMaskCache

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.util

public class FileMaskCache<T>

## Methods

- public T getIfPresentFileMask(String filename)
- public void putFileMask(String filename, T value)
- public JsonElement cachedFile(String filename, @Nonnull Function<String, JsonElement> function)
