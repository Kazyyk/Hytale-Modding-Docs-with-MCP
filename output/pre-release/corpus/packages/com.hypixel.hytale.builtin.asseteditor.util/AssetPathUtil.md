# AssetPathUtil

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.util

public class AssetPathUtil

## Fields

- public static final String UNIX_FILE_SEPARATOR
- public static final String FILE_EXTENSION_JSON
- public static final String DIR_SERVER
- public static final String DIR_COMMON
- public static final Path PATH_DIR_COMMON
- public static final Path PATH_DIR_SERVER
- public static final Path EMPTY_PATH
- private static final Pattern INVALID_FILENAME_CHAR_REGEX
- private static final String[] RESERVED_NAMES

## Methods

- public static boolean isInvalidFileName(Path path)
- public static String removeInvalidFileNameChars(String name)
- @Nonnull private static String getIdFromPath(Path path)
