# IntegerSchema

Type: class | Package: com.hypixel.hytale.codec.schema.config | Extends: com.hypixel.hytale.codec.schema.config.Schema

public class IntegerSchema extends Schema

Schema node for the JSON Schema `"integer"` type. Extends Schema with integer-specific validation keywords. The `minimum`, `exclusiveMinimum`, `maximum`, and `exclusiveMaximum` fields accept either an integer value or a `Schema` reference (for dynamic bounds).

## Codec Properties

Inherits all codec properties from Schema, plus:

- minimum | Integer` or `Schema | Minimum allowed value (inclusive).
- exclusiveMinimum | Integer` or `Schema | Exclusive minimum.
- maximum | Integer` or `Schema | Maximum allowed value (inclusive).
- exclusiveMaximum | Integer` or `Schema | Exclusive maximum.
- enum | int[] | Allowed integer values.
- const | Integer | Required constant value.
- default | Integer | Default value.

## Static Methods


@Nonnull
public static Schema constant(int c)

Creates an `IntegerSchema` with a `const` value.

## Methods

Getter and setter methods for `minimum`, `exclusiveMinimum`, `maximum`, `exclusiveMaximum` (both `int` and `Schema` overloads), `enum`, `const`, and `default`.


@Override
public boolean equals(@Nullable Object o)


@Override
public int hashCode()

## See Also

- Schema -- base class
- NumberSchema -- floating-point equivalent

Also in this package: ArrayOrNull, ArraySchema, BooleanOrSchema, BooleanSchema, CommonAsset, DoubleOrSchema, HytaleMetadata, InheritSettings, IntegerOrSchema, ItemOrItems, NullSchema, NumberSchema, ObjectSchema, Schema, SchemaTypeField, StringOrBlank, StringSchema

Complete API:
  public Object getMinimum()
  public void setMinimum(int minimum)
  public Object getExclusiveMinimum()
  public void setExclusiveMinimum(int exclusiveMinimum)
  public Object getMaximum()
  public void setMaximum(int maximum)
  public Object getExclusiveMaximum()
  public void setExclusiveMaximum(int exclusiveMaximum)
  public void setMinimum(Schema minimum)
  public void setExclusiveMinimum(Schema exclusiveMinimum)
  public void setMaximum(Schema maximum)
  public void setExclusiveMaximum(Schema exclusiveMaximum)
  public int[] getEnum()
  public void setEnum(int[] enum_)
  public Integer getConst()
  public void setConst(Integer const_)
  public Integer getDefault()
  public void setDefault(Integer default_)
  public boolean equals(Object o)
  public int hashCode()
  public static Schema constant(int c)

Fields:
public static final BuilderCodec<IntegerSchema> CODEC
private Object minimum
private Object exclusiveMinimum
private Object maximum
private Object exclusiveMaximum
private int[] enum_
private Integer const_
private Integer default_
