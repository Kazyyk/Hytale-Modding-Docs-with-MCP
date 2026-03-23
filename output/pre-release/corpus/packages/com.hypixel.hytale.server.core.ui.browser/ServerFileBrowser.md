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

Also in this package: ActionResult, AssetPackSaveBrowser, AssetPackSaveBrowserConfig, AssetPackSaveBrowserEventData, AssetPackSearchResult, Builder, CreatePackResult, FileBrowserConfig, FileBrowserEventData, FileEntry, FileListProvider, ModsDirectory, PackEntry, PendingPack, RootEntry

Complete API:
  public void buildRootSelector(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  public void buildSearchInput(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  public void buildCurrentPath(UICommandBuilder commandBuilder)
  public void buildFileList(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  public void buildUI(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  public boolean handleEvent(FileBrowserEventData data)
  private List<FileListProvider.FileEntry> buildDirectoryListing()
  private List<FileListProvider.FileEntry> buildSearchResults()
  private boolean matchesExtension(String fileName)
  private List<FileListProvider.FileEntry> buildAssetPackListing()
  private List<FileListProvider.FileEntry> buildAssetPackSearchResults()
  private void searchInAssetPackDirectory(Path searchRoot, String packName, String basePath, List<ServerFileBrowser.AssetPackSearchResult> results)
  private boolean handleAssetPackNavigation(String fileName)
  private Path getAssetPackSubPath(AssetPack pack)
  private String getAssetPackDisplayName(AssetPack pack)
  private AssetPack findAssetPackByDisplayName(String displayName)
  private boolean isTerminalDirectory(Path path)
  public Path resolveAssetPackPath(String virtualPath)
  public String getAssetPackCurrentPath()
  private String removeExtensions(String fileName)
  public Path getRoot()
  public void setRoot(Path root)
  public Path getCurrentDir()
  public void setCurrentDir(Path currentDir)
  public String getSearchQuery()
  public void setSearchQuery(String searchQuery)
  public void navigateUp()
  public void navigateTo(Path relativePath)
  public Set<String> getSelectedItems()
  public void addSelection(String item)
  public void clearSelection()
  public FileBrowserConfig getConfig()
  private Path findConfigRoot(String pathStr)

Fields:
private static final HytaleLogger LOGGER
private static final Value<String> BUTTON_HIGHLIGHTED
private static final String BASE_ASSET_PACK_DISPLAY_NAME
private final FileBrowserConfig config
private Path root
private Path currentDir
private String searchQuery
private final Set<String> selectedItems
