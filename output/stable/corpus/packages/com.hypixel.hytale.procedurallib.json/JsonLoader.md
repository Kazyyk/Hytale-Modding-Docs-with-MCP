# JsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: Loader

public abstract class JsonLoader<K extends SeedResource> extends Loader<K, T>

Abstract base for all JSON-based resource loaders. Extends `Loader` with JSON element access, file reference resolution, and typed accessor methods (`mustGetString`, `mustGetNumber`, `mustGetBool`, `mustGetObject`, `mustGetArray`). Constructor auto-loads external JSON when the root element contains a `"File"` key.

## Static Constants

- JSON_LOADER | JsonResourceLoader<JsonElement> | Generic JSON element loader (non-null check).
- JSON_ARR_LOADER | JsonResourceLoader<JsonArray> | JSON array loader with array type check.
- JSON_OBJ_LOADER | JsonResourceLoader<JsonObject> | JSON object loader with object type check.

## Key Methods

- `has(String name)`
- `getOrLoad(@Nonnull JsonElement element)`
- `get(String name)`
- `getRaw(String name)`
- `loadFile(@Nonnull String filePath)`
- `mustGetObject`
- `mustGetArray`
- `mustGetString`
- `mustGetBool`
- `mustGetNumber`

## Related Types

- JsonLoader.Constants -- inner interface defining `JSON_FILEPATH_SEPARATOR` and `KEY_FILE`
