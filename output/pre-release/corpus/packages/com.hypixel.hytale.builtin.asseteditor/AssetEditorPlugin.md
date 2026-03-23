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
