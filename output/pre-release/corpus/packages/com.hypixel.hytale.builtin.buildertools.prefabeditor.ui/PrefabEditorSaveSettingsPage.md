# PrefabEditorSaveSettingsPage

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor.ui | Extends: InteractiveCustomUIPage

public class PrefabEditorSaveSettingsPage extends InteractiveCustomUIPage<PrefabEditorSaveSettingsPage.PageData>

Custom UI page for saving prefab data back to disk. Provides checkboxes for save options (entities, empty blocks, overwrite existing, clear support values) and an integrated prefab browser with fuzzy search for selecting which prefabs to save. Includes a saving progress overlay with error reporting. Read-only prefabs are automatically redirected to the server prefabs directory.

## Constants

- PROGRESS_UPDATE_INTERVAL_MS | long | 100 | Minimum milliseconds between progress UI updates.

## Fields

- prefabEditSession | PrefabEditSession | The active edit session.
- isSaving | boolean | Whether a save operation is in progress.
- browserSearchQuery | String | Current search query in the prefab browser.
- selectedPrefabUuids | Set<UUID> | UUIDs of prefabs selected in the browser.

## Constructor


public PrefabEditorSaveSettingsPage(@Nonnull PlayerRef playerRef, @Nonnull PrefabEditSession prefabEditSession)

## Methods

- build(Ref<EntityStore>, UICommandBuilder, UIEventBuilder, Store<EntityStore>) | void | Constructs the save settings form, browser, and saving progress overlays.
- handleDataEvent(Ref<EntityStore>, Store<EntityStore>, PageData) | void | Handles Save, Cancel, SelectAll, SelectEdited, OpenBrowser, BrowserSearch, BrowserTogglePrefab, BrowserSelectAll, ConfirmBrowser, CancelBrowser, and BackFromSaving actions.

## Inner Types

### Action (enum)

- Save | Execute save with current settings.
- Cancel | Close without saving.
- SelectAll | Select all loaded prefabs for saving.
- SelectEdited | Select only dirty prefabs.
- OpenBrowser | Open the prefab browser overlay.
- BrowserSearch | Filter prefabs by search query.
- BrowserTogglePrefab | Toggle selection of a single prefab.
- BrowserSelectAll | Select all prefabs in browser.
- ConfirmBrowser | Apply browser selection.
- CancelBrowser | Close browser without applying.
- BackFromSaving | Return to main form after a save attempt.

### PageData (class)

Codec-backed data class with fields for save options (prefabsToSave, entities, empty, overwrite, clearSupport), browser search, and prefab UUID.

## See Also

- PrefabEditorExitConfirmPage
- PrefabEditorLoadSettingsPage

Also in this package: Action, Action, Action, Action, PageData, PageData, PageData, PageData, PageData, PrefabEditorExitConfirmPage, PrefabEditorLoadOptionsPage, PrefabEditorLoadSettingsPage, PrefabTeleportPage

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, PrefabEditorSaveSettingsPage.PageData data)
  private void buildPrefabList(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private String toDisplayPath(PrefabEditingMetadata metadata)
  private Path getWritableSavePath(PrefabEditingMetadata metadata)
  private void onSavingFailed(Message errorMessage)

Fields:
private static final HytaleLogger LOGGER
private static final Value<String> BUTTON_HIGHLIGHTED
private static final Value<String> BUTTON_SELECTED
private final PrefabEditSession prefabEditSession
private final AssetPackSaveBrowser packBrowser
private final boolean exitOnSave
private volatile boolean isSaving
private volatile long lastProgressUpdateTime
private static final long PROGRESS_UPDATE_INTERVAL_MS
private String browserSearchQuery
private final Set<UUID> selectedPrefabUuids
