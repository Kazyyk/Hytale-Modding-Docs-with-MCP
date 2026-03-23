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
