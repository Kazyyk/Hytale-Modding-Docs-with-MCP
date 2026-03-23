# ServerFileBrowser

Type: class | Package: com.hypixel.hytale.server.core.ui.browser

public class ServerFileBrowser

Server-side file browser that builds UI command sequences for a file browsing interface. Supports directory navigation, fuzzy search, root switching, multi-select, and asset pack browsing mode. Manages current directory state, search queries, and selected items.

In asset pack mode, lists asset packs as top-level directories with the base pack displayed as "HytaleAssets". Supports terminal directory detection via a configurable predicate.

## Fields

- private final FileBrowserConfig config
- private Path root
- private Path currentDir
- private String searchQuery
- private final Set<String> selectedItems

## Constructors

- public ServerFileBrowser(@Nonnull FileBrowserConfig config)
- public ServerFileBrowser(@Nonnull FileBrowserConfig config, @Nullable Path initialRoot, @Nullable Path initialDir)

## Methods

- public void buildRootSelector(@Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder)
- public void buildSearchInput(@Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder)
- public void buildCurrentPath(@Nonnull UICommandBuilder commandBuilder)
- public void buildFileList(@Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder)
- public void buildUI(@Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder)
- public boolean handleEvent(@Nonnull FileBrowserEventData data)
- public Path resolveAssetPackPath(@Nonnull String virtualPath)
- public String getAssetPackCurrentPath()
- public Path getRoot()
- public void setRoot(@Nonnull Path root)
- public Path getCurrentDir()
- public void setCurrentDir(@Nonnull Path currentDir)
- public String getSearchQuery()
- public void setSearchQuery(@Nonnull String searchQuery)
- public void navigateUp()
- public void navigateTo(@Nonnull Path relativePath)
- public Set<String> getSelectedItems()
- public void addSelection(@Nonnull String item)
- public void clearSelection()
- public FileBrowserConfig getConfig()
