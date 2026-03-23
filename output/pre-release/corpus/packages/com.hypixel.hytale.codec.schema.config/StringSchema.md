# StringSchema

Type: class | Package: com.hypixel.hytale.codec.schema.config | Extends: com.hypixel.hytale.codec.schema.config.Schema

public class StringSchema extends Schema

Schema node for the JSON Schema `"string"` type. Extends Schema with string-specific validation keywords and Hytale-specific asset reference extensions.

## Codec Properties

Inherits all codec properties from Schema, plus:

- pattern | String | Regex pattern the value must match.
- enum | String[] | Allowed string values.
- const | String | Required constant value.
- default | String | Default value.
- minLength | Integer | Minimum string length.
- maxLength | Integer | Maximum string length.
- hytaleCommonAsset | StringSchema.CommonAsset | Common asset file reference configuration.
- hytaleCosmeticAsset | String | Cosmetic asset reference.

## Static Methods


@Nonnull
public static Schema constant(String c)

Creates a `StringSchema` with a `const` value.

## Methods


public String getPattern()


public void setPattern(String pattern)


public void setPattern(@Nonnull Pattern pattern)

Sets pattern from a compiled `Pattern`. Throws if the pattern has flags set.


public Integer getMinLength()


public void setMinLength(int minLength)


public Integer getMaxLength()


public void setMaxLength(int maxLength)


public String[] getEnum()


public void setEnum(String[] enum_)


public String getConst()


public void setConst(String const_)


public String getDefault()


public void setDefault(String default_)


public StringSchema.CommonAsset getHytaleCommonAsset()


public void setHytaleCommonAsset(StringSchema.CommonAsset hytaleCommonAsset)


public String getHytaleCosmeticAsset()


public void setHytaleCosmeticAsset(String hytaleCosmeticAsset)


@Override
public boolean equals(@Nullable Object o)


@Override
public int hashCode()

## Inner Classes

- StringSchema.CommonAsset -- configuration for common asset file references

## See Also

- Schema -- base class
- ObjectSchema -- uses `StringSchema` for `propertyNames`
