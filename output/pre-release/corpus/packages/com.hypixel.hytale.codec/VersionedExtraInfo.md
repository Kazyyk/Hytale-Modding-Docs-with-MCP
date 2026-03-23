# VersionedExtraInfo

Type: class | Package: com.hypixel.hytale.codec | Extends: ExtraInfo

public class VersionedExtraInfo extends ExtraInfo

`ExtraInfo` implementation that includes a version number, enabling version-aware codec decode logic.

Also in this package: Codec, DirectDecodeCodec, DocumentContainingCodec, EmptyExtraInfo, ExtraInfo, InheritCodec, KeyedCodec, PrimitiveCodec, RawJsonCodec, RawJsonInheritCodec, WrappedCodec

Complete API:
  public int getVersion()
  public int getKeysSize()
  public CodecStore getCodecStore()
  public void pushKey(String key)
  public void pushIntKey(int key)
  public void pushKey(String key, RawJsonReader reader)
  public void pushIntKey(int key, RawJsonReader reader)
  public void popKey()
  public void ignoreUnusedKey(String key)
  public void popIgnoredUnusedKey()
  public boolean consumeIgnoredUnknownKey(RawJsonReader reader)
  public boolean consumeIgnoredUnknownKey(String key)
  public void readUnknownKey(RawJsonReader reader)
  public void addUnknownKey(String key)
  public String peekKey()
  public String peekKey(char separator)
  public List<String> getUnknownKeys()
  public ValidationResults getValidationResults()
  public Map<String,Object> getMetadata()
  public void appendDetailsTo(StringBuilder sb)
  public int getLegacyVersion()

Fields:
private final int version
private final ExtraInfo delegate
