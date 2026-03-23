# ObjectSchema

Type: class | Package: com.hypixel.hytale.codec.schema.config | Extends: com.hypixel.hytale.codec.schema.config.Schema

public class ObjectSchema extends Schema

Schema node for the JSON Schema `"object"` type. Extends Schema with object-specific keywords: `properties` (ordered map), `additionalProperties` (boolean or schema), and `propertyNames` (string schema constraint on key names).

## Codec Properties

Inherits all codec properties from Schema, plus:

- properties | Map<String, Schema>` (LinkedHashMap, ordered) | Named property schemas.
- additionalProperties | Boolean` or `Schema | Whether additional properties are allowed, or a schema they must conform to.
- propertyNames | StringSchema | Constraint on property key names.

## Methods


public Map<String, Schema> getProperties()


public void setProperties(Map<String, Schema> properties)


@Nullable
public Object getAdditionalProperties()


public void setAdditionalProperties(boolean additionalProperties)


public void setAdditionalProperties(Schema additionalProperties)


public StringSchema getPropertyNames()


public void setPropertyNames(StringSchema propertyNames)


@Override
public boolean equals(@Nullable Object o)


@Override
public int hashCode()


@Nonnull
@Override
public String toString()

## See Also

- Schema -- base class
- StringSchema -- used for `propertyNames` constraints
