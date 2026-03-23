# AssetPathUtil

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.util

public class AssetPathUtil

Static utility class for file path validation and manipulation within the asset editor.

## Constants

- UNIX_FILE_SEPARATOR | String | "/" | Unix path separator
- FILE_EXTENSION_JSON | String | ".json" | JSON file extension
- DIR_SERVER | String | "Server" | Server directory name
- DIR_COMMON | String | "Common" | Common directory name
- PATH_DIR_COMMON | Path | Paths.get("Common") | Path constant for Common
- PATH_DIR_SERVER | Path | Paths.get("Server") | Path constant for Server
- EMPTY_PATH | Path | Path.of("") | Empty path constant

## Key Methods

- boolean isInvalidFileName(Path) | Returns true if the filename contains invalid characters (control chars, `<>:" | ?*`), ends with a dot, or matches a Windows reserved name (CON, PRN, AUX, NUL, COM1-9, LPT1-9)
- String removeInvalidFileNameChars(String) | Strips characters matching `[<>:" | ?*/\\]
