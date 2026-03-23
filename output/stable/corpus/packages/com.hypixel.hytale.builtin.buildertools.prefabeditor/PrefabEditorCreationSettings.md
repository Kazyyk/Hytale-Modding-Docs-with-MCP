# PrefabEditorCreationSettings

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor | Implements: PrefabEditorCreationContext, JsonAssetWithMap

public class PrefabEditorCreationSettings implements PrefabEditorCreationContext, JsonAssetWithMap<String, DefaultAssetMap<String, PrefabEditorCreationSettings>>

Persistent, serializable settings for creating a prefab edit session. Stored as a JSON asset and loadable by name. Contains all parameters from `PrefabEditorCreationContext` plus path resolution logic that handles asset-pack, server, and worldgen root directories. Validates paths for traversal attacks on non-singleplayer owners. Supports recursive directory walking up to depth 10.

## Constants

- RECURSIVE_SEARCH_MAX_DEPTH | int | 10 | Maximum directory recursion depth.

## Key Methods

- getAssetStore() | AssetStore<...> | Returns the global asset store for creation settings.
- getAssetMap() | DefaultAssetMap<...> | Returns the asset map for named lookup.
- finishProcessing(Player, PlayerRef, boolean) | PrefabEditorCreationContext | Resolves raw paths into absolute prefab file paths. Returns null on validation failure.
- load(String) | CompletableFuture<PrefabEditorCreationSettings> | Asynchronously loads a named settings preset.
- save(String, PrefabEditorCreationSettings) | CompletableFuture<Void> | Asynchronously saves settings under a name.
- stringEndsWithPrefabPath(String) | boolean | Checks if a string ends with a prefab file extension.

## See Also

- PrefabEditorCreationContext
- PrefabEditSessionManager
