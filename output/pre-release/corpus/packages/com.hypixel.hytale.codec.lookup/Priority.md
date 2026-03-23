# Priority

Type: enum | Package: com.hypixel.hytale.codec.lookup | Extends: java.lang.Enum<Priority>

public enum Priority

Priority levels for codec registration in `ACodecMapCodec`. When multiple codecs can handle a document (e.g., with `allowDefault`), they are tried in priority order. Higher priority values are tried first.
