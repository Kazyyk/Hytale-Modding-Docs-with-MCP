# NumberSchema

Type: class | Package: com.hypixel.hytale.codec.schema.config | Extends: com.hypixel.hytale.codec.schema.config.Schema

public class NumberSchema extends Schema

Schema node for the JSON Schema `"number"` type. Extends Schema with numeric validation keywords. The `minimum`, `exclusiveMinimum`, `maximum`, and `exclusiveMaximum` fields accept either a `double` value or a `Schema` reference (for dynamic bounds).

## Codec Properties

Inherits all codec properties from Schema, plus:

- minimum | Double` or `Schema | Minimum allowed value (inclusive).
- exclusiveMinimum | Double` or `Schema | Exclusive minimum.
- maximum | Double` or `Schema | Maximum allowed value (inclusive).
- exclusiveMaximum | Double` or `Schema | Exclusive maximum.
- enum | double[] | Allowed numeric values.
- const | Double | Required constant value.
- default | Double | Default value.

## Static Methods


@Nonnull
public static Schema constant(double c)

Creates a `NumberSchema` with a `const` value.

## Methods

Getter and setter methods for `minimum`, `exclusiveMinimum`, `maximum`, `exclusiveMaximum` (both `double` and `Schema` overloads), `enum`, `const`, and `default`.


@Override
public boolean equals(@Nullable Object o)


@Override
public int hashCode()

## See Also

- Schema -- base class
- IntegerSchema -- integer equivalent

Also in this package: ArrayOrNull, ArraySchema, BooleanOrSchema, BooleanSchema, CommonAsset, DoubleOrSchema, HytaleMetadata, InheritSettings, IntegerOrSchema, IntegerSchema, ItemOrItems, NullSchema, ObjectSchema, Schema, SchemaTypeField, StringOrBlank, StringSchema

Complete API:
  public Object getMinimum()
  public void setMinimum(double minimum)
  public Object getExclusiveMinimum()
  public void setExclusiveMinimum(double exclusiveMinimum)
  public Object getMaximum()
  public void setMaximum(double maximum)
  public Object getExclusiveMaximum()
  public void setExclusiveMaximum(double exclusiveMaximum)
  public void setMinimum(Schema minimum)
  public void setExclusiveMinimum(Schema exclusiveMinimum)
  public void setMaximum(Schema maximum)
  public void setExclusiveMaximum(Schema exclusiveMaximum)
  public double[] getEnum()
  public void setEnum(double[] enum_)
  public Double getConst()
  public void setConst(Double const_)
  public Double getDefault()
  public void setDefault(Double default_)
  public boolean equals(Object o)
  public int hashCode()
  public static Schema constant(double c)

Fields:
public static final BuilderCodec<NumberSchema> CODEC
private Object minimum
private Object exclusiveMinimum
private Object maximum
private Object exclusiveMaximum
private double[] enum_
private Double const_
private Double default_
