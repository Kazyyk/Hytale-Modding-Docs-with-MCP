# DocumentContainingCodec

Type: class | Package: com.hypixel.hytale.codec | Extends: BsonFunctionCodec<T>

@Deprecated
public class DocumentContainingCodec<T> extends BsonFunctionCodec<T>

Deprecated codec that preserves unknown fields from a BSON document alongside the known decoded fields. Strips known keys during decode and merges extra keys during encode.
