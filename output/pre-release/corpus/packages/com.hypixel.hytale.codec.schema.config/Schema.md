# Schema

Type: class | Package: com.hypixel.hytale.codec.schema.config

public class Schema

Base class for the Hytale JSON Schema configuration system. Represents a JSON Schema node with support for standard JSON Schema keywords (`$id`, `type`, `title`, `description`, `anyOf`, `oneOf`, `allOf`, `not`, `if`/`then`/`else`, `required`, `default`, `definitions`, `$ref`, `$data`) plus Hytale-specific extensions (`hytale`, `hytaleParent`, `hytaleSchemaTypeField`, `hytaleAssetRef`, `hytaleCustomAssetRef`, `doNotSuggest`). Uses a polymorphic `ObjectCodecMapCodec` discriminated on the `type` field.

## Static Fields

- ObjectCodecMapCodec<String, Schema> CODEC
- ArrayCodec<Schema> ARRAY_CODEC
- BuilderCodec<Schema> BASE_CODEC

## Codec Properties (BASE_CODEC)

- $id | String | Schema identifier.
- type | String[] | JSON Schema type(s).
- title | String | Display title.
- description | String | Plain-text description.
- markdownDescription | String | Markdown-formatted description.
- enumDescriptions | String[] | Descriptions for enum values.
- markdownEnumDescriptions | String[] | Markdown enum descriptions.
- anyOf | Schema[] | anyOf composition.
- oneOf | Schema[] | oneOf composition.
- allOf | Schema[] | allOf composition.
- not | Schema | not composition.
- if | Schema | Conditional schema (if).
- then | Schema | Conditional schema (then).
- else | Object` (Boolean or Schema) | Conditional schema (else).
- required | String[] | Required property names.
- default | BsonDocument | Default value.
- definitions | Map<String, Schema> | Reusable schema definitions.
- $ref | String | Reference to another schema.
- $data | String | Data reference.
- doNotSuggest | Boolean | Suppress from autocomplete suggestions.
- hytaleAssetRef | String | Hytale asset reference.
- hytaleCustomAssetRef | String | Hytale custom asset reference.
- hytaleParent | Schema.InheritSettings | Parent inheritance configuration.
- hytaleSchemaTypeField | Schema.SchemaTypeField | Type field discriminator configuration.
- hytale | Schema.HytaleMetadata | Hytale-specific metadata (UI editor, paths, features).

## Static Methods


@Nonnull
public static Schema ref(String file)

Creates a `$ref` schema.


@Nonnull
public static Schema data(String file)

Creates a `$data` schema.


@Nonnull
public static Schema anyOf(Schema... anyOf)

Creates an `anyOf` composition schema.


@Nonnull
public static Schema not(Schema not)

Creates a `not` composition schema.


public static void init()

Registers all built-in schema types (`null`, `string`, `number`, `integer`, `array`, `boolean`, `object`) with the codec.

## Methods

Getter and setter methods for all fields listed above.


@Override
public boolean equals(@Nullable Object o)


@Override
public int hashCode()

## Inner Classes

- Schema.HytaleMetadata -- Hytale-specific metadata (UI editor, paths, caching, etc.)
- Schema.InheritSettings -- parent schema inheritance configuration
- Schema.SchemaTypeField -- type discriminator field configuration

## Subclasses

- ArraySchema
- BooleanSchema
- IntegerSchema
- NullSchema
- NumberSchema
- ObjectSchema
- StringSchema
