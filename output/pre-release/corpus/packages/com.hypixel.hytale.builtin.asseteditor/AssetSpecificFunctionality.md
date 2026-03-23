# AssetSpecificFunctionality

Type: class | Package: com.hypixel.hytale.builtin.asseteditor

@Deprecated
public class AssetSpecificFunctionality

Static event handlers for asset-type-specific editor functionality. Provides live preview for models, items, and weather; handles equipping items and applying models to the player entity; and serves auto-complete data for block groups, localization keys, and item categories.

Marked `@Deprecated` -- purpose unknown, likely scheduled for refactoring.

## Setup


public static void setup()

Registers event handlers on the asset editor's `EventRegistry`:
- `LoadedAssetsEvent<ModelAsset>` / `LoadedAssetsEvent<Item>` -- Updates model previews for open editors when assets reload
- `AssetEditorActivateButtonEvent("EquipItem")` -- Equips an item on the player
- `AssetEditorActivateButtonEvent("UseModel")` -- Applies a model to the player
- `AssetEditorActivateButtonEvent("ResetModel")` -- Resets the player's model to their auth skin
- `AssetEditorUpdateWeatherPreviewLockEvent` -- Toggles weather preview lock
- `AssetEditorAssetCreatedEvent(Item/Model)` -- Handles post-creation equip/apply
- `AssetEditorFetchAutoCompleteDataEvent("BlockGroups"/"LocalizationKeys")` -- Serves auto-complete data
- `AssetEditorRequestDataSetEvent("ItemCategories")` -- Serves item category list
- `AssetEditorSelectAssetEvent` -- Updates model/weather preview on asset selection
- `AssetEditorClientDisconnectEvent` -- Cleans up weather/time overrides

## Key Static Methods

- AssetEditorUpdateModelPreview getModelPreviewPacketForItem(AssetPath, Item) | Builds a model preview packet for an item with icon camera settings
- AssetIconProperties getDefaultItemIconProperties(Item) | Returns default camera settings based on item type (weapon, tool, armor, generic)
- Model convertToModelPacket(Item) | Converts an item's model/texture to a protocol `Model` packet
- void resetTimeSettings(EditorClient, PlayerRef) | Sends game time and day/night duration to the editor
- void handleWeatherOrEnvironmentSelected(EditorClient, Path, boolean) | Applies weather preview override
- void handleWeatherOrEnvironmentUnselected(EditorClient, Path, boolean) | Clears weather preview override

## Inner Classes

### PlayerPreviewData

Tracks per-player preview state:

- weatherAssetPath | Path | Currently previewed weather asset (nullable)
- keepPreview | boolean | Whether preview persists across asset selection changes

Also in this package: AssetEditorGamePacketHandler, AssetEditorPacketHandler, AssetEditorPlugin, AssetPath, AssetToDiscard, AssetTree, AssetTypeRegistry, DiscardResult, EditorClient, InitState, Messages, PlayerPreviewData, UndoRedoManager

Complete API:
  public static void setup()
  private static PlayerRef tryGetPlayer(EditorClient editorClient)
  private static void onModelAssetLoaded(LoadedAssetsEvent<String,ModelAsset,?> event)
  private static void onItemAssetLoaded(LoadedAssetsEvent<String,Item,?> event)
  private static void onItemAssetCreated(AssetEditorAssetCreatedEvent event)
  private static void onModelAssetCreated(AssetEditorAssetCreatedEvent event)
  private static void onEquipItem(AssetEditorActivateButtonEvent event)
  private static void onUseModel(AssetEditorActivateButtonEvent event)
  private static void onUpdateWeatherPreviewLockEvent(AssetEditorUpdateWeatherPreviewLockEvent event)
  private static void onResetModel(AssetEditorActivateButtonEvent event)
  private static void equipItem(Path assetPath, EditorClient editorClient)
  private static void useModel(Path assetPath, EditorClient editorClient)
  private static void onRequestLocalizationKeyDataSet(AssetEditorFetchAutoCompleteDataEvent event)
  private static void onRequestBlockGroupsDataSet(AssetEditorFetchAutoCompleteDataEvent event)
  private static void onRequestItemCategoriesDataSet(AssetEditorRequestDataSetEvent event)
  private static void onClientDisconnected(AssetEditorClientDisconnectEvent event)
  static void resetTimeSettings(EditorClient editorClient, PlayerRef playerRef)
  static void handleWeatherOrEnvironmentUnselected(EditorClient editorClient, Path assetPath, boolean wasWeather)
  static void handleWeatherOrEnvironmentSelected(EditorClient editorClient, Path assetPath, boolean isWeather)
  private static void onSelectAsset(AssetEditorSelectAssetEvent event)
  public static AssetEditorUpdateModelPreview getModelPreviewPacketForItem(AssetPath assetPath, Item item)
  public static AssetIconProperties getDefaultItemIconProperties(Item item)
  public static Model convertToModelPacket(Item item)
  private static EventRegistry getEventRegistry()

Fields:
private static final Message NO_GAME_CLIENT_MESSAGE
private static final ClearEditorTimeOverride CLEAR_EDITOR_TIME_OVERRIDE_PACKET
private static final UpdateEditorWeatherOverride CLEAR_WEATHER_OVERRIDE_PACKET
private static final String MODEL_ASSET_ID
private static final String ITEM_ASSET_ID
private static final String WEATHER_ASSET_ID
private static final String ENVIRONMENT_ASSET_ID
private static final Map<UUID,AssetSpecificFunctionality.PlayerPreviewData> activeWeatherPreviewMapping
private static final AssetEditorPreviewCameraSettings DEFAULT_PREVIEW_CAMERA_SETTINGS
