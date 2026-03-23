# AssetTypeRegistry

Type: class | Package: com.hypixel.hytale.builtin.asseteditor

public class AssetTypeRegistry

Registry mapping asset type IDs to their AssetTypeHandler instances. Backed by a `ConcurrentHashMap`. Provides lookup by ID, lookup by file path (matching extension and path prefix), and packet generation for sending the full type list to editor clients.

## Key Methods

- void registerAssetType(AssetTypeHandler) | Registers a handler; throws if ID already registered
- void unregisterAssetType(AssetTypeHandler) | Removes a handler by ID
- AssetTypeHandler getAssetTypeHandler(String id) | Looks up a handler by asset type ID
- AssetTypeHandler getAssetTypeHandlerForPath(Path) | Finds the handler matching a file path's extension and prefix
- boolean isPathInAssetTypeFolder(Path) | Checks if a path falls within any registered asset type's root
- AssetTypeHandler tryGetAssetTypeHandler(Path, EditorClient, int) | Looks up handler with error messaging on failure
- void sendPacket(EditorClient) | Sends the cached `AssetEditorSetupAssetTypes` packet
- void setupPacket() | Builds the setup packet from all registered handlers
- Map<String, AssetTypeHandler> getRegisteredAssetTypeHandlers() | Returns the full handler map

Also in this package: AssetEditorGamePacketHandler, AssetEditorPacketHandler, AssetEditorPlugin, AssetPath, AssetSpecificFunctionality, AssetToDiscard, AssetTree, DiscardResult, EditorClient, InitState, Messages, PlayerPreviewData, UndoRedoManager

Complete API:
  public Map<String,AssetTypeHandler> getRegisteredAssetTypeHandlers()
  public void registerAssetType(AssetTypeHandler assetType)
  public void unregisterAssetType(AssetTypeHandler assetType)
  public AssetTypeHandler getAssetTypeHandler(String id)
  public AssetTypeHandler getAssetTypeHandlerForPath(Path path)
  public boolean isPathInAssetTypeFolder(Path path)
  public AssetTypeHandler tryGetAssetTypeHandler(Path assetPath, EditorClient editorClient, int requestToken)
  public void sendPacket(EditorClient editorClient)
  public void setupPacket()

Fields:
private static final HytaleLogger LOGGER
private final ConcurrentHashMap<String,AssetTypeHandler> assetTypeHandlers
private AssetEditorSetupAssetTypes setupPacket
