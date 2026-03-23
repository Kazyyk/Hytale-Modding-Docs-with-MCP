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
