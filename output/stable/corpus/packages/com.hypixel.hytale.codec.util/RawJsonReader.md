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

Also in this package: Documentation

Complete API:
  public char[] getBuffer()
  public int getBufferIndex()
  public int getBufferSize()
  public int getLine()
  public int getColumn()
  private boolean ensure()
  private boolean ensure(int n)
  private boolean fill()
  public int peek()
  public int peek(int n)
  public int read()
  public long skip(long skip)
  public int findOffset(char value)
  public int findOffset(int start, char value)
  public void skipOrThrow(long n)
  public boolean ready()
  public boolean markSupported()
  public void mark(int readAheadLimit)
  public boolean isMarked()
  public void mark()
  public void unmark()
  public int getMarkDistance()
  public char[] cloneMark()
  public void reset()
  public void close()
  public char[] closeAndTakeBuffer()
  public boolean peekFor(char consume)
  public boolean tryConsume(char consume)
  public boolean tryConsumeString(String str)
  public boolean tryConsume(String str)
  public boolean tryConsume(String str, int start)
  public int tryConsumeSome(String str, int start)
  public void expect(char expect)
  public void expect(String str, int start)
  public boolean tryConsumeOrExpect(char consume, char expect)
  public void consumeWhiteSpace()
  public void consumeIgnoreCase(String str, int start)
  public String readString()
  public String readRemainingString()
  public void skipString()
  public void skipRemainingString()
  public long readStringPartAsLong(int count)
  protected long readStringPartAsLongSlow(int count)
  protected long readStringPartAsLongUnsafe(int count)
  public boolean readBooleanValue()
  public void skipBooleanValue()
  public Void readNullValue()
  public void skipNullValue()
  public double readDoubleValue()
  public void skipDoubleValue()
  public float readFloatValue()
  public void skipFloatValue()
  public long readLongValue()
  public long readLongValue(int radix)
  public void skipLongValue()
  public void skipLongValue(int radix)
  public int readIntValue()
  public int readIntValue(int radix)
  public byte readByteValue()
  public byte readByteValue(int radix)
  public void skipIntValue()
  public void skipIntValue(int radix)
  public void skipObject()
  public void skipObjectContinued()
  public void skipArray()
  public void skipArrayContinued()
  public void skipValue()
  private IOException unexpectedEOF()
  private IOException unexpectedChar(char read)
  private IOException expecting(char read, char expect)
  private IOException expecting(char read, String expected)
  private IOException expectingWhile(char read, String expected, String reason)
  private IOException expecting(char read, String expected, int index)
  public String toString()
  private int findLineStart(int index)
  private int appendLine(StringBuilder sb, int index, int lineNumber)
  private int appendProblemLine(StringBuilder sb, int index, int lineNumber)
  public static RawJsonReader fromRawString(String str)
  public static RawJsonReader fromJsonString(String str)
  public static RawJsonReader fromPath(Path path, char[] buffer)
  public static RawJsonReader fromBuffer(char[] buffer)
  public static boolean equalsIgnoreCase(char c1, char c2)
  public static BsonDocument readBsonDocument(RawJsonReader reader)
  private static void readBsonDocument0(RawJsonReader reader, StringBuilder sb)
  public static BsonArray readBsonArray(RawJsonReader reader)
  private static void readBsonArray0(RawJsonReader reader, StringBuilder sb)
  public static BsonValue readBsonValue(RawJsonReader reader)
  public static boolean seekToKey(RawJsonReader reader, String search)
  public static String seekToKeyFromObjectStart(RawJsonReader reader, String search1, String search2)
  public static String seekToKeyFromObjectContinued(RawJsonReader reader, String search1, String search2)
  public static void validateBsonDocument(RawJsonReader reader)
  public static void validateBsonArray(RawJsonReader reader)
  public static void validateBsonValue(RawJsonReader reader)
  public static T readSync(Path path, Codec<T> codec, HytaleLogger logger)
  public static T readSyncWithBak(Path path, Codec<T> codec, HytaleLogger logger)

Fields:
public static final ThreadLocal<char[]> READ_BUFFER
public static final int DEFAULT_CHAR_BUFFER_SIZE
public static final int MIN_CHAR_BUFFER_READ
public static final int BUFFER_GROWTH
private static final int UNMARKED
private int streamIndex
private Reader in
private char[] buffer
private int bufferIndex
private int bufferSize
private int markIndex
private int markLine
private int markLineStart
private StringBuilder tempSb
private int line
private int lineStart
public static final int ERROR_LINES_BUFFER
