# ExtraInfo

Type: interface | Package: com.hypixel.hytale.codec

public abstract class ExtraInfo

Abstract base class providing contextual information during codec encode/decode operations. Tracks key paths for error reporting and provides push/pop operations for navigating nested structures.

## Methods

- public void pushKey(String key, RawJsonReader reader)
- public void pushIntKey(int key, RawJsonReader reader)
- public void popKey()
- public String getKeyPath()

Known subclasses: AssetExtraInfo, BlockMigrationExtraInfo, EmptyExtraInfo, VersionedExtraInfo

Also in this package: Codec, DirectDecodeCodec, DocumentContainingCodec, EmptyExtraInfo, InheritCodec, KeyedCodec, PrimitiveCodec, RawJsonCodec, RawJsonInheritCodec, VersionedExtraInfo, WrappedCodec

Complete API:
  public int getVersion()
  public int getLegacyVersion()
  public int getKeysSize()
  public CodecStore getCodecStore()
  private int nextKeyIndex()
  public void pushKey(String key)
  public void pushIntKey(int key)
  public void pushKey(String key, RawJsonReader reader)
  public void pushIntKey(int key, RawJsonReader reader)
  public void popKey()
  private int nextIgnoredUnknownIndex()
  public void ignoreUnusedKey(String key)
  public void popIgnoredUnusedKey()
  public boolean consumeIgnoredUnknownKey(RawJsonReader reader)
  public boolean consumeIgnoredUnknownKey(String key)
  public void readUnknownKey(RawJsonReader reader)
  public void addUnknownKey(String key)
  public String peekKey()
  public String peekKey(char separator)
  public int peekLine()
  public int peekColumn()
  public List<String> getUnknownKeys()
  public ValidationResults getValidationResults()
  public Map<String,Object> getMetadata()
  public void appendDetailsTo(StringBuilder sb)
  public String toString()
  private static int grow(int oldSize)

Fields:
public static final ThreadLocal<ExtraInfo> THREAD_LOCAL
public static final String GENERATED_ID_PREFIX
public static final int UNSET_VERSION
private final int legacyVersion
private final int keysInitialSize
private String[] stringKeys
private int[] intKeys
private int[] lineNumbers
private int[] columnNumbers
private int keysSize
private String[] ignoredUnknownKeys
private int ignoredUnknownSize
private final List<String> unknownKeys
private final ValidationResults validationResults
private final CodecStore codecStore
private final Map<String,Object> metadata
