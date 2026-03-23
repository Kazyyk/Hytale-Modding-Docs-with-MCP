# AssetPrefabFileProvider

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefablist | Implements: FileListProvider

public class AssetPrefabFileProvider implements FileListProvider

Implements `FileListProvider` to list prefab files from all registered asset packs. Supports directory browsing and substring search across prefab directories, returning entries sorted alphabetically with base asset pack prioritized.

Also in this package: Action, PageData, PrefabPage, PrefabSavePage, SearchResult

Complete API:
  public List<FileListProvider.FileEntry> getFiles(Path currentDir, String searchQuery)
  private List<FileListProvider.FileEntry> buildPackListings()
  private List<FileListProvider.FileEntry> buildPackDirectoryListing(String currentDirStr)
  private List<FileListProvider.FileEntry> buildSearchResults(String currentDirStr, String searchQuery)
  private void searchInDirectory(Path root, String packKey, String basePath, String searchQuery, List<AssetPrefabFileProvider.SearchResult> results)
  private String getPackKey(PrefabStore.AssetPackPrefabPath packPath)
  private PrefabStore.AssetPackPrefabPath findPackByKey(String packKey)
  private String removeExtension(String fileName)
  public Path resolveVirtualPath(String virtualPath)
  public String getPackDisplayName(String packKey)

Fields:
private static final String PREFAB_EXTENSION
private static final int MAX_SEARCH_RESULTS
private static final String BASE_ASSET_PACK_DISPLAY_NAME
