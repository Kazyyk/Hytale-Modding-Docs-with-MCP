# AssetEditorGamePacketHandler

Type: class | Package: com.hypixel.hytale.builtin.asseteditor | Implements: SubPacketHandler

public class AssetEditorGamePacketHandler implements SubPacketHandler

Handles asset editor packets arriving through the in-game client connection. Registered as a sub-packet handler on `ServerManager`. Supports two packet types: `AssetEditorInitialize` (packet ID 302) for opening the editor, and `AssetEditorUpdateJsonAsset` (packet ID 323, deprecated) for inline JSON updates.

When the plugin is disabled, both packet IDs are registered as no-ops.

## Constructor


public AssetEditorGamePacketHandler(IPacketHandler packetHandler)

## Key Methods

- void registerHandlers() | Registers packet handlers or no-ops based on plugin state
- void handle(AssetEditorInitialize) | Authorizes the player via `hytale.editor.asset` permission, sends `AssetEditorAuthorization`, and initializes the editor
- void handle(AssetEditorUpdateJsonAsset) | Deprecated. Creates a mock `EditorClient` from the `PlayerRef` and dispatches JSON update asynchronously

## Permission

Requires the `hytale.editor.asset` permission. Players without this permission receive an `AssetEditorAuthorization(false)` response or the `Messages.USAGE_DENIED` message.

Also in this package: AssetEditorPacketHandler, AssetEditorPlugin, AssetPath, AssetSpecificFunctionality, AssetToDiscard, AssetTree, AssetTypeRegistry, DiscardResult, EditorClient, InitState, Messages, PlayerPreviewData, UndoRedoManager

Complete API:
  public void registerHandlers()
  public void handle(AssetEditorInitialize packet)
  public void handle(AssetEditorUpdateJsonAsset packet)
  private boolean lacksPermission(Player player, boolean shouldShowDenialMessage)

Fields:
private static final HytaleLogger LOGGER
private final IPacketHandler packetHandler
