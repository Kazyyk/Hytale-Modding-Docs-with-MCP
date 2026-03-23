# Content

Type: interface | Package: com.hypixel.hytale.builtin.worldgen.modifier.content

public interface Content

Interface for world-gen modifier content. Implementations provide JSON data to be added to target content lists.

## Methods


@Nonnull
    JsonElement get()

Known implementors: FileRef

Also in this package: FileRef

Complete API:
  JsonElement get()

Fields:
String TYPE_KEY
Content[] EMPTY_ARRAY
CodecMapCodec<Content> TYPE_CODEC
ArrayCodec<Content> ARRAY_CODEC
