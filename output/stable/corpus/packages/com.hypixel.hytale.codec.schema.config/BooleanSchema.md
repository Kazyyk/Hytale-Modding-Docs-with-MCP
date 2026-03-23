# BooleanSchema

Type: class | Package: com.hypixel.hytale.codec.schema.config | Extends: com.hypixel.hytale.codec.schema.config.Schema

public class BooleanSchema extends Schema

Schema node for the JSON Schema `"boolean"` type. Extends Schema with a `default` value.

## Codec Properties

Inherits all codec properties from Schema, plus:

- default | Boolean | Default boolean value.

## Methods


public Boolean getDefault()


public void setDefault(Boolean default_)


@Override
public boolean equals(@Nullable Object o)


@Override
public int hashCode()

## See Also

- Schema -- base class

Also in this package: ArrayOrNull, ArraySchema, BooleanOrSchema, CommonAsset, DoubleOrSchema, HytaleMetadata, InheritSettings, IntegerOrSchema, IntegerSchema, ItemOrItems, NullSchema, NumberSchema, ObjectSchema, Schema, SchemaTypeField, StringOrBlank, StringSchema

Complete API:
  public Boolean getDefault()
  public void setDefault(Boolean default_)
  public boolean equals(Object o)
  public int hashCode()

Fields:
public static final BuilderCodec<BooleanSchema> CODEC
private Boolean default_
