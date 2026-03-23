# EmptyExtraInfo

Type: class | Package: com.hypixel.hytale.codec

public class EmptyExtraInfo extends ExtraInfo

Singleton `ExtraInfo` implementation with no additional context. Used as the default when no extra decoding information is needed.

## Fields

- public static final | EmptyExtraInfo | EMPTY | Singleton instance

Also in this package: Codec, DirectDecodeCodec, DocumentContainingCodec, ExtraInfo, InheritCodec, KeyedCodec, PrimitiveCodec, RawJsonCodec, RawJsonInheritCodec, VersionedExtraInfo, WrappedCodec

Complete API:
  public void pushKey(String key)
  public void pushIntKey(int i)
  public void pushKey(String key, RawJsonReader reader)
  public void pushIntKey(int key, RawJsonReader reader)
  public void popKey()
  public void addUnknownKey(String key)
  public void ignoreUnusedKey(String key)
  public void popIgnoredUnusedKey()
  public String peekKey()
  public String peekKey(char separator)
  public List<String> getUnknownKeys()
  public void appendDetailsTo(StringBuilder sb)
  public String toString()

Fields:
public static final EmptyExtraInfo EMPTY
