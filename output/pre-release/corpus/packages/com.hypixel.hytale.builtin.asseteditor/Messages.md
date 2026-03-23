# Messages

Type: class | Package: com.hypixel.hytale.builtin.asseteditor

public class Messages

Constants class holding all localization `Message` instances used by the asset editor module. Each field is a `Message.translation()` referencing a key under the `server.assetEditor.messages` namespace.

## Message Constants

- USAGE_DENIED | server.assetEditor.messages.usageDenied | Player lacks editor permission
- INVALID_FILE_NAME | server.assetEditor.messages.invalidFileName | File name validation failure
- DIRECTORY_OUTSIDE_ASSET_TYPE_ROOT | server.assetEditor.messages.directoryOutsideAssetTypeRoot | Directory path escapes root
- UNKNOWN_ASSET_PACK | server.assetEditor.messages.unknownAssetPack | Referenced pack not found
- ASSETS_READ_ONLY | server.assetEditor.messages.assetsReadOnly | Attempt to modify immutable pack
- UPDATE_DOESNT_EXIST | server.assetEditor.messages.update.doesntExist | Asset not found for update
- CREATE_ASSET_FAILED | server.assetEditor.messages.createAsset.failed | Asset creation failure
- UPDATE_FAILED | server.assetEditor.messages.update.failed | Asset update failure
- UNDO_EMPTY | server.assetEditor.messages.undo.empty | No actions to undo
- UNDO_FAILED | server.assetEditor.messages.undo.failed | Undo operation failed
- REDO_EMPTY | server.assetEditor.messages.redo.empty | No actions to redo
- REDO_FAILED | server.assetEditor.messages.redo.failed | Redo operation failed
- FETCH_ASSET_DOESNT_EXIST | server.assetEditor.messages.fetchAsset.doesntExist | Requested asset not found
- FETCH_ASSET_FAILED | server.assetEditor.messages.fetchAsset.failed | Asset fetch failed
- DELETE_ASSET_ALREADY_DELETED | server.assetEditor.messages.deleteAsset.alreadyDeleted | Asset already deleted
- FAILED_TO_DELETE_ASSET | server.assetEditor.messages.failedToDeleteAsset | Deletion failure
- RENAME_ASSET_ALREADY_EXISTS | server.assetEditor.messages.renameAsset.alreadyExists | Target name already taken
- RENAME_ASSET_DOESNT_EXIST | server.assetEditor.messages.renameAsset.doesntExist | Source asset not found
- RENAME_ASSET_FAILED | server.assetEditor.messages.renameAsset.failed | Rename failure
- CREATE_DIRECTORY_ALREADY_EXISTS | server.assetEditor.messages.createDirectory.alreadyExists | Directory already exists
- DELETE_DIRECTORY_NOT_EMPTY | server.assetEditor.messages.deleteDirectory.notEmpty | Cannot delete non-empty dir
- DELETE_DIRECTORY_FAILED | server.assetEditor.messages.deleteDirectory.failed | Directory deletion failure
- RENAME_DIRECTORY_UNSUPPORTED | server.assetEditor.messages.renameDirectory.unsupported | Directory rename not supported
- CREATE_DIRECTORY_NO_DATA_SOURCE | server.assetEditor.messages.createDirectory.noDataSource | No data source for pack
- CREATE_DIRECTORY_NO_PATH | server.assetEditor.messages.createDirectory.noPath | No path specified
- PARENT_DIRECTORY_MISSING | server.assetEditor.messages.parentDirectoryMissing | Parent directory does not exist
- FAILED_TO_CREATE_DIRECTORY | server.assetEditor.messages.failedToCreateDirectory | Directory creation failure
- CREATE_ASSET_ID_ALREADY_EXISTS | server.assetEditor.messages.createAsset.idAlreadyExists | Asset ID conflict
- MANIFEST_NOT_FOUND | server.assetEditor.messages.manifestNotFound | Pack manifest missing
- INVALID_VERSION_FORMAT | server.assetEditor.messages.invalidVersionFormat | Semver parse failure
- MANIFEST_SAVED | server.assetEditor.messages.manifestSaved | Manifest save success
- MANIFEST_SAVE_FAILED | server.assetEditor.messages.manifestSaveFailed | Manifest save failure
- PACK_NAME_REQUIRED | server.assetEditor.messages.packNameRequired | Pack name not provided
- PACK_GROUP_REQUIRED | server.assetEditor.messages.packGroupRequired | Pack group not provided
- PACK_ALREADY_EXISTS | server.assetEditor.messages.packAlreadyExists | Pack name conflict
- PACK_OUTSIDE_DIRECTORY | server.assetEditor.messages.packOutsideDirectory | Pack path escapes allowed dirs
- PACK_ALREADY_EXISTS_AT_PATH | server.assetEditor.messages.packAlreadyExistsAtPath | Pack already at target path
- PACK_CREATED | server.assetEditor.messages.packCreated | Pack creation success
- PACK_CREATION_FAILED | server.assetEditor.messages.packCreationFailed | Pack creation failure
- UNKNOWN_ASSET_INDEX | server.assetEditor.messages.unknownAssetIndex | Invalid asset index
- DIRECTORY_OUTSIDE_ROOT | server.assetEditor.messages.directoryOutsideRoot | Path escapes root
- INVALID_ASSET_TYPE | server.assetEditor.messages.invalidAssetType | Unknown asset type
- REQUEST_CHILD_IDS_ASSET_TYPE_MISSING | server.assetEditor.messages.requestChildIds.assetTypeMissing | Asset type not specified
- INVALID_TARGET_DIRECTORY | server.assetEditor.messages.invalidTargetDirectory | Target directory invalid

Also in this package: AssetEditorGamePacketHandler, AssetEditorPacketHandler, AssetEditorPlugin, AssetPath, AssetSpecificFunctionality, AssetToDiscard, AssetTree, AssetTypeRegistry, DiscardResult, EditorClient, InitState, PlayerPreviewData, UndoRedoManager

Fields:
public static final Message USAGE_DENIED
public static final Message INVALID_FILE_NAME
public static final Message DIRECTORY_OUTSIDE_ASSET_TYPE_ROOT
public static final Message UNKNOWN_ASSET_PACK
public static final Message ASSETS_READ_ONLY
public static final Message UPDATE_DOESNT_EXIST
public static final Message CREATE_ASSET_FAILED
public static final Message UPDATE_FAILED
public static final Message PACK_OUTSIDE_DIRECTORY
public static final Message PACK_ALREADY_EXISTS_AT_PATH
public static final Message PACK_CREATED
public static final Message PACK_CREATION_FAILED
public static final Message UNKNOWN_ASSET_INDEX
public static final Message DIRECTORY_OUTSIDE_ROOT
public static final Message INVALID_ASSET_TYPE
public static final Message UNDO_EMPTY
public static final Message UNDO_FAILED
public static final Message REDO_EMPTY
public static final Message REDO_FAILED
public static final Message FETCH_ASSET_DOESNT_EXIST
public static final Message FETCH_ASSET_FAILED
public static final Message REQUEST_CHILD_IDS_ASSET_TYPE_MISSING
public static final Message DELETE_ASSET_ALREADY_DELETED
public static final Message FAILED_TO_DELETE_ASSET
public static final Message RENAME_ASSET_ALREADY_EXISTS
public static final Message RENAME_ASSET_DOESNT_EXIST
public static final Message RENAME_ASSET_FAILED
public static final Message CREATE_DIRECTORY_ALREADY_EXISTS
public static final Message DELETE_DIRECTORY_NOT_EMPTY
public static final Message DELETE_DIRECTORY_FAILED
public static final Message RENAME_DIRECTORY_UNSUPPORTED
public static final Message CREATE_DIRECTORY_NO_DATA_SOURCE
public static final Message CREATE_DIRECTORY_NO_PATH
public static final Message PARENT_DIRECTORY_MISSING
public static final Message FAILED_TO_CREATE_DIRECTORY
public static final Message CREATE_ASSET_ID_ALREADY_EXISTS
public static final Message MANIFEST_NOT_FOUND
public static final Message INVALID_VERSION_FORMAT
public static final Message MANIFEST_SAVED
public static final Message MANIFEST_SAVE_FAILED
public static final Message PACK_NAME_REQUIRED
public static final Message PACK_GROUP_REQUIRED
public static final Message PACK_ALREADY_EXISTS
public static final Message INVALID_TARGET_DIRECTORY
