# RawJsonReader

Type: class | Package: com.hypixel.hytale.codec.util | Implements: AutoCloseable

public class RawJsonReader implements AutoCloseable

Implements `AutoCloseable`.

## Constants

- public static final ThreadLocal<char[]> READ_BUFFER
- public static final int DEFAULT_CHAR_BUFFER_SIZE
- public static final int MIN_CHAR_BUFFER_READ
- public static final int BUFFER_GROWTH
- public static final int ERROR_LINES_BUFFER

## Fields

- private int streamIndex
- @Nullable private Reader in
- @Nullable private char[] buffer
- private int bufferIndex
- private int bufferSize
- private int markIndex
- private int markLine
- private int markLineStart
- private StringBuilder tempSb
- private int line
- private int lineStart
