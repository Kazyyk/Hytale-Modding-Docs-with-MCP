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

Also in this package: AssetStoreUtil, BsonTransformationUtil

Complete API:
  public static boolean isInvalidFileName(Path path)
  public static String removeInvalidFileNameChars(String name)
  private static String getIdFromPath(Path path)

Fields:
public static final String UNIX_FILE_SEPARATOR
public static final String FILE_EXTENSION_JSON
public static final String DIR_SERVER
public static final String DIR_COMMON
public static final Path PATH_DIR_COMMON
public static final Path PATH_DIR_SERVER
public static final Path EMPTY_PATH
private static final Pattern INVALID_FILENAME_CHAR_REGEX
private static final String[] RESERVED_NAMES
