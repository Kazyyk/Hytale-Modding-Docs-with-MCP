# FileBrowserEventData

Type: class | Package: com.hypixel.hytale.server.core.ui.browser

public class FileBrowserEventData

Codec-backed event data for file browser UI interactions. Carries optional file path, root selector value, search query, search result, and browse request flag.

## Fields

- public static final String KEY_FILE
- public static final String KEY_ROOT
- public static final String KEY_SEARCH_QUERY
- public static final String KEY_SEARCH_RESULT
- public static final String KEY_BROWSE
- public static final BuilderCodec<FileBrowserEventData> CODEC

## Methods

- public String getFile()
- public String getRoot()
- public String getSearchQuery()
- public String getSearchResult()
- public boolean isBrowseRequested()
- public static FileBrowserEventData file(String file)

Also in this package: AssetPackSearchResult, Builder, FileBrowserConfig, FileEntry, FileListProvider, RootEntry, ServerFileBrowser

Complete API:
  public String getFile()
  public String getRoot()
  public String getSearchQuery()
  public String getSearchResult()
  public boolean isBrowseRequested()
  public static FileBrowserEventData file(String file)

Fields:
public static final String KEY_FILE
public static final String KEY_ROOT
public static final String KEY_SEARCH_QUERY
public static final String KEY_SEARCH_RESULT
public static final String KEY_BROWSE
public static final BuilderCodec<FileBrowserEventData> CODEC
private String file
private String root
private String searchQuery
private String searchResult
private Boolean browse
