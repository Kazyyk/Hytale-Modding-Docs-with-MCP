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

Known subclasses: ArraySchema, BooleanSchema, IntegerSchema, NullSchema, NumberSchema, ObjectSchema, StringSchema

Also in this package: ArrayOrNull, ArraySchema, BooleanOrSchema, BooleanSchema, CommonAsset, DoubleOrSchema, HytaleMetadata, InheritSettings, IntegerOrSchema, IntegerSchema, ItemOrItems, NullSchema, NumberSchema, ObjectSchema, SchemaTypeField, StringOrBlank, StringSchema

Complete API:
  public String getId()
  public void setId(String id)
  public String[] getTypes()
  public void setTypes(String[] types)
  public String getTitle()
  public void setTitle(String title)
  public String getDescription()
  public void setDescription(String description)
  public String getMarkdownDescription()
  public void setMarkdownDescription(String markdownDescription)
  public String[] getEnumDescriptions()
  public void setEnumDescriptions(String[] enumDescriptions)
  public String[] getMarkdownEnumDescriptions()
  public void setMarkdownEnumDescriptions(String[] markdownEnumDescriptions)
  public Schema[] getAnyOf()
  public void setAnyOf(Schema anyOf)
  public Schema[] getOneOf()
  public void setOneOf(Schema oneOf)
  public Schema[] getAllOf()
  public void setAllOf(Schema allOf)
  public String[] getRequired()
  public void setRequired(String required)
  public BsonDocument getDefaultRaw()
  public void setDefaultRaw(BsonDocument default_)
  public Map<String,Schema> getDefinitions()
  public void setDefinitions(Map<String,Schema> definitions)
  public String getRef()
  public void setRef(String ref)
  public String getData()
  public void setData(String data)
  public Schema getIf()
  public void setIf(Schema if_)
  public Schema getThen()
  public void setThen(Schema then)
  public Schema getElse()
  public void setElse(Schema else_)
  public void setElse(boolean else_)
  public Boolean isDoNotSuggest()
  public void setDoNotSuggest(boolean doNotSuggest)
  public Schema.HytaleMetadata getHytale()
  public Schema.HytaleMetadata getHytale(boolean createInstance)
  public String getHytaleAssetRef()
  public void setHytaleAssetRef(String hytaleAssetRef)
  public Schema.InheritSettings getHytaleParent()
  public void setHytaleParent(Schema.InheritSettings hytaleParent)
  public Schema.SchemaTypeField getHytaleSchemaTypeField()
  public void setHytaleSchemaTypeField(Schema.SchemaTypeField hytaleSchemaTypeField)
  public String getHytaleCustomAssetRef()
  public void setHytaleCustomAssetRef(String hytaleCustomAssetRef)
  public static Schema ref(String file)
  public static Schema data(String file)
  public static Schema anyOf(Schema anyOf)
  public static Schema not(Schema not)
  public boolean equals(Object o)
  public int hashCode()
  public static void init()

Fields:
public static final ObjectCodecMapCodec<String,Schema> CODEC
public static final ArrayCodec<Schema> ARRAY_CODEC
public static final BuilderCodec<Schema> BASE_CODEC
private String id
private String[] types
private String title
private String description
private String markdownDescription
private Schema[] anyOf
private Schema[] oneOf
private Schema[] allOf
private Schema not
private String[] required
private String[] enumDescriptions
private String[] markdownEnumDescriptions
private Map<String,Schema> definitions
private String ref
private String data
private BsonDocument default_
private Schema if_
private Schema then
private Object else_
private Schema.HytaleMetadata hytale
private Schema.InheritSettings hytaleParent
private Schema.SchemaTypeField hytaleSchemaTypeField
private String hytaleAssetRef
private String hytaleCustomAssetRef
private Boolean doNotSuggest
