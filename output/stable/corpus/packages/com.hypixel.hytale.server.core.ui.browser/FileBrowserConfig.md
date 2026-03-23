# FileBrowserConfig

Type: record | Package: com.hypixel.hytale.server.core.ui.browser

public record FileBrowserConfig(
    @Nonnull String listElementId,
    @Nullable String rootSelectorId,
    @Nullable String searchInputId,
    @Nullable String currentPathId,
    @Nonnull List<FileBrowserConfig.RootEntry> roots,
    @Nonnull Set<String> allowedExtensions,
    boolean enableRootSelector,
    boolean enableSearch,
    boolean enableDirectoryNav,
    boolean enableMultiSelect,
    int maxResults,
    @Nullable FileListProvider customProvider,
    boolean assetPackMode,
    @Nullable String assetPackSubPath,
    @Nullable Predicate<Path> terminalDirectoryPredicate
)

Immutable configuration record for the server file browser UI. Controls which UI elements are present (root selector, search input, path display), file filtering by extension, navigation behavior, multi-select support, maximum search results, asset pack browsing mode, and terminal directory detection.

## Methods

- public static FileBrowserConfig.Builder builder()

## Inner Types

- FileBrowserConfig.Builder -- fluent builder for constructing config instances
- FileBrowserConfig.RootEntry -- root directory entry with display name and path

Also in this package: AssetPackSearchResult, Builder, FileBrowserEventData, FileEntry, FileListProvider, RootEntry, ServerFileBrowser

Complete API:
  public static FileBrowserConfig.Builder builder()
