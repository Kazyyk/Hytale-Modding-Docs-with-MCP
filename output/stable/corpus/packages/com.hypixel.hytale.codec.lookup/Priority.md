# Priority

Type: enum | Package: com.hypixel.hytale.codec.lookup | Extends: java.lang.Enum<Priority>

public enum Priority

Priority levels for codec registration in `ACodecMapCodec`. When multiple codecs can handle a document (e.g., with `allowDefault`), they are tried in priority order. Higher priority values are tried first.

Also in this package: ACodecMapCodec, AMapProvidedMapCodec, BuilderCodecMapCodec, CodecMapCodec, CodecPriority, MapKeyMapCodec, MapProvidedMapCodec, ObjectCodecMapCodec, StringCodecMapCodec, TypeMap, UnknownIdException

Complete API:
  public int getLevel()
  public Priority before()
  public Priority before(int by)
  public Priority after()
  public Priority after(int by)
  public boolean equals(Object o)
  public int hashCode()

Fields:
public static Priority DEFAULT
public static Priority NORMAL
private int level
