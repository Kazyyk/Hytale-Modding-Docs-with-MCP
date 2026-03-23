# SchemaConvertable

Type: interface | Package: com.hypixel.hytale.codec.schema

public interface SchemaConvertable<T>

## Methods

- @Nonnull Schema toSchema(SchemaContext var1)
- @Nonnull default Schema toSchema(SchemaContext context, T def)

Known implementors: Builder, BuilderFactory, Codec, SchemaGenerator, SchemaGenerator

Also in this package: NamedSchema, SchemaContext

Complete API:
  Schema toSchema(SchemaContext var1)
  default Schema toSchema(SchemaContext context, T def)
