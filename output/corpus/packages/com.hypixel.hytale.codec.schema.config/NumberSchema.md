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
