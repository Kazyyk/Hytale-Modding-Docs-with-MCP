# AssetPackSaveBrowserEventData

Type: class | Package: com.hypixel.hytale.server.core.ui.browser

public class AssetPackSaveBrowserEventData

Data class carrying event data from the asset pack browser UI. Contains fields for pack selection, search query, create-pack form fields (name, group, description, version, website, author), validation, target directory, and directory filter.

Also in this package: ActionResult, AssetPackSaveBrowser, AssetPackSaveBrowserConfig, AssetPackSearchResult, Builder, CreatePackResult, FileBrowserConfig, FileBrowserEventData, FileEntry, FileListProvider, ModsDirectory, PackEntry, PendingPack, RootEntry, ServerFileBrowser

Complete API:
  public String getPack()
  public String getSearch()
  public String getCreateName()
  public String getCreateGroup()
  public String getCreateDescription()
  public String getCreateVersion()
  public String getCreateWebsite()
  public String getCreateAuthorName()
  public String getValidateCreate()
  public String getCreateTargetDir()
  public String getDirectoryFilter()

Fields:
public static final String KEY_PACK
public static final String KEY_SEARCH
public static final String KEY_CREATE_NAME
public static final String KEY_CREATE_GROUP
public static final String KEY_CREATE_DESCRIPTION
public static final String KEY_CREATE_VERSION
public static final String KEY_CREATE_WEBSITE
public static final String KEY_CREATE_AUTHOR_NAME
public static final String KEY_VALIDATE_CREATE
public static final String KEY_CREATE_TARGET_DIR
public static final String KEY_DIRECTORY_FILTER
public static final BuilderCodec<AssetPackSaveBrowserEventData> CODEC
public String pack
public String search
public String createName
public String createGroup
public String createDescription
public String createVersion
public String createWebsite
public String createAuthorName
public String validateCreate
public String createTargetDir
public String directoryFilter
