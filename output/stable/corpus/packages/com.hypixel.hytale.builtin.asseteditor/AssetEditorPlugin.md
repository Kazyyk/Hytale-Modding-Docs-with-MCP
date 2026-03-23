# AssetEditorPlugin

Type: class | Package: com.hypixel.hytale.builtin.asseteditor | Extends: JavaPlugin

public class AssetEditorPlugin extends JavaPlugin

Central plugin entry point for the asset editor system. Manages the complete lifecycle of asset editing: client connections, asset pack data sources, JSON schema distribution, asset type registration, live asset updates, undo/redo, and asset export. Registered as a singleton via `instance`.

## Key Fields

- globalEditLock | StampedLock | Global lock for serializing edit operations
- uuidToEditorClients | Map<UUID, Set<EditorClient>> | Maps player UUIDs to their editor sessions
- clientOpenAssetPathMapping | Map<EditorClient, AssetPath> | Tracks which asset each client has open
- schemas | Map<String, Schema> | Loaded JSON schemas for asset types
- assetPackDataSources | Map<String, DataSource> | Data sources keyed by asset pack name
- assetTypeRegistry | AssetTypeRegistry | Registry of all asset type handlers
- undoRedoManager | UndoRedoManager | Per-asset undo/redo stack manager

## Static Access


public static AssetEditorPlugin get()

Returns the singleton instance.

## Setup

During `setup()`, the plugin:
1. Registers data sources for all existing asset packs
2. Registers `AssetEditorGamePacketHandler` as a sub-packet handler on `ServerManager`
3. Sets `AssetEditorPacketHandler` as the editor packet handler supplier on `InitialPacketHandler`
4. Registers `AssetStoreTypeHandler` for each `AssetStore` in the `AssetRegistry`
5. Registers `CommonAssetTypeHandler` instances for Texture (.png), Model (.blockymodel), Animation (.blockyanim), Sound (.ogg), UI (.ui), and Language (.lang)
6. Registers event listeners for asset store/pack registration, asset monitoring, translations, and common asset changes
7. Calls `AssetSpecificFunctionality.setup()` for model/item/weather preview handlers

## Key Methods

- DataSource registerDataSourceForPack(AssetPack) | Creates a `StandardDataSource` for an asset pack
- AssetTypeRegistry getAssetTypeRegistry() | Returns the asset type registry
- UndoRedoManager getUndoRedoManager() | Returns the undo/redo manager
- Map<EditorClient, AssetPath> getClientOpenAssetPathMapping() | Returns the client-to-open-asset mapping
- AssetPath getOpenAssetPath(EditorClient) | Returns the asset currently open by a client
- Set<EditorClient> getEditorClients(UUID) | Returns all editor clients for a player UUID
- Schema getSchema(String) | Returns a loaded JSON schema by name

## Inner Enums

### InitState

Tracks the plugin's initialization state for deferred client setup:
- `NOT_INITIALIZED` -- Plugin not yet initialized
- `INITIALIZING` -- In progress
- `INITIALIZED` -- Ready to serve clients

Also in this package: AssetEditorGamePacketHandler, AssetEditorPacketHandler, AssetPath, AssetSpecificFunctionality, AssetToDiscard, AssetTree, AssetTypeRegistry, DiscardResult, EditorClient, InitState, Messages, PlayerPreviewData, UndoRedoManager

Complete API:
  public static AssetEditorPlugin get()
  DataSource registerDataSourceForPack(AssetPack assetPack)
  protected void setup()
  protected void start()
  protected void shutdown()
  public DataSource getDataSourceForPath(AssetPath path)
  public DataSource getDataSourceForPack(String assetPack)
  public Collection<DataSource> getDataSources()
  public AssetTypeRegistry getAssetTypeRegistry()
  public Schema getSchema(String id)
  public Map<EditorClient,AssetPath> getClientOpenAssetPathMapping()
  public Set<EditorClient> getEditorClients(UUID uuid)
  private void sendPingPackets()
  private List<EditorClient> getClientsWithOpenAssetPath(AssetPath path)
  public AssetPath getOpenAssetPath(EditorClient editorClient)
  private void onRegisterAssetPack(AssetPackRegisterEvent event)
  private void onUnregisterAssetPack(AssetPackUnregisterEvent event)
  private void onI18nMessagesUpdated(MessagesUpdated event)
  private void onRegisterAssetStore(RegisterAssetStoreEvent event)
  private void onUnregisterAssetStore(RemoveAssetStoreEvent event)
  private void tryReinitializeAssetEditor()
  private void onAssetMonitor(AssetMonitorEvent<Void> event)
  public void handleInitializeEditor(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void handleInitializeClient(EditorClient editorClient)
  private void initializeAssetEditor(boolean updateLoadedAssets)
  private void initializeClient(EditorClient editorClient)
  public void handleEditorClientDisconnected(EditorClient editorClient, PacketHandler.DisconnectReason disconnectReason)
  public void handleDeleteAssetPack(EditorClient editorClient, String packId)
  public void handleUpdateAssetPack(EditorClient editorClient, String packId, AssetPackManifest packetManifest)
  public void handleCreateAssetPack(EditorClient editorClient, AssetPackManifest packetManifest, int requestToken)
  private static AssetPackManifest toManifestPacket(PluginManifest manifest)
  private void broadcastPackAddedOrUpdated(String packId, PluginManifest manifest)
  public void handleExportAssets(EditorClient editorClient, List<AssetPath> paths)
  public void handleSelectAsset(EditorClient editorClient, AssetPath assetPath)
  public void handleFetchLastModifiedAssets(EditorClient editorClient)
  public void handleAssetUpdate(EditorClient editorClient, AssetPath assetPath, byte[] data, int requestToken)
  public void handleJsonAssetUpdate(EditorClient editorClient, AssetPath assetPath, String assetType, int assetIndex, JsonUpdateCommand[] commands, int requestToken)
  public void handleUndo(EditorClient editorClient, AssetPath assetPath, int requestToken)
  public void handleRedo(EditorClient editorClient, AssetPath assetPath, int requestToken)
  public void handleFetchAsset(EditorClient editorClient, AssetPath assetPath, int requestToken)
  public void handleFetchJsonAssetWithParents(EditorClient editorClient, AssetPath assetPath, boolean isFromOpenedTab, int requestToken)
  public void handleRequestChildIds(EditorClient editorClient, AssetPath assetPath)
  public void handleDeleteAsset(EditorClient editorClient, AssetPath assetPath, int requestToken)
  public void handleSubscribeToModifiedAssetsChanges(EditorClient editorClient)
  public void handleUnsubscribeFromModifiedAssetsChanges(EditorClient editorClient)
  public void handleRenameAsset(EditorClient editorClient, AssetPath oldAssetPath, AssetPath newAssetPath, int requestToken)
  public void handleDeleteDirectory(EditorClient editorClient, AssetPath assetPath, int requestToken)
  public void handleRenameDirectory(EditorClient editorClient, AssetPath path, AssetPath newPath, int requestToken)
  public void handleCreateDirectory(EditorClient editorClient, AssetPath assetPath, int requestToken)
  public void handleCreateAsset(EditorClient editorClient, AssetPath assetPath, byte[] data, AssetEditorRebuildCaches rebuildCaches, String buttonId, int requestToken)
  private BsonDocument applyCommandsToAsset(byte[] bytes, AssetPath path, JsonUpdateCommand[] commands, AssetUpdateQuery.RebuildCacheBuilder rebuildCache)
  private void sendModifiedAssetsUpdateToConnectedUsers()
  private void sendPacketToAllEditorUsers(ToClientPacket packet)
  private void sendPacketToAllEditorUsersExcept(ToClientPacket packet, EditorClient ignoreEditorClient)
  private void updateAssetForConnectedClients(AssetPath assetPath)
  private void updateAssetForConnectedClients(AssetPath assetPath, EditorClient ignoreEditorClient)
  private void updateAssetForConnectedClients(AssetPath assetPath, byte[] bytes, EditorClient ignoreEditorClient)
  private void updateJsonAssetForConnectedClients(AssetPath assetPath, JsonUpdateCommand[] commands)
  private void updateJsonAssetForConnectedClients(AssetPath assetPath, JsonUpdateCommand[] commands, EditorClient ignoreEditorClient)
  private AssetEditorLastModifiedAssets buildAssetEditorLastModifiedAssetsPacket()
  boolean isValidPath(DataSource dataSource, AssetPath assetPath)

Fields:
private static AssetEditorPlugin instance
private final StampedLock globalEditLock
private final Map<UUID,Set<EditorClient>> uuidToEditorClients
private final Map<EditorClient,AssetPath> clientOpenAssetPathMapping
private final Set<EditorClient> clientsSubscribedToModifiedAssetsChanges
private Map<String,Schema> schemas
private AssetEditorSetupSchemas setupSchemasPacket
private final StampedLock initLock
private final Set<EditorClient> initQueue
private AssetEditorPlugin.InitState initState
private ScheduledFuture<?> scheduledReinitFuture
private final Map<String,DataSource> assetPackDataSources
private final AssetTypeRegistry assetTypeRegistry
private final UndoRedoManager undoRedoManager
private ScheduledFuture<?> pingClientsTask
