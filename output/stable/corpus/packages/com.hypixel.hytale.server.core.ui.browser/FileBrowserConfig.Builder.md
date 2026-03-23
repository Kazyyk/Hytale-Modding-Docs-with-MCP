# FileBrowserConfig.Builder

Type: class | Package: com.hypixel.hytale.server.core.ui.browser

public static class Builder

Fluent builder for FileBrowserConfig. Provides setter methods for all configuration options with sensible defaults (e.g., `maxResults = 50`, `enableSearch = true`, `enableDirectoryNav = true`).

## Methods

- public FileBrowserConfig.Builder listElementId(@Nonnull String listElementId)
- public FileBrowserConfig.Builder rootSelectorId(@Nullable String rootSelectorId)
- public FileBrowserConfig.Builder searchInputId(@Nullable String searchInputId)
- public FileBrowserConfig.Builder currentPathId(@Nullable String currentPathId)
- public FileBrowserConfig.Builder roots(@Nonnull List<FileBrowserConfig.RootEntry> roots)
- public FileBrowserConfig.Builder allowedExtensions(@Nonnull String... extensions)
- public FileBrowserConfig.Builder allowedExtensions(@Nonnull Set<String> extensions)
- public FileBrowserConfig.Builder enableRootSelector(boolean enable)
- public FileBrowserConfig.Builder enableSearch(boolean enable)
- public FileBrowserConfig.Builder enableDirectoryNav(boolean enable)
- public FileBrowserConfig.Builder enableMultiSelect(boolean enable)
- public FileBrowserConfig.Builder maxResults(int maxResults)
- public FileBrowserConfig.Builder customProvider(@Nullable FileListProvider provider)
- public FileBrowserConfig.Builder assetPackMode(boolean enable, @Nullable String subPath)
- public FileBrowserConfig.Builder terminalDirectoryPredicate(@Nullable Predicate<Path> predicate)
- public FileBrowserConfig build()

Known subclasses: Builder

Known implementors: BuilderActionRecomputePath, BuilderBase, BuilderBodyMotionFindBase

Also in this package: AssetPackSearchResult, FileBrowserConfig, FileBrowserEventData, FileEntry, FileListProvider, RootEntry, ServerFileBrowser

Complete API:
  public FileBrowserConfig.Builder listElementId(String listElementId)
  public FileBrowserConfig.Builder rootSelectorId(String rootSelectorId)
  public FileBrowserConfig.Builder searchInputId(String searchInputId)
  public FileBrowserConfig.Builder currentPathId(String currentPathId)
  public FileBrowserConfig.Builder roots(List<FileBrowserConfig.RootEntry> roots)
  public FileBrowserConfig.Builder allowedExtensions(String extensions)
  public FileBrowserConfig.Builder allowedExtensions(Set<String> extensions)
  public FileBrowserConfig.Builder enableRootSelector(boolean enable)
  public FileBrowserConfig.Builder enableSearch(boolean enable)
  public FileBrowserConfig.Builder enableDirectoryNav(boolean enable)
  public FileBrowserConfig.Builder enableMultiSelect(boolean enable)
  public FileBrowserConfig.Builder maxResults(int maxResults)
  public FileBrowserConfig.Builder customProvider(FileListProvider provider)
  public FileBrowserConfig.Builder assetPackMode(boolean enable, String subPath)
  public FileBrowserConfig.Builder terminalDirectoryPredicate(Predicate<Path> predicate)
  public FileBrowserConfig build()

Fields:
private String listElementId
private String rootSelectorId
private String searchInputId
private String currentPathId
private List<FileBrowserConfig.RootEntry> roots
private Set<String> allowedExtensions
private boolean enableRootSelector
private boolean enableSearch
private boolean enableDirectoryNav
private boolean enableMultiSelect
private int maxResults
private FileListProvider customProvider
private boolean assetPackMode
private String assetPackSubPath
private Predicate<Path> terminalDirectoryPredicate
