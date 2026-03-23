# SchemaContext

Type: class | Package: com.hypixel.hytale.codec.schema

public class SchemaContext

## Fields

- private final Map<String,Schema> definitions
- private final Map<String,Schema> otherDefinitions
- private final Map<Object,String> nameMap
- private final Object2IntMap<String> nameCollisionCount
- private final Map<SchemaConvertable<?>,String> fileReferences

## Methods

- public void addFileReference(String fileName, SchemaConvertable<?> codec)
- @Nullable public Schema getFileReference(SchemaConvertable<?> codec)
- @Nonnull public Schema refDefinition(SchemaConvertable<?> codec)
- @Nonnull public Schema refDefinition(SchemaConvertable<T> convertable, T def)
- @Nullable public Schema getRawDefinition(BuilderCodec<?> codec)
- @Nullable public Schema getRawDefinition(NamedSchema namedSchema)
- @Nonnull public Map<String,Schema> getDefinitions()
- @Nonnull public Map<String,Schema> getOtherDefinitions()
- private String resolveName(NamedSchema namedSchema)
- @Nonnull private String resolveName(BuilderCodec<?> codec)
