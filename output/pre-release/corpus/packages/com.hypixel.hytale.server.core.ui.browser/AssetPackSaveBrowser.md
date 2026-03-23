# AssetPackSaveBrowser

Type: class | Package: com.hypixel.hytale.server.core.ui.browser

public class AssetPackSaveBrowser

UI browser component for selecting or creating asset packs for saving prefabs. Manages pack list display with search filtering, directory filtering, pack selection, and new pack creation. Handles create-pack validation against existing packs and directory traversal safety.

Also in this package: ActionResult, AssetPackSaveBrowserConfig, AssetPackSaveBrowserEventData, AssetPackSearchResult, Builder, CreatePackResult, FileBrowserConfig, FileBrowserEventData, FileEntry, FileListProvider, ModsDirectory, PackEntry, PendingPack, RootEntry, ServerFileBrowser

Complete API:
  private List<AssetPackSaveBrowser.ModsDirectory> collectModsDirectories()
  private Path getDefaultTargetDirectory()
  private Path resolveTargetDirectory(String pathStr)
  private void populateTargetDirectoryDropdown(UICommandBuilder commandBuilder)
  private void populateDirectoryFilterDropdown(UICommandBuilder commandBuilder)
  private boolean packBelongsToDirectory(AssetPack pack, Path directory)
  public void setSelectedPackKey(String key)
  public void buildUI(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  public void buildEventBindings(UIEventBuilder eventBuilder, String browseButtonSelector)
  private void buildSearchInput(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  public void buildPackList(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  public boolean handleEvent(AssetPackSaveBrowserEventData data)
  public AssetPackSaveBrowser.ActionResult handleAction(String actionName, AssetPackSaveBrowserEventData data, String selectedPackLabelSelector)
  public AssetPack getSelectedPack()
  public boolean hasSelectedPack()
  public String getSelectedPackDisplayName()
  public AssetPackSaveBrowser.CreatePackResult createPack(AssetPackSaveBrowserEventData data)
  public boolean checkDuplicatePack(String name, String group)
  public void buildCreateFormValidation(UICommandBuilder commandBuilder, String name, String group)
  private List<AssetPackSaveBrowser.PackEntry> collectPackEntries()
  private static void disambiguateDisplayNames(List<AssetPackSaveBrowser.PackEntry> entries)
  private static String getPackDisplayName(AssetPack pack)

Fields:
private static final HytaleLogger LOGGER
private static final Value<String> BUTTON_SELECTED
private static final Value<String> TOOLTIP_STYLE
private static final Pattern INVALID_FILENAME_CHARS
private static final String DIRECTORY_FILTER_ALL
private final AssetPackSaveBrowserConfig config
private String searchQuery
private String selectedPackKey
private AssetPackSaveBrowser.PendingPack pendingPack
private String selectedDirectoryFilter
public static final String ACTION_OPEN_PACK_BROWSER
public static final String ACTION_CONFIRM_PACK_BROWSER
public static final String ACTION_CANCEL_PACK_BROWSER
public static final String ACTION_OPEN_CREATE_PACK
public static final String ACTION_CREATE_PACK
public static final String ACTION_CANCEL_CREATE_PACK
public static final String ACTION_PACK_SEARCH
public static final String ACTION_PACK_SELECT
