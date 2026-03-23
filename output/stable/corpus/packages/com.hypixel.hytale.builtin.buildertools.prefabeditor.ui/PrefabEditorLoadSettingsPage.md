# PrefabEditorLoadSettingsPage

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor.ui | Extends: InteractiveCustomUIPage

public class PrefabEditorLoadSettingsPage extends InteractiveCustomUIPage<PrefabEditorLoadSettingsPage.PageData>

Full-featured custom UI page for configuring and initiating a prefab editing session. Provides dropdowns for root directory, world generation type, environment, stacking axis, alignment method, and row split mode. Includes an integrated file browser supporting both asset pack virtual paths and filesystem paths, a saved configurations system, and a loading progress overlay with cancel support.

## Fields

- savedConfigsDropdown | List<DropdownEntryInfo> | Dropdown entries for saved configuration presets.
- isLoading | boolean | Whether a prefab load operation is in progress.
- loadingCancelled | boolean | Whether the current load was cancelled by the user.
- isShuttingDown | boolean | Whether a cancellation shutdown is in progress.
- currentLoadingState | PrefabLoadingState | Current loading progress state.
- browserRoot | Path | Root directory for the file browser.
- browserCurrent | Path | Current directory within the browser.
- selectedItems | List<String> | List of selected items for multi-select loading.
- assetProvider | AssetPrefabFileProvider | Asset pack file provider for browsing.

## Constructor


public PrefabEditorLoadSettingsPage(@Nonnull PlayerRef playerRef)

## Methods

- build(Ref<EntityStore>, UICommandBuilder, UIEventBuilder, Store<EntityStore>) | void | Builds the complete settings form, browser, and loading overlays.
- handleDataEvent(Ref<EntityStore>, Store<EntityStore>, PageData) | void | Routes UI events to the appropriate handler: Load, Cancel, SavePropertiesConfig, ApplySavedProperties, CancelLoading, OpenBrowser, BrowserNavigate, BrowserSearch, ConfirmBrowser, and others.

## Inner Types

### Action (enum)

All possible UI actions for this page.

- Load | Begin loading prefabs with current settings.
- OpenSavePropertiesDialog | Open the save-properties sub-page.
- CancelSavePropertiesDialog | Close the save-properties sub-page.
- SavePropertiesConfig | Persist current settings as a named configuration.
- ApplySavedProperties | Apply a previously saved configuration.
- Cancel | Close the page without loading.
- CancelLoading | Cancel an in-progress load operation.
- SavePropertiesNameChanged | Enables/disables save button based on name input.
- OpenBrowser | Open the file browser overlay.
- BrowserNavigate | Navigate into a directory or select a file.
- BrowserRootChanged | Switch the browser root directory.
- BrowserSearch | Filter browser entries by search query.
- AddFolderToList | Add the current browser path to the selection list.
- ConfirmBrowser | Apply browser selection and return to main form.
- CancelBrowser | Close the browser without applying selection.

### PageData (class)

Codec-backed data class containing all form fields (root directory, prefab paths, Y level, blocks between prefabs, world gen type, environment, grass tint, stacking axis, alignment, row split mode, recursive, children, entities, world ticking) plus browser event fields.

## See Also

- PrefabEditorExitConfirmPage
- PrefabEditorSaveSettingsPage

Also in this package: Action, Action, Action, PageData, PageData, PageData, PageData, PrefabEditorExitConfirmPage, PrefabEditorSaveSettingsPage, PrefabTeleportPage

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, PrefabEditorLoadSettingsPage.PageData data)
  private void onLoadingProgress(PrefabLoadingState state)
  private void onLoadingFailed(Message errorMessage)
  private void onShutdownProgress(PrefabLoadingState state)
  private void handleAssetsNavigation(String fileName)
  private void handleRegularNavigation(String fileName)
  private String getCurrentBrowserPath()
  private void buildBrowserList(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private void buildAssetsBrowserList(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private void buildRegularBrowserList(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private List<DropdownEntryInfo> buildBrowserRootEntries()
  private Path findActualRootPath(String pathStr)
  private AssetPack findAssetPackForPath(String pathStr)
  private PrefabRootDirectory getRootDirectoryForPath(String pathStr)
  private boolean isAllowedBrowserRoot(String pathStr)
  private String getRootDisplayPath(Path root)

Fields:
private static final HytaleLogger LOGGER
private static final Value<String> BUTTON_HIGHLIGHTED
private static final String ASSETS_ROOT_KEY
private final List<DropdownEntryInfo> savedConfigsDropdown
private volatile boolean isLoading
private volatile boolean loadingCancelled
private volatile boolean isShuttingDown
private PrefabLoadingState currentLoadingState
private String loadingWorldName
private Path browserRoot
private Path browserCurrent
private String selectedPath
private String browserSearchQuery
private final List<String> selectedItems
private final AssetPrefabFileProvider assetProvider
private boolean inAssetsRoot
private Path assetsCurrentDir
