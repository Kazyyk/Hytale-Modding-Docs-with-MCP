# FileListProvider.FileEntry

Type: record | Package: com.hypixel.hytale.server.core.ui.browser

public record FileEntry(@Nonnull String name, @Nonnull String displayName, boolean isDirectory, boolean isTerminal, int matchScore)

Represents a file or directory entry in the file browser listing. The `isTerminal` flag indicates directories that should not be navigated into (treated as selectable items). The `matchScore` is used for ranking search results.

## Constructors

- public FileEntry(@Nonnull String name, boolean isDirectory)
- public FileEntry(@Nonnull String name, @Nonnull String displayName, boolean isDirectory)
- public FileEntry(@Nonnull String name, @Nonnull String displayName, boolean isDirectory, boolean isTerminal)
- public FileEntry(@Nonnull String name, @Nonnull String displayName, boolean isDirectory, boolean isTerminal, int matchScore)

Also in this package: ActionResult, AssetPackSaveBrowser, AssetPackSaveBrowserConfig, AssetPackSaveBrowserEventData, AssetPackSearchResult, Builder, CreatePackResult, FileBrowserConfig, FileBrowserEventData, FileListProvider, ModsDirectory, PackEntry, PendingPack, RootEntry, ServerFileBrowser
